package combates;

import aplicacao.Jogo;
import interfaces.GerenciadorInterfaces;
import interfaces.telas.combate.Combate;
import mapa.Mapa;
import monstros.ListaMonstros;
import monstros.Monstro;

import java.util.Objects;
import java.util.Random;

public class Encontros{ // Classe de gerenciamento de encontros com monstros

    public static void encontroPorNivelPerigo(Mapa local){ // Método que gerencia os possíveis encontros com um monstro
        Random rand = new Random();
        int aleat = rand.nextInt(100);
        System.out.println("Número aleatório gerado: "+aleat);
        if(aleat <= Jogo.getPerigo()){ // Verica se o número aleatório é menor que o nível de perigo do Jogo
            GerenciadorInterfaces.adicionaCombate(new Combate(local, Objects.requireNonNull(sorteadorMonstros())));
            Jogo.setPerigo(20); // Se for menor, um monstro é encontrado, sendo gerado uma tela de combate e o nível de perigo voltar para 20%
        }else{
            System.out.println("Nível de perigo: "+Jogo.getPerigo());
            Jogo.setPerigo(Jogo.getPerigo()+20); // A cada vez que um monstro não é encontrado em um novo lugar, as chances sobem em 20%
        }
    }

    private static Monstro sorteadorMonstros(){
        Random rand = new Random();
        int num = rand.nextInt(ListaMonstros.values().length);
        System.out.println("Número de monstro sorteado: "+num);
        switch(num){
            case 0:
                return new Monstro(ListaMonstros.ESQUELETO);
            case 1:
                return new Monstro(ListaMonstros.GOBLIN);
        }
        return null;
    }
}