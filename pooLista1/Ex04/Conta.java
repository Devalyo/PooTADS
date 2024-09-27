package Ex04;

public class Conta {

    String numero;
    double saldo;

    public Conta(String numero, double saldo)
    {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void exibirSaldo()
    {
        System.out.println(saldo);
    }

    public void depositar(double valor)
    {
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor)
    {
        this.saldo = this.saldo - valor;
    }
    
}
