import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("----------NÚMERO-----------");
        System.out.printf("digite um número: ");
        num = sc.nextInt();
        
        Numero numero = new Numero(num);
        
        System.out.println("Seu antecessor é " + numero.getAntecessor() 
        + " e seu sucessor é " + numero.getSucessor() + ".");
        
         sc.close();
    }
}
