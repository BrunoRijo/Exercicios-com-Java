
package Map.Exercicios;

import java.util.*;

public class Populacao {

    public static void main(String[] args) {

//      Questão 1
        Map<String, Integer> popNE = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println("Estados e populações: ");

//      Questão 2
        System.out.println("Substituindo a população de RN");
        popNE.put("RN", 354165);

//      Questão 3
        System.out.println("Caso a população da PB não esteja presente, vamos cadastrar. ");
        if (!popNE.containsKey("PB")) popNE.put("PB", 4039277);

//      Questão 4
        //Collection<populacaoNE> p = popNE.values();
        System.out.println("A população de PE é: "+ popNE.get("PE"));

//      Questão 5
        System.out.println("Ordem de inserção: ");
        for (Map.Entry<String, Integer> p : popNE.entrySet()) System.out.println(p.getKey()
                + " - " + p.getValue());

//      Questão 6
        Map<String, populacaoNE> p2 = new TreeMap(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println("Primeira versão da lista em ordem alfabética");
        for (Map.Entry<String, populacaoNE> p: p2.entrySet()) System.out.println(p.getKey()
                + " - " + p.getValue());

//      Questão 7
        Integer i = Collections.min(popNE.values());
        String estadoMin = "";
        for (Map.Entry<String, Integer> p : popNE.entrySet()){
            if(p.getValue().equals(i)) {
                estadoMin = p.getKey();
                System.out.print("O estado com menor população e sua qt: " + estadoMin + " - " + i);
            }
        }

//      Questão 8
        Integer j = Collections.max(popNE.values());
        String estadoMax = "";
        for (Map.Entry<String, Integer> p: popNE.entrySet()){
            if(p.getValue().equals(j)){
                estadoMax = p.getKey();
                System.out.println("\nO estado com maior população e sua qt: " + estadoMax + " - " + i);
            }
        }

//      Questão 9
        Iterator<Integer> iterator = popNE.values().iterator();
        Integer soma  = 0, tamanho = 0;
        while (iterator.hasNext()) {
            tamanho += 1;
            soma += iterator.next();
        }
        System.out.println("A soma das populações é:" + soma);

//      Questão 10
        System.out.println("A média das populações é: "+ soma/tamanho);

//      Questão 11
        popNE.clear();

//      Questão 12
        System.out.println("O dicionario está vazio? R: " + popNE.isEmpty());



    }

    private static void imprime(Map<String, Integer> popNE) {
        for (Map.Entry<String, Integer> p : popNE.entrySet()) {
            System.out.println("Estado - " + p.getKey()+
                    " População: " + p.getValue());
        }
    }
}

class populacaoNE {
    private String estado;
    private Integer populacao;

    public populacaoNE(String estado, int populacao) {
        this.estado = estado;
        this.populacao = populacao;
    }

    public String getEstado() {    return estado;    }

    public void setEstado(String estado) {   this.estado = estado;    }

    public int getPopulacao() {    return populacao;    }

    public void setPopulacao(int populacao) {    this.populacao = populacao;    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        populacaoNE that = (populacaoNE) o;
        return populacao == that.populacao && Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estado, populacao);
    }

    @Override
    public String toString() {
        return "populacaNE{" +
                "estado='" + estado + '\'' +
                ", populacao=" + populacao +
                '}';
    }

    public static class ComparaNomes implements Comparator<Map.Entry<String, populacaoNE>>{
        @Override
        public int compare(Map.Entry<String, populacaoNE> p1, Map.Entry<String, populacaoNE> p2) {
            return p1.getValue().getEstado().compareTo(p2.getValue().getEstado());
        }
    }
}

/*
Dada a população estimada de alguns estados no NE brasileiro, faça:
Estado = PE - População = 9.616.621
Estado = AL - População = 3.351.543
Estado = CE - População = 9.187.103
Estado = RN - População = 3.534.265
1 -> Crie um dicionário que relacione os estados e suas populações;
2 -> Substitua a popuação do estado RN por 3.534.165;
3 -> Confira se o estado PB está no dicionário, caso não esteja adicione:
    PB - 4.039.277;
4 -> Exiba a população do PE.
5 -> Exiba os estados e suas populações na ordem informada
6 -> Exiba os estados e suas populações em ordem alfabétia
7 -> Exiba o estado com o menor população e sua quantidade
8 -> Exiba o estado com o maior população e sua quantidade
9 -> Exiba a soma da população desses estados;
10 -> Exiba a média da população desses estados
11 -> Apague o dicionário de estados.
12 -> Confira se o dicionario está vazio.
*/


