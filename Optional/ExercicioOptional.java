/*
Crie um optional de um determinado tipo de dado
-> Crie com estado vazio, estado presente e com null
-> Se presente, exiba o valor no console
-> Se vazio, lance uma exceção IlegalStateException
-> Se vazio exiba "Optional vazio" no console
-> se presente, transforme o valor e exiba no console
-> Se presente, pegue o valor do optional e atribua em uma variavel
*/

import java.util.Optional;

public class exerciseWithOptional {

    public static void main(String[] args) {

        Optional<String> optionalVazio = Optional.empty();
        String variavelPresent = "Test", variavel2 = "";
        Optional<String> optionalPresente = Optional.of(variavelPresent);
        String variavelNula = null;
        Optional<String> optionalNulo = Optional.ofNullable(variavelNula);

        optionalPresente.ifPresent(System.out::println);
        if (optionalVazio.isEmpty())System.out.println("Optional Vazio");
        //optionalVazio.orElseThrow(IllegalMonitorStateException::new);

        optionalPresente.map((v) -> v.concat(" **Plus adventure!")).ifPresent(System.out::println);
        if(optionalPresente.isPresent()) variavel2 = optionalPresente.get();
        if(optionalPresente.isPresent()) System.out.println(variavel2);
    }
}

