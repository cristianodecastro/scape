package interfaces.telas.exploracao;

import interfaces.componentes.Legenda;
import interfaces.componentes.Caixa;
import interfaces.config.Configuracoes;

import javax.swing.*;
import java.awt.*;

public class ExploracaoCabecalho extends Caixa{ // Classe que constrói o componente de cabeçalho da interface de exploração

    public ExploracaoCabecalho(String local){
        setLayout(new GridLayout(1,2,20,0)); // Layout de grid
        setPreferredSize(new Dimension( // Configuração das dimensões do cabeçalho
                580, Configuracoes.ALTURA_CABECALHO.getNum()
        ));
        add(new BarraStatus()); // Adição de uma barra de status do personagem
        Legenda cab = new Legenda(local); // Instância de uma legenda com o nome do lugar atual
        cab.setHorizontalAlignment(SwingConstants.RIGHT); // Alinhamento da legenda para a direita
        add(cab); // Adição da legenda
    }
}