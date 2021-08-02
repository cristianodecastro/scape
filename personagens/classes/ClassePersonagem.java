package personagens.classes;

import personagens.Atributos;

public abstract class ClassePersonagem{ // Superclasse das classes de personagem do jogo, Guerreiro, Ladino e Mago

    protected String classe;
    protected Atributos atributos;
    protected String descricao;

    //Getters
    public String getClasse() {
        return classe;
    }
    public Atributos getAtributos(){
        return atributos;
    }
    public String getDescricao(){
        return descricao;
    }
}