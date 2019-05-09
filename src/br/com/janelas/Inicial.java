package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial frame = new Inicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicial() {
		setResizable(false);
		setTitle("Gerenciar Pessoas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 179);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPessoaFisica = new JButton("Pessoa F\u00EDsica");
		btnPessoaFisica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JanelaPessoaFisica jpf = new JanelaPessoaFisica();
				jpf.setVisible(true);
				
			}
		});
	
		btnPessoaFisica.setBounds(41, 52, 180, 29);
		contentPane.add(btnPessoaFisica);
		
		JButton btnPessoaJurdica = new JButton("Pessoa Jur\u00EDdica");
		btnPessoaJurdica.setBounds(235, 52, 180, 29);
		contentPane.add(btnPessoaJurdica);
	}
}
