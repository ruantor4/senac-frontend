// FIG. 12.26: MULTIPLESELECTIONTEST.JAVA
// TESTANDO O FRAME QUE PERMITE SELECIONAR E COPIAR MÚLTIPLOS ITENS.

import javax.swing.JFrame; // IMPORTA A CLASSE JFrame, QUE É USADA PARA CRIAR UMA JANELA GRÁFICA.

// CLASSE PRINCIPAL MultipleSelectionTest, ONDE O PROGRAMA COMEÇA A SER EXECUTADO.
public class MultipleSelectionTest
{
   // MÉTODO MAIN: O PONTO DE ENTRADA DO PROGRAMA.
   // ESTE MÉTODO SERÁ EXECUTADO QUANDO O PROGRAMA INICIAR.
   public static void main(String[] args)
   { 
      // CRIA UMA INSTÂNCIA DA CLASSE MultipleSelectionFrame.
      // ISSO FAZ COM QUE A JANELA E OS COMPONENTES DEFINIDOS NA CLASSE MultipleSelectionFrame SEJAM EXIBIDOS.
      MultipleSelectionFrame multipleSelectionFrame = new MultipleSelectionFrame(); 
      
      // DEFINE O COMPORTAMENTO DE FECHAMENTO DA JANELA.
      // JFrame.EXIT_ON_CLOSE FAZ COM QUE O PROGRAMA SEJA ENCERRADO QUANDO A JANELA FOR FECHADA.
      multipleSelectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // DEFINE O TAMANHO DA JANELA. NESTE CASO, 350 PIXELS DE LARGURA E 150 PIXELS DE ALTURA.
      multipleSelectionFrame.setSize(350, 150); 

      // TORNA A JANELA VISÍVEL PARA O USUÁRIO.
      multipleSelectionFrame.setVisible(true); 
   } // FIM DO MÉTODO MAIN
} // FIM DA CLASSE MultipleSelectionTest

/**************************************************************************
 * (C) COPYRIGHT 1992-2014 BY DEITEL & ASSOCIATES, INC. AND               *
 * PEARSON EDUCATION, INC. ALL RIGHTS RESERVED.                           *
 *                                                                        *
 * DISCLAIMER: OS AUTORES E EDITORES DESTE LIVRO UTILIZARAM SEUS MELHORES *
 * ESFORÇOS NA PREPARAÇÃO DO LIVRO. ESTES ESFORÇOS INCLUEM O              *
 * DESENVOLVIMENTO, PESQUISA E TESTES DAS TEORIAS E PROGRAMAS PARA        *
 * DETERMINAR SUA EFICÁCIA. OS AUTORES E EDITORES NÃO OFERECEM            *
 * GARANTIA DE NENHUM TIPO, EXPRESSA OU IMPLÍCITA, EM RELAÇÃO AOS         *
 * PROGRAMAS OU À DOCUMENTAÇÃO CONTIDA NESTES LIVROS. OS AUTORES E        *
 * EDITORES NÃO SERÃO RESPONSÁVEIS POR DANOS INCIDENTAIS OU               *
 * CONSEQUENTES RELACIONADOS AO FORNECIMENTO, DESEMPENHO OU USO DOS       *
 * PROGRAMAS.                                                             *
 *************************************************************************/
