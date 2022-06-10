/*
Crie uma clase LinguagemFavorita que possua os atributos: nome, anoDeCriacao e ide.
Em seguida, crie um conjkunto com 3 linguagens e faça um programa que ordene esse
conjunto por
-> Ordem de inserção
-> Ordem Natural(Nome)
-> IDE
-> Ano de criação e nome
-> Nome, Ano de criação e ide

Ao final exiba as linguagens no console uma abaixo da outra.

Resolvida por João Buno dos Santos Rijo em 09/06/2022 às 22:51
LinkedIn: linkedin.com/in/brunorijo
*/

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinguagemFavorita {

    public static void main(String[] args) {
        Set<linguagem> languages = new LinkedHashSet<>(){{
            add(new linguagem("HTML", 1990 , "VisualStudio"));
            add(new linguagem("Java", 2004, "IntelliJ"));
            add(new linguagem("Kotlin", 2009, "Android Studio"));
        }};

        System.out.println("Ordem de Inserção: ");
        System.out.println(languages.toString());

        System.out.println("Ordem Natural: ");
        Set<linguagem> l2 = new TreeSet<>(languages);
        for (linguagem l : l2) System.out.print(l.getNome()+ " " + l.getAnoDeCriacao() + " " + l.getIde()+ ".");

        System.out.println("\nOrdem de IDE");
        Set<linguagem> l3 = new TreeSet<>(new comparaIDE());
        l3.addAll(languages);
        for (linguagem l : l3) System.out.print(l.getNome()+ " " + l.getAnoDeCriacao() + " " + l.getIde()+ ".");

        System.out.println("\n Ordem Ano e Nome");
        Set<linguagem> l4 = new TreeSet<>(new comparaAnoNome());
        l4.addAll(languages);
        for (linguagem l : l4) System.out.print(l.getNome()+ " " + l.getAnoDeCriacao() + " " + l.getIde()+ ".");

        System.out.println("\n Ordenar por Nome, Ano de criação e ide: ");
        Set<linguagem> l5 = new TreeSet<>(new comparaNomeAnoIDE());
        l5.addAll(languages);
        for (linguagem l : l5) System.out.print(l.getNome()+ " " + l.getAnoDeCriacao() + " " + l.getIde()+ ".");
    }
}

class linguagem implements Comparable<linguagem>{
    String nome;
    int anoDeCriacao;
    String ide;

    public linguagem(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return nome + '\'' +  anoDeCriacao +  ide + '\'';
    }

    @Override
    public int compareTo(linguagem linguagem) {
        int i = this.getNome().compareTo(linguagem.getNome());
        if (i != 0) return i;
        else return 0;
    }
}

class comparaIDE implements Comparator<linguagem>{

    @Override
    public int compare(linguagem o1, linguagem o2) {
        int i = o1.getIde().compareTo(o2.getIde());
        if (i != 0) return i;
        else return 0;
    }
}

class comparaAnoNome implements Comparator<linguagem>{

    @Override
    public int compare(linguagem o1, linguagem o2) {
        int i = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if (i != 0 ) return i;

        int j = o1.getNome().compareTo(o2.getNome());
        if (j != 0) return j;

        else return 0;
    }
}

class comparaNomeAnoIDE implements Comparator<linguagem>{

    @Override
    public int compare(linguagem o1, linguagem o2) {
        int i = o1.getNome().compareTo(o2.getNome());
        if (i!=0) return i;

        int j = o1.getIde().compareTo(o2.getIde());
        if(j!=0) return j;

        return Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
    }
}


