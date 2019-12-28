package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int computerNumber;
    private Scanner scanner;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        computerNumber = (new Random()).nextInt((101));
        scanner = new Scanner(System.in);
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
        if (player.getCurrentNumber() == computerNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + computerNumber + " с " + player.getCounter() + " попытки");
            return true;
        } else if (player.getCurrentNumber() > computerNumber) {
            System.out.println("Введенное число больше загаданного");
            return false;
        } else if (player.getCurrentNumber() < computerNumber) {
            System.out.println(player.getCurrentNumber());
            System.out.println("Введенное число меньше загаданного");
            return false;
        }
        return false;
    }

    private void printEnteredNumbers(Player player) {
        System.out.print(Arrays.toString(player.getPuzzledNumbers()) + " ");
    }
}