package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		String userName;
		String userSurname;
		String userColor;
	    String userDate;
		short userDay;
		short userMonth;
		short userYear;
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("-------------------------- Generiamo la tua password --------------------------------");
		System.out.println("-------------------------------------------------------------------------------------");
		
	    System.out.println("-- Inserisci il tuo Nome");
	    userName = input.nextLine();  
	    System.out.println("-- Inserisci il tuo Cognome:");
	    userSurname = input.nextLine();  
	    System.out.println("-- Inserisci il tuo Colore Preferito:");
	    userColor = input.nextLine();  
	    
	    System.out.println("-------------------- Chiedo giorno, mese, anno separatamente -------------------------");
	    
	    System.out.println("-- Inserisci Giorno di nascita:");
	    userDay = (short) input.nextInt(); 
	    System.out.println("-- Inserisci Mese di nascita:");
	    userMonth = (short) input.nextInt(); 
	    System.out.println("-- Inserisci Anno di nascita:");
	    userYear = (short) input.nextInt(); 
	    
		System.out.println("-------------------------------------------------------------------------------------");
	    
	    System.out.println("La tua password è: "+userName+"-"+userSurname+"-"+userColor+"-"+ (userDay+userMonth+userYear));
	    
		System.out.println("-------------------------------------------------------------------------------------");
		
	    System.out.println("-- Inserisci Data di nascita:");
	    
	    userDate = input.nextLine(); 
		
	}
}
