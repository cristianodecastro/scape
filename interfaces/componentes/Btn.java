package interfaces.componentes;

import interfaces.config.PaletaCores;

import javax.swing.*;

public abstract class Btn extends JButton{

    public Btn(String texto){
        setText(texto);
        setForeground(PaletaCores.CINZA.getCor());
        setBackground(PaletaCores.AZUL.getCor());
        setFocusPainted(false);
    }
}