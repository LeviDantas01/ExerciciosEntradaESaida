/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.alugeldecarro;

/**
 *
 * @author lod17
 */
public class Consecionaria {
    
    private double diaria;
    private double kmRodado;
    
    
    public void calculaPreco(double diaria, double kmRodado) {
        double totalAPagar;
        totalAPagar = this.kmRodado * kmRodado + this.diaria;
        
        System.out.println("O total a ser pago e: " + totalAPagar);
        
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public void setKmRodado(double kmRodado) {
        this.kmRodado = kmRodado;
    }

    public double getDiaria() {
        return diaria;
    }

    public double getKmRodado() {
        return kmRodado;
    }
    
    
    
    
}
