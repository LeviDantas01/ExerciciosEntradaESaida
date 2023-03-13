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
 * Escreva um programa em Python que leia o peso e a altura de uma pessoa. Em
 * seguida o programa deve calcular e imprimir índice de massa corpórea (IMC)
 * dessa pessoa. Dado:
 */
public class Imc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double altura, peso, imc;

        System.out.print("Informe sua altura: ");
        altura = sc.nextDouble();
        
        System.out.print("Informe seu peso: ");
        peso = sc.nextDouble();
        
        imc = peso / (altura * altura);
        
        System.out.println(imc);

    }

}
