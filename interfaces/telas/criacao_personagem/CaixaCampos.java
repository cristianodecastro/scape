package interfaces.telas.criacao_personagem;

import interfaces.componentes.Caixa;


public class CaixaCampos extends Caixa {

    private final CampoNome nome = new CampoNome();
    private final CampoClasse classe = new CampoClasse();

    public CaixaCampos(){
        add(this.nome);
        add(this.classe);
    }

    public CampoNome getCampoNome(){
        return nome;
    }

    public CampoClasse getCampoClasse(){
        return classe;
    }
}