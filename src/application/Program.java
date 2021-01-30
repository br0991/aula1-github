package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Número do quarto.: ");
		int numero = sc.nextInt();
		
		System.out.println("Data do check-in (dd/MM/yyyy): ");
		Date checkin = simple.parse(sc.next());
		
		System.out.println("Data do check-out (dd/MM/yyyy): ");
		Date checkout = simple.parse(sc.next());
		
		if(!checkout.after(checkin)){
			
			System.out.println("A data do check-out deve ser depois da data do check-in");
		}
		else{
			
			Reserva reserva = new Reserva(numero, checkin, checkout);
			System.out.println(reserva);
		}
		
		
		sc.close();
	}

}
