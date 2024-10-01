// IMPORTAÇÃO DO COMPONENTE JFrame DO MODULO swing, DA BIBLIOTECA javax
import javax.swing.JFrame;

// DECLARAÇÃO DA CLASSE CheckBoxTest
public class CheckBoxTest
{

   // DECLARAÇÃO DO METODO main
   public static void main(String[] args)
   { 

      CheckBoxFrame checkBoxFrame = new CheckBoxFrame(); // DECLARAÇÃO E ATRIBUIÇÃO DE VARIAVEL checkBoxFrame DO TIPO CheckBoxFrame
      checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // DEFINIÇÃO DO BOTÃO FECHAR DA JANELA DO PROGRAMA
      checkBoxFrame.setSize(275, 100); // DEFINIÇÃO DO TAMANHO DA JANELA
      checkBoxFrame.setVisible(true);  // DEFINIR VISIBILIDADE DA JANELA
   } 
} // FINAL DA CLASSE CheckBoxTest

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
