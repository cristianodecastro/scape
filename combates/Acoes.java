package combates;

import aplicacao.Jogo;
import interfaces.telas.combate.Combate;
import interfaces.telas.combate.LogCombate;
import monstros.Monstro;

import java.util.Random;

public class Acoes{ // Classe com métodos estáticos para as ações de combate

    public static void confronto(Monstro monstro){ // Método que controla os ataques entre um jogador e um monstro
        int velJogador = Jogo.getJogador().getClasse().getAtributos().getVelocidade();
        int velMonstro = monstro.getVelocidade();
        if(velJogador >= velMonstro){ // Verificação das velocidades para ver quem ataca primeiro
            ataqueJogador(monstro);
            ataqueMonstro(monstro);
        }else{
            ataqueMonstro(monstro);
            ataqueJogador(monstro);
        }
    }

    private static void ataqueJogador(Monstro monstro){ // Método que controla o ataque do jogador
        Random rand = new Random();
        int forcaGolpe = Jogo.getJogador().getClasse().getAtributos().getForca();
        int sorteJogador = Jogo.getJogador().getClasse().getAtributos().getSorte();
        int aleat = rand.nextInt(100);
        if(aleat+sorteJogador > 90){
            forcaGolpe *= 2;
            LogCombate.addLog(" - Você acertou um golpe crítico no monstro e ele perdeu "+forcaGolpe+" de vida.");
        }else if(aleat+sorteJogador > 75){
            forcaGolpe = (int) (forcaGolpe * 1.5);
            LogCombate.addLog(" - Você acertou um golpe forte no monstro e ele perdeu "+forcaGolpe+" de vida.");
        }else if(aleat <= 5){
            forcaGolpe = 0;
            LogCombate.addLog(" - Você errou o seu ataque.");
        }else{
            LogCombate.addLog(" - Você atacou o monstro e ele perdeu "+forcaGolpe+" de vida.");
        }
        Jogo.getJogador().atacar(monstro, forcaGolpe);
    }

    private static void ataqueMonstro(Monstro monstro){ // Método que controla o ataque do monstro
        Random rand = new Random();
        int velocidadeJogador = Jogo.getJogador().getClasse().getAtributos().getVelocidade();
        int inteligenciaJogador = Jogo.getJogador().getClasse().getAtributos().getInteligencia();
        int sorteJogador = Jogo.getJogador().getClasse().getAtributos().getSorte();
        int poderGolpe = monstro.getPoder();
        int aleat = rand.nextInt(100);
        if(aleat-sorteJogador > 90){
            poderGolpe *= 2;
            LogCombate.addLog(" - O monstro te acertou um golpe crítico e você perdeu "+poderGolpe+" de vida.");
        }else if(aleat-sorteJogador > 75){
            poderGolpe = (int) (poderGolpe * 1.5);
            LogCombate.addLog(" - O monstro te acertou um golpe forte e você perdeu "+poderGolpe+" de vida.");
        }else if(aleat-sorteJogador < 30 && aleat-sorteJogador > 5){ // Uso da velocidade e inteligência para diminuir o dano sofrido
            poderGolpe -= (int) ((velocidadeJogador * 0.20)+(inteligenciaJogador * 0.20));
            LogCombate.addLog(" - O monstro não conseguiu te acertar em cheio e você perdeu "+poderGolpe+" de vida.");
        }else if(aleat <= 5){
            poderGolpe = 0;
            LogCombate.addLog(" - O monstro errou o seu ataque.");
        }else{
            LogCombate.addLog(" - O monstro te atacou e você perdeu "+poderGolpe+" de vida.");
        }
        monstro.atacar(poderGolpe);
    }

    public static void retirada(Monstro monstro){ // Método que controla as chances e consequências de uma fuga
        Random rand = new Random();
        int velJogador = Jogo.getJogador().getClasse().getAtributos().getVelocidade();
        int velMonstro = monstro.getVelocidade();
        int randomico = rand.nextInt(velJogador+velMonstro) + 1;
        System.out.println("Vel jog: "+velJogador);
        System.out.println("Vel mon: "+velMonstro);
        System.out.println("Número vencedor da velocidade: "+(randomico)); /////////
        if(randomico <= velJogador){
            Combate.terminarCombate(); // Se não for possível fugir, o monstro atacará
        }else{
            ataqueMonstro(monstro);
            LogCombate.addLog(" - Você não conseguiu fugir!");
        }
    }
}