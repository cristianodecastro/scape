package interfaces.componentes;

import combates.Encontros;
import interfaces.telas.exploracao.Exploracao;
import mapa.Mapa;

import java.awt.*;

public class Link extends Btn{ // Subclasse de um botão, utilizado como porta de um local para outro

    public Link(String texto){
        super(texto); // Envio do texto do botão para a superclasse
    }

    public void configAncora(Mapa local){ // Método que interliga um lugar com outro
        addActionListener(e -> {
            Encontros.encontroPorNivelPerigo(local); // Ao clicar no botão, um possível encontro com um monstro pode acontecer
            CardLayout cl = (CardLayout) (Exploracao.getLocais().getLayout());
            cl.show(Exploracao.getLocais(), local.getNome());
        });
    }
}