// IMPORTE DA BIBLIOTECA JAVAX, MODULO SWING, COMPONENTE JFrame.
import javax.swing.JFrame;

// DECLARAÇÃO DA CLASSE ButtonTest
public class ButtonTest 
{ // INICIO DO BLOCO DE CODIGO DA CLASSE ButtonTest

   // METODO PRINCIPAL "main"
   public static void main(String[] args)
   { // INICIO DO BLOCO DE CODIGO DO METODO "main"

      // INSTANCIAÇÃO DA VARIAVEL buttonFrame DO TIPO ButtonFrame .
      ButtonFrame buttonFrame = new ButtonFrame(); 
      buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // DEFINIÇÃO DO BOTÃO SAIR E ENCERRAR O SISTEMA.
      buttonFrame.setSize(275, 110); // DEGFINIÇÃO DE TAMANHO
      buttonFrame.setVisible(true); // DEFINIÇÃO DE VISIBILIDADE
   } // FIM DO BLOCO DO METODO "main" 

} // FINAL DA CLASSE ButtonTest

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
