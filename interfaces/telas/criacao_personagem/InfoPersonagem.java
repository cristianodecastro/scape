package interfaces.telas.criacao_personagem;

import interfaces.componentes.Caixa;
import interfaces.componentes.TextoMaior;
import interfaces.config.Configuracoes;
import personagens.classes.ClassePersonagem;

import java.awt.*;

public class InfoPersonagem extends Caixa{ // Classe que constrói o componente que mostra as características de cada classe de personagem

    public InfoPersonagem(ClassePersonagem classe){
        TextoMaior info = new TextoMaior(this.info(classe)); // Texto da classe de personagem
        info.setPreferredSize(new Dimension( // Configuração das dimensões do texto
                Configuracoes.LARGURA_CAIXAS.getNum(),
                Configuracoes.ALTURA_CRIACAO.getNum()
        ));
        add(info);
    }

    private String info(ClassePersonagem classe){ // Método que retorna as informações da classe de personagem, de acordo com seu parâmetro
        return(classe.getClasse() + "\n" +
                "\n- Vitalidade: " + classe.getAtributos().getVitalidade() +
                "\n- Força: " + classe.getAtributos().getForca() +
                "\n- Velocidade: " + classe.getAtributos().getVelocidade() +
                "\n- Inteligência: " + classe.getAtributos().getInteligencia() +
                "\n- Sorte: " + classe.getAtributos().getSorte() + "\n" +
                "\n " + classe.getDescricao()
        );
    }
}