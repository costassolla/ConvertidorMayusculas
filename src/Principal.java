import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pide por pantalla un texto

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un texto");
		String texto;
		texto = teclado.nextLine();

		// Convierte ese texto a may�sculas

		texto = texto.toUpperCase();

		// Imprime en pantalla el texto convertido a may�sculas
		System.out.println(texto);

		teclado.close();

	}

}
