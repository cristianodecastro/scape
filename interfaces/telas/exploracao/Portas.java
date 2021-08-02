package interfaces.telas.exploracao;

import interfaces.GerenciadorInterfaces;
import interfaces.componentes.Caixa;
import interfaces.componentes.Link;
import interfaces.componentes.Opcao;
import interfaces.config.ListaInterfaces;
import mapa.Mapa;
import java.awt.*;
import java.util.ArrayList;

public class Portas extends Caixa{ // Classe que constrói o componente que contém todas as portas do jogo

    public Portas(int i){
        setLayout(new GridLayout(4,1)); // Layout de grid
        this.configPortas(i);
    }

    public void configPortas(int i){ // Método responsável por criar cada botão de link presente em cada local do jogo
        ArrayList <Link> caminhos = new ArrayList <>();
        switch(i){
            // calabouço superior
            case 0:
                caminhos.add (new Link (Mapa.MASMORRA_CEN.getNome()));
                caminhos.get (0).configAncora (Mapa.MASMORRA_CEN);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.CALABOUCO_INF.getNome()));
                caminhos.get (1).configAncora (Mapa.CALABOUCO_INF);
                add (caminhos.get (1));
                break;
            // calabouço inferior
            case 1:
                caminhos.add (new Link (Mapa.CALABOUCO_SUP.getNome()));
                caminhos.get (0).configAncora (Mapa.CALABOUCO_SUP);
                add (caminhos.get (0));
                break;
            case 2:
            // masmorra superior
                caminhos.add (new Link (Mapa.MASMORRA_CEN.getNome()));
                caminhos.get (0).configAncora (Mapa.MASMORRA_CEN);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.SAGUAO.getNome()));
                caminhos.get (1).configAncora (Mapa.SAGUAO);
                add (caminhos.get (1));
                break;
            // masmorra central
            case 3:
                caminhos.add (new Link (Mapa.MASMORRA_SUP.getNome()));
                caminhos.get (0).configAncora (Mapa.MASMORRA_SUP);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.CALABOUCO_SUP.getNome()));
                caminhos.get (1).configAncora (Mapa.CALABOUCO_SUP);
                add (caminhos.get (1));
                caminhos.add (new Link (Mapa.MASMORRA_INF.getNome()));
                caminhos.get (2).configAncora (Mapa.MASMORRA_INF);
                add (caminhos.get (2));
                
                break;
            // masmorra inferior
            case 4:
                caminhos.add (new Link (Mapa.MASMORRA_CEN.getNome()));
                caminhos.get (0).configAncora (Mapa.MASMORRA_CEN);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.CRIPTA.getNome()));
                caminhos.get (1).configAncora(Mapa.CRIPTA);
                add (caminhos.get (1));
                break;
            // saguão
            case 5:
                caminhos.add (new Link (Mapa.MASMORRA_SUP.getNome()));
                caminhos.get (0).configAncora(Mapa.MASMORRA_SUP);
                add (caminhos.get(0));
                caminhos.add (new Link (Mapa.CORREDOR_OESTE.getNome()));
                caminhos.get (1).configAncora (Mapa.CORREDOR_OESTE);
                add (caminhos.get (1));
                caminhos.add (new Link (Mapa.CORREDOR_LESTE.getNome()));
                caminhos.get (2).configAncora (Mapa.CORREDOR_LESTE);
                add (caminhos.get (2));
                caminhos.add (new Link (Mapa.CORREDOR_SUL.getNome()));
                caminhos.get (3).configAncora (Mapa.CORREDOR_SUL);
                add (caminhos.get (3));
                break;
            // corredor oeste
            case 6:
                caminhos.add (new Link (Mapa.SAGUAO.getNome()));
                caminhos.get (0).configAncora (Mapa.SAGUAO);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.QUARTEL.getNome()));
                caminhos.get (1).configAncora (Mapa.QUARTEL);
                add (caminhos.get (1));
                break;
            // quartel
            case 7:
                caminhos.add (new Link (Mapa.CORREDOR_OESTE.getNome()));
                caminhos.get (0).configAncora (Mapa.CORREDOR_OESTE);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.FORJA.getNome()));
                caminhos.get (1).configAncora (Mapa.FORJA);
                add (caminhos.get (1));
                caminhos.add (new Link (Mapa.ARSENAL.getNome()));
                caminhos.get (2).configAncora (Mapa.ARSENAL);
                add (caminhos.get (2));
                break;
            // forja
            case 8:
                caminhos.add (new Link (Mapa.QUARTEL.getNome()));
                caminhos.get (0).configAncora (Mapa.QUARTEL);
                add (caminhos.get (0));
                break;
            // arsenal
            case 9:
                caminhos.add (new Link (Mapa.QUARTEL.getNome()));
                caminhos.get (0).configAncora (Mapa.QUARTEL);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.MURALHA.getNome()));
                caminhos.get (1).configAncora (Mapa.MURALHA);
                add (caminhos.get (1));
                break;
            // corredor leste
            case 10:
                caminhos.add (new Link (Mapa.SAGUAO.getNome()));
                caminhos.get (0).configAncora (Mapa.SAGUAO);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.SALA_JANTAR.getNome()));
                caminhos.get (1).configAncora (Mapa.SALA_JANTAR);
                add (caminhos.get (1));
                break;
            // sala de jantar
            case 11:
                caminhos.add (new Link (Mapa.CORREDOR_LESTE.getNome()));
                caminhos.get (0).configAncora (Mapa.CORREDOR_LESTE);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.COZINHA.getNome()));
                caminhos.get (1).configAncora (Mapa.COZINHA);
                add (caminhos.get (1));
                break;
            // cozinha
            case 12:
                caminhos.add (new Link (Mapa.SALA_JANTAR.getNome()));
                caminhos.get (0).configAncora (Mapa.SALA_JANTAR);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.JARDIM.getNome()));
                caminhos.get (1).configAncora (Mapa.JARDIM);
                add (caminhos.get (1));
                break;
            // jardim
            case 13:
                caminhos.add (new Link (Mapa.COZINHA.getNome()));
                caminhos.get (0).configAncora (Mapa.COZINHA);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.TEMPLO.getNome()));
                caminhos.get (1).configAncora (Mapa.TEMPLO);
                add (caminhos.get (1));
                caminhos.add (new Link (Mapa.CORREDOR_SUL.getNome()));
                caminhos.get (2).configAncora (Mapa.CORREDOR_SUL);
                add (caminhos.get (2));
                caminhos.add (new Link (Mapa.MURALHA.getNome()));
                caminhos.get (3).configAncora (Mapa.MURALHA);
                add (caminhos.get (3));
                break;
            // templo
            case 14:
                caminhos.add (new Link (Mapa.JARDIM.getNome()));
                caminhos.get (0).configAncora (Mapa.JARDIM);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.CEMITERIO.getNome()));
                caminhos.get (1).configAncora (Mapa.CEMITERIO);
                add (caminhos.get (1));
                break;
            // cemitério
            case 15:
                caminhos.add (new Link (Mapa.TEMPLO.getNome()));
                caminhos.get (0).configAncora (Mapa.TEMPLO);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.CAVERNA.getNome()));
                caminhos.get (1).configAncora (Mapa.CAVERNA);
                add (caminhos.get (1));
                break;
            // caverna
            case 16:
                caminhos.add (new Link (Mapa.CEMITERIO.getNome()));
                caminhos.get (0).configAncora (Mapa.CEMITERIO);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.CRIPTA.getNome()));
                caminhos.get (1).configAncora (Mapa.CRIPTA);
                add (caminhos.get (1));
                break;
            // cripta
            case 17:
                caminhos.add (new Link (Mapa.CAVERNA.getNome()));
                caminhos.get (0).configAncora (Mapa.CAVERNA);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.MASMORRA_INF.getNome()));
                caminhos.get (1).configAncora (Mapa.MASMORRA_INF);
                add (caminhos.get (1));
                break;
            // sala do trono
            case 18:
                caminhos.add (new Link (Mapa.SAGUAO.getNome()));
                caminhos.get (0).configAncora (Mapa.SAGUAO);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.TORRE_REI.getNome()));
                caminhos.get (1).configAncora (Mapa.TORRE_REI);
                add (caminhos.get (1));
                break;
            // torre do rei
            case 19:
                caminhos.add (new Link (Mapa.SALA_TRONO.getNome()));
                caminhos.get (0).configAncora (Mapa.SALA_TRONO);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.QUARTO_REAL.getNome()));
                caminhos.get (1).configAncora (Mapa.QUARTO_REAL);
                add (caminhos.get (1));
                break;
            // quarto real
            case 20:
                caminhos.add (new Link (Mapa.TORRE_REI.getNome()));
                caminhos.get (0).configAncora (Mapa.TORRE_REI);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.MURALHA.getNome()));
                caminhos.get (1).configAncora (Mapa.MURALHA);
                add (caminhos.get (1));
                break;
            // corredor norte
            case 21:
                caminhos.add (new Link (Mapa.SAGUAO.getNome()));
                caminhos.get (0).configAncora (Mapa.SAGUAO);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.JARDIM.getNome()));
                caminhos.get (1).configAncora (Mapa.JARDIM);
                add (caminhos.get (1));
                break;
            // muralha
            case 22:
                caminhos.add (new Link (Mapa.JARDIM.getNome()));
                caminhos.get (0).configAncora (Mapa.JARDIM);
                add (caminhos.get (0));
                caminhos.add (new Link (Mapa.QUARTO_REAL.getNome()));
                caminhos.get (1).configAncora (Mapa.QUARTO_REAL);
                add (caminhos.get (1));
                caminhos.add (new Link (Mapa.PORTOES.getNome()));
                caminhos.get (2).configAncora (Mapa.PORTOES);
                add (caminhos.get (2));
                caminhos.add (new Link (Mapa.ARSENAL.getNome()));
                caminhos.get (3).configAncora (Mapa.ARSENAL);
                add (caminhos.get (3));
                break;
            // portões
            case 23:
                caminhos.add (new Link (Mapa.MURALHA.getNome()));
                caminhos.get (0).configAncora(Mapa.MURALHA);
                add (caminhos.get (0));

                //Criação do botão que leva ao final do jogo!
                GerenciadorInterfaces.adicionaVitoria();
                Opcao fim = new Opcao("Abrir portões");
                fim.configAncoraInterface(ListaInterfaces.VITORIA.getTela());
                add(fim);
                break;
        }
    }
}