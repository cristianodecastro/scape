package interfaces.componentes;

import interfaces.config.PaletaCores;

import javax.swing.*;

public class Caixa extends JPanel{ // Classe que estiliza a caixa (container), muito utilizada no jogo inteiro

    public Caixa(){
        setBackground(PaletaCores.PRETO.getCor()); // Mudança do fundo para a cor preta
    }

    //Getters
    public JPanel getCard(){
        return this;
    }
}