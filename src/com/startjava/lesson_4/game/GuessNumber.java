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
            System.out.println(player1.getName() + " введите ваше число ");
            player1.addNumber(scanner.nextInt(), counter1);

            if (player1.getNumberById(counter1) == computerNumber) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + computerNumber + " с " + (counter1 + 1) + " попытки");
                for (int a : Arrays.copyOf(player2.getPuzzledNumbers(), counter2)) System.out.print(a + " ");
                System.out.println();
                for (int b : Arrays.copyOf(player1.getPuzzledNumbers(), counter1)) System.out.print(b + " ");
                break;
            } else if (player1.getNumberById(counter1) > computerNumber) {
                System.out.println("Введенное число больше загаданного");
            } else if (player1.getNumberById(counter1) < computerNumber) {
                System.out.println("Введенное число меньше загаданного");
            }

            if (counter1 == 9) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }
            counter1++;
            System.out.println(player2.getName() + " введите ваше число ");
            player2.addNumber(scanner.nextInt(), counter2);

            if (player2.getNumberById(counter2) == computerNumber) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + computerNumber + " с " + (counter2 + 1) + " попытки");
                for (int a : Arrays.copyOf(player2.getPuzzledNumbers(), counter2)) System.out.print(a + " ");
                System.out.println();
                for (int b : Arrays.copyOf(player1.getPuzzledNumbers(), counter1)) System.out.print(b + " ");
                break;
            } else if (player2.getNumberById(counter2) > computerNumber) {
                System.out.println("Введенное число больше загаданного");
            } else if (player2.getNumberById(counter2) < computerNumber) {
                System.out.println("Введенное число меньше загаданного");
            }
            if (counter2 == 9) {
                System.out.println("У " + player2.getName() + " закончились попытки");
                break;
            }
            counter2++;
        }
    }
}