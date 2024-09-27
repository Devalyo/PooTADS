package Ex09;

public class Ex09 {
    public static void main(String[] args) {

        Funcionario jao = new Funcionario("ahildo", 2000);

        System.out.println(jao.salario);
        jao.aumentarSalario(30);
        System.out.println(jao.salario);

        

    
    }
    
}
