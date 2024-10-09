
// Fig. 12.23: ListFrame.java
// JList that displays a list of colors.
import java.awt.*; 
import javax.swing.*; 
import javax.swing.event.*; 
import java.awt.event.*; // Importa o pacote para tratar eventos de ação.

/**
 * CLASSE LISTFRAME QUE CRIA UMA JANELA COM UMA LISTA DE CORES.
 */
public class ListFrame extends JFrame {

   // DECLARA UMA JLIST PARA EXIBIR OS NOMES DAS CORES
   private final JList<String> colorJList;

   // DECLARA UMA LISTA COM OS TAMANHOS DA JANELA
   private final JList<String> sizeList;

   // NOMES DAS CORES A SEREM EXIBIDOS NA LISTA
   private static final String[] colorNames = {
         "BLACK", "BLUE", "CYAN", "DARK GRAY", "GRAY", "GREEN",
         "LIGHT GRAY", "MAGENTA", "ORANGE", "PINK", "RED",
         "WHITE", "YELLOW"
   };

   // NOME DOS TAMANHOS
   private static final String[] sizeNames = {
         "Small", "Medium", "Big"
   };

   // CORRESPONDÊNCIA DAS CORES PARA CADA NOME
   private static final Color[] colors = {
         Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY,
         Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA,
         Color.ORANGE, Color.PINK, Color.RED, Color.WHITE,
         Color.YELLOW
   };

   /**
    * CONSTRUTOR DA CLASSE LISTFRAME.
    * CONFIGURA A JANELA E ADICIONA A JLIST DE CORES.
    */
   public ListFrame() {
      super("LIST TEST"); // DEFINE O TÍTULO DA JANELA
      setLayout(new FlowLayout()); // DEFINE O LAYOUT DA JANELA

      // CRIA UMA JLIST COM OS NOMES DAS CORES
      colorJList = new JList<String>(colorNames);
      colorJList.setVisibleRowCount(5); // EXIBE CINCO LINHAS DE CADA VEZ

      // PERMITE APENAS UMA SELEÇÃO NA LISTA
      colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

      // ADICIONA A JLIST EM UM SCROLLPANE À JANELA
      add(new JScrollPane(colorJList));

      // ADICIONA UM LISTENER PARA TRATAR EVENTOS DE SELEÇÃO NA LISTA
      colorJList.addListSelectionListener(
            new ListSelectionListener() // CLASSE INTERNA ANÔNIMA
            {
               // MÉTODO CHAMADO QUANDO A SELEÇÃO DA LISTA MUDA
               @Override
               public void valueChanged(ListSelectionEvent event) {
                  // ALTERA A COR DE FUNDO DA JANELA DE ACORDO COM A COR SELECIONADA
                  getContentPane().setBackground(colors[colorJList.getSelectedIndex()]);
               }
            });
            sizeList = new JList<String>(sizeNames); // INTANCIAÇÃO DO SIZELIST
            sizeList.setVisibleRowCount(3); // DEFINIR VISIBILIDADE DE 3 LINHAS
           
            sizeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // DEFINIÇÃO DO MODO DE SELEÇÃO
      
            add(new JScrollPane(sizeList)); // ADICIONANDO OBJETO AO SIZELIST
      
            sizeList.addListSelectionListener(  // ADICIONANDO UM LISTENER PARA TRATAR EVENTOS
               new ListSelectionListener()
               {
                  @Override
                  public void valueChanged(ListSelectionEvent event) // METODO PARA TROCA DE VALORES DE ACORDO COM SELEÇÃO
                  {
                     switch (sizeList.getSelectedIndex()) {
                        case 0:
                           setSize(350, 150);  // JANELA "SMALL"
                           break;
      
                        case 1:
                           setSize(550, 350); // JANELA "MEDIUM"
                           break;
      
                        case 2:
                           setSize(750, 550); // JANELA "BIG"
                           break;
      
                        default:
                           setSize(350,150); // TAMANHO PADRÃO
                           break;
                     }
                  } 
               } 
            ); 
         }  
         
      }