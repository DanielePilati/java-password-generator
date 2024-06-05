package org.lessons.java.security;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		String userName;
		String userSurname;
		String userColor;
		short userDay;
		short userMonth;
		short userYear;
		
		Scanner input = new Scanner(System.in); 
		
	    System.out.println("Inserisci il tuo Nome");
	    userName = input.nextLine();  
	    System.out.println("Inserisci il tuo Cognome:");
	    userSurname = input.nextLine();  
	    System.out.println("Inserisci il tuo Colore Preferito");
	    userColor = input.nextLine();  
	    
	    System.out.println("----------------- Chiedo giorno, mese, anno separatamente ---------------------------");
	    
	    System.out.println("Inserisci Giorno di nascita:");
	    userDay = (short) input.nextInt(); 
	    System.out.println("Inserisci Mese di nascita:");
	    userMonth = (short) input.nextInt(); 
	    System.out.println("Inserisci Anno di nascita:");
	    userYear = (short) input.nextInt(); 
	    
	    System.out.println(userName+"-"+userSurname+"-"+userColor+"-"+ (userDay+userMonth+userYear));
	    
	    System.out.println("--------------------------------------------");
	    
	    System.out.println("Richiedo la data in un'unica soluzione Stringa");
	    
	    System.out.println("----------------- Usando un Array ---------------------------");
	    
	    String userDate;
	    
	    System.out.println("Inserisci Data di nascita: (mm/gg/aaaa)");
	    userDate = input.nextLine(); 
	    
	    String[] userDateValues = userDate.split("/");
	    
        userDay = (short) Integer.parseInt(userDateValues[0]);
        userMonth = (short) Integer.parseInt(userDateValues[1]);
        userYear = (short) Integer.parseInt(userDateValues[2]);
	    
        System.out.println(userName+"-"+userSurname+"-"+userColor+"-"+ (userDay+userMonth+userYear));
		
		
	}
}
