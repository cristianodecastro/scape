package interfaces.componentes;

import interfaces.config.Configuracoes;

import java.awt.*;

public class Cabecalho extends Caixa {

    public Cabecalho(){
        setPreferredSize(new Dimension(
                Configuracoes.LARGURA_CABECALHO.getNum(),
                Configuracoes.ALTURA_CABECALHO.getNum()
        ));
    }
}