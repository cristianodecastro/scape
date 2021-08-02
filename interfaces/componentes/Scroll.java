package interfaces.componentes;

import interfaces.config.PaletaCores;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

public class Scroll extends JScrollPane{ // Método que estiliza o painel com scroll

    public Scroll(JTextArea info){
        super(info); // Inclusão do painel com as informações dentro do painel com scroll
        this.configScroll();
    }

    private void configScroll(){ // Método que configura o painel com scroll
        setBorder(null); // Retira a borda do painel
        getVerticalScrollBar().setUI(new BasicScrollBarUI(){ // Estilização do scroll de rolagem do zero

            private JButton btnZerado(){ // Método que retorna um botão com dimensões desprezíveis
                JButton jbutton = new JButton();
                jbutton.setPreferredSize(new Dimension(0, 0));
                return jbutton;
            }

            @Override
            protected JButton createDecreaseButton(int orientation){ // Método que retira o botão do scroll
                return btnZerado();
            }

            @Override
            protected JButton createIncreaseButton(int orientation){ // Método que retira o botão do scroll
                return btnZerado();
            }

            @Override
            protected void configureScrollBarColors(){ // Método que configura as cores do scroll
                thumbHighlightColor = PaletaCores.AZUL.getCor();
                thumbLightShadowColor = PaletaCores.AZUL.getCor();
                thumbDarkShadowColor = PaletaCores.AZUL.getCor();
                thumbColor = PaletaCores.AZUL.getCor();
                trackColor = PaletaCores.PRETO.getCor();
            }
        });
    }
}