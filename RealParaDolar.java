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
 * Faça um programa em Python para converter um dado valor em reais (R$) para a
    moeda dólar (US$). O programa deve ler um valor em reais (R$) e a cotação da moeda
    americana, depois converter para dólares (US$) e apresentar este valor convertido na tela.
 * 
 */
public class RealParaDolar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double dolar, real, cotacao;
        
        System.out.print("Informe a quantidade em reais: ");
        real = sc.nextDouble();
        
        System.out.print("Informe a cotacao: ");
        cotacao = sc.nextDouble();
        
        dolar = real / cotacao;
        
        System.out.println(dolar);
                
        
    }
    
}
