package interfaces.telas.menu_principal;

import interfaces.config.Fontes;
import interfaces.config.Configuracoes;
import interfaces.config.PaletaCores;

import javax.swing.*;
import java.awt.*;

public class Titulo extends JLabel{ // Classe que estiliza o título do jogo, presente do menu principal

    public Titulo(){
        setText(Configuracoes.NOME_JOGO.getInfo()); // Nome do jogo
        setFont(Fontes.TITULO.getFonte()); // Configuração do estilo da fonte
        setForeground(PaletaCores.VINHO.getCor()); // Configuração da cor da fonte
        setHorizontalAlignment(SwingConstants.CENTER); // Texto centralizado
        setPreferredSize(new Dimension( // Configuração das dimensões do label
                Configuracoes.LARGURA_INTERFACE.getNum(),
                Configuracoes.ALTURA_TITULO.getNum()
        ));
    }
}