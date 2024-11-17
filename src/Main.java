package src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Количество строк: ");
		byte strQuantity = scanner.nextByte();

		printSquare(strQuantity);

	}

	public static void printSquare(byte strQuantity) {
		for (int i = 0; i < strQuantity; i++) {
			if (i == 0 || i == strQuantity - 1) {
				System.out.print("=".repeat(strQuantity * 2));
			} else {
				for (int j = 0; j < strQuantity * 2; j++) {

					if (j == 0 || j == strQuantity * 2 - 1) {
						System.out.print("=");
					} else if (j % 2 == 0) {
						System.out.print("/");
					} else System.out.print("\\");
				}
			}
			System.out.println();
			System.out.println("Домашнее задание github");
		}
	}
}