/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.alugeldecarro;

/**
 *
 * @author lod17
 * 
 *  Um grupo de amigos pretende alugar um carro por um único dia. Consultadas duas
    agências, a primeira cobra R$62,00 pela diária e R$1,40 por quilômetro rodado. A segunda
    cobra diária de R$80,00 e mais R$1,20 por quilômetro rodado. Escreva um programa em
    Python que leia a quantidade de quilômetros a serem rodados e calcule e imprima na tela
    o preço a ser pago em cada uma das agências.
 * 
 */
public class AluguelDeCarro {
    
    public static void main(String[] args) {
        
        
        Consecionaria agencia1 = new Consecionaria();
        
        double diaria = 62;
        double kmRodado = 40;
        
        agencia1.setDiaria(diaria);
        agencia1.setKmRodado(1.40);
        
        agencia1.calculaPreco(diaria, kmRodado);
        
        
        Consecionaria agencia2 = new Consecionaria();
        
        diaria = 80;
        kmRodado = 40;
        
        agencia2.setDiaria(diaria);
        agencia2.setKmRodado(1.20);
        
        agencia2.calculaPreco(diaria, kmRodado);
        
        
    }
    
}
