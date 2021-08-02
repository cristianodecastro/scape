package interfaces.telas.exploracao;

import interfaces.componentes.Barra;
import interfaces.componentes.Caixa;
import interfaces.config.PaletaCores;
import aplicacao.Jogo;
import java.awt.*;

public class BarraStatus extends Caixa{ // Classe que constrói o componente da barra de status do personagem (ainda não funcionando)

    public BarraStatus(){
        setLayout(new GridLayout(2,1,0,2)); // Layout de grid
        Barra barraHp = new Barra( // Instância da barra de vida
                PaletaCores.VINHO.getCor(),
                Jogo.getJogador().getHpMax() * 1.3,
                Jogo.getJogador().getHpAtual() * 1.3
        );
        add(barraHp); // Adição da barra de vida
        Barra barraMp = new Barra( // Instância da barra de mana
                PaletaCores.AZUL.getCor(),
                Jogo.getJogador().getMpMax() * 1.3,
                Jogo.getJogador().getMpAtual() * 1.3
        );
        add(barraMp); // Adição da barra de mana
    }
}