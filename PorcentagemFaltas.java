/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author lod17
 *  Um aluno deseja saber qual a porcentagem de faltas que ele tem em cada disciplina.
    Ajude este aluno para que ele sempre possa calcular sua porcentagem de faltas. Para
    isso, escreva um programa em Python que leia a carga horária da disciplina e a
    quantidade de horas de faltas acumuladas, calcule a porcentagem e a imprima na tela.
 */
public class PorcentagemFaltas {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        double cargaHoraria, faltasAcumuladas, qtdHoras;
        
        System.out.print("Informe a carga horaria: ");
        cargaHoraria = sc.nextDouble();
        
        System.out.print("Faltas acumuladas: ");
        faltasAcumuladas = sc.nextDouble();
        
        qtdHoras = (cargaHoraria - faltasAcumuladas) / cargaHoraria * 100;  
        
        System.out.println(qtdHoras);
        
    }
    
}
