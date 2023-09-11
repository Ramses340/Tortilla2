/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mx.itso.edu.tortilla2;

import java.util.Scanner;

/**
 *
 * @author ramse
 */
public class Tortilla2 {

    public static void main(String[] args) {
         System.out.println("Escriba el enunciado a separar:");
        
        Scanner scanner = new Scanner(System.in);
        String enunciado = scanner.nextLine();
        
        String[] resultado = new Operaciones().separar(enunciado);
        
        for(String s : resultado){
            System.out.println(s);
        }
    }





}

