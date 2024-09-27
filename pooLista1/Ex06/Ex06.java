package Ex06;

public class Ex06
{
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno("jao", 1.5, 10);
        Aluno aluno02 = new Aluno("pipi", 9.5, 8);
        Aluno aluno03 = new Aluno("jao", 2, 8);

        System.out.println(aluno01.calcularMedia());
        System.out.println(aluno02.calcularMedia());
        System.out.println(aluno03.calcularMedia());
        
    }
}