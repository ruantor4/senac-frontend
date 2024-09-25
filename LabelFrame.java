import java.awt.FlowLayout; //importando java.awt.FlowLayout que é um componente de um móduto de uma biblioteca (pacote) Javax 
import javax.swing.JFrame; //importando javax.swing.JFrame que é um componente de um móduto de uma biblioteca (pacote) Javax 
import javax.swing.JLabel; //importando um componentejavax.swing.JLabel que é de um móduto de uma biblioteca (pacote) Javax 
import javax.swing.SwingConstants; //importando javax.swing.SwingConstants que é um componente de um móduto de uma biblioteca (pacote) Javax 
import javax.swing.Icon; //importando javax.swing.Icon que é um componente de um móduto de uma biblioteca (pacote) Javax 
import javax.swing.ImageIcon; //importando javax.swing.ImageIcon que é um componente de um móduto de uma biblioteca (pacote) Javax 


// DECLARAÇÃO DA CLASSE "LabelFrame" HERDANDO DA CLASSE "JFrame"
public class LabelFrame extends JFrame 
{ // INICIO DO BLOCO
   
   // DECLARAÇÃO DE VARIAVEIS "SOMENTE LEITURA" 
   private final JLabel label1; // JLabel with just text
   private final JLabel label2; // JLabel constructed with text and icon
   private final JLabel label3; // JLabel with added text and icon

   // CONTRUTOR "LabelFrame" sem argumentos.
   public LabelFrame()
   {// INICIO DO BLOCO DO CONSTRUTOR
      super("Testing JLabel");
      setLayout(new FlowLayout()); // DEFINIR DESIGN PARA RENDERIZAÇÃO
      
      // JLabel CONSTRUTOR COM ARGUMENTOS STRING
      label1 = new JLabel("Label with text");
      label1.setToolTipText("This is label1"); // QUANDO MOUSE ESTIVER EM CIMA INFORMAR STRING "DICA"
      add(label1); // ADICIONAR label1 NO JFrame

      // JLabel CONSTRUTOR INSTANCIANDO IMAGEM PNG A VARIAVEL BUG
      Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
      label2 = new JLabel("Label with text and icon", bug, 
         SwingConstants.LEFT); // swingConstants, ALINHAMENTO , DIREITO, ESQUERDO...
      label2.setToolTipText("This is label2");
      add(label2); // ADICIONAR LANEL2 AO JFrame

      label3 = new JLabel(); // JLabel CONSTRUTOR SEM ARGUMENTOS
      label3.setText("Label with icon and text at bottom"); // DEFINIR TEXTO DO LABEL3
      label3.setIcon(bug); // ADICIONAR A VARIAVEL BUG AO JLabel
      label3.setHorizontalTextPosition(SwingConstants.CENTER); // DEFINIR POSIÇÃO DO TEXTO HORIZONTAL
      label3.setVerticalTextPosition(SwingConstants.BOTTOM);// DEFINIR POSIÇÃO DO TEXTO VERTICAL
      label3.setToolTipText("This is label3");
      add(label3); // ADICIONAR LABEL3 AO JFrame
   } // FINAL DO CONSTRUTOR
} // FINAL DA CLASSE LabelFrame


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
