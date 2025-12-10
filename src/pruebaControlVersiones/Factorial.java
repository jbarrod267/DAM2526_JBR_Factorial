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