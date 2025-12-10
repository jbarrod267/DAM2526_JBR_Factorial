package pruebaControlVersiones;

import java.util.Scanner;

public class Factorial {

	@SuppressWarnings("resource")
	public void show() {

		Scanner keyboard = new Scanner(System.in);
		int n;

		System.out.println("Llamada a la función con argumentos introducidos por el usuario: ");

		do {
			System.out.println("Introduzca un número entero positivo: ");
			n = keyboard.nextInt();

		} while (n <= 0);

	}

	@SuppressWarnings("unused")
	private static long factorialRec(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		return n * factorialRec(n - 1);
	}

	public static void main(String[] args) {
		new Factorial().show();
	}

}