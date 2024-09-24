//NA LINHA ABAIXO ESTA IMPORTANTO A BIBLIOTECA JAVAX, O MÓDULO SWING E O COMPONENTE JOptionPane
import javax.swing.JOptionPane; 

// NA LINHA ABAIXO ESTA SENDO DECLARADA A CLASSE ADDITION
public class Addition 
//NA LINHA ABAIXO ESTA SENDO ABERTO O BLOCO DE CODIGOS DA CLASSE ADDITION
{
// NA LINHA ABAIXO ESTÁ SENDO DECLARADA O METODO "main" QUE IRÁ EXECUTAR A APLICAÇÃO
   public static void main(String[] args)
   // A HAVE ABAIXO INICIA O METODO "main"
   {
      //NA LINHA ABAIXO ESTÁ DECLARANDO A VARIAVEL DO TIPO STRING
      String firstNumber =  // ONDE TEM OPERADOR DE ATRIBUIÇÃO, TEM DECLARAÇÃO DE VARIAVEL.
         JOptionPane.showInputDialog("Enter first integer");
         //NA LINHA ACIMA ESTA SOLICITANDO PARA DIGITAR O PRIMEIRO NUMERO.
     
         String secondNumber =
          JOptionPane.showInputDialog("Enter second integer");
      //NA LINHA ACIMA ESTA SOLICITANDO PARA DIGITAR O SEGUNDO NUMERO.


      // CONVERTE STRING EM NUMEROS INTEIROS.
      int number1 = Integer.parseInt(firstNumber); 
      int number2 = Integer.parseInt(secondNumber);

      int sum = number1 + number2; // SOMA DOS 2 NUMEROS INFORMADOS E ARMAZENA NA VARIAVEL "sum"

      // MOSTRA UM TEXTO CONCATENADO COM O VALOR DA VARIAVEL SOMA
      JOptionPane.showMessageDialog(null, "The sum is " + sum, 
         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
   } // FINAL DO METODO "main"
} // FINAL DA CLASSE


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
