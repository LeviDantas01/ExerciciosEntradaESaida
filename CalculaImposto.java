/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author lod17
 * 0. Um fabricante paga uma porcentagem de imposto sobre o total de uma venda
    realizada. Esse fabricante conhece a quantidade de unidades de um produto que produziu
    e o valor de cada peça. Ajude este fabricante escrevendo um programa em Python que
    permita a leitura das seguintes informações: quantidade de unidades de um produto
    produzidas, valor (preço) de uma unidade desse produto e porcentagem de imposto a ser
    paga. Depois calcule o valor do imposto a ser pago e imprima na tela esse valor obtido.
 */
public class CalculaImposto {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double quantidade, valor, imposto, valorTotal, precoInposto;
        
        System.out.print("Informe a quantidade: ");
        quantidade = sc.nextDouble();
        
        System.out.print("Informe o valor do protudo: ");
        valor = sc.nextDouble();
        
        System.out.print("Informe o imposto: ");
        imposto = sc.nextDouble();
        
        valorTotal = quantidade * valor;
        
        precoInposto = imposto * valorTotal / 100;
        
        
        System.out.println(precoInposto);
        
    }
    
}
