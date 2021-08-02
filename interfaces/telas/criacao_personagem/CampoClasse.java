package interfaces.telas.criacao_personagem;

import interfaces.componentes.Radio;
import interfaces.componentes.Label;
import interfaces.componentes.Caixa;
import interfaces.config.Configuracoes;
import personagens.classes.ClassePersonagem;
import personagens.classes.Guerreiro;
import personagens.classes.Ladino;
import personagens.classes.Mago;

import java.awt.*;

public class CampoClasse extends Caixa{ // Classe que constrói o componente onde se escolhe a classe de personagem do jogador

    private final Radio gue = new Radio("Guerreiro");
    private final Radio lad = new Radio("Ladino");
    private final Radio mag = new Radio("Mago");

    public CampoClasse(){
        this.radiosConfig();
        setLayout(new GridLayout(4,1)); // Layout de grid
        setPreferredSize(new Dimension( // Configuração das dimensões da caixa
                Configuracoes.LARGURA_CAIXAS.getNum(),
                Configuracoes.ALTURA_CAIXA_CLASSE.getNum()
        ));
        add(new Label(" Classe: ")); // Adição de uma legenda antes dos radios
        add(this.gue);
        add(this.lad); // Adição dos radios
        add(this.mag);
    }

    private void radiosConfig(){ // Método de configuração para os radios
        Radio.radioConfig(this.gue, this.lad, this.mag); // Colocando os botões em um grupo
        this.gue.setMargin(new Insets(0,20,0,0)); // Definindo uma margem para os radios
        this.lad.setMargin(new Insets(0,20,0,0));
        this.mag.setMargin(new Insets(0,20,0,0));
        this.gue.addActionListener(e -> this.alterarInfo("Guerreiro")); // Atribuição do evento para mudar o texto informativo sobre a classe de personagem selecionada
        this.lad.addActionListener(e -> this.alterarInfo("Ladino"));
        this.mag.addActionListener(e -> this.alterarInfo("Mago"));
        this.gue.setSelected(true); // Inicializa sempre com o Guerreiro marcado
    }

    private void alterarInfo(String info){ // Método que altera qual card de informação que será visto
        CardLayout cl = (CardLayout) (Criacao.getCaixaInfo().getLayout());
        cl.show(Criacao.getCaixaInfo(), info);
    }

    public ClassePersonagem getClasse(){ // Getter modificado para retornar a classe selecionada nos radios
        if(gue.isSelected()){
            return new Guerreiro();
        }else if(lad.isSelected()){
            return new Ladino();
        }else if(mag.isSelected()){
            return new Mago();
        }else{
            return null;
        }
    }
}