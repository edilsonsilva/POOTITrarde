package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo.heranca.PessoaJuridica;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPessoaJuridica extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtRS;
	private JTextField txtNF;
	private JTextField txtCNPJ;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPessoaJuridica frame = new JanelaPessoaJuridica();
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
	public JanelaPessoaJuridica() {
		setResizable(false);
		setTitle("Gerenciar Pessoa Jur\u00EDdica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 262);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(10, 11, 85, 14);
		contentPane.add(lblId);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o Social:");
		lblRazoSocial.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRazoSocial.setBounds(10, 36, 85, 14);
		contentPane.add(lblRazoSocial);
		
		JLabel lblNomeFantasia = new JLabel("Nome Fantasia:");
		lblNomeFantasia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomeFantasia.setBounds(10, 61, 85, 14);
		contentPane.add(lblNomeFantasia);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCnpj.setBounds(10, 86, 85, 14);
		contentPane.add(lblCnpj);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(10, 111, 85, 14);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setBounds(10, 136, 85, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereo.setBounds(10, 166, 85, 14);
		contentPane.add(lblEndereo);
		
		txtId = new JTextField();
		txtId.setBounds(105, 8, 96, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtRS = new JTextField();
		txtRS.setBounds(105, 33, 295, 20);
		contentPane.add(txtRS);
		txtRS.setColumns(10);
		
		txtNF = new JTextField();
		txtNF.setBounds(105, 58, 295, 20);
		contentPane.add(txtNF);
		txtNF.setColumns(10);
		
		txtCNPJ = new JTextField();
		txtCNPJ.setBounds(105, 83, 96, 20);
		contentPane.add(txtCNPJ);
		txtCNPJ.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(105, 108, 295, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(105, 133, 96, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(105, 163, 295, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		PessoaJuridica pj = new PessoaJuridica();
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pj.cadastrar();
				
			}
		});
		btnCadastrar.setBounds(311, 194, 89, 23);
		contentPane.add(btnCadastrar);
	}

}
