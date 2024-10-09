import javax.swing.JFrame;

/**
 * CLASSE LISTTEST QUE INICIA A APLICAÇÃO.
 */
public class ListTest 
{
   /**
    * MÉTODO PRINCIPAL QUE EXECUTA A APLICAÇÃO.
    * CRIA UMA INSTÂNCIA DE ListFrame E CONFIGURA A JANELA.
    */
   public static void main(String[] args)
   { 
      ListFrame listFrame = new ListFrame(); // CRIA UMA INSTÂNCIA DE ListFrame
      listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // DEFINE O COMPORTAMENTO DE FECHAMENTO
      listFrame.setSize(350, 150); // DEFINE O TAMANHO DA JANELA
      listFrame.setVisible(true); // TORNA A JANELA VISÍVEL
   } 
} // FIM DA CLASSE LISTTEST

/**************************************************************************
 * (C) COPYRIGHT 1992-2014 BY DEITEL & ASSOCIATES, INC. AND               *
 * PEARSON EDUCATION, INC. ALL RIGHTS RESERVED.                           *
 *                                                                        *
 * DISCLAIMER: THE AUTHORS AND PUBLISHER OF THIS BOOK HAVE USED THEIR     *
 * BEST EFFORTS IN PREPARING THE BOOK. THESE EFFORTS INCLUDE THE          *
 * DEVELOPMENT, RESEARCH, AND TESTING OF THE THEORIES AND PROGRAMS        *
 * TO DETERMINE THEIR EFFECTIVENESS. THE AUTHORS AND PUBLISHER MAKE       *
 * NO WARRANTY OF ANY KIND, EXPRESSED OR IMPLIED, WITH REGARD TO THESE    *
 * PROGRAMS OR TO THE DOCUMENTATION CONTAINED IN THESE BOOKS. THE AUTHORS *
 * AND PUBLISHER SHALL NOT BE LIABLE IN ANY EVENT FOR INCIDENTAL OR       *
 * CONSEQUENTIAL DAMAGES IN CONNECTION WITH, OR ARISING OUT OF, THE       *
 * FURNISHING, PERFORMANCE, OR USE OF THESE PROGRAMS.                     *
 *************************************************************************/