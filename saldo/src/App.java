import java.util.Random;
/*
* O programa deve exibir o saldo do cliente, reajustá-lo com
* o acréscimo de 1% e exibir o valor reajustado.
*/
public class App {
    public static void main(String[] args) throws Exception {

        //gerando número aleatório que vai ser o saldo
        Random random = new Random();
        double numeroAleatorio = random.nextDouble()*5000;
        
        float saldoInicial;
        float saldoFinal;

        System.out.println("----------SALDO-------------");
        
        saldoInicial = (float)numeroAleatorio;
        System.out.printf("seu saldo inicial é %.2f\n", saldoInicial);
        
        saldoFinal = (float)(saldoInicial * 1.01);
        System.out.printf("com o reajuste ele fica %.2f\n", saldoFinal);
    }
}
