package Exemplos;

/*Tipos de JOptionPane, suas opções e usos, um guia rápido, mas completo*/


//Primeiro temos que importar o pacote de JOptionPane
import javax.swing.JOptionPane;

//Utilizaremos para colocar uma imagem ou icone dentro da mensagem
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class JOPTIONPANE {

	public static void main(String[] args) {
		
		
		Icon Oi1 = new ImageIcon("imagens/Oi1.jpg");
		Icon Tchau = new ImageIcon("imagens/tchau.jpg");
		ImageIcon Oi = new ImageIcon("imagens/Oi.jpg");
		
		//Aqui temos os comandos para messageType(Tipo de mensagem)
		//Os comandos tem um valor especifico e podem ser colocados dentro de uma variavel inteira
		int P = JOptionPane.PLAIN_MESSAGE;//-1
		int E = JOptionPane.ERROR_MESSAGE;//0
		int I = JOptionPane.INFORMATION_MESSAGE;//1
		int W = JOptionPane.WARNING_MESSAGE;//2
		int Q = JOptionPane.QUESTION_MESSAGE;//3
		
		//Aqui temos os comandos para optionType(Tipo de opções)
		//Os comandos tem um valor especifico e podem ser colocados dentro de uma variavel inteira
		int De = JOptionPane.DEFAULT_OPTION;//-1
		int YN = JOptionPane.YES_NO_OPTION;//0
		int YNC = JOptionPane.YES_NO_CANCEL_OPTION;//1
		int OKC = JOptionPane.OK_CANCEL_OPTION;//2
		
		/*abaixo temos o 1° JOptionPane que será por onde você poderá ver
		 * determinado tipo de JOptionPane em execução*/
		
		
		Object Opcoes[] = {"Message", "Input", "Confirm", "Option"}; 
		
		int ASD = JOptionPane.showOptionDialog(null, "Escolha os tipos de mensagens \n"+"a serem executadas", "JOptionPane-Guia", -1, 1, null, Opcoes, Opcoes[0] );//Para: 0(Message); 1(Input); 2(Confirm); 3(Option)
		switch(ASD) {
			case 0 :
		
				/*MessageDialog*/
				JOptionPane.showMessageDialog(null , "Mensagem 1", "Título", 0, null);//Erro...
				JOptionPane.showMessageDialog(null , "Mensagem 2", "Título", 1, null);//Informação
				JOptionPane.showMessageDialog(null , "Mensagem 3", "Título", 2, null);//Perigo
				JOptionPane.showMessageDialog(null , "Mensagem 4", "Título", 3, null);//Pergunta
		
				JOptionPane.showMessageDialog(null , "Mensagem 5", "Título", -1, null);//Sem icone 
		
				JOptionPane.showMessageDialog(null , "Mensagem", "Título", P, Oi1);//Com icone especifico
		
				JOptionPane.showMessageDialog(null , Oi, "Título", I, null);//Imagem como mensagem
				JOptionPane.showMessageDialog(null , "Mensagem " + Oi, "Título", P, Oi1);//Não funciona colocar imagem e texto na mensagem, vai aparecer só o link da imagem
		
				//Exemplos de uso
				JOptionPane.showMessageDialog(null , "Erro 404 \n" + "Reinicie o Sistema", "ERRO 404", E, null);
				JOptionPane.showMessageDialog(null , "Nem tudo que reluz é Ouro", "Dica", I, null);
				JOptionPane.showMessageDialog(null , "Foi detectado atividade não autorizada de terceiros \n"+"As atuais paginas serão fechadas", "Detecção de Vírus", W, null);
				JOptionPane.showMessageDialog(null , "Por que fazer essa ação poderia te ajudar?", "Repreensão do Sistema", Q, null);
				break;
				case 1 :
					/*InputDialog*/
		
					//Por natureza todo Input é String, exceto quando temos Objeto com vetor dentro das especificações,aí ele sera um Object por natureza
					String A = null;
					String B = null;
					String C = null;
					Object D = null;
					Object G[] = {"1", "2", "3", "4","5"};
					

					A = JOptionPane.showInputDialog("Mensagem que necesita de resposta");
					B = JOptionPane.showInputDialog(null, "Por favor \n" + "Seu e-mail:" , "exemplo@email.com");//Teremos uma sugestão de resposta
					C  = JOptionPane.showInputDialog(null, "Escreve aí", "Aquele Título", E);
					D = JOptionPane.showInputDialog(null, "Escolhe um número por favor:", "Números", I, null, G, G[0]); 
					
		
					break;
				case 2 :
					int a = 0;
					int b = 0;
					int c = 0;
					int d = 0;
					String e = "Tipo de Confirm: ";
					
					
					a = JOptionPane.showConfirmDialog(null, "Confirm padrão");//Yes = 0, No = 1, Cancel = 2 -\''/-
					
					b = JOptionPane.showConfirmDialog(null, "Qual você escolhe?", e + "Default ", De);//De poderia ser -1 no lugar 
					//OK=0
					b = JOptionPane.showConfirmDialog(null, "Qual você escolhe? ", e + "Yes or No ", YN );//YN poderia ser 0 no lugar
					//Yes = 0, No = 1
					b = JOptionPane.showConfirmDialog(null, "Qual você escolhe? ", e + "Yes, No, Cancel ", YNC);//YNC poderia ser 1 no lugar
					//Yes = 0, No = 1, Cancel = 2
					b = JOptionPane.showConfirmDialog(null, "Qual você escolhe? ", e + "Ok or Cancel", OKC);//OKC poderia ser 2 no lugar
					//Ok = 0, Cancel = 2
					
					c = JOptionPane.showConfirmDialog(null, "Sabe a resposta???", " Icone padrão", YNC, E);
					d = JOptionPane.showConfirmDialog(null,"Concorda em continuar?", "Icone personalizado", YN, P, Oi1);
					
					break;
				case 3 :
					int g = 0;
					String k = "Continent Detector";
					Object Paises[] = {"México", "Bangladesh", "França"};
					
					
					g = JOptionPane.showOptionDialog(null, "Selecione um país:", k, De, Q, null, Paises, Paises[0] );// 1°=0; 2°=1; 3°=2;
					JOptionPane.showMessageDialog(null, "Valor encontrado: " + g, k, I);
					
					break;
					default :
						JOptionPane.showMessageDialog(null, "Tudo bem, teste quando quiser", "JOptionPane-Guia", P, Tchau);
	}

}
}