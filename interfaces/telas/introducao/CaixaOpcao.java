package interfaces.telas.introducao;

import interfaces.componentes.Caixa;
import interfaces.componentes.Opcao;
import interfaces.config.Configuracoes;
import interfaces.config.ListaInterfaces;
import java.awt.*;

public class CaixaOpcao extends Caixa{ // Classe que constrói o componente de container para o botão de prosseguir

    private final Opcao continuar = new Opcao("Continuar");

    public CaixaOpcao(){
        this.opcaoConfig();
        this.caixaConfig();
    }

    public void opcaoConfig(){ // Método de configuração do botão
        this.continuar.configAncoraInterface(ListaInterfaces.CRIACAO_PERSONAGEM.getTela());
    }

    private void caixaConfig(){ // Método de configuração da caixa
        setLayout(new GridBagLayout()); // Layout GridBag para o botão ficar centralizado
        setPreferredSize(new Dimension( // Configuração das dimensões da caixa
                Configuracoes.LARGURA_INTRO.getNum(),
                Configuracoes.ALTURA_OPCOES_INTRO.getNum()
        ));
        add(this.continuar); // Adicionando o botão
    }
}