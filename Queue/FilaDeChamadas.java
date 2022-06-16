package Queue;

/*Crie uo objeto Chamada e um fila que execute as seguintes operações:
-> Adicione 5 chamadas com protocolos diferentes;
-> Navegue na fila exibindo cada chamada no console
-> Consulte a primeira chamada da fila, sem removê-la
-> Consulte a primeira chamada da fila, removendo-a
-> Adicione uma nova chamada. E Verifique a posição em que a ela assumiu na fila.
-> Retorne o tamanho da fila
-> Verifique se a fila está vazia
-> Verifique se a chamada '22222' está na fila.

Exercicio Resolvido por João Bruno dos Santos Rijo em 16/06/2022 as 13:41
LinkedIn: https://linkedin.com/in/brunorijo

*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FilaDeChamadas {

    public static void main(String[] args) {

        Queue<Chamada> chamadas = new LinkedList<>(){{
            add(new Chamada(00000,"Luiza"));
            add(new Chamada(11111,"Bruno"));
            add(new Chamada(22222,"Francisco"));
            add(new Chamada(33333,"Tiago"));
            add(new Chamada(44444,"Antonio"));
        }};

        chamadas.forEach(System.out::println);

        System.out.println("A primeira chamada é: "+ chamadas.peek().protocolo);
        chamadas.forEach(System.out::println);

        System.out.println("Removendo a primeira chamada -> "+ chamadas.poll());
        chamadas.forEach(System.out::println);

        chamadas.add(new Chamada(55555,"Yasmim"));
        Iterator<Chamada> iterator = chamadas.iterator();
        int position = 1;
        while (iterator.hasNext())
            if(iterator.next().cliente.equalsIgnoreCase("Yasmim"))
                System.out.println("Yasmim foi adicionada na posição de numero:" + position);
            else position++;
        chamadas.forEach(System.out::println);

        System.out.println("O tamanho da fila é de: "+ chamadas.size()+" chamadas");
        System.out.println("A fila está vazia? R:"+ chamadas.isEmpty());



    }
}

class Chamada {
    Integer protocolo;
    String cliente;

    public Chamada(Integer protocolo, String cliente) {
        this.protocolo = protocolo;
        this.cliente = cliente;
    }

    public Integer getProtocolo() {
        return protocolo;
    }

    public String getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Chamada:" + protocolo +", cliente: " + cliente;
    }
}


