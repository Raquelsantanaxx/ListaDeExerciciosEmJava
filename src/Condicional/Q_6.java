package Condicional;

import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto 1 ");
        int produto1 = sc.nextInt();
        System.out.println("Digite o valor do produto 2 ");
        int produto2 = sc.nextInt();
        System.out.println("Digite o valor do produto 3 ");
        int produto3 = sc.nextInt();

        if(produto1 <= produto2 && produto1<= produto3) {
            System.out.println("Compre o produto1");

        } else if (produto2 <= produto1 && produto2<= produto3) {
            System.out.println("Compre o produto2");
        }else {
            System.out.println("Compre o produto3");
        }
    }
}


/*
* produto1
* produto2
* produto3
*
*
* se produto 1 >= produto 2 and produto 1 >= produto3;
* imprima ("Compre", produto1);
* se produto 2 >= produto 1 and produt
* */