import java.util.Scanner;

public class holamundo {


	public static void main(String[] args) {		
		Scanner escaneo = new Scanner(System.in);
		System.out.println("ingresa un numero");
		String numero = escaneo.nextLine();
		var numeroTexto = "nunmero Desconocido bro";

		if(Integer.parseInt(numero) == 1){
			numeroTexto = "numero Uno";
		}
		else if (Integer.parseInt(numero) == 2){
			numeroTexto = "numero Dos";
		}
		else if( Integer.parseInt(numero) == 3){
			numeroTexto = " Numero Tres";
		}
		else if(Integer.parseInt(numero) == 4){
			numeroTexto = "Numero cuatro";
		}
		else{
			numeroTexto = "Numero no encontrado";
		}
		System.out.println(numeroTexto);

	}



}