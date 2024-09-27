
import java.awt.FlowLayout;// IMPORTANDO COMPONENTE FlowLayout DO MODULO awt DA BIBLIOTECA javax. - a forma com que os objetos serao renderizados.
import java.awt.event.ActionListener;   // IMPORTAÇÃO DO COMPONENTE ActionListener DO MODULO event DA BIBLIOTECA javax - ação que usuario ira tomar
import java.awt.event.ActionEvent;  // IMPORTAÇÃO DO COMPONENTE ActionEvent DO MODULO event DA BIBLIOTECA javax - ação da decisão do usuario.
import javax.swing.JFrame; // IMPORTAÇÃO DO COMPONENTE JFrame DO MODULO swing DA BIBLIOTECA javax - estrutura do javanela
import javax.swing.JButton; // IMPORTAÇÃO DO COMPONENTE JButton DO MODULO swing DA BIBLIOTECA javax - estrutura do botao
import javax.swing.Icon; // IMPORTAÇÃO DO COMPONENTE Icon DO MODULO swing DA BIBLIOTECA javax - estrutura do icone " imagem do botao"
import javax.swing.ImageIcon; // IMPORTAÇÃO DO COMPONENTE ImageIcon DO MODULO swing DA BIBLIOTECA javax - imagem do icone
import javax.swing.JOptionPane; // IMPORTAÇÃO DO COMPONENTE JOptionPane DO MODULO swing DA BIBLIOTECA javax - caixa de dialogo

public class ButtonFrame extends JFrame // DECLARAÇÃO DA CLASSE ButtonFrame RECEBENDO HERANÇA JFrame
{
   private final JButton plainJButton; // DECLARAÇAÕ DA VARIAVEL DO TIPO JButton FINAL "SOMENTE LEITURA"
   private final JButton fancyJButton; // DECLARAÇAÕ DA VARIAVEL DO TIPO JButton FINAL "SOMENTE LEITURA"

   // CONSTRUTOR DA CLASSE
   public ButtonFrame()
   {
      super("Testing Buttons"); // DEFINIÇÃO DE TITULO DA JANELA
      setLayout(new FlowLayout()); 

      plainJButton = new JButton("Plain Button"); // ATRIBUIÇÃO DE UM NOVO OBJETO PARA VARIAVEL, COM STRING .
      add(plainJButton); // ADICIONANDO plainJButton AO JFrame

      Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif")); // ATRIBUIÇÃO DE VARIAVEL bug1 DO TIPO Icon, INSTANCIANDO COM ATRIBUTOS DESEJADOS
      Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
      fancyJButton = new JButton("Fancy Button", bug1); // ATRIBUINDO IMAGEM
      fancyJButton.setRolloverIcon(bug2); // TROCAR IMAGEM INTERATIVAMENTE QUANDO COLOCADO MOUSE EM CIMA
      add(fancyJButton); // ADICIONANDO fancyJButton AO JFrame

    
      ButtonHandler handler = new ButtonHandler(); // ATRIBUIÇÃO DE VARIAVEL handler DO TIPO ButtonHandler.
      fancyJButton.addActionListener(handler); // INVOCANDO METODO PARA COLETAR DADO MANIPULADO
      plainJButton.addActionListener(handler); // INVOCANDO METODO PARA COLETAR DADO MANIPULADO 
   }

   // CLASSE DE ENVENTO DE MANIPULAÇÃO DO BOTAO
   private class ButtonHandler implements ActionListener 
   {
      // METO SOBREESCRITO COM AÇÃO DO BOTÃO
      @Override
      public void actionPerformed(ActionEvent event)
      {  
         // MENSAGEM DE DIALOGO COM FORMATAÇÃO AO OBJETO DECLARADO.
         JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
            "You pressed: %s", event.getActionCommand()));
      }
   } 
} // FINAL DA CLASSE ButtonFrame

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
