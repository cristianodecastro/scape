package enredo;

public enum Historia{ // Enum para armazenar o texto de história do jogo

    BACKGROUND("    Você acorda em cima de um punhado de feno, em uma cela quase sem iluminação. " +
            "Tonto pela dor de cabeça, não há nenhuma lembrança de como você veio parar nesse lugar, " +
            "cujo as paredes, chão e teto, são feitos de pedra. Não há nenhuma janela, apenas um portão, " +
            "feito de grossas grades de metal.\n\n    Ao conseguir focar a visão para o lado de fora da " +
            "grade, percebe-se um grande vulto humano guardando a prisão. Após dias de tentativas frustradas " +
            "de chamar a atenção do guarda, seu corpo vai ficando mais fraco e sua mente sem esperanças."+
            "    Sem noção de quanto tempo já se passou do seu cativeiro, em um inesperado " +
            "momento, você acorda e vê o portão aberto.\n\n    Fraco demais para sair correndo da cela, " +
            "calmamente você se dirige ao portão e, ao olhar mais atentamente para o chão pouco iluminado, " +
            "um corpo, provavelmente do vulto que guardava sua cela, se encontra morto aos seus pés." +
            "\n\n    Você está muito fraco, contudo, a esperança brota em sua mente."),
    DESC_GUERREIRO(" Treinado no manejo de armas, o guerreiro utiliza do aço para superar seus adversários."),
    DESC_LADINO(" Nunca ataca de frente e sempre consegue construir uma vantagem com sua esperteza."),
    DESC_MAGO(" Jovem estudante das artes místicas, capaz de feitos grandiosos através dos seus poderes.");

    private final String info;

    Historia(String info){
        this.info = info;
    }

    //Getters
    public String getInfo() {
        return info;
    }
}