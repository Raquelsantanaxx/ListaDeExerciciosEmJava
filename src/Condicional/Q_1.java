package Condicional;
import java.util.Scanner;
public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salario: ");
        double salario = sc.nextDouble();

        double percentual;
        if (salario <= 280.00) {
            percentual = 0.20;
        } else if (salario <= 700.00){
            percentual = 0.15;
        } else if (salario <=1500.00) {
            percentual = 0.10;
        } else  {
            percentual = 0.5;

        }

        double aumento = salario * percentual;
        double novoSalario = salario + aumento;

        System.out.println("Este é o salario antes do reajuste " + salario);
        System.out.println("Este é o percentual aplicado " + percentual);
        System.out.printf("Este é o valor do aumento R$ %.2f\n", aumento);
        System.out.println("Este é o seu novo Salario " + novoSalario);

        sc.close();
    }
}
