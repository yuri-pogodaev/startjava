package com.startjava.lesson_1.cycle;

public class Cycle {

	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println(i + " ");
		}
		
		int j = 6;
		while(j >= -6) {
			System.out.println(j + " ");
			j -= 2;
		}

		int sum = 0;
		int k = 10;
		do {
			k++;
			if(k % 2 == 1) {
				sum += k;
			}
		} while(k < 20);
		System.out.println(sum);
	}
}	