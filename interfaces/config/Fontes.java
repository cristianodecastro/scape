package interfaces.config;

import java.awt.*;

public enum Fontes{ // Enum contendo as fontes usadas no jogo

    TITULO("Candara",Font.BOLD,45),
    CABECALHO("Candara",Font.BOLD,28),
    TXT_MAIOR("Candara",Font.BOLD,20),
    TXT_MENOR("Candara",Font.BOLD,14);

    private final Font fonte;

    Fontes(String nome, int estilo, int tamanho){
        this.fonte = new Font(nome, estilo, tamanho);
    }

    //Getters
    public Font getFonte() {
        return fonte;
    }
}