package personagens.classes;

import enredo.Historia;
import personagens.Atributos;

public class Guerreiro extends ClassePersonagem{ // Classe do personagem Guerreiro

    public Guerreiro(){
        super.classe = "Guerreiro";
        super.atributos = new Atributos(7,8,4,2,4); // Atributos predefinidos
        super.descricao = Historia.DESC_GUERREIRO.getInfo();
    }
}