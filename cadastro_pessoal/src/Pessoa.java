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

    private String nome;
    private Calendar dataNascimento = Calendar.getInstance();
    private int altura;
    
    String getNome()
    {
        return nome;
    }
    
    Calendar getData()
    {
        return dataNascimento;
    }
    
    int getAltura()
    {
        return altura;
    }
    
    void setNome(String name)
    {
        this.nome = name;
    }
    
    void setData(Calendar data)
    {
        this.dataNascimento = data;
    }
    void setAltura(int alt)
    {
        this.altura = alt;
    }
}