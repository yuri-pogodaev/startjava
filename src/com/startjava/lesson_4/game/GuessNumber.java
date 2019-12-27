package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int computerNumber;
    private int counter1 = 0;
    private int counter2 = 0;
    private boolean isWinner = false;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        Random random = new Random();
        computerNumber = random.nextInt((101));
    }

    public void startGame() {
        player1.refill();
        player2.refill();
        Scanner scanner = new Scanner(System.in);
        System.out.println("У вас 10 попыток");
        while (true) {

            playRound(player1, counter1, scanner);
            counter1++;
            if (isWinner) {
                printArrays();
                break;
            }

            if (counter1 == 10) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }

            playRound(player2, counter2, scanner);
            counter2++;
            if (isWinner) {
                printArrays();
                break;
            }

            if (counter2 == 10) {
                System.out.println("У " + player2.getName() + " закончились попытки");
                break;
            }
        }
    }

    private void playRound(Player player, int count, Scanner scanner) {
        System.out.println(player.getName() + " введите ваше число ");

        player.addNumber(scanner.nextInt(), count);

        if (player.getNumber(count) == computerNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + computerNumber + " с " + (count + 1) + " попытки");
            isWinner = true;
        } else if (player.getNumber(count) > computerNumber) {
            System.out.println("Введенное число больше загаданного");
        } else if (player.getNumber(count) < computerNumber) {
            System.out.println("Введенное число меньше загаданного");
        }
    }

    private void printArrays() {
        System.out.println();
        for (int a : Arrays.copyOf(player2.getPuzzledNumbers(), counter2)) System.out.print(a + " ");
        System.out.println();
        for (int b : Arrays.copyOf(player1.getPuzzledNumbers(), counter1)) System.out.print(b + " ");
        System.out.println();
    }

}