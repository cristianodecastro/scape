package aplicacao;

import interfaces.InterfaceJogo;
import personagens.Personagem;

public class Jogo{ // Classe de controle do jogo

    private static Personagem jogador; // Personagem do jogador
    private static int perigo = 20; // Probabilidade em porcentagem de encontrar um monstro ao se deslocar

    public Jogo(){ // Ao ser instanciado, a classe Jogo inicializa a interface, instanciando a classe InterfaceJogo
        javax.swing.SwingUtilities.invokeLater(InterfaceJogo::new);
    }

    public static void definirPersonagem(Personagem personagem){ // Após o personagem ser criado, ele é armazenado por esse método
        jogador = personagem;
    }

    //Getters e Setters
    public static Personagem getJogador() {
        return jogador;
    }
    public static int getPerigo(){
        return perigo;
    }
    public static void setPerigo(int perigo){
        Jogo.perigo = perigo;
    }
}