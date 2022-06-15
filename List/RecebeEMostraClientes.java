
/*
Crie um objeto chamado Cliente com os atributos: id, nome, idade, telefone.
Faça um programa para solicitar os dados de vários clientes e armazenar em
um ArrayList até que se digite um número de ID negativo. Em seguida exiba
os dados de todos os clientes via SystemOut, formatando cada objeto separado por linhas.

Resolvida por João Bruno dos Santos Rijo em 15/06/2022 às 1:17
*/

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class recebeEMostraClientes {

    public static void main(String[] args) {
        List<Cliente> clienteList = new ArrayList<>();
        insere(clienteList);
        imprime(clienteList);
    }

    private static void imprime(List<Cliente> clienteList) {
        for (Cliente c: clienteList) System.out.println(c);
    }

    private static void insere(List<Cliente> clienteList) {
        do{
            int idAux = Integer.parseInt(JOptionPane.showInputDialog("Digite o id: "));
            if(idAux < 0) break;
            clienteList.add(new Cliente(
                    idAux
                    ,  JOptionPane.showInputDialog("Digite o nome: ")
                    ,  Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "))
                    ,  JOptionPane.showInputDialog("Digite o telefone: ")
            ));
        } while (true);
    }

}

class Cliente {
    Integer id, idade;
    String nome, telefone;

    public Cliente(Integer id,  String nome, Integer idade, String telefone) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public Integer getIdade() { return idade; }

    public void setIdade(Integer idade) { this.idade = idade; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone) { this.telefone = telefone; }

    @Override
    public String toString() {
        return "Cliente:" + id + " | " + idade + " |" + nome +" | "+ telefone;
    }
}
