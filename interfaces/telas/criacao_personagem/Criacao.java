package interfaces.telas.criacao_personagem;

import interfaces.componentes.Caixa;
import interfaces.config.Configuracoes;

import java.awt.*;

public class Criacao extends Caixa{ // Classe que constrói o componente que contem outros componentes

    private static final CaixaCampos inputs = new CaixaCampos();
    private static final CaixaInfo infos = new CaixaInfo();

    public Criacao(){
        setLayout(new GridLayout(1,2,10,0)); // Alteração para um layput de grid
        setPreferredSize(new Dimension( // Configuração das dimensões do container
                Configuracoes.LARGURA_CRIACAO.getNum(),
                Configuracoes.ALTURA_CRIACAO.getNum()
        ));
        add(inputs); // Adição de componentes de input à esquerda
        add(infos); // Adição de componentes de informação à direita
    }

    //Getters
    public static CaixaCampos getInputs() {
        return inputs;
    }
    public static CaixaInfo getCaixaInfo() {
        return infos;
    }
}