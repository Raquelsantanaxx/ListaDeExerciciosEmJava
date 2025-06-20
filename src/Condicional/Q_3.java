package Condicional;
import java.util.Scanner;
public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a qtidade em kilos de morango: ");
        double kgMorango = sc.nextDouble();

        System.out.println("Digite a qtidade em kilos de maça ");
        double kgMaca = sc.nextDouble();

        double preco_morango;
        if(kgMorango <= 5) {
            preco_morango = 2.50;
        } else {
            preco_morango = 2.20;
        }

        double preco_maca;
        if (kgMaca <=5) {
            preco_maca = 1.80;
        } else {
            preco_maca = 1.50;
        }
        double valorMorango = kgMorango * preco_morango;
        double valorMaca = kgMaca * preco_maca;
        double total = valorMorango + valorMaca;

        double pesoTotal = kgMorango + kgMaca;
        if (pesoTotal > 8 || total > 25.0 ) {
            total = total - (total * 0.10);
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", total);
        sc.close();
    }
}

