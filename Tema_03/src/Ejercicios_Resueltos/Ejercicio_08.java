/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0;
        double media;
        
        for(int cont = 1; cont <= 10; cont++){
            System.out.print("Escribe un numero: ");
            num = sc.nextInt();
            suma += num;
        }
        
        media = suma / 10.0;
        
        System.out.println("La media de los 10 numeros es: " + media);
        
    }
    
}
