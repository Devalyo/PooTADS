// Definição da Classe Carro
public class Carro {
    // Atributos (propriedades)
    String cor;
    String modelo;
    int ano;

    // Método construtor
    public Carro(String cor, String modelo, int ano) {
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para acelerar
    public void acelerar() {
        System.out.println("O carro está acelerando...");
    }

    // Método para frear
    public void frear() {
        System.out.println("O carro está freando...");
    }

    // Método para exibir as informações do carro
    public void exibirInfo() {
        System.out.println("Carro: " + modelo + " (" + cor + ", " + ano + ")");
    }

}