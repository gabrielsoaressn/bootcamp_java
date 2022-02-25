import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------PESSOA--------");
        Pessoa p1 = new Pessoa(), p2 = new Pessoa();
        Calendar d1 = Calendar.getInstance(), d2 = Calendar.getInstance();
        
        d1.set(1998, 11, 27);
        p1.setAltura(168);
        p1.setData(d1);
        p1.setNome("Lucas");

        d2.set(2000, 3, 6);
        p2.setAltura(175);
        p2.setData(d2);
        p2.setNome("Gabriel");     
        
        System.out.printf("a) Nome : %s | altura : %dcm | data de nascimento : %d/%d/%d \n"
        , p1.getNome(), p1.getAltura(), p1.getData().get(5), p1.getData().get(2),
        p1.getData().get(1));

        System.out.printf("b) Nome : %s | altura : %dcm | data de nascimento : %d/%d/%d \n"
        , p2.getNome(), p2.getAltura(), p2.getData().get(5), p2.getData().get(2),
        p2.getData().get(1));

    }
}