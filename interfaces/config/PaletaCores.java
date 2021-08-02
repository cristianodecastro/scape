package interfaces.config;

import java.awt.*;

public enum PaletaCores{ // Enum contendo a paleta de cores usada no jogo

    PRETO(21,21,21),
    AZUL(60,65,92),
    CINZA(180,165,165),
    CINZA_ESCURO(40,40,40),
    ROXO(48,27,63),
    VINHO(132,84,96);

    private final Color cor;

    PaletaCores(int r, int g, int b){
        this.cor = new Color(r, g, b);
    }

    //Getters
    public Color getCor(){
        return cor;
    }
}