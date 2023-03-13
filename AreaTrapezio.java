/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author lod17
 *
 * 11. Escreva um programa em Python que leia os valores da base maior (B), base
 * menor (b) e altura (h) de um trapézio e calcule e imprima o valor de sua
 * área, sabendo que a área de um trapézio (A) é dada por:
 * 
 * A = (B * b)^2 / 2 
 */
public class AreaTrapezio {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double baseMaior, baseMenor, area, altura;
        
        System.out.print("Informe a base maior: ");
        baseMaior = sc.nextDouble();
        
        System.out.print("Infome a base menor: ");
        baseMenor = sc.nextDouble();
        
        System.out.print("Informe a altra: ");
        altura = sc.nextDouble();
        
        area = (baseMaior * baseMenor) * altura / 2;
        
        System.out.println(area);
        
    }
    
}
