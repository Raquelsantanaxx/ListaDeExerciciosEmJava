package Condicional;
import java.util.Scanner;
public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos litros de gasolina deseja: ");
        double qtidade = sc.nextFloat();

        System.out.println("Informe qual opção deseja: G- Gasolina ou A - Alcool: ");
        char tipo = sc.next().toUpperCase().charAt(0);

        double litro_gasolina = 2.5;
        double litro_alcool = 1.90;
        double preco_total = 0;
        double desconto = 0;


        if (tipo == 'G') {
            preco_total = qtidade * litro_gasolina;
            if (qtidade <= 20) {
                desconto = preco_total * 0.04;
            } else {
                desconto = preco_total * 0.06;
            }
        } else if (tipo == 'A') {
            preco_total = qtidade * litro_alcool;
            if (qtidade <= 20) {
                desconto = preco_total * 0.03;
            } else {
                desconto = preco_total * 0.05;
            }
        }
            double valor_final = preco_total - desconto;
            System.out.printf("O valor a ser pago é: R$ %.2f%n", valor_final);
            sc.close();

        }

    }
