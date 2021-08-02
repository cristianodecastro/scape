package interfaces;

import interfaces.telas.combate.Combate;
import interfaces.config.ListaInterfaces;
import interfaces.telas.criacao_personagem.CriacaoPersonagem;
import interfaces.telas.exploracao.Exploracao;
import interfaces.telas.fim.Derrota;
import interfaces.telas.fim.Vitoria;
import interfaces.telas.introducao.Introducao;
import interfaces.telas.menu_principal.MenuPrincipal;
import interfaces.telas.ranking.LeRanking;
import javax.swing.*;
import java.awt.*;

public class GerenciadorInterfaces{ // Classe responsável pelas alternâncias de interface

    private final static JPanel cards = new JPanel(new CardLayout());
    private final static CardLayout cl = (CardLayout) (cards.getLayout());

    public GerenciadorInterfaces(){ // Ao iniciar a aplicação, a interface do menu é criada
        menu();
    }
    
    public static void menu(){ // Adição da interface do menu
        cards.add(new MenuPrincipal().getCard(), ListaInterfaces.MENU_PRINCIPAL.getTela());
    }

    public static void ranking(){ // Adição da interface do ranking
        cards.add(new LeRanking().getCard(), ListaInterfaces.RANKING.getTela());
    }

    public static void iniciarNovoJogo(){ // Adição das interfaces de começo de jogo
        cards.add(new Introducao().getCard(), ListaInterfaces.INTRODUCAO.getTela());
        cards.add(new CriacaoPersonagem().getCard(), ListaInterfaces.CRIACAO_PERSONAGEM.getTela());
    }

    public static void inicializarInterfaceJogavel(){ // Adição das interfaces de exploração do jogo
        cards.add(new Exploracao().getCard(), ListaInterfaces.EXPLORACAO.getTela());
    }

    public static void adicionaCombate(Combate combate){ // Adição e alternância para a tela de combate
        cards.add(combate, ListaInterfaces.COMBATE.getTela());
        cl.show(cards, ListaInterfaces.COMBATE.getTela());
    }

    public static void terminarCombate(){ // Alternância para a tela de exploração após um combate acabar
        cl.show(cards, ListaInterfaces.EXPLORACAO.getTela());
    }

    public static void adicionaVitoria(){ // Adição da interface de vitória, ao chegar no fim do jogo
        cards.add(new Vitoria(), ListaInterfaces.VITORIA.getTela());
    }

    public static void adicionaDerrota(){ // Adição e aleternância para a interface de derrota ao morrer
        cards.add(new Derrota(), ListaInterfaces.DERROTA.getTela());
        cl.show(cards, ListaInterfaces.DERROTA.getTela());
    }

    //Getters
    public static JPanel getCards(){
        return cards;
    }
}