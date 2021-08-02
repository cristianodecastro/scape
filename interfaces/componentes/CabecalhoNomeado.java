package interfaces.componentes;

import javax.swing.*;

public class CabecalhoNomeado extends Cabecalho{

    public CabecalhoNomeado(String nome){
        Legenda legenda = new Legenda(nome);
        legenda.setHorizontalAlignment(SwingConstants.CENTER);
        add(legenda);
    }
}