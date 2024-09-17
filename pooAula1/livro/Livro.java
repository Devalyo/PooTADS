package livro;
public class Livro
{
    String titulo;
    String autor;
    int ano;

    public Livro(String titulo, String autor, int ano)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void info()
    {
       System.out.printf("Titulo: %s \nAutor: %s\nAno: %d\n", titulo, autor, ano); 

    }
    
    public void alterarTitulo(String titulo)
    {
        this.titulo = titulo;

    }

}