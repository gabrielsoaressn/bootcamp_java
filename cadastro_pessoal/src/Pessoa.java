/*
*Crie uma classe para representar uma pessoa, 
*com os atributos privados de nome, data de
*nascimento e altura. Crie os métodos públicos 
*necessários para sets e gets e também um
*método para imprimir todos dados de uma pessoa. 
*Crie um método para calcular a idade
*da pessoa.
*/
import java.util.Calendar;

public class Pessoa {
    
    Pessoa(){};

    static private String nome;
    static private Calendar dataNascimento = Calendar.getInstance();
    static private int altura;
    
    public String getNome()
    {
        return nome;
    }
    public Calendar getData()
    {
        return dataNascimento;
    }
    public int getAltura()
    {
        return altura;
    }
    
    public void setNome(String name)
    {
        nome = name;
    }
    public void setData(Calendar data)
    {
        dataNascimento = data;
    }
    public void setAltura(int alt)
    {
        altura = alt;
    }
}