package Arrays;
import java.util.Scanner;
public class Q_3 {
    public static void main(String [] args) {
    Scanner sc = new Scanner (System.in);
    int [] A = new int [10];

    for(int i =0; i <A.length; i++) {
        System.out.println("Digite o valor da posição " + i + " : ");
        A[i] = sc.nextInt();
    }
    int soma =0;
    int igual = 0;
    int somaMaior =0;
    int qtidadeMaior = 0;

        for (int valor : A) {
            if (valor == 15) {
                igual++;
            } else if (valor < 15) {
                soma += valor;
            } else {
                qtidadeMaior++;
                somaMaior += valor;
            }
        }
    System.out.println("Vetor A[]: ");
    for(int i =0; i <A.length; i++) {
        System.out.println("VetorA[" + i + "] = " + A[i]);
    }
    System.out.println();
        System.out.println("A soma de elementos < 15 : " + soma );
        System.out.println("Qauntidade de numeros = 15 : " +  igual );
        System.out.println("A Média  de elementos > 15 : " + (somaMaior/qtidadeMaior));

    }
}


