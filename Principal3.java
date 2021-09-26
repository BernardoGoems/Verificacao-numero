/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculos;

/**
 *
 * @author berna
 */
import java.util.Scanner;

public class Principal3 {

    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 0;
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            System.out.println("Informe um numero: ");
            vetor1[i] = input.nextInt();  
           
        }
        
        for (int h = 0; h < 9; h++) {
            System.out.println("Informe um numero 11: ");
            vetor2[h] = input.nextInt();
            for (int j = 0; j < 9; j++) {

                if (vetor1[j] == vetor2[h]) {
                    cont++;
                    
                }
            }
        }
        System.out.println("Valor é: " + cont);
        
        
        
    }

}

