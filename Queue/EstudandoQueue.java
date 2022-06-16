package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*Resumo feito por João Bruno dos Santos Rijo em 16/06/2022 às 12:48
LinkedIn: BrunoRijo*/

public class EstudandoQueue {

    /*Queue são filas, ou seja uma 'lista linkada' onde o primeiro elemento
            que for inserido também será o primeiro a ser removido, ou manipulado*/

    public static void main(String[] args) {

//        Criando a fila que será usada para este estudo.
        Queue<String> filaDoCinema = new LinkedList<>(){{
            add("Alana");
            add("Michelle");
            add("Jonas");
            add("Ronaldo");
            add("Fernando");
        }};
        System.out.println(filaDoCinema);
        
        /*  Em uma fila(Queue) é preciso saber que se quisermos manipular um elemento, só poderemos
        fazer isso com o primeiro elemento. Podemos usar 3 métodos para isso.*/

        String clienteDaVez = filaDoCinema.poll(); //poll() captura o primeiro elemento e o remove da fila
        System.out.println("O cliente da vez é: "+clienteDaVez);
        System.out.println(filaDoCinema);

        String primeiroClie = filaDoCinema.peek();
        //peek() captura o primeiro elemento mas não o remove da fila, caso vazia retorna null
        System.out.println("O primeiro cliente da vila é:"  + primeiroClie);
        System.out.println(filaDoCinema);

        String mostraPrimeiroCLienteOuErro = filaDoCinema.element();
        /*Assim como o peek() retorna o primeiro elemento da fila sem removê-lo, porém caso a fila esteja vazia
        o element() garante que seja retornado um erro*/
        System.out.println(mostraPrimeiroCLienteOuErro);

        /*Para navegar nos elementos da fila, a maneira é semelhante a usada em listas.*/
//        -> Forma 1
        for (String elemento: filaDoCinema) System.out.println(elemento);

//        -> Forma 2
        Iterator<String> iterator = filaDoCinema.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());

//        Forma 3
        filaDoCinema.forEach(System.out::println);

        /*Além de também apresentar os métodos mais basicos como:*/
        filaDoCinema.size();
        filaDoCinema.clear();
        filaDoCinema.isEmpty();


    }

}

