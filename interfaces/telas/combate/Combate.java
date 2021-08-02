package interfaces.telas.combate;

import interfaces.GerenciadorInterfaces;
import interfaces.componentes.Caixa;
import interfaces.componentes.TextoMaior;
import interfaces.config.Configuracoes;
import interfaces.telas.exploracao.ExploracaoCabecalho;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import monstros.ListaMonstros;
import monstros.Monstro;
import mapa.Mapa;

import javax.swing.*;
import java.io.*;
import java.awt.*;

public class Combate extends Caixa{ // Classe que constrói a interface de combate

    public Combate(Mapa local, Monstro monstro){ // O Combate recebe o local atual e o monstro encontrado
        TextoMaior descricaoMonstro = new TextoMaior(monstro.getDescricao()); // Texto de descrição do monstro
        descricaoMonstro.setPreferredSize(new Dimension( // Configuração das dimensões da descrição
                Configuracoes.LARGURA_DESC_MONSTRO.getNum(),
                Configuracoes.ALTURA_DESC_MONSTRO.getNum()
        ));
        add(new ExploracaoCabecalho(local.getNome())); // Adição de um cabeçalho para a interface, com o local atual
        add(descricaoMonstro); // Adição da descrição do monstro
        this.configAreaCombate(monstro);
    }

    private void configAreaCombate(Monstro monstro){ // Método de configuração da área de combate
        String nome = "cenario\\combate\\";
        try{
            switch(monstro.getIndice()){ // Verificação de qual monstro foi encontrado
                case 0: // Esqueleto
                    nome += ListaMonstros.ESQUELETO.getLink();
                    break;
                case 1: // Góblin
                    nome += ListaMonstros.GOBLIN.getLink();
                    break;
            }
            BufferedImage arquivo = ImageIO.read(new File(nome));
            JLabel imagem = new JLabel(new ImageIcon(arquivo));
            add(imagem); // Adição da imagem do monstro
        }catch(IOException e){ // Exceção gerada caso o caminho para a imagem não estiver correto
            System.out.println ("Imagem inacessível!");
        }
        add(new AreaCombate(monstro)); // Adição da área de combate, onde estão contidas as opções e descrição da batalha
    }

    public static void terminarCombate(){ // Método chamado ao acabar um combate, assim que o monstro morrer
        LogCombate.zerarLog(); // Limpa o texto com as informações da batalha
        GerenciadorInterfaces.terminarCombate(); // Retorna para a interface de exploração
    }
}