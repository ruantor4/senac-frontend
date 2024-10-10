// FIG. 12.25: MULTIPLESELECTIONFRAME.JAVA
// JLIST QUE PERMITE SELEÇÕES MÚLTIPLAS.

import java.awt.*; // IMPORTA OS PACOTES DE AWT (ABSTRACT WINDOW TOOLKIT) PARA MANIPULAÇÃO DE LAYOUT E EVENTOS.
import java.awt.event.*; // IMPORTA OS EVENTOS NECESSÁRIOS, COMO ACTIONEVENT.
import javax.swing.*; // IMPORTA OS COMPONENTES GRÁFICOS DO SWING.

// DECLARAÇÃO DA CLASSE MULTIPLESELECTIONFRAME, QUE HERDA DE JFRAME PARA CRIAR UMA JANELA.
public class MultipleSelectionFrame extends JFrame 
{
   // DECLARAÇÃO DE VARIÁVEIS PARA AS LISTAS E BOTÕES.
   private final JList<String> colorJList; // LISTA QUE CONTÉM OS NOMES DAS CORES.
   private final JList<String> copyJList; // LISTA PARA ARMAZENAR OS ITENS COPIADOS DE COLORJLIST.
   private JButton copyJButton; // BOTÃO PARA COPIAR OS ITENS SELECIONADOS DE COLORJLIST.
   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
      "Pink", "Red", "White", "Yellow"}; // ARRAY QUE ARMAZENA AS CORES PARA COLORJLIST.

   private final JList<String> fruitJList; // LISTA QUE CONTÉM OS NOMES DAS FRUTAS.
   private final JList<String> copyFJList; // LISTA PARA ARMAZENAR OS ITENS COPIADOS DE FRUITJLIST.
   private JButton copyJButton2;  // BOTÃO PARA COPIAR OS ITENS SELECIONADOS DE FRUITJLIST.
   private static final String[] fruitNames= {"Orange", "Banana", "Apple", "Pear"}; // ARRAY QUE ARMAZENA AS FRUTAS PARA FRUITJLIST.

   // CONSTRUTOR DA CLASSE MULTIPLESELECTIONFRAME.
   public MultipleSelectionFrame()
   {
      super("MULTIPLE SELECTION LISTS"); // DEFINE O TÍTULO DA JANELA.
      setLayout(new FlowLayout()); // DEFINE O LAYOUT COMO FLOWLAYOUT, PARA ORGANIZAR OS COMPONENTES HORIZONTALMENTE.

      // INICIALIZA A FRUITJLIST COM OS NOMES DAS FRUTAS E DEFINE AS PROPRIEDADES DE SELEÇÃO.
      fruitJList = new JList<String>(fruitNames); // CRIA A LISTA COM OS NOMES DAS FRUTAS.
      fruitJList.setVisibleRowCount(5); // DEFINE QUE 5 ITENS SERÃO VISÍVEIS POR VEZ.
      fruitJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // PERMITE MÚLTIPLAS SELEÇÕES NÃO CONTÍGUAS.
      add(new JScrollPane(fruitJList)); // ADICIONA A LISTA DENTRO DE UM JSCROLLPANE PARA PERMITIR ROLAGEM.

      // INICIALIZA O BOTÃO COPYJBUTTON2 PARA COPIAR ITENS DA FRUITJLIST PARA COPYFJLIST.
      copyJButton2 = new JButton("COPY >>"); // BOTÃO PARA COPIAR OS ITENS SELECIONADOS DA FRUITJLIST.
      copyJButton2.addActionListener(
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event)
            {
               // COPIA OS ITENS SELECIONADOS DA FRUITJLIST PARA COPYFJLIST.
               copyFJList.setListData(
                  fruitJList.getSelectedValuesList().toArray(
                     new String[0])); // CONVERTE A LISTA DE SELEÇÃO EM UM ARRAY DE STRINGS.
            }
         }
      );

      add(copyJButton2); // ADICIONA O BOTÃO COPYJBUTTON2 À JANELA.

      // INICIALIZA A COPYFJLIST PARA EXIBIR OS ITENS COPIADOS DA FRUITJLIST.
      copyFJList = new JList<String>(); // CRIA UMA LISTA VAZIA.
      copyFJList.setVisibleRowCount(5); // DEFINE QUE 5 ITENS SERÃO VISÍVEIS POR VEZ.
      copyFJList.setFixedCellWidth(100); // DEFINE A LARGURA FIXA DAS CÉLULAS DA LISTA.
      copyFJList.setFixedCellHeight(15); // DEFINE A ALTURA FIXA DAS CÉLULAS DA LISTA.
      copyFJList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION); // PERMITE APENAS UMA SELEÇÃO CONTÍGUA.
      add(new JScrollPane(copyFJList)); // ADICIONA A LISTA DENTRO DE UM JSCROLLPANE PARA PERMITIR ROLAGEM.

      // INICIALIZA A COLORJLIST COM OS NOMES DAS CORES E DEFINE AS PROPRIEDADES DE SELEÇÃO.
      colorJList = new JList<String>(colorNames); // CRIA A LISTA COM OS NOMES DAS CORES.
      colorJList.setVisibleRowCount(5); // DEFINE QUE 5 ITENS SERÃO VISÍVEIS POR VEZ.
      colorJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // PERMITE MÚLTIPLAS SELEÇÕES NÃO CONTÍGUAS.
      add(new JScrollPane(colorJList)); // ADICIONA A LISTA DENTRO DE UM JSCROLLPANE PARA PERMITIR ROLAGEM.

      // INICIALIZA O BOTÃO COPYJBUTTON PARA COPIAR ITENS DA COLORJLIST PARA COPYJLIST.
      copyJButton = new JButton("COPY >>>"); // BOTÃO PARA COPIAR OS ITENS SELECIONADOS DA COLORJLIST.
      copyJButton.addActionListener(
         new ActionListener() // CLASSE INTERNA ANÔNIMA PARA TRATAR O EVENTO DO BOTÃO.
         {  
            @Override
            public void actionPerformed(ActionEvent event)
            {
               // COPIA OS ITENS SELECIONADOS DA COLORJLIST PARA COPYJLIST.
               copyJList.setListData(
                  colorJList.getSelectedValuesList().toArray(
                     new String[0])); // CONVERTE A LISTA DE SELEÇÃO EM UM ARRAY DE STRINGS.
            }
         } 
      ); 

      add(copyJButton); // ADICIONA O BOTÃO COPYJBUTTON À JANELA.

      // INICIALIZA A COPYJLIST PARA EXIBIR OS ITENS COPIADOS DA COLORJLIST.
      copyJList = new JList<String>(); // CRIA UMA LISTA VAZIA.
      copyJList.setVisibleRowCount(5); // DEFINE QUE 5 ITENS SERÃO VISÍVEIS POR VEZ.
      copyJList.setFixedCellWidth(100); // DEFINE A LARGURA FIXA DAS CÉLULAS DA LISTA.
      copyJList.setFixedCellHeight(15); // DEFINE A ALTURA FIXA DAS CÉLULAS DA LISTA.
      copyJList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION); // PERMITE APENAS UMA SELEÇÃO CONTÍGUA.
      add(new JScrollPane(copyJList)); // ADICIONA A LISTA DENTRO DE UM JSCROLLPANE PARA PERMITIR ROLAGEM.
   } 
} // FIM DA CLASSE MULTIPLESELECTIONFRAME

/**************************************************************************
 * (C) COPYRIGHT 1992-2014 BY DEITEL & ASSOCIATES, INC. AND               *
 * PEARSON EDUCATION, INC. TODOS OS DIREITOS RESERVADOS.                  *
 *************************************************************************/
