package pruebaControlVersiones;

import java.util.Scanner;

public class Factorial {

	@SuppressWarnings("resource")
	public void show() {

		Scanner keyboard = new Scanner(System.in);
		int n;
		boolean valido;

		System.out.println("Llamada a la función con argumentos introducidos por el usuario: ");

		do {
			System.out.print("Introduce un número entero mayor o igual que 0: ");
			if (keyboard.hasNextInt()) {
				n = keyboard.nextInt();
				valido = true;
			} else {
				System.out.println("Entrada no válida. Introduce un entero.");
				keyboard.next();
				valido = false;
				n = -1;
			}
		} while (!valido);

		System.out.printf("RESULTADO - En versiones posteriores se calculará el factorial del número " + n + " que es "
				+ factorialBucle(n));

	}

	private static long factorialBucle(int n) {
		int result;

		if (n == 1 || n == 0) {
			result = 1;
		} else {
			result = (int) (n * factorialBucle(n - 1));
		}
		return result;
	}

	public static void main(String[] args) {
		new Factorial().show();
	}

}