package interfaces.telas.combate;

import interfaces.componentes.Caixa;
import monstros.Monstro;

import java.awt.*;

public class AreaCombate extends Caixa{ // Classe que constrói o componente que contém ações e informações de um combate

    public AreaCombate(Monstro monstro){
        setLayout(new GridLayout(1, 2, 10, 0)); // Mudança para um layout de grid
        setPreferredSize(new Dimension(580, 150)); // Configuração das dimensões do componente
        add(new AreaAcoes(monstro)); // Adição da área que contém as ações do jogador
        add(new LogCombate()); // Adição da área onde é descrita as ações do combate
    }
}