package interfaces.telas.ranking;

import java.awt.Dimension;
import java.awt.*;
import java.util.ArrayList;
import interfaces.GerenciadorInterfaces;
import interfaces.componentes.Caixa;
import interfaces.componentes.Opcao;
import interfaces.componentes.TextoMaior;
import interfaces.config.Configuracoes;
import interfaces.config.ListaInterfaces;

public class LeRanking extends Caixa
{
    private TextoMaior rank;
    private final Opcao voltar = new Opcao ("Voltar");

    public LeRanking()
    {
        ArrayList <String> lista = new ArrayList <String>();

        lista = LeitorEscritor.desserializa ("interfaces\\telas\\ranking\\top3ranking.txt");

        rank = new TextoMaior (lista.get(0) + "\n" + lista.get(1) + "\n" + lista.get(2)
                               + "\n" + lista.get(3) + "\n" + lista.get(4));

        rank.setPreferredSize(new Dimension(
            Configuracoes.LARGURA_INTRO.getNum() / 2,
            Configuracoes.ALTURA_INTRO.getNum() / 2
            ));
        rank.setCaretPosition (0);
        rank.setMargin (new Insets (20, 20, 20, 20));
        add (rank);

        voltar.setLayout (new GridLayout (1,1,0,5));
        this.voltar.configAncoraInterface (ListaInterfaces.MENU_PRINCIPAL.getTela());
        this.voltar.addActionListener (e -> GerenciadorInterfaces.menu());
        add (voltar);
    }
}
