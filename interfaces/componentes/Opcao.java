package interfaces.componentes;

import interfaces.GerenciadorInterfaces;
import interfaces.config.Configuracoes;
import java.awt.*;

public class Opcao extends Btn{ // Subclasse de um botão, utilizado para as opçoes de menus

    public Opcao(String texto){
        super(texto); // Envio do texto do botão para a superclasse
        setPreferredSize(new Dimension( // Configuração das dimensões do botão
                Configuracoes.LARGURA_BTN.getNum(),
                Configuracoes.ALTURA_BTN.getNum()
        ));
    }

    public void configAncoraInterface(String tela){ // Método que interliga uma interface à outra
        addActionListener(e -> {
            CardLayout cl = (CardLayout) (GerenciadorInterfaces.getCards().getLayout());
            cl.show(GerenciadorInterfaces.getCards(), tela);
        });
    }
}