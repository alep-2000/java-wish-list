package org.lessons.java.christmas;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il nome del regalo:");
		String strRegalo = in.nextLine();
		
		System.out.println(strRegalo);
		
		in.close();
	}
}
