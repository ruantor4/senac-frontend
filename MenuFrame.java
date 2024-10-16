// FIG. 19.5: MENUFRAME.JAVA
// DEMONSTRANDO O USO DE MENUS.

// IMPORTANDO BIBLIOTECAS NECESSÁRIAS
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


// DEFINIÇÃO DA CLASSE MENUFRAME QUE HERDA DE JFRAME
public class MenuFrame extends JFrame {

   // ARRAY DE CORES QUE PODEM SER SELECIONADAS NO MENU
   
   private final Color[] colorValues = {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};
   // ARRAY DE ITENS DO MENU DE BOTÕES DE RÁDIO PARA ESCOLHER CORES
   
   private final JRadioButtonMenuItem[] colorItems;
   
   // ARRAY DE ITENS DO MENU DE BOTÕES DE RÁDIO PARA ESCOLHER FONTES
   private final JRadioButtonMenuItem[] fonts;

   // ARRAY DE SIZE 
   private final JRadioButtonMenuItem[] sizes;


   // ARRAY DE ITENS DO MENU DE CAIXA DE SELEÇÃO PARA TAMANHO DE FONTE
   private final JCheckBoxMenuItem[] styleItems;

   // RÓTULO QUE EXIBE O TEXTO EXEMPLO NA INTERFACE
   private final JLabel displayJLabel;

   // GRUPOS DE BOTÕES PARA GERENCIAR ITENS DE MENU DE FONTES E CORES
   private final ButtonGroup fontButtonGroup;
   private final ButtonGroup colorButtonGroup;
   private final ButtonGroup sizeButtonGroup;

   // VARIÁVEL PARA ARMAZENAR O ESTILO DA FONTE (NEGRITO/ITÁLICO/PLAIN)
   private int style;

   private final int[] fontSizes = {12,24,48,72};

   // CONSTRUTOR DA CLASSE MENUFRAME
   public MenuFrame() {
     
      // CHAMA O CONSTRUTOR DA SUPERCLASSE (JFRAME) E DEFINE O TÍTULO DA JANELA
      super("Using JMenus");

      // CRIA UM MENU "FILE"
      JMenu fileMenu = new JMenu("File");
      fileMenu.setMnemonic('F'); // ATALHO: ALT + F

      // CRIA UM ITEM DE MENU "ABOUT..."
      JMenuItem aboutItem = new JMenuItem("About...");
      aboutItem.setMnemonic('A'); // ATALHO: ALT + A
      fileMenu.add(aboutItem); // ADICIONA O ITEM AO MENU "FILE"
      
      // ADICIONA UM OUVINTE DE AÇÃO (EVENTO) PARA O ITEM "ABOUT..."
      aboutItem.addActionListener(
         new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent event) {
               // EXIBE UMA MENSAGEM INFORMATIVA QUANDO "ABOUT..." É SELECIONADO
               JOptionPane.showMessageDialog(MenuFrame.this,
                  "This is an example\nof using menus",
                  "About", JOptionPane.PLAIN_MESSAGE);
            }
         }
      );

      // CRIA UM ITEM DE MENU "EXIT"
      JMenuItem exitItem = new JMenuItem("Exit");
      exitItem.setMnemonic('x'); // ATALHO: ALT + X
      fileMenu.add(exitItem); // ADICIONA O ITEM AO MENU "FILE"
      // ADICIONA UM OUVINTE DE AÇÃO (EVENTO) PARA O ITEM "EXIT"
      exitItem.addActionListener(
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
               // ENCERRA O APLICATIVO QUANDO "EXIT" É SELECIONADO
               System.exit(0);
            }
         }
      );

      // CRIA UMA BARRA DE MENU E ADICIONA O MENU "FILE" A ELA
      JMenuBar bar = new JMenuBar();
      setJMenuBar(bar);
      bar.add(fileMenu);

      // CRIA UM MENU "FORMAT" (FORMATAR)
      JMenu formatMenu = new JMenu("Format");
      
      formatMenu.setMnemonic('r'); // ATALHO: ALT + R

      // CRIA O MENU "COLOR" DENTRO DO MENU "FORMAT"
      String[] colors = {"Black", "Blue", "Red", "Green"};
      JMenu colorMenu = new JMenu("Color");
      colorMenu.setMnemonic('C'); // ATALHO: ALT + C

      // CRIA OS ITENS DE MENU DE BOTÃO DE RÁDIO PARA AS CORES
      colorItems = new JRadioButtonMenuItem[colors.length];

      colorButtonGroup = new ButtonGroup(); // GERENCIA OS BOTÕES DE RÁDIO

      ItemHandler itemHandler = new ItemHandler(); // MANIPULADOR DE EVENTOS

      // ADICIONA OS ITENS DO MENU DE CORES
      for (int count = 0; count < colors.length; count++) {
         colorItems[count] = new JRadioButtonMenuItem(colors[count]);
         colorMenu.add(colorItems[count]);
         colorButtonGroup.add(colorItems[count]);
         colorItems[count].addActionListener(itemHandler);
      }

      colorItems[0].setSelected(true); // DEFINE A COR PADRÃO COMO PRETO
      formatMenu.add(colorMenu); // ADICIONA O MENU "COLOR" AO MENU "FORMAT"
      formatMenu.addSeparator(); // ADICIONA UMA LINHA SEPARADORA

      // CRIA O MENU "FONT" (FONTE) DENTRO DO MENU "FORMAT"
      String[] fontNames = {"Serif", "Monospaced", "SansSerif"};
      JMenu fontMenu = new JMenu("Font");
      fontMenu.setMnemonic('n'); // ATALHO: ALT + N

      // CRIA OS ITENS DE MENU DE BOTÃO DE RÁDIO PARA AS FONTES
      fonts = new JRadioButtonMenuItem[fontNames.length];
      fontButtonGroup = new ButtonGroup(); // GERENCIA OS BOTÕES DE RÁDIO

      // ADICIONA OS ITENS DO MENU DE FONTES
      for (int count = 0; count < fonts.length; count++) {
         fonts[count] = new JRadioButtonMenuItem(fontNames[count]);
         fontMenu.add(fonts[count]);
         fontButtonGroup.add(fonts[count]);
         fonts[count].addActionListener(itemHandler);
      }

      fonts[0].setSelected(true); // DEFINE A FONTE PADRÃO COMO "Serif"
      fontMenu.addSeparator(); // ADICIONA UMA LINHA SEPARADORA

      // CRIA OS ITENS DE MENU DE CAIXA DE SELEÇÃO PARA ESTILOS DE FONTE
      String[] styleNames = {"Bold", "Italic"};
      styleItems = new JCheckBoxMenuItem[styleNames.length];
      StyleHandler styleHandler = new StyleHandler(); // MANIPULADOR DE ESTILOS

      for (int count = 0; count < styleNames.length; count++) {
         styleItems[count] = new JCheckBoxMenuItem(styleNames[count]);
         fontMenu.add(styleItems[count]);
         styleItems[count].addItemListener(styleHandler);
      }

      
      fontMenu.addSeparator(); // ADICIONA UMA LINHA SEPARADORA

      // CRIA OS ITENS DE MENU DE CAIXA DE SELEÇÃO PARA ESTILOS DE FONTE
     
      sizes = new JRadioButtonMenuItem[fontSizes.length];
      sizeButtonGroup = new ButtonGroup();

      for (int count = 0; count < fontSizes.length; count++) {
         sizes[count] = new JRadioButtonMenuItem(String.valueOf(fontSizes[count]));
         fontMenu.add(sizes[count]);
         sizeButtonGroup.add(sizes[count]);;
         sizes[count].addActionListener(itemHandler);
      }

         sizes[3].setSelected(true);


      formatMenu.add(fontMenu); // ADICIONA O MENU "FONT" AO MENU "FORMAT"
      bar.add(formatMenu); // ADICIONA O MENU "FORMAT" À BARRA DE MENUS

      // CONFIGURAÇÃO DO RÓTULO QUE EXIBE O TEXTO EXEMPLO
      displayJLabel = new JLabel("Sample Text", SwingConstants.CENTER);
      displayJLabel.setForeground(colorValues[0]); // COR PADRÃO: PRETO
      displayJLabel.setFont(new Font("Serif", Font.PLAIN, fontSizes[3])); // FONTE PADRÃO

      getContentPane().setBackground(Color.CYAN); // COR DE FUNDO DA JANELA
      add(displayJLabel, BorderLayout.CENTER); // ADICIONA O RÓTULO AO CENTRO
   }

   // CLASSE INTERNA PARA MANIPULAR AÇÕES DE ITENS DE MENU
   private class ItemHandler implements ActionListener {
     
      @Override
      public void actionPerformed(ActionEvent event) {
        

       definirTamaho();

         
       definirFonte();
        
      definirCor();
         repaint(); // REDESEMHA A JANELA
      }
   }

   public void definirCor(){
      // VERIFICA QUAL COR FOI SELECIONADA E ATUALIZA O RÓTULO
         for (int count = 0; count < colorItems.length; count++) {
            if (colorItems[count].isSelected()) {
               displayJLabel.setForeground(colorValues[count]);
               break;
            }
         }
   
   }

   public void definirFonte(){
      // VERIFICA QUAL FONTE FOI SELECIONADA E ATUALIZA O RÓTULO
         for (int count = 0; count < fonts.length; count++) {
            if (fonts[count].isSelected()) {
               displayJLabel.setFont(new Font(fonts[count].getText(), 
               displayJLabel.getFont().getStyle(), 
               displayJLabel.getFont().getSize()));
            }
         }
   }

   public void definirTamaho(){
       // VERIFICA QUAL TAMAHO FOI SELECIONADA E ATUALIZA O RÓTULO
         for (int count = 0; count < sizes.length; count++) {
            if (sizes[count].isSelected()) {
               displayJLabel.setFont(new Font(displayJLabel.getFont().getName(), 
               displayJLabel.getFont().getStyle(),
               fontSizes[count]));
            }
         }
   }


   // CLASSE INTERNA PARA MANIPULAR A SELEÇÃO DE ESTILO (NEGRITO/ITÁLICO)
   private class StyleHandler implements ItemListener {
      @Override
      public void itemStateChanged(ItemEvent e) {
         String name = displayJLabel.getFont().getName(); // NOME DA FONTE ATUAL
         Font font; // NOVA FONTE COM BASE NAS SELEÇÕES DO USUÁRIO

         // DEFINE O ESTILO DE ACORDO COM OS CHECKBOXES SELECIONADOS
         if (styleItems[0].isSelected() && styleItems[1].isSelected()) {
            font = new Font(name, Font.BOLD + Font.ITALIC, 72);
         } else if (styleItems[0].isSelected()) {
            font = new Font(name, Font.BOLD, 72);
         } else if (styleItems[1].isSelected()) {
            font = new Font(name, Font.ITALIC, 72);
         } else {
            font = new Font(name, Font.PLAIN, 72);
         }

         displayJLabel.setFont(font); // ATUALIZA O RÓTULO
         repaint(); // REDESEMHA A JANELA
      }
   }
}

