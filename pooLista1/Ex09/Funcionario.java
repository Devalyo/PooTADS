package Ex09;

public class Funcionario {

    String name;
    double salario;

    public Funcionario(String name, double salario)
    {
        this.name = name;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual)
    {
        if(percentual <= 0)
        {
            System.out.println("percentual invalido");
            return;
        }

        this.salario += this.salario * (percentual / 100);

    }
    
}
