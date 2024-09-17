package livro;
public class Exemplo02
{
    public static void main(String[] args) {

        Livro livro1 = new Livro("jajaj", "el toro", 1992);

        livro1.info();

        livro1.alterarTitulo("omagaa");
        System.out.println();

        livro1.info();
        
    }
    
}
