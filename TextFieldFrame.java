
import java.awt.FlowLayout; // IMPORTE DA BIBLIOTECA JAVA, MODULO awt E COMPONENTE FlowLayout.
import java.awt.event.ActionListener; // IMPORTE DA BIBLIOTECA JAVA, MODULO awt, SUB MODULO event E COMPONENTE ActionListener.
import java.awt.event.ActionEvent;// IMPORTE DA BIBLIOTECA JAVA, MODULO awt, SUB MODULO event E COMPONENTE ActionEvent.
import javax.swing.JFrame; // IMPORTE DA BIBLIOTECA JAVA, MODULO swing E COMPONENTE JFrame.
import javax.swing.JTextField; // IMPORTE DA BIBLIOTECA JAVA, MODULO swing E COMPONENTE JTextField.
import javax.swing.JPasswordField; // IMPORTE DA BIBLIOTECA JAVA, MODULO swing E COMPONENTE JPasswordField.
import javax.swing.JOptionPane; // IMPORTE DA BIBLIOTECA JAVA, MODULO swing E COMPONENTE JOptionPane.

// DECLARAÇÃO DA CLASSE HERDANDO DO JFrame
public class TextFieldFrame extends JFrame 
{ // INICIO DO BLOCO DE CODIGO DA CLASSE TextFieldFrame

   private final JTextField textField1; // DECLARAÇÃO DA VARIAVEL texField1 DO TIPO JTextField
   private final JTextField textField2; // DECLARAÇÃO DA VARIAVEL texField2 DO TIPO JTextField
   private final JTextField textField3; // DECLARAÇÃO DA VARIAVEL texField3 DO TIPO JTextField
   private final JPasswordField passwordField; // DECLARAÇÃO DA VARIAVEL passwordField DO TIPO JPasswordField

   // CONSTRUTOR DA CLASSE TextFieldFrame
   public TextFieldFrame()
   { // INICIO DO BLOCO DO CONSTRUTOR
      // DEFINIÇÃO DO TITULO DA JANELA
      super("Testing JTextField and JPasswordField");
      setLayout(new FlowLayout()); // DEFININDO LAYOUT PARA FlowLayout

      // ATRIBUINDO A VARIAVEL textField1 10 colunas
      textField1 = new JTextField(10); 
      add(textField1); // ADICIONANDO O textField1 AO JFRAME

      // ATRIBUINDO A VARIAVEL textField2 UM TEXTO PADRÃO
      textField2 = new JTextField("Enter text here");
      add(textField2); // ADICIONANDO O textField2 AO JFRAME

      // ATRIBUINDO A VARIAVEL textField2 UM TEXTO PADRÃO COM 21 COLUNAS
      textField3 = new JTextField("Uneditable text field", 21);
      textField3.setEditable(false); // DESABILITANDO A EDIÇÃO DO TEXTO
      add(textField3); // ADICIONANDO O textField3 AO JFRAME

      // ATRIBUINDO A VARIAVEL passwordField UM TEXTO PADRÃO DO TIPO JPasswordField QUE ESCONDE O TEXTO.
      passwordField = new JPasswordField("Hidden text"); 
      add(passwordField); // ADICIONANDO O passwordField AO JFRAME

      // register event handlers
      TextFieldHandler handler = new TextFieldHandler();
      textField1.addActionListener(handler); // INVOCANDO METODO E ADICIONANDO UM ESCUTADOR DE AÇÃO ENVIANDO COMO PARAMETRO Handler
      textField2.addActionListener(handler);
      textField3.addActionListener(handler);
      passwordField.addActionListener(handler);
   } // FINAL DO BLOCO DO CONSTRUTOR

   // NA LINHA ABAIXO A DECLARAÇÃO DA CLASSA TextFieldHandler IMPLEMENTANDO ActionListener
   private class TextFieldHandler implements ActionListener 
   {
      // NA LINHA ABAIXO A ANOTAÇÃO DE SOBREESCREVER METODO
      @Override
      public void actionPerformed(ActionEvent event) //DECLARAÇÃO DE METODO SEM RETORNO COM ARGUMENTO ActionEvente
      { // INICIO DO BLOCO DE CODIGO DO METODO.
         //DECLARANDO VARIAVEL string DO TIPO String ATRIBUINDO TEXTO VAZIO
         String string = ""; 
         // TESTANDO SE ATRIBUITO event.getSource() É IGUAL A VARIAVEL texField
         if (event.getSource() == textField1)
            string = String.format("textField1: %s", // FORMATAÇÃO DO TEXTO DO TIPO STRING
               event.getActionCommand()); // ATRIBUITO DIGITADO

         // TESTANDO SE ATRIBUITO event.getSource() É IGUAL A VARIAVEL textField2
         else if (event.getSource() == textField2)
            string = String.format("textField2: %s",
               event.getActionCommand());

        // TESTANDO SE ATRIBUITO event.getSource() É IGUAL A VARIAVEL textField3
         else if (event.getSource() == textField3)
            string = String.format("textField3: %s", 
               event.getActionCommand());

         /// TESTANDO SE ATRIBUITO event.getSource() É IGUAL A VARIAVEL passwordField
         else if (event.getSource() == passwordField)
            string = String.format("passwordField: %s", 
               event.getActionCommand());

         // CAIXA DE MENSAGEM REFERENTE A AÇÃO ACIMA
         JOptionPane.showMessageDialog(null, string); // NULL = PODE SER DE QUALQUER UM DOS CAMPOS
      } 
   } // end private inner class TextFieldHandler
} // end class TextFieldFrame

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
