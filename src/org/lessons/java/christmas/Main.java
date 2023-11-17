package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		List<String> lista = new ArrayList<>();
		
		while(true) {
			System.out.println("Inserisci il nome del regalo: ");
			String strRegalo = in.nextLine();
			
			lista.add(strRegalo);
			
			System.out.println("Vuoi inserire un'altro regalo? (Si/No)");
			String strNuovoRegalo = in.nextLine().toLowerCase();
			
			if(strNuovoRegalo.equals("no")) break;
		}
		
		Collections.sort(lista);
		
		System.out.println("------------------------------");
		
		for(String regalo : lista) {
			System.out.println("Regalo: " + regalo);
		}
		
		System.out.println("-----------------------------");
		in.close();
	}
}
