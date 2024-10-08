// IMPORTE DE TODOS COMPONENTES DENTRO DE BIBLIOTECA javax DO MODULO swing
import javax.swing.*; 

// DECLARAÇÃO DA CLASSE, QUE CONTEM METODO PRINCIAL "main"
public class ComboBoxTest 

{
   // DECLARAÇÃO DO METODO PRINCIPAL "main" QUE FAZ A EXECUÇÃO DO PROGRAMA
   public static void main(String[] args) 
   

   { 
      ComboBoxFrame comboBoxFrame = new ComboBoxFrame(); 
      // DECLARAÇÃO DE VARIAVEL DO TIPO ComboBoxFrame INSTANCIANDO UM NOVO OBJETO

      comboBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      // DEFINE A IPERAÇÃO DE PADRÃO DE FECHAMENTO DA JANELA

      comboBoxFrame.setSize(350, 150); 
      // DEFINE O TAMANHO DA JANELA POR PIXEL

      comboBoxFrame.setVisible(true); 
      // DEFINIÇÃO DA JANELA PARA APARECER QUNADO INICIAR O PROGRAMA
   } 

} // FIM DA CLASSE 
