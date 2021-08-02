package monstros;

import aplicacao.Jogo;
import interfaces.telas.combate.Combate;

public class Monstro{ // Classe que contem os atributos e ações de um monstro, seja esqueleto ou goblin

    private final int indice;
    private final int poder;
    private final int velocidade;
    private final String descricao;
    private int hpAtual;

    public Monstro(ListaMonstros monstro){ // Ao ser instanciado, são pegas as informações do monstro passado por parâmetro que estão na ListaMonstros
        this.hpAtual = monstro.getHp();
        this.velocidade = monstro.getVelocidade();
        this.poder = monstro.getPoder();
        this.descricao = monstro.getDescricao();
        this.indice = monstro.getIndice();
    }

    public void atacar(int golpe){ // Ao atacar, o monstro usa seu poder para diminuir a vida do jogador
        Jogo.getJogador().tomarDano(golpe);
    }

    public void tomarDano(int dano){ // O método é chamado quando o jogador causa dano ao monstro
        System.out.println("Vida monstro antes: "+ this.hpAtual);
        this.hpAtual -= dano;
        System.out.println("Vida monstro depois: "+ this.hpAtual);
        if(this.hpAtual <= 0){ // Se a vida do monstro atingir zero, o monstro morre
            this.morrer();
        }
    }

    private void morrer(){ // Ao morrer, a classe GerenciadorInterfaces retorna para os cards de exploração
        Jogo.getJogador().curar();
        Combate.terminarCombate();
    }

    //Getters
    public int getPoder(){
        return poder;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public String getDescricao(){
        return descricao;
    }
    public int getIndice(){
        return indice;
    }
}