package interfaces.telas.ranking;

import java.io.Serializable;

public class Jogador implements Serializable
{
    private String nome;
    private double score;

    public Jogador (String nome, double score)
    {
        this.nome = nome;
        this.score = score;
    }

    public void setScore (double score)
    {
        if (this.score >= score)
            this.score = Math.round (this.score * 100.0) / 100.0;

        else
            this.score = Math.round (score * 100.0) / 100.0;
    }

    public double getScore()
    {
        return this.score;
    }

    public String toString()
    {
        return nome + " \t\t\t" + score;
    }
}