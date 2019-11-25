package SetterAndGetter;

import java.util.Scanner;

public class CriarBike {

    public static void main(String[] args) {
        int aro;
        String cor;
        String marca;
        Double valor;
        
        Bike b = new Bike(24, "amarela", "caloi", 1500.00);
        
        System.out.printf("Aro: %d, Cor: %s, Marca: %s, valor: %f\n\n", b.getAro(), b.getCor(), b.getMarca(), b.getValor());
        
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite o tamanho do aro\n\n");
        aro = ler.nextInt();
        System.out.println("Digite a cor: \n\n");
        cor = ler.next();
        System.out.printf("Digite a marca: \n\n");
        marca = ler.next();
        System.out.printf("Digite o valor: \n\n");
        valor = ler.nextDouble();
        
        
        
        
        System.out.printf("Aro: %d, Cor: %s, Marca: %s, Valor: %.2f\n\n", aro, cor, marca, valor);
        
        
        Bike c = new Bike(aro, cor, marca, valor);
        
        System.out.println("");
        c.setAro(26);
        c.setCor("Branca");
        System.out.printf("Aro: %d, Cor: %s, Marca: %s, valor: %.2f\n\n", c.getAro(), c.getCor(), c.getMarca(), c.getValor());
    }
    
}
