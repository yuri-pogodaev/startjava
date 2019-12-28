package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] puzzledNumbers;
    private int counter;

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
        return puzzledNumbers;
    }

    public int getNumber(int i) {
        return puzzledNumbers[i];
    }

    public void addNumber(int number, int i) {
        puzzledNumbers[i] = number;
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public void refill() {
        Arrays.fill(puzzledNumbers, 0, counter, 0);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", array=" + Arrays.toString(puzzledNumbers) +
                '}';
    }
}