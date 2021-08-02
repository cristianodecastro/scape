package monstros;

public enum ListaMonstros{ // Enum contendo informações sobre os monstros do jogo

    ESQUELETO(0,40,10,7,"Um esqueleto animado por magia das trevas.","0_esqueleto.jpg"),
    GOBLIN(1, 30,7,10,"Um pequeno goblinóide trapaceiro.","1_goblin.jpg");

    private final int indice;
    private final int hp;
    private final int poder;
    private final int velocidade;
    private final String descricao;
    private final String link;

    ListaMonstros(int indice, int hp, int poder, int velocidade, String descricao, String link){
        this.indice = indice;
        this.hp = hp;
        this.poder = poder;
        this.velocidade = velocidade;
        this.descricao = descricao;
        this.link = link;
    }

    //Getters
    public int getIndice(){
        return this.indice;
    }
    public int getHp(){
        return hp;
    }
    public int getPoder(){
        return poder;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getLink() {
        return link;
    }
}