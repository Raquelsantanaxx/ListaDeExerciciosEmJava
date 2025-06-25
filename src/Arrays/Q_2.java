package Arrays;
import java.util.Scanner;
public class Q_2 {
    public static void main(String[] args) {
        int[] A = new int[10];
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int contador = 0;

        System.out.println("Digite os 10 numeros: ");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Posição" + i + " : ");
            A[i] = sc.nextInt();

            if (A[i] % 2 != 0) {
                soma += A[i];
                contador++;
            }
        }

            if (contador > 0) {
                double media = (double) soma / contador;
                System.out.println("media dos elementos impares" + media);
            } else {
                System.out.println("Não existe elemento impar");
            }
            sc.close();
        }
    }


/*
14. Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor.
 */