package Ex08;

public class Calculadora {

    public double somar(double number01, double number02)
    {
        return number01 + number02;

    }
    public double subtrair(double number01, double number02)
    {
        return number01 - number02;

    }
    public double multiplicar(double number01, double number02)
    {
        return number01 * number02;

    }
    public double dividir(double number01, double number02)
    {
        if(number02 == 0)
        {
            System.out.println("ERRO: DIVISAO POR ZERO");
            return 0;
        }

        return number01 / number02;
    }
    
}
