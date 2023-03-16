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
 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
    porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que
    a porcentagem do distribuidor seja de 28% e os impostos de 45%, escreva um programa
    em Python que leia o custo de fábrica de um carro e escreva o custo ao consumidor.

 * 
 */
public class CustoCarro {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double custoFabrica, porcentagemDistribuidor, impostos, precoFinal;
        
        System.out.print("Informe o custo: ");
        custoFabrica = sc.nextDouble();
        
        porcentagemDistribuidor = custoFabrica * 100 / 28;
        
        impostos = custoFabrica * 100 / 45;
        
        precoFinal = porcentagemDistribuidor + impostos + custoFabrica;
        
        System.out.println(precoFinal);
        
        
        
        
    }
    
}
