package interfaces;

import interfaces.config.Configuracoes;

import javax.swing.*;
import java.awt.*;

public class InterfaceJogo extends JFrame{ // Classe que configura a interface

    public InterfaceJogo(){
        new GerenciadorInterfaces(); // Instância da classe que gerencia a troca de interfaces
        getContentPane().add(GerenciadorInterfaces.getCards()); // Captura todas as interfaces do jogo pra dentro do JFrame
        this.configInterface();
    }

    private void configInterface(){ // Configurações da interface
        setTitle(Configuracoes.NOME_JOGO.getInfo()); // Título na barra superior da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Comportamento ao fechar a janela pelo X
        setSize(Configuracoes.LARGURA_INTERFACE.getNum(), Configuracoes.ALTURA_INTERFACE.getNum()); // Dimensões da janela
        setPreferredSize(new Dimension( // Dimensões da janela
                Configuracoes.LARGURA_INTERFACE.getNum(),
                Configuracoes.ALTURA_INTERFACE.getNum()
        ));
        setLocationRelativeTo(this); // Janela surgindo no meio da tela
        setResizable(false); // Bloqueio de redimensionamento da tela
        pack();
        setVisible(true);
    }
}