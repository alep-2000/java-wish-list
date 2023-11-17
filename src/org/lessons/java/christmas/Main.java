package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		BASE
//		while(true) {
//			System.out.println("Inserisci il nome del regalo: ");
//			String strRegalo = in.nextLine();
//			
//			lista.add(strRegalo);
//			
//			System.out.println("Vuoi inserire un'altro regalo? (Si/No)");
//			String strNuovoRegalo = in.nextLine().toLowerCase();
//			
//			if(strNuovoRegalo.equals("no")) break;
//		}
		
		
//		BONUS
		Scanner in = new Scanner(System.in);
		
		List<Regalo> lista = new ArrayList<>();
		
		while(true) {
			System.out.println("Inserisci il nome del regalo: ");
			String strRegalo = in.nextLine();
			
			System.out.println("Inserisci il destinatario del regalo: ");
			String strPersona = in.nextLine();
			
			Regalo reg = new Regalo(strRegalo, strPersona);
			lista.add(reg);
			
			System.out.println("Vuoi inserire un'altro regalo? (Si/No)");
			String strNuovoRegalo = in.nextLine().toLowerCase();
			
			if(strNuovoRegalo.equals("no")) break;
		}
		
		System.out.println("Come vuoi ordinare la lista? (nome | destinatario)");
		String strOrdinamento = in.nextLine().toLowerCase();

		
		
		if (strOrdinamento.equals("nome")) {

			Collections.sort(lista, Comparator.comparing(regalo -> regalo.getNomeRegalo()));
			
		} else {
			
			Collections.sort(lista, Comparator.comparing(regalo -> regalo.getDestinatario()));
		}
		
		for(Regalo regalo : lista) {
			System.out.println(regalo);
		}
		
		in.close();
	}
}
