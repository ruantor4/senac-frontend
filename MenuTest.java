// Fig. 19.6: MenuTest.java
// Testing MenuFrame.

import javax.swing.JFrame;  // Importa a classe JFrame do pacote javax.swing, necessário para criar a interface gráfica.

public class MenuTest {
   // Método principal que inicia a execução do programa.
   public static void main(String[] args) { 
      // Cria uma nova instância da classe MenuFrame, que deve estender JFrame e configurar menus.
      MenuFrame menuFrame = new MenuFrame(); 
      
      // Configura a operação padrão de fechamento da janela. Quando a janela for fechada,
      // o programa será encerrado.
      menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Define o tamanho da janela. A largura é de 500 pixels e a altura é de 200 pixels.
      menuFrame.setSize(500, 200); 
      
      // Torna a janela visível para o usuário.
      menuFrame.setVisible(true);
   } 
} // end class MenuTest

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
