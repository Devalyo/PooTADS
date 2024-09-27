package Ex04;

public class Ex04
{
    public static void main(String[] args) {

        Conta conta01 = new Conta("32131", 300);

        conta01.sacar(100);
        conta01.depositar(200);
        conta01.exibirSaldo();
        
    }

}