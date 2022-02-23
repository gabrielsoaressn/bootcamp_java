public class App {
    public static void main(String[] args) throws Exception {
        /* Este programa deve tirar a média entre 3 notas: 7, 8 e 9.
        *  Depois a média de mais 3 notas: 4, 5 e 6
        *  Por fim, calcular a média das duas médias       
        */    
        System.out.println("----------MÉDIA DAS MÉDIAS---------------");
        float n1 = 7, n2 = 8, n3 = 9;
        float n4 = 4, n5 = 5, n6 = 6;
        float mediaMedias;

        mediaMedias = (((n1 + n2 + n3)/3)+((n4 + n5 + n6)/3))/2;
        System.out.println("A média das médias é " + mediaMedias);
        
    }
}
