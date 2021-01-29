package application;

import java.util.Scanner;

import model.entities.Reserva;

public class Program {

	public static void main(String[] args) {
		
		Reserva reserva = new Reserva();
		Scanner sc = new Scanner (System.in);
		System.out.println(reserva.duracao());
		sc.close();
	}

}
