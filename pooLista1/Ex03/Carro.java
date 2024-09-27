package Ex03;

public class Carro
{
    String modelo;
    String cor;
    int ano;

    public Carro(String modelo, String cor, int ano)
    {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void exibirDetalhes()
    {
        System.out.printf("%s\n%s\n%d\n", modelo, cor, ano);
    }

}