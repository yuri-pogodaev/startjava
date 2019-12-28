package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] puzzledNumbers;
    private int counter = 0;
    public Player(String name) {
        this.name = name;
        puzzledNumbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getPuzzledNumbers() {
        return Arrays.copyOf(puzzledNumbers,counter);
    }

    public int getCurrentNumber() {
        return puzzledNumbers[counter - 1];
    }

    public void addNumber(int number) {
        puzzledNumbers[counter] = number;
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public void refill() {
        Arrays.fill(puzzledNumbers, 0, counter , 0);
        counter = 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", array=" + Arrays.toString(puzzledNumbers) +
                '}';
    }
}