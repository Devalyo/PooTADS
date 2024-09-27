package Ex02;

public class Circulo {

    double raio;

    public Circulo(double raio)
    {
        this.raio = raio;
    }

    public double calcularArea()
    {
        double result = Math.PI * (this.raio * this.raio);

        return result;

    }


    public double calcularPerimetro()   
    {
        double result = (2 * Math.PI) * this.raio;

        return result;

    }
}
