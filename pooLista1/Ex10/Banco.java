package Ex10;

import java.util.ArrayList;

public class Banco {

    ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void adicionarPessoas(Pessoa guy)
    {
        pessoas.add(guy);

    }
    public void ExibirPessoas()
    {
        for(int i = 0; i < pessoas.size(); i++)
        {
            Pessoa people = pessoas.get(i);
            System.out.println("----- Pessoa " + (i + 1) + " ------");
            System.out.println(people.nome);
            System.out.println(people.idade);
            System.out.println(people.altura);
            System.out.println();
        }
    }

    public void removerPessoas(String nome)
    {
        for(int i = 0; i < pessoas.size(); i++)
        {
            Pessoa dude = pessoas.get(i);

            if(nome.equals(dude.nome))
            {
                pessoas.remove(i);
            }
        }

    }
    
}
