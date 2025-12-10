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

		System.out.printf("RESULTADO - En versiones posteriores se calculará el factorial del número " + n);

	}

	public int factorial(int n) {

		int result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		new Factorial().show();
	}

}