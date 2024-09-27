package Ex10;

public class Ex10 {
    public static void main(String[] args) {
        
        Banco db = new Banco();

        db.adicionarPessoas(new Pessoa("jao", 2, 1.2));
        db.adicionarPessoas(new Pessoa("tonhao", 2, 1.2));
        db.adicionarPessoas(new Pessoa("uuuh", 2, 1.2));
        db.ExibirPessoas();
        db.removerPessoas("jao");
        db.ExibirPessoas();
        db.adicionarPessoas(new Pessoa("emiri", 22, 1.72));
        db.adicionarPessoas(new Pessoa("dabuel", 21, 1.73));
        db.ExibirPessoas();
        
    }

    
}
