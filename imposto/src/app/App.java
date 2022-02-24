package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("-----------CALCULA IMPOSTO--------");
        float valor1, valor2, IPI;
        int quant1, quant2;
        Scanner scanner = new Scanner(System.in);
        CalculaImposto ci =  new CalculaImposto();

        float imposto;

        System.out.printf("valor do item 1: ");
        valor1 = scanner.nextFloat();

        System.out.printf("valor do item 2: ");
        valor2 = scanner.nextFloat();

        System.out.printf("quantidade do item 1: ");
        quant1 = scanner.nextInt();

        System.out.printf("quantidade do item 2: ");
        quant2 = scanner.nextInt();

        System.out.printf("valor do IPI: ");
        IPI = scanner.nextFloat();

        scanner.close();

        imposto = ci.Calcula(valor1, valor2, quant1, quant2, IPI);

        System.out.printf("o valor do imposto a ser pago é R$%.2f\n", imposto);
    }
}
