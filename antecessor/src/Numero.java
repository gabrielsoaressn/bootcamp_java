public class Numero
{
    public Numero(int valor)
    {
        this.valor = valor;
    }
    int valor;

    int getAntecessor()
    {
        int ant = valor-1;
        return ant;
    }

    int getSucessor()
    {
        int suc = valor + 1;
        return suc;
    }
}