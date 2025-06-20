package Condicional;
import java.util.Scanner;
public class Q_4 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o tipo de carne:");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int tipo = sc.nextInt();

        System.out.println("Digite a quantidade de carne:  ");
        double qtidade = sc.nextDouble();

        System.out.println("Pagamento no cartão tabajara? (S/n)");
        char cartao = sc.next().toUpperCase().charAt(0);

        String nomeCarne;
        double precoPorkg;

        switch (tipo) {
            case 1:
                nomeCarne = "Filé Duplo";
                precoPorkg = (qtidade <= 5) ? 4.90 : 5.80;
                break;
            case 2 :
                nomeCarne = "Alcatra";
                precoPorkg =(qtidade <= 5) ? 5.90 : 6.80;
                break;
            case 3 :
                nomeCarne = "Picanha";
                precoPorkg = (qtidade <= 5) ? 6.90 : 7.80;
                break;
            default:
                System.out.print("Não temos esse tipo de carne ");
                sc.close();
                return;
        }
        double total = precoPorkg * qtidade;
        boolean usaCartao = (cartao == 'S');
        double desconto = usaCartao ? total * 0.05 : 0;
        double totalFinal = total - desconto;

        //Nota
        System.out.println("Tipo de carne " + nomeCarne);
        System.out.println("Quantidade de carne " + qtidade);
        System.out.println("Preço " + totalFinal);
        System.out.println("Tipo de Pagamento " + (usaCartao ? "Cartão Tabajara" : "Outros"));
        System.out.printf("Desconto: R$ %.2f\n" , desconto);
        System.out.printf("Valor a pagar: R$ %.2f\n", totalFinal);

        sc.close();



    }
}

