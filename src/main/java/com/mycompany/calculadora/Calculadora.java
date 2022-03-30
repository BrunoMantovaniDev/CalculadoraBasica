/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Calculadora {

    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
            
            
            System.out.println(" Informe Qual Tipo de Operação, sendo: +, - , *, /");
            String operacao = input.nextLine();
            
            char menu = operacao.charAt(0);
            
            System.out.println(" Informe o Primeiro valor: ");
            double valor1 = input.nextDouble();
            System.out.println(" Informe o Segundo valor: ");
            double valor2 = input.nextDouble();
            
            
            switch (menu) {
                case '+' : System.out.println(valor1+" + "+valor2+" = "+(valor1+valor2));break;
                case '-' : System.out.println(valor1+" - "+valor2+" = "+(valor1-valor2));break;
                case '*' : System.out.println(valor1+" * "+valor2+" = "+(valor1*valor2));break;
                case '/' : {
                    if(valor2 !=0){
                        System.out.println(valor1+" / "+valor2+" = "+(valor1/valor2));
                       
                    }else{
                        System.out.println("O Segundo valor 2 deve ser maior que 0");
                    }break;
                    
                }
                default: System.out.println(" Operações Matematicas Invalidas");
                
 
        }
            
            
            
            
        
        
        
    }
}
