/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author lod17
 * Sabe-se que para iluminar de maneira correta os cômodos de uma casa, para cada m2
   deve-se usar 18 W de potência. Escreva um programa em Python que leia as dimensões
   de um cômodo retangular (em metros), calcule e mostre a sua área (em m2) 
   e a potência de iluminação que deverá ser utilizada.
 */
public class PotenciaIluminacao {
    
    public static void main(String[] args) {
        
        double area, base, altura, potencia, watts = 18;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a base: ");
        base = sc.nextDouble();
        
        System.out.print("Informe a altura: ");
        altura = sc.nextDouble();
        
        area = base * altura;
        
        potencia = area / watts;
        
        System.out.println(potencia);
                
        
    }
    
    
}
