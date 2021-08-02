package interfaces.telas.exploracao;

import interfaces.componentes.Caixa;
import mapa.*;

import javax.swing.*;
import java.awt.*;

public class Exploracao extends Caixa{ // Classe que constrói a interface de exploração

    private static final JPanel locais = new JPanel(new CardLayout());

    public Exploracao(){
        super();
        this.montagemCard();
    }

    protected void montagemCard(){ // Método que adiciona todos os locais do jogo, contidos no enum Mapa
        locais.add(new Local(Mapa.CALABOUCO_SUP), Mapa.CALABOUCO_SUP.getNome());
        locais.add(new Local(Mapa.CALABOUCO_INF), Mapa.CALABOUCO_INF.getNome());
        locais.add(new Local(Mapa.MASMORRA_SUP), Mapa.MASMORRA_SUP.getNome());
        locais.add(new Local(Mapa.MASMORRA_CEN), Mapa.MASMORRA_CEN.getNome());
        locais.add(new Local(Mapa.MASMORRA_INF), Mapa.MASMORRA_INF.getNome());
        locais.add(new Local(Mapa.SAGUAO), Mapa.SAGUAO.getNome());
        locais.add(new Local(Mapa.CORREDOR_OESTE), Mapa.CORREDOR_OESTE.getNome());
        locais.add(new Local(Mapa.QUARTEL), Mapa.QUARTEL.getNome());
        locais.add(new Local(Mapa.FORJA), Mapa.FORJA.getNome());
        locais.add(new Local(Mapa.ARSENAL), Mapa.ARSENAL.getNome());
        locais.add(new Local(Mapa.CORREDOR_LESTE), Mapa.CORREDOR_LESTE.getNome());
        locais.add(new Local(Mapa.SALA_JANTAR), Mapa.SALA_JANTAR.getNome());
        locais.add(new Local(Mapa.COZINHA), Mapa.COZINHA.getNome());
        locais.add(new Local(Mapa.JARDIM), Mapa.JARDIM.getNome());
        locais.add(new Local(Mapa.TEMPLO), Mapa.TEMPLO.getNome());
        locais.add(new Local(Mapa.CEMITERIO), Mapa.CEMITERIO.getNome());
        locais.add(new Local(Mapa.CAVERNA), Mapa.CAVERNA.getNome());
        locais.add(new Local(Mapa.CRIPTA), Mapa.CRIPTA.getNome());
        locais.add(new Local(Mapa.SALA_TRONO), Mapa.SALA_TRONO.getNome());
        locais.add(new Local(Mapa.TORRE_REI), Mapa.TORRE_REI.getNome());
        locais.add(new Local(Mapa.QUARTO_REAL), Mapa.QUARTO_REAL.getNome());
        locais.add(new Local(Mapa.CORREDOR_SUL), Mapa.CORREDOR_SUL.getNome());
        locais.add(new Local(Mapa.MURALHA), Mapa.MURALHA.getNome());
        locais.add(new Local(Mapa.PORTOES), Mapa.PORTOES.getNome());
        add(locais);
    }

    //Getters
    public static JPanel getLocais(){
        return locais;
    }
}