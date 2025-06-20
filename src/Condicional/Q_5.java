package Condicional;
import java.util.Scanner;
public class Q_5 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2 = sc.nextDouble();

        double media_final = (nota1 + nota2)/2;
        if (media_final == 10) {
            System.out.println("Aprovado com nota maxima");

        } else if (media_final >= 7) {
            System.out.println("Aprovado ");

        } else {
            System.out.println("Reprovado");
        }

    }
}

/*
  Criando variaveis
  nota 1
  nota 2
  media_final
  solicitar a entrada ao usuario
  se media_final >= 7
  imprima aprovado;
  se media_final == 10;
  imprima voce passou
  senao
  imprima reprovado

  **/