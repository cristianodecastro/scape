package interfaces.telas.exploracao;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import interfaces.componentes.Caixa;
import interfaces.componentes.TextoMaior;
import mapa.Mapa;
import java.awt.*;

public class Local extends Caixa{ // Classe usada como molde para todos os lugares do jogo

    public Local(Mapa local){ // O lugar é gerado através do local do Mapa que é passado
        setLayout(new BorderLayout()); // Layout de borda
        add(new ExploracaoCabecalho(local.getNome()), BorderLayout.NORTH); // Adição de um cabeçalho de exploração no topo
        add(new TextoMaior(local.getInfo()), BorderLayout.CENTER); // Adição de uma descrição para o local no centro, caso a imagem não seja encontrada
        add(new LinkGroup(local.getIndice()), BorderLayout.SOUTH); // Adição do grupo de botões que funcionam como portas para outros lugares
        this.configImg(local);
    }

    private void configImg(Mapa local){ // Método de configuração da imagem do local
        String nome = "cenario\\local\\";
        try{
            switch(local.getIndice()){ // Verificação através do índice de cada local
                case 0:
                    nome += "0_calab_sup.jpg";
                    break;
                case 1:
                    nome += "1_calab_inf.jpg";
                    break;
                case 2:
                    nome += "2_masm_sup.jpg";
                    break;
                case 3:
                    nome += "3_masm_cen.jpg";
                    break;
                case 4:
                    nome += "4_masm_inf.jpg";
                    break;
                case 5:
                    nome += "5_saguao.jpg";
                    break;
                case 6:
                    nome += "6_oeste.jpg";
                    break;
                case 7:
                    nome += "7_quartel.png";
                    break;
                case 8:
                    nome += "8_forja.jpg";
                    break;
                case 9:
                    nome += "9_arsenal.jpg";
                    break;
                case 10:
                    nome += "10_leste.png";
                    break;
                case 11:
                    nome += "11_jantar.jpg";
                    break;
                case 12:
                    nome += "12_cozin.jpg";
                    break;
                case 13:
                    nome += "13_jardim.jpg";
                    break;
                case 14:
                    nome += "14_templo.jpg";
                    break;
                case 15:
                    nome += "15_cemi.jpg";
                    break;
                case 16:
                    nome += "16_cave.jpg";
                    break;
                case 17:
                    nome += "17_cripta.png";
                    break;
                case 18:
                    nome += "18_trono.jpg";
                    break;
                case 19:
                    nome += "19_torre.jpg";
                    break;
                case 20:
                    nome += "20_quarto.jpg";
                    break;
                case 21:
                    nome += "21_sul.jpg";
                    break;
                case 22:
                    nome += "22_mura.jpg";
                    break;
                case 23:
                    nome += "23_portoes.jpg";
                    break;
            }
            BufferedImage arquivo = ImageIO.read(new File(nome));
            JLabel imagem = new JLabel(new ImageIcon(arquivo));
            add(imagem); // Adição de imagem no centro
        }catch(IOException e){ // Exceção caso a imagem não seja encontrada
            System.out.println("Imagem inacessível!");
        }
    }
}