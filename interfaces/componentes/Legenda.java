package interfaces.componentes;

import interfaces.config.Fontes;
import interfaces.config.Configuracoes;
import interfaces.config.PaletaCores;

import javax.swing.*;
import java.awt.*;

public class Legenda extends JLabel{ // Classe que estiliza um texto que serve como legenda para outros componentes

    public Legenda(String txt){
        setText(txt); // Inclusão do texto para a legenda
        legendaConfig();
    }

    private void legendaConfig(){
        setFont(Fontes.CABECALHO.getFonte()); // Mudança no estilo da fonte
        setForeground(PaletaCores.VINHO.getCor()); // Mudança na cor da letra
        setPreferredSize(new Dimension( // Configuração das dimensões da caixa da legenda
                Configuracoes.LARGURA_LEGENDA.getNum(),
                Configuracoes.ALTURA_LEGENDA.getNum()
        ));
    }
}