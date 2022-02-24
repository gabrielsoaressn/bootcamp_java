package app;

public class CalculaImposto
{
    float Calcula(float valor1, float valor2, int quant1, int quant2, float IPI)
    {
        return (valor1*quant1 + valor2*quant2)*(IPI/100 + 1);
    }
}