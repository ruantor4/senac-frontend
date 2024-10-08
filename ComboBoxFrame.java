// IMPORTA TODAS AS CLASSES DO PACOTE JAVA.AWT, QUE CONTÉM COMPONENTES GRÁFICOS E EVENTOS PARA CRIAR INTERFACES GRÁFICAS.
import java.awt.*;

// IMPORTA TODAS AS CLASSES DO PACOTE JAVA.AWT.EVENT, QUE PERMITE MANIPULAR EVENTOS DE INTERFACE GRÁFICA, COMO AÇÕES DO USUÁRIO.
import java.awt.event.*;

// IMPORTA TODAS AS CLASSES DO PACOTE JAVAX.SWING, QUE FORNECE COMPONENTES GUI COMO JFRAME, JCOMBOBOX, JLABEL, ETC.
import javax.swing.*;

// DECLARA A CLASSE PÚBLICA COMBOBOXFRAME QUE ESTENDE JFRAME, CRIANDO ASSIM UMA JANELA GUI PERSONALIZADA.
public class ComboBoxFrame extends JFrame 

{
   // DECLARA UMA JCOMBOBOX DE STRINGS CHAMADA IMAGESJCOMBOBOX; SERÁ USADA PARA EXIBIR UMA LISTA DE OPÇÕES PARA O USUÁRIO.
   private final JComboBox<String> imagesJComboBox; 

   // DECLARA UM JLABEL CHAMADO LABEL; SERÁ USADO PARA EXIBIR IMAGENS CORRESPONDENTES À OPÇÃO SELECIONADA NA JCOMBOBOX.
   private final JLabel label;

   // DECLARA UM ARRAY ESTÁTICO FINAL DE STRINGS CHAMADO NAMES, QUE CONTÉM OS NOMES DOS ARQUIVOS DE IMAGEM A SEREM USADOS.
   private static final String[] names = 
      {"bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif"};

   // DECLARA UM ARRAY FINAL DE ICONS CHAMADO ICONS; CARREGA AS IMAGENS CORRESPONDENTES AOS NOMES NO ARRAY NAMES.
   private final Icon[] icons = { 
      // CARREGA A IMAGEM "BUG1.GIF" COMO UM IMAGEICON.
      new ImageIcon(getClass().getResource(names[0])),
      // CARREGA A IMAGEM "BUG2.GIF" COMO UM IMAGEICON.
      new ImageIcon(getClass().getResource(names[1])), 
      // CARREGA A IMAGEM "TRAVELBUG.GIF" COMO UM IMAGEICON.
      new ImageIcon(getClass().getResource(names[2])),
      // CARREGA A IMAGEM "BUGANIM.GIF" COMO UM IMAGEICON.
      new ImageIcon(getClass().getResource(names[3]))
   };

   // CONSTRUTOR DA CLASSE COMBOBOXFRAME; INICIALIZA A INTERFACE GRÁFICA E SEUS COMPONENTES.
   public ComboBoxFrame()
   {
      // CHAMA O CONSTRUTOR DA SUPERCLASSE JFRAME E DEFINE O TÍTULO DA JANELA COMO "TESTING JCOMBOBOX".
      super("Testing JComboBox");

      // DEFINE O LAYOUT DA JANELA COMO FLOWLAYOUT, QUE ORGANIZA OS COMPONENTES NA ORDEM EM QUE SÃO ADICIONADOS.
      setLayout(new FlowLayout());

      // INICIALIZA A JCOMBOBOX COM O ARRAY DE NOMES; CADA ITEM DA LISTA SERÁ UM DOS NOMES DE IMAGEM.
      imagesJComboBox = new JComboBox<String>(names);

      // DEFINE O NÚMERO MÁXIMO DE LINHAS VISÍVEIS NA LISTA SUSPENSA PARA 3.
      imagesJComboBox.setMaximumRowCount(5); 

      // ADICIONA UM ITEMLISTENER À JCOMBOBOX PARA RESPONDER A EVENTOS DE SELEÇÃO DE ITEM.
      imagesJComboBox.addItemListener(
         // CRIA UMA NOVA CLASSE ANÔNIMA QUE IMPLEMENTA ITEMLISTENER.
         new ItemListener()
         {
            // SOBRESCREVE O MÉTODO ITEMSTATECHANGED PARA DEFINIR AÇÕES QUANDO O ESTADO DE UM ITEM MUDA.
            @Override
            public void itemStateChanged(ItemEvent event)
            {
               // VERIFICA SE O EVENTO É DE SELEÇÃO (E NÃO DE DESELEÇÃO).
               if (event.getStateChange() == ItemEvent.SELECTED)
                  // DEFINE O ÍCONE DO LABEL PARA O ÍCONE CORRESPONDENTE AO ITEM SELECIONADO NA JCOMBOBOX.
                  label.setIcon(icons[
                     imagesJComboBox.getSelectedIndex()]);
            } 
         }
      );

      // ADICIONA A JCOMBOBOX AO JFRAME PARA QUE SEJA EXIBIDA NA INTERFACE.
      add(imagesJComboBox);

      // INICIALIZA O JLABEL COM O PRIMEIRO ÍCONE DO ARRAY ICONS, EXIBINDO A PRIMEIRA IMAGEM POR PADRÃO.
      label = new JLabel(icons[0]);

      // ADICIONA O JLABEL AO JFRAME PARA QUE A IMAGEM SEJA EXIBIDA NA INTERFACE.
      add(label);
   }
}
