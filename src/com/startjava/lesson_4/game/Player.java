package com.startjava.lesson_4.game;

public class Player {
    private String name;
    private int[] array;

    public Player(String name) {
        this.name = name;
        this.array = new int[10];
    }

    public String getName() {
        return name;
    }

    public void refill() {
        Arrays.fill(array, 0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void addNumber(int number, int index) {
        array[index] = number;
    }

    public int getNumber(int i) {
        return array[i];
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}