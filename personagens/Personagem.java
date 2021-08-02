package personagens;

import interfaces.GerenciadorInterfaces;
import monstros.Monstro;
import personagens.classes.ClassePersonagem;

import java.util.Random;

public class Personagem{ // Classe que contem os atributos e ações do personagem

    private final String nome;
    private final ClassePersonagem classe;
    private double hpMax;
    private double hpAtual;
    private final double mpMax;
    private final double mpAtual;

    public Personagem(String nome, ClassePersonagem classe){ // Ao ser instanciado, o nome e a classe escolhida na CriacaoPersonagem são passadas por parâmetro
        this.nome = nome;
        this.classe = classe;
        this.hpMax = this.classe.getAtributos().getVitalidade() * 10;
        this.hpAtual = this.hpMax;
        this.mpMax = this.classe.getAtributos().getInteligencia() * 10;
        this.mpAtual = this.mpMax;
    }

    public void atacar(Monstro monstro, int golpe){ // Ao atacar, o personagem usa sua força para diminuir a vida do monstro
        monstro.tomarDano(golpe);
    }

    public void curar(){ // Recuperação de hp do personagem após derrotar um monstro
        Random rand = new Random();
        this.hpMax++; // A cada monstro derrotado, o personagem terá mais vida
        int dif = (int) (this.hpMax - this.hpAtual);
        int aleat = rand.nextInt(100); // Recuperação de vida de acordo com a sorte
        if(aleat > 90){
            this.hpAtual = this.hpMax;
        }else if(aleat > 40){
            this.hpAtual += (int) (dif * 0.7);
        }else{
            this.hpAtual += (int) (dif * 0.5);
        }
        System.out.println("Fim de combate!");
        System.out.println("Vida Máxima: " + this.hpMax);
        System.out.println("Vida Atual: " + this.hpAtual);
    }

    public void tomarDano(int dano){ // O método é chamado quando o monstro causa dano ao jogador
        System.out.println("Vida jogador antes: "+ this.hpAtual);
        this.hpAtual -= dano;
        System.out.println("Vida jogador antes: "+ this.hpAtual);
        if(this.hpAtual <= 0){ // Se a vida do personagem atingir zero, ele morre
            this.morrer();
        }
    }

    private void morrer(){ // Ao morrer, a classe GerenciadorInterfaces cria a interface de Derrota
        GerenciadorInterfaces.adicionaDerrota();
    }

    //Getters
    public ClassePersonagem getClasse(){
        return classe;
    }
    public double getHpMax(){
        return hpMax;
    }
    public double getHpAtual(){
        return hpAtual;
    }
    public double getMpMax(){
        return mpMax;
    }
    public double getMpAtual(){
        return mpAtual;
    }
}