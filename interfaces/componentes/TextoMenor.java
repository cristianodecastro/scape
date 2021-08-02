package interfaces.componentes;

import interfaces.config.Fontes;

public class TextoMenor extends TextoMaior{ // Classe que herda as configurações de TextoMaior, porém diminui o tamanho da letra

    public TextoMenor(String txt) {
        super(txt); // Inserção do texto na superclasse
        setFont(Fontes.TXT_MENOR.getFonte()); // Mudança no estilo da fonte para uma menor
    }
}