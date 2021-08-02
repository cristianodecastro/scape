package interfaces.config;

public enum ListaInterfaces{ // Enum contendo a lista de interfaces do jogo

    MENU_PRINCIPAL ("Menu Principal"),
    RANKING ("Ranking"),
    INTRODUCAO ("Introdução"),
    CRIACAO_PERSONAGEM ("Criação de Personagem"),
    EXPLORACAO ("Exploração"),
    COMBATE ("Combate"),
    VITORIA ("Vitória"),
    DERROTA ("Derrota");

    private final String tela;

    ListaInterfaces(String tela){
        this.tela = tela;
    }

    //Getters
    public String getTela() {
        return tela;
    }
}