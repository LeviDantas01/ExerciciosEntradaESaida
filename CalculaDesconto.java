/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author lod17
 * 17. Escreva um programa em Python que calcule o valor do desconto de uma mercadoria
    paga a vista e o valor total a ser pago. O programa deve ler o valor da mercadoria e a
    porcentagem do desconto. Depois o programa deve calcular e imprimir na tela o valor do
    desconto e o novo valor da mercadoria com o desconto.

 */
public class CalculaDesconto {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double valor, desconto, valorDesconto, valorFinal;
        
        System.out.print("Qual o valor da mercadoria: ");
        valor = sc.nextDouble();
        
        System.out.print("Qual o desconto: ");
        desconto = sc.nextDouble();
        
        valorDesconto = valor * desconto / 100;  
        
        valorFinal = valor - valorDesconto;
        System.out.println("Valor desconto: " + valorDesconto);
        System.out.println("Valor total: " + valorFinal);
        
    }
    
    
}
