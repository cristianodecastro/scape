package interfaces.componentes;

import interfaces.config.Fontes;
import interfaces.config.PaletaCores;
import javax.swing.*;

public class TextoMaior extends JTextArea{ // Classe que estiliza um painel de texto

    public TextoMaior (String txt){
        setText(txt); // Inserção do texto
        setEditable(false); // Altera a permissão para alterar o texto
        setLineWrap(true); // Ativa a quebra de linhas ao terminar o espaço para uma palavra grande
        setWrapStyleWord(true); // Linha só quebrando quando a palvra acabar
        setFont(Fontes.TXT_MAIOR.getFonte()); // Mudança no estilo da fonte
        setBackground(PaletaCores.PRETO.getCor()); // Mudança da cor de fundo para preto
        setForeground(PaletaCores.CINZA.getCor()); // Mudança na cor da letra para cinza
    }
}