package personagens.classes;

import enredo.Historia;
import personagens.Atributos;

public class Ladino extends ClassePersonagem{ // Classe do personagem Ladino

    public Ladino(){
        super.classe = "Ladino";
        super.atributos = new Atributos(5,3,8,5,4); // Atributos predefinidos
        super.descricao = Historia.DESC_LADINO.getInfo();
    }
}