package interfaces.componentes;

import interfaces.config.Fontes;
import interfaces.config.PaletaCores;
import javax.swing.*;

public class Input extends JTextField{ // Classe que estiliza o input

    public Input(){
        setBackground(PaletaCores.AZUL.getCor()); // Mudança da cor de fundo para azul
        setForeground(PaletaCores.PRETO.getCor()); // Mudança da cor da letra para preto
        setFont(Fontes.TXT_MAIOR.getFonte()); // Mudança do estilo da fonte
        setBorder(null); // Exclusão da borda padrão feia do input
    }
}