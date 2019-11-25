/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetterAndGetter;

/**
 *
 * @author 03475300958
 */
public class Bike {
    
    private int aro;
    private String cor;
    private String Marca;
    private Double valor;
    

    public Bike(int aro, String cor, String Marca, Double valor) {
        this.aro = aro;
        this.cor = cor;
        this.Marca = Marca;
        this.valor = valor;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
}
