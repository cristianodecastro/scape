package interfaces.telas.criacao_personagem;

import interfaces.componentes.CabecalhoNomeado;
import interfaces.componentes.Caixa;

public class CriacaoPersonagem extends Caixa{ // Classe que constrói a interface de criação de personagem

    public CriacaoPersonagem(){
        add(new CabecalhoNomeado("Criar Personagem")); // Adição de um cabeçalho para a interface
        add(new Criacao()); // Adição do conteúdo de criação de personagem
        add(new CaixaOpcao()); // Adição de uma área para o botão
    }
}