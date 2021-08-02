package interfaces.telas.introducao;

import enredo.Historia;
import interfaces.componentes.Caixa;
import interfaces.componentes.Scroll;
import interfaces.componentes.TextoMaior;
import interfaces.config.Configuracoes;
import java.awt.*;

public class CaixaHistoria extends Caixa{ // Classe que constrói o componente de texto introdutório da história do jogo

    private final TextoMaior intro = new TextoMaior(Historia.BACKGROUND.getInfo());
    private final Scroll scroll = new Scroll(intro);

    public CaixaHistoria(){
        this.caixaConfig();
    }

    private void caixaConfig(){ // Método de configuração do texto com scroll
        this.intro.setCaretPosition(0); // Scroll sempre começar em cima
        this.intro.setMargin(new Insets(20,20,20,20)); // Definição de uma margem para o texto
        this.scroll.setPreferredSize(new Dimension( // Configuração das dimensões do texto
                Configuracoes.LARGURA_INTRO.getNum(),
                Configuracoes.ALTURA_INTRO.getNum()
        ));
        this.scroll.getVerticalScrollBar().setPreferredSize(new Dimension( // Configuração das dimensões do scroll
                Configuracoes.LARGURA_SCROLL.getNum(),
                Configuracoes.ALTURA_INTRO.getNum()
        ));
        add(this.scroll); // Adição do texto
    }
}