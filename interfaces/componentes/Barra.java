package interfaces.componentes;

import interfaces.config.PaletaCores;
import java.awt.*;

public class Barra extends Caixa {

    private final Caixa max = new Caixa();
    private final Caixa atual = new Caixa();

    public Barra(Color cor, double max, double atual){
        setLayout(new BorderLayout());
        add(this.max, BorderLayout.WEST);
        this.atualizarMax(max);
        this.atualizarAtual(atual);
        this.max.setLayout(new BorderLayout());
        this.max.setBackground(PaletaCores.CINZA_ESCURO.getCor());
        this.max.add(this.atual, BorderLayout.WEST);
        this.atual.setBackground(cor);
    }

    public void atualizarMax(double val){
        this.max.setPreferredSize(new Dimension((int)val,0));
    }
    public void atualizarAtual(double val){
        this.atual.setPreferredSize(new Dimension((int)val,0));
    }
}