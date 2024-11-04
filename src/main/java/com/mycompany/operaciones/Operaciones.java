/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operaciones;

/**
 *
 * @author alban
 */

import java.util.Scanner;

public class Operaciones {

   
    
    public static void main(String[] args) {
      	
		
        System.out.println("Selecciona operación \n 1.Resta \n 2.Suma \n 3.Multiplicación");
        
        Scanner scanner = new Scanner(System.in);
        
       int operator = scanner.nextInt();
        
       
       
        while(true){
             
            
            if(operator == 1){
                
                 System.out.println("Usted ha elegido resta \n Indica una cifra");
                 int number1 =(int) scanner.nextInt();
                 
                 System.out.println("Indica otra cifra");
                 int number2= (int) scanner.nextInt();
                 
                 
                 //aqui meted la resta
            }
            if(operator == 2){
                
                 System.out.println("Usted ha elegido suma \n Indica una cifra");
                 int number1 =(int) scanner.nextInt();
                 
                 System.out.println("Indica otra cifra");
                 int number2= (int) scanner.nextInt();
                 
                 //aqui meted la suma
            }
            if(operator == 3){
                
                 System.out.println("Usted ha elegido multiplicación \n Indica una cifra");
                 int number1 =(int) scanner.nextInt();
                 
                 System.out.println("Indica otra cifra");
                 int number2= (int) scanner.nextInt();
                 
                 //aqui meted la multi
            }
           
		
            
        }
      
			
		
			
                        
		
    }
}
