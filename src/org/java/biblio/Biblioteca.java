package org.java.biblio;
import java.io.FileWriter;
import java.util.Scanner;

import org.java.biblio.Libro;

public class Biblioteca {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Quanti libri vuoi inserire?");
		int numeroLibri = sc.nextInt();
		
		Libro[] libri = new Libro[numeroLibri];
		for(int i=0;i<=numeroLibri;i++) {
			System.out.print("titolo:");
			String titolo = sc.nextLine();
			
			System.out.print("titolo:");
			int pagine = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("autore:");
			String autore = sc.nextLine();
			
			System.out.print("editore:");
			String editore = sc.nextLine();
			
			try {
				Libro l = new Libro(titolo,pagine,autore,editore);
				libri[i]=l;
				
			}catch (Exception e) {
				System.err.println("valori sbagliati");
				System.err.println(e.getMessage());
			}
		}
		
		
	}

}
