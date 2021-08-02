package interfaces.telas.menu_principal;

import interfaces.componentes.Caixa;

public class MenuPrincipal extends Caixa{ // Classe que constrói a interface do menu principal

    public MenuPrincipal(){
        add(new Titulo()); // Adição do título do jogo
        add(new OpcoesMenu()); // Adição das opções do menu principal
    }
}