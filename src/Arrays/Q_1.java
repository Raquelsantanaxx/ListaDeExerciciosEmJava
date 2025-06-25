package Arrays;
import java.util.Scanner;
public class Q_1 {
    public static void main(String [] args) {
        int[] A = new int[10];
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite 10 números inteiros");
        for(int i =0; i<A.length; i ++) {
            System.out.println("Posição" + i + " : ");
            A[i] = sc.nextInt();
        }

        for (int j : A)
            if (j % 5 == 0) {
                soma += j;
            }

        System.out.println("Soma dos elementos multiplos de 5: " + soma);

        sc.close();
    }

}



/*
. Criar um vetor A com 10 elementos inteiros.
 Implementar um programa
que determine a soma dos elementos ]
armazenados neste vetor que
são múltiplos de 5.
 */