package br.com.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.classes.Usuario;

public class GerenciarUsuarios extends JFrame{

	public static void main(String[] args) {
		
		//Inst�ncia da classe JFrame
		JFrame janela = new JFrame();
		janela.setSize(505,400);
		janela.setTitle("Gerenciar Usu�rios");
		janela.setLocationRelativeTo(null);//alinha a janela ao centro da tela
		//retira a janela da mem�ria quando clica no bot�o fechar
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//impede que a janela seja redimensionada
		janela.setResizable(false);
		
		//Vamos configurar o gerenciador de layout do java
		//usaremos o gerenciador null(nulo). Isso far� com que
		//o gerenciador seja encarado como absolute(absoluto)
		janela.getContentPane().setLayout(null);
		
		//Agora podemos criar nosso componentes e posicion�-los 
		//da maneira que quisermos
		JButton btnCadastrar = new JButton("Cadastrar");
		
		/*
		 * O fato de voc� ter configurado o gerenciador de layout
		 * como null(absolute) lhe permite posicionar os elementos(
		 * componetes) em qualquer parte da tela usando coordenadas:
		 * x -> posi��o horizontal
		 * y -> posi��o vertical
		 * width -> largura
		 * height -> altura
		 */
		btnCadastrar.setBounds(10,300,150,30);
		//para adicionar o bot�o a janela iremos usar 
		//o comando add e passar como par�metro o componente
		//que neste caso � o btnCadastrar
		janela.add(btnCadastrar);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.setBounds(170, 300, 150, 30);
		janela.add(btnLogar);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(330,300,150,30);
		janela.add(btnLogout);
		
		//Vamos inserir as labels a janela
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(10,50,100,30);
		janela.add(lblLogin);
		
		//Vamos inserir as TextFields a janela
		JTextField txtLogin = new JTextField();
		txtLogin.setBounds(120,50,330,30);
		janela.add(txtLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10,90,100,30);
		janela.add(lblSenha);
		
		JPasswordField txtSenha = new JPasswordField();
		txtSenha.setBounds(120,90,330,30);
		janela.add(txtSenha);
		
		
		JTextField txtResultado = new JTextField();
		txtResultado.setBounds(120,130,330,150);
		janela.add(txtResultado);
		
		/*
		 * Vamos adicionar a a��o de clique ao bot�o cadastrar e realizar 
		 * a chamada do m�todo cadastrar que est� na classe Usuario
		 */
		
		Usuario us = new Usuario();
		
		
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				us.login = txtLogin.getText();//pegar o que foi escrito na caixa do login
				us.senha = txtSenha.getText();//pegar o que foi escrito na caixa da senha
				txtResultado.setText(us.cadastrar());
				
			}
		});
		
		
		btnLogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				txtResultado.setText(us.logar());
				
			}
		});
		
		
		
		
		janela.setVisible(true);

	}

}
