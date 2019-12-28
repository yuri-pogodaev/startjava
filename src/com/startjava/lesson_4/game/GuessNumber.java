package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int computerNumber;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        Random random = new Random();
        computerNumber = random.nextInt((101));
    }

    public void startGame() {

        System.out.println("У вас 10 попыток");
        while (true) {

            if (playRound(player1)) {
                printEnteredNumbers(player1);
                printEnteredNumbers(player2);
                break;
            }

            if (player1.getCounter() == 10) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }

            if (playRound(player2)) {
                printEnteredNumbers(player2);
                printEnteredNumbers(player1);
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

    private boolean playRound(Player player) {
        enterNumber(player);
        return checkNumber(player);
    }

    private void enterNumber(Player player) {
        System.out.println(player.getName() + " введите ваше число ");
        player.addNumber(scanner.nextInt());
    }

    private boolean checkNumber(Player player) {
        boolean flag = false;
        if (player.getNumber() == computerNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + computerNumber + " с " + player.getCounter() + " попытки");
            flag = true;
        } else if (player.getNumber() > computerNumber) {
            System.out.println("Введенное число больше загаданного");
        } else if (player.getNumber() < computerNumber) {
            System.out.println(player.getNumber());
            System.out.println("Введенное число меньше загаданного");
        }
        return flag;
    }

    private void printEnteredNumbers(Player player) {
        System.out.println();
        for (int a : Arrays.copyOf(player.getPuzzledNumbers(), player.getCounter())) System.out.print(a + " ");
        System.out.println();
    }
}
