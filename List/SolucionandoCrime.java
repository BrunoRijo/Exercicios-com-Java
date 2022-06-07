/*

Utilizando listas, faça um programa que faça 5 perguntas para
uma pessoa sobre um crime. As perguntas são:
1 - Telefonou para a vitima?
2 - Esteve no local do crime?
3 - Mora perto da vitima?
4 - Devia para a vitima?
5 - Já trabalhou com a vitima?

Se a pessoa responder positivamente a 2 questoes ela sera uma suspeita
3 a 4 respostas, Cumplice e 5 como Assassina. Caso contrário será inocente


Questão resolvida em 06 de Junho de 2022 às 22:44
LinkedIn: https://linkedin.com/in/brunorijo
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolucionandoCrime {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>(){{
            add("Telefonou para a vitima?");
            add("Esteve no local do crime?");
            add("Mora perto da vitima?");
            add("Devia para a vitima?");
            add("á trabalhou com a vitima?");
        }};
        List<String> respostas = new ArrayList<>();

        for (int i = 0; i< perguntas.size(); i++){
            System.out.println(perguntas.get(i));
            respostas.add(scan.next());
        }

        System.out.println(analisaSuspeito(respostas));
    }

    private static String analisaSuspeito(List<String> respostas) {
        int suspeita = 0;
        for (int i = 0; i< respostas.size(); i++){
            if (respostas.get(i).equalsIgnoreCase("S")) suspeita++;
        }
        if (suspeita == 0) return "Inocente";
        if (suspeita <= 2) return "Suspeito!";
        else if (suspeita <= 4) return "Cumplice!";
        else return "Assassino";
    }


}


