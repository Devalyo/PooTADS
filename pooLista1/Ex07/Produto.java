package Ex07;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    public boolean definirPreco(double preco)
    {
        if(preco < 0)
        {
            System.out.println("Nao pode ser negativo");
            return false;
        }

        this.preco = preco;
        return true;

    }
    public void exibirInfo()
    {
        System.out.println(nome);
        System.out.println(preco);
    }
    
}
