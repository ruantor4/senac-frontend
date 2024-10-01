import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.font.TextAttribute;
import java.util.Map;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame 
{
   private final JTextField textField; // DECLARAÇÃO DE VARIAVEL PARA ALTERR TEXTO
   private final JCheckBox boldJCheckBox; // DECLARAÇÃO DE VARIAVEL DE CHECKBOX NEGRITO
   private final JCheckBox italicJCheckBox; // DECLARAÇÃO DE VARIAVEL DE CHECKBOX ITALICO
   private final JCheckBox underlineCheckBox; // DECLARAÇÃO DE VARIAVEL DE SUBLINHADO
   // CONSTRUTOR CheckBoxFrame PARA ADICIONAR CHECKBOX AO JFrame
   public CheckBoxFrame()
   {
      super("JCheckBox Test"); // TITULO DA JANELA
      setLayout(new FlowLayout()); // DEFINIÇÃO DO TIPO DE LAYOUT

      // DEFININDO JTextField E AS FONTES
      textField = new JTextField("Watch the font style change", 20); // INSTANCIANDO VARIAVEL DEFININDO TEXTO E TAMANHO
      textField.setFont(new Font("Serif", Font.PLAIN, 14)); // INSTANCIANDO VARIAVEL COMO FONT PARA DEFINIR FONTE, TIPO DE FORMATAÇÃO E TAMANHO.
      add(textField); // ADICIONANDO textField AO JFrame

      boldJCheckBox = new JCheckBox("Bold"); // INSTANCIANDO VARIAVEIS COM O TEXTO
      italicJCheckBox = new JCheckBox("Italic"); // INSTANCIANDO VARIAVEIS COM O TEXTO
      underlineCheckBox = new JCheckBox("UnderLine"); 

      add(boldJCheckBox); // ADICIONANDO bold checkbox AO JFrame
      add(italicJCheckBox); // ADICIONANDO italic checkbox AO JFrame
      add(underlineCheckBox); 

      // REGISTRAR ESCUTADORES AS VERIAVEIS, INSTANCIANDO O handler DO TIPO CheBoxHandler
      CheckBoxHandler handler = new CheckBoxHandler();
      boldJCheckBox.addItemListener(handler); 
      italicJCheckBox.addItemListener(handler);
      underlineCheckBox.addItemListener(handler);
   } 

   // DECLARNANDO CLASSE CheckBoxHandler INJETANDO ItemListener 
   private class CheckBoxHandler implements ItemListener 
   {
      // SUBSCRIÇÃO DO METODO
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         Font font = null; // DECLARANDO NOVA FONTE INICIALMENTE NULL

         // TESTE DE ALGORITIMO 
         if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected()) 
            font = new Font("Serif", Font.BOLD + Font.ITALIC ,14);
           
         else if (boldJCheckBox.isSelected())
            font = new Font("Serif", Font.BOLD, 14);
         else if (italicJCheckBox.isSelected())
            font = new Font("Serif", Font.ITALIC, 14);
         else
            font = new Font("Serif", Font.PLAIN, 14);

         textField.setFont(font); 
         
         // TESTANDO SE CHECKBOX DO UNDERLINE ESTÁ SELECIONADO
         if (underlineCheckBox.isSelected()){
            font = textField.getFont(); // PEGA FONT DO textField
            Map attributes = font.getAttributes(); //Mapeia font E PEGA OS ATRIBUTOS 
            attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON); //DEFININDO FONT DO TEXTATRRIBUTE INVOCANDO UNDERLINE, DEFININDO ATRIBUITO UNDERLINE LIGADO.
            textField.setFont(font.deriveFont(attributes)); // DEFININDO FONTE DERIVADA 
            font = new Font(attributes); // INSTANCIANDO ATRIBUTOS NO OBJETO FONTE
         } // FIM DO IF
      } // FIM DO METO SOBREESCRITO 
   }// FIM DA CLASSE CheckBoxHandler
} // FIM DA CLASSE CheckBoxFrame

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
