package interfaces.telas.criacao_personagem;

import interfaces.componentes.Caixa;
import personagens.classes.ClassePersonagem;
import personagens.classes.Guerreiro;
import personagens.classes.Ladino;
import personagens.classes.Mago;

import java.awt.*;

public class CaixaInfo extends Caixa{ // Classe que constrói o componente que conterá as informações das classes de personagem

    public CaixaInfo(){
        setLayout(new CardLayout()); // Layout de card para poder haver a alternância de conteúdo
        ClassePersonagem gue = new Guerreiro();
        ClassePersonagem lad = new Ladino();
        ClassePersonagem mag = new Mago();
        add(new InfoPersonagem(gue), gue.getClasse()); // Adição das informações do Guerreiro
        add(new InfoPersonagem(lad), lad.getClasse()); // Adição das informações do Ladino
        add(new InfoPersonagem(mag), mag.getClasse()); // Adição das informações do Mago
    }
}