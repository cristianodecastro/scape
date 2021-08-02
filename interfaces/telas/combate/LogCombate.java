package interfaces.telas.combate;

import interfaces.componentes.Caixa;
import interfaces.componentes.Scroll;
import interfaces.componentes.TextoMenor;
import interfaces.config.Configuracoes;
import interfaces.config.PaletaCores;

import java.awt.*;

public class LogCombate extends Caixa{ // Classe que constrói o componente que contém as informações do combate

    private static final TextoMenor log = new TextoMenor("");
    private final Scroll scroll = new Scroll(log);

    public LogCombate(){
        this.logConfig();
    }

    private void logConfig(){ // Método de configurações do LogCombate
        log.setBackground(PaletaCores.AZUL.getCor()); // Mudança de cor do fundo para azul
        log.setMargin(new Insets(5,10,5,10)); // Adição de uma margem para o texto em relação à borda da caixa
        this.scroll.setPreferredSize(new Dimension( // Configuração das dimensões da caixa
                Configuracoes.LARGURA_LOG_COMBATE.getNum(),
                Configuracoes.ALTURA_LOG_COMBATE.getNum()
        ));
        this.scroll.getVerticalScrollBar().setPreferredSize(new Dimension( // Configuração das dimensões do scroll
                Configuracoes.LARGURA_SCROLL.getNum(),
                Configuracoes.ALTURA_LOG_COMBATE.getNum()
        ));
        add(this.scroll); // Adição da caixa que contém o scroll
    }

    public static void addLog(String newLog){
        log.setText(log.getText()+newLog+"\n");
    }

    public static void zerarLog(){
        log.setText("");
    }
}