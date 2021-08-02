package interfaces.config;

public enum Configuracoes{ // Enum contendo configurações de nome e dimensões do jogo

    NOME_JOGO("Escape da Cidadela"),
    LARGURA_INTERFACE(700),
    ALTURA_INTERFACE(600),

    //Componentes Gerais
    LARGURA_BTN(100),
    ALTURA_BTN(30),
    LARGURA_SCROLL(10),
    LARGURA_CABECALHO(540),
    ALTURA_CABECALHO(50),
    LARGURA_LEGENDA(540),
    ALTURA_LEGENDA(30),
    ALTURA_INPUT(30),

    //Menu Principal
    ALTURA_TITULO(175),

    //Introdução
    LARGURA_INTRO(580),
    ALTURA_INTRO(450),
    ALTURA_OPCOES_INTRO(70),

    //Criação de Personagem
    LARGURA_CRIACAO(580),
    ALTURA_CRIACAO(325),
    LARGURA_CAIXAS(260),
    ALTURA_CAIXA_NOME(60),
    ALTURA_CAIXA_CLASSE(120),
    LARGURA_INPUT_NOME(190),
    ALTURA_OPCOES_CRIACAO(70),

    //Combate
    LARGURA_DESC_MONSTRO(580),
    ALTURA_DESC_MONSTRO(25),
    LARGURA_LOG_COMBATE(260),
    ALTURA_LOG_COMBATE(140);

    private String info;
    private int num;

    Configuracoes(String info){
        this.info = info;
    }
    Configuracoes(int num){
        this.num = num;
    }

    //Getters
    public String getInfo() {
        return info;
    }
    public int getNum() {
        return num;
    }
}