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
    * 18. Escreva um programa em Python para ajudar a calcular a quantidade de gotas de um
       remédio que uma determinada criança precisa tomar. A bula desse remédio pediátrico
       recomenda a seguinte dosagem: 5 gotas para cada 2 kg do peso da criança. Você deve
       fazer um programa que leia o peso desta criança, calcule e imprima na tela a quantidade
       de gotas a ser tomada.
 */
public class QuantidadeGotas {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int gotas, peso, quantidadeGotas;
        
        System.out.print("Qual o peso: ");
        peso = sc.nextInt();
        
        
       quantidadeGotas = 5 * peso / 2;
       
        System.out.println(quantidadeGotas);
        
        
        
    }
    
}
