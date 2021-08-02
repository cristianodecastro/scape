package personagens;

public class Atributos{ // Classe responsável pelos atributos que diferem cada tipo de personagem

    private final int vitalidade;
    private final int forca;
    private final int velocidade;
    private final int inteligencia;
    private final int sorte;

    public Atributos(int vi, int fo, int ve, int in, int so){ // Ao ser instanciado, os valores de cada atributo são dados de acordo com a classe do personagem
        this.vitalidade = vi;
        this.forca = fo;
        this.velocidade = ve;
        this.inteligencia = in;
        this.sorte = so;
    }

    //Getters
    public int getVitalidade(){
        return vitalidade;
    }
    public int getForca(){
        return forca;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public int getInteligencia(){
        return inteligencia;
    }
    public int getSorte(){
        return sorte;
    }
}