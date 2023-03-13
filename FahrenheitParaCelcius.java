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
 * Faça um programa em Python que leia uma temperatura fornecida em graus fahrenheit
    e a converta para o seu equivalente em graus centígrados, imprimindo este valor na tela.
    Dado: c = 5/9(f-32)
 */
public class FahrenheitParaCelcius {
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double fahrenheit, celcius;
        
        System.out.print("Informe a temperatura em Fahrenheit: ");
        fahrenheit = sc.nextDouble();
        
        celcius = (fahrenheit - 32) * 5 / 9;
        
        System.out.println(celcius);
        
        
        
        
    }
    
}
