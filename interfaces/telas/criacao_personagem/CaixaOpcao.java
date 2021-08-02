package interfaces.telas.criacao_personagem;

import aplicacao.Jogo;
import interfaces.GerenciadorInterfaces;
import interfaces.componentes.Caixa;
import interfaces.componentes.Opcao;
import interfaces.config.Configuracoes;
import interfaces.config.ListaInterfaces;
import personagens.Personagem;
import personagens.classes.ClassePersonagem;

import java.awt.*;

public class CaixaOpcao extends Caixa{ // Classe que constrói o componente de container para o botão de finalizar a criação

    private final Opcao finalizar = new Opcao("Finalizar");

    public CaixaOpcao(){
        this.opcaoConfig();
        this.caixaConfig();
    }

    public void opcaoConfig(){ // Método de configuração do botão
        this.finalizar.configAncoraInterface(ListaInterfaces.EXPLORACAO.getTela()); // Ancorando o botão com a próxima tela, a de exploração
        this.finalizar.addActionListener(e -> {
            String nome = Criacao.getInputs().getCampoNome().getNome();
            ClassePersonagem classe = Criacao.getInputs().getCampoClasse().getClasse();
            if(!nome.isEmpty()){ // Verificação para ver se o nome não está vazio
                Jogo.definirPersonagem(new Personagem(nome, classe)); // Definição de um personagem para a classe controladora do jogo
                GerenciadorInterfaces.inicializarInterfaceJogavel(); // Inicializa a parte jogável das interfaces
            }
        });
    }

    private void caixaConfig(){ // Método de configuração da caixa
        setLayout(new GridBagLayout()); // Layout GridBag para o botão ficar centralizado
        setPreferredSize(new Dimension( // Configuração das dimensões da caixa
                Configuracoes.LARGURA_CRIACAO.getNum(),
                Configuracoes.ALTURA_OPCOES_CRIACAO.getNum()
        ));
        add(this.finalizar); // Adicionando o botão
    }
}