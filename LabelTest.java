// A LINHA ABAIXO IMPORTARÁ O COMPONENTE "JFRAME" DO MODOLO "SWING" E DA BIBLIOTECA "JAVAX"
import javax.swing.JFrame;

// NA LINHA ABAIXO ESTÁ DECLARANDO A CLASSE "LabelTest"
public class LabelTest 
{
   // A CHAVE ACIMA ESTA INICIANDO O BLOCO DA CLASSE "LabelTest"

   // NA LINHA ABIXO ESTÁ DECLARANDO O METODO "main"
   public static void main(String[] args)
   { // INICIO DO BLOCO DO METODO "main"

   // INSTACIAÇÃO DA CLASSE NO CONSTRUTOR
      LabelFrame labelFrame = new LabelFrame(); 
      // NA LINHA ABAIXO ESTÁ SENDO ENVOCADO DefaultCloseOperation PARAMETRIZANDO JFRAME INVOCANDO ENUM EXIT_ON_CLOSE.
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // DEFINIR TAMANHO EM PIXEL POR PADRÃO
      labelFrame.setSize(260, 180); 
      // DEFINIR VIZUALIZAÇÃO
      labelFrame.setVisible(true); 
   } // FINAL DO PROGRAMA "main"
} //  FINAL DA CLASSE LabelTest


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
