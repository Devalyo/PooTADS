package Ex05;

public class Ret {

    double altura;
    double largura;

    public Ret(double altura, double largura)
    {
        this.altura = altura;
        this.largura = largura;
    }

    public double CalcularArea()
    {
        return altura * largura;
    }

    public int Comparar(Ret retangulo)
    {
        if(CalcularArea() > retangulo.CalcularArea())
        {
            return 1;

        }
        return 0;

    }
    
}
