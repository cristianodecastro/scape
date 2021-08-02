package interfaces.telas.combate;

import interfaces.componentes.Acao;
import interfaces.componentes.Caixa;
import monstros.Monstro;

public class AreaAcoes extends Caixa{ // Classe que constrói o componente que contém as ações do combate

    public AreaAcoes(Monstro monstro){
        this.acoesConfig(monstro);
    }

    private void acoesConfig(Monstro monstro){ // Método de configurações da caixa de ações
        Acao ataque = new Acao("Atacar");
        Acao fuga = new Acao("Fugir");
        ataque.ataqueConfig(monstro); // Atribuição das ações de ataque no botão
        fuga.fugaConfig(monstro); // Atribuição das ações de fuga no botão
        add(ataque); // Adição do botão de ataque
        add(fuga); // Adição do botão de fuga
    }
}