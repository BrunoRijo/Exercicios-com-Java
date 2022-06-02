import java.util.Random;

public class Baralho {

    private Carta[] baralho = new Carta[56];
    Random random = new Random();

    public Baralho() {
        int contador = 0;
        String[] naipe = {"Copas", "Ouro", "Paus", "Espadas"};
        String[] faces = {"Az", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Damas", "Rei", "Coringa"};

        for (int i = 0; i < naipe.length; i++){
            for(int j = 0; j < faces.length; j++){
                this.baralho[contador] = new Carta(faces[j],naipe[i]);;
                contador++;
            }
        }
    }

    public void imprimeBaralho() {
        for (int i = 0; i< baralho.length; i++){
            System.out.print(baralho[i].getNomeCarta() + " de " + baralho[i].getNaipeCarta() + " ");
        }
        System.out.println("\n");
    }

    public void embaralhar(){
        for (int i = 0; i < baralho.length; i++){
            Carta cartaAux =  baralho[i];
            int prox = random.nextInt(baralho.length);
            baralho[i] = baralho[prox];
            baralho[prox] = cartaAux;
        }
    }

}

