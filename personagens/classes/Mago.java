package personagens.classes;

import enredo.Historia;
import personagens.Atributos;

public class Mago extends ClassePersonagem{ // Classe do personagem Mago

    public Mago(){
        super.classe = "Mago";
        super.atributos = new Atributos(4,3,6,8,4); // Atributos predefinidos
        super.descricao = Historia.DESC_MAGO.getInfo();
    }
}