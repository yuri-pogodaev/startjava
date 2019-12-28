package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int computerNumber;
    private boolean isWinner = false;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        Random random = new Random();
        computerNumber = random.nextInt((101));
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("У вас 10 попыток");
        while (true) {
            playRound(player1, scanner);

            if (isWinner) {
                printEnteredNumbers();
                break;
            }

            if (player1.getCounter() == 10) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }

            playRound(player2, scanner);
            if (isWinner) {
                printEnteredNumbers();
                break;
            }

            if (player2.getCounter() == 10) {
                System.out.println("У " + player2.getName() + " закончились попытки");
                break;
            }

        }
        player1.refill();
        player2.refill();
    }

    private void playRound(Player player, Scanner scanner) {
        enterNumber(player, scanner);
        checkRound(player);
    }

    private void printEnteredNumbers() {
        System.out.println();
        for (int a : Arrays.copyOf(player2.getPuzzledNumbers(), player2.getCounter())) System.out.print(a + " ");
        System.out.println();
        for (int b : Arrays.copyOf(player1.getPuzzledNumbers(), player1.getCounter())) System.out.print(b + " ");
        System.out.println();
    }

    private void enterNumber(Player player, Scanner scanner) {
        System.out.println(player.getName() + " введите ваше число ");
        player.addNumber(scanner.nextInt(), player.getCounter());
    }

    private void checkRound(Player player) {
        if (player.getNumber(player.getCounter() - 1) == computerNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + computerNumber + " с " + player.getCounter() + " попытки");
            isWinner = true;
            System.out.println("Game over");
        } else if (player.getNumber(player.getCounter() - 1) > computerNumber) {
            System.out.println("Введенное число больше загаданного" + computerNumber);
        } else if (player.getNumber(player.getCounter() - 1) < computerNumber) {
            System.out.println("Введенное число меньше загаданного" + computerNumber);
        }
    }
}