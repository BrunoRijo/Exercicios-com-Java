package StreamAPI;

/*
Utilizando uma lista com um objeto complexo (Estudante, por exemplo)
realize as seguintes operações:
-> Transforme cada estudante em uma string com os atributos do objeto
-> Conte a quantidade de estudantes tem na coleção
-> Filtre estudantes com idade igual ou superior a 18 anos
-> Exiba cada elemento no console
-> Ordene os estudantes de maneira alfabética
-> Retorne estudantes com nome que possui a letra B
-> Retorne se existe ao menos um estudante com a letra D no nome
-> Retorne o estudante com maior idade da coleção, retorne o mais novo também.

Resolvido por João Bruno dos Santos Rijo às 13:48 em 23/06/2022
LinkedIn: https://linkedin.com/in/brunorijo
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class EstudanteStreamAPI {

    public static void main(String[] args) {

        List<Estudante> estudanteList = new ArrayList<>(){{
            add(new Estudante("Bruno", 27));
            add(new Estudante("Vitoria", 17));
            add(new Estudante("Raquel", 24));
            add(new Estudante("Tiago", 33));
            add(new Estudante("David", 30));
            add(new Estudante("Francisco das Chagas", 25));
        }};

        Stream<String> listaStrings = estudanteList.stream().map(Estudante::toString);
        listaStrings.forEach(System.out::println);

        System.out.println("Alunos com 18 anos ou mais");
        estudanteList.stream().filter(estudante -> estudante.getIdade() >= 18).forEach(System.out::println);

        System.out.println("Ordem alfabética");
        estudanteList.stream().sorted(Comparator.comparing(Estudante::getNome)).forEach(System.out::println);

        System.out.println("Estudantes com a letra B no nome");
        estudanteList.stream().filter(estudante -> estudante.getNome().contains("B")).forEach(System.out::println);

        System.out.println("Existe algum estudante com a letra D no nome? R:"
                + estudanteList.stream().anyMatch(estudante -> estudante.getNome().contains("D")));

        System.out.println("O Estudante mais velho é: "
        +estudanteList.stream().max(Comparator.comparing(Estudante::getIdade)).get());

        System.out.println("O Estudante mais jovem é: "
                +estudanteList.stream().min(Comparator.comparing(Estudante::getIdade)).get());

    }
}

class Estudante{
    String nome;
    int idade;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Estudante: " + nome + ',' + idade + " anos";
    }
}

