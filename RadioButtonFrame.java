// Fig. 12.19: RadioButtonFrame.java
// Creating radio buttons using ButtonGroup and JRadioButton.
// IMPORTE DE COMPONENTES QUE SERÃO UTILIZADO
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame // DECLARAÇÃO DA CLASSE RadioButtonFrame HERDANDO DE JFrame
{
   private JTextField textField; // DISPLAY PARA MUDANÇA DE FONTES
   private Font plainFont; // FONTE PARA SIMPLES
   private Font boldFont; // FONTE PARA NEGRITO
   private Font italicFont; // FONTE PARA ITALICO
   private Font boldItalicFont; // FONTE PARA ITALICO E NEGRITO
   private JRadioButton plainJRadioButton; // BOTÃO DE SELEÇÃO PARA FONTE SIMPLES
   private JRadioButton boldJRadioButton; // BOTÃO DE SELEÇÃO PARA FONTE NEGRITO
   private JRadioButton italicJRadioButton; // BOTÃO DE SELEÇÃO PARA FONTE ITALICO
   private JRadioButton boldItalicJRadioButton; // BOTÃO DE SELEÇÃO PARA FONTE ITALICO E NEGRITO
   private ButtonGroup radioGroup; // buttongroup MANTER SELEÇÃO DOS BOTOES

   // CONSTRUTOR RadioButtonFrame PARA ADICIONAR JRadioButtons AO JFrame
   public RadioButtonFrame()
   {
      super("RadioButton Test"); // DEFININDO TEXTO DA JANELA
      setLayout(new FlowLayout()); // DEFININDO O TIPO DE LAYOUT 

      textField = new JTextField("Watch the font style change", 25); // INSTANCIAÇÃO DA VARIAVEL DEFININDO TEXTO
      add(textField); // ADICIONANDO textField AO JFrame

      // CRIANDO BOTOES RADIO
      plainJRadioButton = new JRadioButton("Plain", true);
      boldJRadioButton = new JRadioButton("Bold", false);
      italicJRadioButton = new JRadioButton("Italic", false);
      boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
      add(plainJRadioButton); // ADICIONANDO BOTAO SIMPLES AO JFrame
      add(boldJRadioButton); // ADICIONANDO BOTAO NEGRITO AO JFrame
      add(italicJRadioButton); // ADICIONANDO BOTAO ITALICO AO JFrame
      add(boldItalicJRadioButton); // ADICIONANDO BOTAO ITALICO E NEGRITO AO JFrame

      // CRIANDO RELAÇÃO LOGICA AO JRadioButtons
      radioGroup = new ButtonGroup(); // CRIANDO ButtonGroup
      radioGroup.add(plainJRadioButton); // ADICIONANDO SIMPLES AO GRUPO
      radioGroup.add(boldJRadioButton); // ADICIONANDO NEGRITO AO GRUPO
      radioGroup.add(italicJRadioButton); // ADICIONANDO ITALICO AO GRUPO
      radioGroup.add(boldItalicJRadioButton); // ADICIONANDO ITALICO E NEGRITO AO GRUPO

      // CRIANDO FONTE AO OBJETOS
      plainFont = new Font("Serif", Font.PLAIN, 14); // DEFININDO, LETRA, FONTE E TAMANHO
      boldFont = new Font("Serif", Font.BOLD, 14);
      italicFont = new Font("Serif", Font.ITALIC, 14);
      boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
      textField.setFont(plainFont); //DEFININDO FONTE SIMPLES AO textField

      // REGISTRAR EVENTOS DO JRadioButtons
      plainJRadioButton.addItemListener(
         new RadioButtonHandler(plainFont));
      boldJRadioButton.addItemListener(
         new RadioButtonHandler(boldFont));
      italicJRadioButton.addItemListener(
         new RadioButtonHandler(italicFont));
      boldItalicJRadioButton.addItemListener(
         new RadioButtonHandler(boldItalicFont));
   } 

   // CLASSE INTERNA PARA LIDAR COM EVENTOS DO BOTAO DE OPÇÃO
   private class RadioButtonHandler implements ItemListener 
   {
      private Font font; // DECLARANDO VARIAVEL FONT

      // DEFININDO METODO QUE IRÁ MANIPULAR FONTE ATRAVES DO BOTAO ESCOLHIDO
      public RadioButtonHandler(Font f)
      {
         font = f; // FONTE SERÁ ESCOLHIDA DE ACORDO COM BOTAO SELECIONADO
      } 
   
      // MANIPULAÇÃO DE EVENTOS COM OPÇÕES DO BOTAO
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         textField.setFont(font);  // DEFININDO FONTE DE ACORDO COM BOTAO SELECIONADO
      } 
   } 
} // FIM DA CLASSE RadioButtonFrame 

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
