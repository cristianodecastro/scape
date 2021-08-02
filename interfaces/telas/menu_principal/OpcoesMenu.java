package interfaces.telas.menu_principal;

import interfaces.GerenciadorInterfaces;
import interfaces.componentes.Caixa;
import interfaces.componentes.Opcao;
import interfaces.config.ListaInterfaces;
import java.awt.*;

public class OpcoesMenu extends Caixa{ // Método que constrói o componente com as opções do menu principal

    private final Opcao iniciar = new Opcao ("Iniciar");
    private final Opcao sair = new Opcao ("Sair");
    private final Opcao ranking = new Opcao ("Ranking");

    public OpcoesMenu(){
        setLayout(new GridLayout(3,1,0,5)); // Layout em grid
        this.opcoesConfig();
    }

    private void opcoesConfig(){ // Método de configuração das opções do menu
        this.iniciar.configAncoraInterface(ListaInterfaces.INTRODUCAO.getTela()); // Linkagem de telas
        this.ranking.configAncoraInterface(ListaInterfaces.RANKING.getTela());
        this.iniciar.addActionListener(e -> GerenciadorInterfaces.iniciarNovoJogo());
        this.ranking.addActionListener(e -> GerenciadorInterfaces.ranking());
        this.sair.addActionListener(e -> System.exit(0)); // Ao apertar no sair, o jogo é fechado
        add (this.iniciar);
        add (this.ranking); // Adição do botões
        add (this.sair);
    }
}