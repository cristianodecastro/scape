package interfaces.componentes;

import interfaces.config.Fontes;
import interfaces.config.PaletaCores;

import javax.swing.*;

public class Label extends JLabel{ // Classe que estiliza o label

    public Label(String txt){
        setText(txt); // Inclusão do texto do label
        setFont(Fontes.TXT_MAIOR.getFonte()); // Mudança no estilo da fonte
        setForeground(PaletaCores.CINZA.getCor()); // Mudança da cor da letra para cinza
    }
}