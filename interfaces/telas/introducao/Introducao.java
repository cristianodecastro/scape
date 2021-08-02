package interfaces.telas.introducao;

import interfaces.componentes.Caixa;

public class Introducao extends Caixa{ // Classe que constrói a interface de introdução

    public Introducao(){
        add(new CaixaHistoria()); // Adição da caixa que contém o texto de introdução
        add(new CaixaOpcao()); // Adição da caixa que contém o botão para prosseguir
    }
}