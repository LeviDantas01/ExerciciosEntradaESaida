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
 *  Faça um programa em Python que leia a idade de uma pessoa expressa em anos,
    meses e dias e mostre-a expressa apenas em dias. Assuma, neste programa, que um ano
    tem 365 dias e que um mês tem 30 dias. Exemplo: Se a pessoa digitar que tem 28 anos 1
    mês e 10 dias deverá aparecer na tela que ela viveu 10260 dias.
 */
public class CalculaDias {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        int anos, meses, dias, totalDias, anoParaDias, mesesParaDias;
        
        
        System.out.print("Informe sua idade: ");
        anos = sc.nextInt();
        
        System.out.print("Informe quantos meses: ");
        meses = sc.nextInt();
        
        System.out.print("Infomre quantos dias: ");
        dias = sc.nextInt();
        
        mesesParaDias = meses * 30;
        anoParaDias = anos * 365;
        
        totalDias = anoParaDias + mesesParaDias + dias;
        
        System.out.println(totalDias);
        
        
        
        
        
    }
    
}
