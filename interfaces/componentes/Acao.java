package interfaces.componentes;

import combates.Acoes;
import monstros.Monstro;

public class Acao extends Btn{ // Subclasse de um botão, utilizado para as ações de combate

    public Acao(String texto){
        super(texto); // Envio do texto do botão para a superclasse
    }

    public void ataqueConfig(Monstro monstro){ // Método que chama as configurações de ataque para o botão
        addActionListener(e -> Acoes.confronto(monstro));
    }

    public void fugaConfig(Monstro monstro){ // Método que chama as configurações de fuga para o botão
        addActionListener(e -> Acoes.retirada(monstro));
    }
}