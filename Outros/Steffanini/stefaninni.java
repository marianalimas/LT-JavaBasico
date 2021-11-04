package Steffanini;
import javax.swing.*;

    class Main {

          public static void main (String args[]) {

              new MaiorNotaInformada();
          }
      }

    class MaiorNotaInformada extends JOptionPane {

    	  public MaiorNotaInformada() {

      init();
  }

      private void init() {

      for (int i = 0; i < qtdNotas; i++) {

          nAtual = Float.parseFloat(showInputDialog(null, (i + 1) + " Nota: "));

          if (i == 0) {

              nMaior = nAtual;

              maiorNota = i + 1;

          } else {

              if (nAtual > nMaior) {

                  nMaior = nAtual;

                  maiorNota = i + 1;

              }

          }

      }

      showMessageDialog(null, "Maior nota: " + nMaior + "\nA maior nota digitada foi a " + maiorNota + ".");

  }



  private final int qtdNotas = 3;

  private float nAtual, nMaior = 0;

  private int maiorNota;

}


