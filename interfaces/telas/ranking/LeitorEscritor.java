package interfaces.telas.ranking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileNotFoundException;

public class LeitorEscritor
{
    public static void serializa (String nomeDoArq, Object object)
    {
        try
        {
            BufferedWriter file = new BufferedWriter(new FileWriter(nomeDoArq));

        }
        catch (FileNotFoundException e)
        {
            System.out.println ("Erro relacionado à escrita do arquivo.");
        }
        catch (IOException e)
        {
            System.out.println ("Erro relacionado à escrita do arquivo.");
        }
    }

    public static ArrayList <String> desserializa (String nomeDoArq)
    {
        ArrayList <String> lista = new ArrayList <String>();

        try
        {
            BufferedReader file = new BufferedReader (new FileReader(nomeDoArq));
            String abc;

            while ((abc = file.readLine()) != null)
            {
                lista.add (abc);
            }
            file.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println ("Erro relacionado à leitura do arquivo.");
        }
        catch (IOException e)
        {
            System.out.println ("Erro relacionado à leitura do arquivo.");
        }

        return lista;
    }
}