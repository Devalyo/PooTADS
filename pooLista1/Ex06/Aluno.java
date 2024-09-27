package Ex06;

public class Aluno 
{

    String name;
    double nota01;
    double nota02;

    public  Aluno(String nome, double nota01, double nota02)
    {
        this.name = nome;
        this.nota01 = nota01;
        this.nota02 = nota02;
    }


    public double calcularMedia()
    {
        double media = (this.nota01 + this.nota02) / 2;
        return media;

    }

    
}
