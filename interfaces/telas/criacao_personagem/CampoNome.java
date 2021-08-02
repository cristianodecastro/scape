package interfaces.telas.criacao_personagem;

import interfaces.componentes.Caixa;
import interfaces.componentes.Input;
import interfaces.componentes.Label;
import interfaces.config.Configuracoes;

import java.awt.*;

public class CampoNome extends Caixa{ // Classe que constrói o componente onde se define o nome do personagem

    private final Input campo = new Input();

    public CampoNome(){
        this.inputConfig();
        setPreferredSize(new Dimension( // Configuração das dimensões da caixa
                Configuracoes.LARGURA_CAIXAS.getNum(),
                Configuracoes.ALTURA_CAIXA_NOME.getNum()
        ));
        add(new Label("Nome: ")); // Adição de uma legenda para o input
        add(this.campo); // Adição do input
    }

    private void inputConfig(){ // Método de configuração do input
        this.campo.setPreferredSize(new Dimension( // Configuração das dimensões do input
                Configuracoes.LARGURA_INPUT_NOME.getNum(),
                Configuracoes.ALTURA_INPUT.getNum()
        ));
    }

    public String getNome(){ // Getter modificado para retornar somente o texto escrito dentro do input
        return this.campo.getText();
    }
}