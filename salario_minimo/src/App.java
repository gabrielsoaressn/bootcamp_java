import java.util.Scanner;
/*
*este programa deve receber o valor do salário do usuário e compara com o
salário mínimo no Brasil.
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---------SALARIO MINIMO---------");
        Scanner sc = new Scanner(System.in);
        SalarioMinimo sm = new SalarioMinimo();
        float salarioUser;

        final float salarioMinimo = 1211.98F;
        System.out.printf("seu salário: ");
        salarioUser = sc.nextFloat();
        sc.close();    

        System.out.printf("Seu salário é %.1f vezes o salário mínimo do Brasa\n", 
        (sm.QuantSalarios(salarioMinimo, salarioUser)));
    }
}
