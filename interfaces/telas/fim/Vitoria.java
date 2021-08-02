package interfaces.telas.fim;

import interfaces.componentes.Caixa;
import interfaces.componentes.Legenda;
import interfaces.componentes.Opcao;
import interfaces.config.ListaInterfaces;

public class Vitoria extends Caixa{ // Classe que constrói a interface de vitória

    public Vitoria(){
        Opcao menu = new Opcao("Menu"); // Instância de um botão
        menu.configAncoraInterface(ListaInterfaces.MENU_PRINCIPAL.getTela()); // Linkagem do botão para o menu principal
        add(new Legenda("Você terminou o jogo!")); // Mensagem de término do jogo
        add(menu); // Adição do botão
    }
}