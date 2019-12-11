package Janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginC extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginC frame = new LoginC();
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
	public LoginC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(0, 0, 13, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteSeusDados = new JLabel("Digite seus dados:");
		lblDigiteSeusDados.setForeground(new Color(0, 0, 0));
		lblDigiteSeusDados.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblDigiteSeusDados.setBounds(112, 56, 203, 45);
		contentPane.add(lblDigiteSeusDados);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(new Color(0, 0, 0));
		lblLogin.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 24));
		lblLogin.setBounds(206, -11, 180, 76);
		contentPane.add(lblLogin);
		
		JLabel lblEmail = new JLabel("Nome:");
		lblEmail.setForeground(new Color(0, 0, 0));
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(112, 91, 83, 30);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(112, 125, 281, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setForeground(new Color(0, 0, 0));
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEndereo.setBounds(112, 153, 83, 30);
		contentPane.add(lblEndereo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(112, 189, 281, 20);
		contentPane.add(textField_1);
		
		JLabel lblSetor = new JLabel("Setor\r\n:");
		lblSetor.setForeground(new Color(0, 0, 0));
		lblSetor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSetor.setBounds(112, 210, 83, 30);
		contentPane.add(lblSetor);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(112, 251, 281, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(Color.GRAY);
			}
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(171, 289, 144, 30);
		contentPane.add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBackground(Color.DARK_GRAY);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login tela1 = new Login();
				tela1.setVisible(true);
				LoginC.this.dispose();
			}
		});
		btnVoltar.setBounds(21, 11, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnInico = new JButton("Inic\u00EDo");
		btnInico.setForeground(Color.WHITE);
		btnInico.setBackground(Color.DARK_GRAY);
		btnInico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Inicio tela1 = new Inicio();
				tela1.setVisible(true);
				LoginC.this.dispose();
			}
		});
		btnInico.setBounds(375, 11, 89, 23);
		contentPane.add(btnInico);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton.setBackground(Color.DARK_GRAY);
			}
		});
		lblNewLabel.setIcon(new ImageIcon("D:\\Projeto Final\\imagem.jpg"));
		lblNewLabel.setBounds(0, 0, 534, 341);
		contentPane.add(lblNewLabel);
	}
}
