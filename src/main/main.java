package main;

import java.util.Scanner;

public class main {

	/* Scrivere un programma che dati dei secondi li converta in ore, minuti,
secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”) */
	
	// 1 h è 3600s
	// 1 min è 60 s
	
	public static void main(String[] args) {
		int fattore_ore = 3600;
		int fattore_minuti = 60;
		int ore = 0;
		int minuti = 0;
		int sec = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("inserisci un numero di secondi");
		
		int secondi = scan.nextInt();
		
		for(int i= 0; i<secondi; i ++) {
			
			sec ++;
			if(sec == 60) {
				minuti ++;
				sec = 0;
				
			} if(minuti == 60) {
				ore ++;
				minuti = 0;
			}
			 
		}
		
		System.out.println(ore + ":" + minuti + ":" +  sec);
	
	
	/*Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare
  funzioni già pronte.Possibile usare solo :
	 - cicli
	 - chartAt
	 - if / switch
 Es. “25” come stringa deve essere convertito in intero 25. */
	
	System.out.println("inserisci un numero intero");
	String numero = scan.next();
	int car = 0;
	int risultato = 0;
	
	for(int i = 0; i< numero.length(); i++) {
		
		char carattere = numero.charAt(i);
		switch(carattere) {
		case '0':
			risultato = risultato * 10 + 0;
			break;
		case '1':
			risultato = risultato * 10 + 1;
			break;
		case '2':
			risultato = risultato * 10 + 2;
			break;
		case '3':
			risultato = risultato * 10 + 3;
			break;
		case '4':
			risultato = risultato * 10 + 4;
			break;
		case '5':
			risultato = risultato * 10 + 5;
			break;
		case '6':
			risultato = risultato * 10 + 6;
			break;
		case '7': 
			risultato = risultato * 10 + 7;
			break;
		case '8':
			risultato = risultato * 10 + 8;
			break;
		case '9':
			risultato = risultato * 10 + 9;
			break;
			
		
		}
		
		
		
	}
	System.out.println(risultato);
	
	/*Data una stringa in input mostrare a video quanti caratteri alfabetici
 contiene, quanti numeri e quanti simboli non alfanumerici. Continuare a
 chiedere una nuova stringa finchè non si inserisce 0. */
	int cont1 = 0;
	int cont2 = 0;
	int cont3 = 0;
	String str1 = "";
	boolean bool = true;
	while(bool) {
		System.out.println("inserisci una stringa");
		 str1 = scan.next();
		 if(str1.equals("0")) {
			 bool = false;
			 break;
		 }
		 
		 for(int i = 0; i < str1.length(); i++) {
			 switch(str1.charAt(i)) {
			 case 'a': 
				 cont1 ++;
				 
				 break;
			 case 'b':
				 cont1 ++;
				 break;
			 case 'c':
				 cont1 ++;
			     break;
			 case 'd':
				 cont1 ++;
				 break;
			 case 'e':
				 cont1 ++;
				 break;
			 case 'f':
				 cont1 ++;
				 break;
			 case 'g':
				 cont1 ++;
				 break;
			 case 'h':
				 cont1 ++;
				 break;
			 case 'i':
				 cont1 ++;
				 break;
			 case 'l':
				 cont1 ++;
				 break;
			 case 'm':
				 cont1 ++;
				 break;
			 case 'n':
				 cont1 ++;
				 break;
			 case 'o':
				 cont1 ++;
				 break;
			 case 'p':
				 cont1 ++;
				 break;
			 case 'q':
				 cont1 ++;
				 break;
			 case 'r':
				 cont1 ++;
				 break;
			 case 's':
				 cont1 ++;
				 break;
			 case 't':
				 cont1 ++;
				 break;
			 case 'u':
				 cont1 ++;
				 break;
			 case 'v':
				 cont1 ++;
				 break;
			 case 'w':
				 cont1 ++;
				 break;
			 case 'x':
				 cont1 ++;
				 break;
			 case 'y':
				 cont1 ++;
				 break;
			 case 'z':
				 cont1 ++;
				 break;
			 case '0':
				 cont2 ++;
				 break;
			 case '1':
				 cont2 ++;
				 break;
			 case '2':
				 cont2 ++;
				 break;
			 case '3':
				 cont2 ++;
				 break;
			 case '4':
				 cont2 ++;
				 break;
			 case '5':
				 cont2 ++;
				 break;
			 case '6':
				 cont2 ++;
				 break;
			 case '7':
				 cont2 ++;
				 break;
			 case '8':
				 cont2 ++;
				 break;
			 case '9':
				 cont2 ++;
				 break;
			default:
				cont3 ++;
				break;
				 
				 
				 
				 
			 }
			 
		 }
		 System.out.println("lettere " + cont1+ "," + " numeri " + cont2 + "," + "simboli " + cont3 );
	}
	
	/* Data in input una stringa verificare se è palindroma */
	
	System.out.println("inserisci una stinga");
	String str2 = scan.next();
	
	String str2 = str.substring(7);
	
	//prendo metà della parola
	//"giro" una metà ciclando
	//confronto le due metà
	
	
	
			scan.close();
	
	}
	
	
}
