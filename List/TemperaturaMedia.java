/*
Faça um programa que receba a temperatura média dos 6 primeiros meses do ano
e armazene-as em uma lista. Após isto, calcule a média semestral de temperaturas
e mostre todas as temperatudas acima desta média, e em que mẽs eslas ocorreram
Ex. 1 - Janeiro, 2 Fevereiro e etc.

Resolvida por João Bruno dos Santos Rijo em 6 de Junho de 2022 às 22:14
LinkedIn: https://www.linkedin.com/in/brunorijo/
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TemperaturaMedia {

    public static void main(String[] args) {
        Double total = 0d, media;
        List<Double> temperaturas = new ArrayList(){{
            add(25d);
            add(16d);
            add(36d);
            add(20d);
            add(11d);
            add(30d);
        }};

//        Para calcular a média utilizarei um interator
        Iterator iterator = temperaturas.iterator();
        while (iterator.hasNext()){
            Double next = (Double) iterator.next();
            total += next;
        }
        media = total/temperaturas.size();
        System.out.println("A média das temperaturas é:" + media);

        System.out.println("Os meses com temperatura acima da média foram: ");
        for (int i = 0; i < temperaturas.size(); i++){
            if (temperaturas.get(i) > media) System.out.println(getMes(i) + " - " + temperaturas.get(i));
        }
    }

    private static String getMes(int mes){
        if (mes == 0) return "Janeiro";
        if (mes == 1) return "Fevereiro";
        if (mes == 2) return "Março";
        if (mes == 3) return "Abril";
        if (mes == 4) return "Maio";
        if (mes == 5) return "Junho";
        if (mes == 6) return "Julho";
        if (mes == 7) return "Agosto";
        if (mes == 8) return "Setembro";
        if (mes == 9) return "Outubro";
        if (mes == 10) return "Novembro";
        if (mes == 11) return "Dezembro";
        else return "";
    }
}

