package interfaces.componentes;

import interfaces.config.Fontes;
import interfaces.config.PaletaCores;
import javax.swing.*;

public class Radio extends JRadioButton{ // Classe que estiliza os botões de radio
    public Radio(String txt){
        setText(txt); // Inserção do texto
        setFont(Fontes.TXT_MAIOR.getFonte()); // Mudança no estilo do texto
        setBackground(PaletaCores.PRETO.getCor()); // Mudança na cor de fundo para preto
        setForeground(PaletaCores.CINZA.getCor()); // Mudança na cor da letra para cinza
    }

    public static void radioConfig(Radio rad1, Radio rad2, Radio rad3){ // Método que inclui três radios em um grupo
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rad1);
        grupo.add(rad2);
        grupo.add(rad3);
    }
}