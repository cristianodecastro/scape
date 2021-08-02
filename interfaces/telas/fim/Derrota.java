package interfaces.telas.fim;

import interfaces.componentes.Caixa;
import interfaces.componentes.Legenda;
import interfaces.componentes.Opcao;
import interfaces.config.ListaInterfaces;

public class Derrota extends Caixa{ // Classe que constrói a interface de derrota

    public Derrota(){
        Opcao menu = new Opcao("Menu"); // Instância de um botão
        menu.configAncoraInterface(ListaInterfaces.MENU_PRINCIPAL.getTela()); // Linkagem do botão para o menu principal
        add(new Legenda("Você Morreu!")); // Mensagem de término do jogo
        add(menu); // Adição do botão
    }
}