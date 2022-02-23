import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner ler = new Scanner(System.in)) {
            int anos, meses, dias, idade; 
            System.out.println("Quantos anos você tem?");
            anos = ler.nextInt();

            System.out.println("Quantos meses você tem?");
            meses = ler.nextInt();

            System.out.println("Quantos dias você tem?");
            dias = ler.nextInt();
            idade = (365*anos)+(30*meses)+dias;
        
            System.out.format("%d anos + %d meses + %d dias = %d dias\n", anos, meses, dias, idade);
        }
        
    
    }
}
