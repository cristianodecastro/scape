package mapa;

public enum Mapa{ // Enum contendo as informações dos locais do mapa

    CALABOUCO_SUP   (0, "Calabouço Superior", "Local inicial do jogo."),
    CALABOUCO_INF   (1, "Calabouço Inferior", "Nível inferior dos calabouços."),
    MASMORRA_SUP    (2, "Masmorra Superior", "Nível superior da masmorra."),
    MASMORRA_CEN    (3, "Masmorra Central", "Nível central da masmorra."),
    MASMORRA_INF    (4, "Masmorra Inferior", "Nível inferior da masmorra."),
    SAGUAO          (5, "Saguão", "Lugar com muitas conexões."),
    CORREDOR_OESTE  (6, "Corredor Oeste", "Corredor que leva ao quartel."),
    QUARTEL         (7, "Quartel", "Um lugar com uma mesa de reuniões para soldados."),
    FORJA           (8, "Forja", "Onde armas e armaduras são fabricadas."),
    ARSENAL         (9, "Arsenal", "Uma sala repleta de armas."),
    CORREDOR_LESTE  (10, "Corredor Leste", "Corredor que leva a sala de jantar."),
    SALA_JANTAR     (11, "Sala de Jantar", "Uma sala com uma grande mesa no centro."),
    COZINHA         (12, "Cozinha", "Onde são preparadas as refeições."),
    JARDIM          (13, "Jardim", "Ampla área exterior do castelo."),
    TEMPLO          (14, "Templo", "Um lugar para rituais religiosos."),
    CEMITERIO       (15, "Cemitério", "Local para o descanso dos nobres."),
    CAVERNA         (16, "Caverna", "Uma grande caverna labiríntica."),
    CRIPTA          (17, "Cripta", "Altar de reis."),
    SALA_TRONO      (18, "Sala do Trono", "Uma ampla sala com um trono."),
    TORRE_REI       (19, "Torre do Rei", "Torre que leva ao quarto real."),
    QUARTO_REAL     (20, "Quarto Real", "Aposentos do Rei."),
    CORREDOR_SUL    (21, "Corredor Sul", "Corredor que leva aos jardins dos castelo."),
    MURALHA         (22, "Muralha", "Grande muralha que cerca o castelo."),
    PORTOES         (23, "Portões", "Fim");

    private final int indice;
    private final String nome;
    private final String info;

    Mapa(int indice, String nome, String info){
        this.indice = indice;
        this.nome = nome;
        this.info = info;
    }

    //Getters
    public int getIndice(){
        return this.indice;
    }
    public String getNome(){
        return nome;
    }
    public String getInfo(){
        return this.info;
    }
}