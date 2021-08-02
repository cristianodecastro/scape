package interfaces.telas.exploracao;

import interfaces.componentes.Caixa;

public class LinkGroup extends Caixa{ // Pequena classe que constrói a caixa que contém todos os botões de porta

    public LinkGroup(int i){
        add(new Portas(i)); // Adição dos botões de porta
    }
}