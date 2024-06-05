package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		String userName;
		String userSurname;
		String userColor;
		short userDay;
		short userMonth;
		short userEar;
		
		Scanner input = new Scanner(System.in); 
		
	    System.out.println("Inserisci il tuo Nome");
	    userName = input.nextLine();  
	    System.out.println("Inserisci il tuo Cognome:");
	    userSurname = input.nextLine();  
	    System.out.println("Inserisci il tuo Colore Preferito");
	    userColor = input.nextLine();  
	    System.out.println("Inserisci Giorno di nascita:");
	    userDay = (short) input.nextInt(); 
	    System.out.println("Inserisci Mese di nascita:");
	    userMonth = (short) input.nextInt(); 
	    System.out.println("Inserisci Anno di nascita:");
	    userEar = (short) input.nextInt(); 
	    
	    System.out.println(userName+"-"+userSurname+"-"+userColor+"-"+ (userDay+userMonth+userEar));
	    
	    
		
		
	}
}
