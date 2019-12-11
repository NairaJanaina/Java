package Janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginF extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginF frame = new LoginF();
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
	public LoginF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Digite seus dados:");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		label.setBounds(100, 45, 205, 45);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Nome:");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(100, 104, 83, 30);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(100, 145, 281, 20);
		contentPane.add(textField);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setForeground(Color.BLACK);
		lblCdigo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCdigo.setBounds(100, 173, 83, 30);
		contentPane.add(lblCdigo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 209, 281, 20);
		contentPane.add(textField_1);
		
		JButton button = new JButton("Enviar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button.setBackground(Color.GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button.setBackground(Color.DARK_GRAY);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(161, 266, 144, 30);
		contentPane.add(button);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBackground(Color.DARK_GRAY);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login tela1 = new Login();
				tela1.setVisible(true);
				LoginF.this.dispose();
			}
		});
		btnVoltar.setBounds(21, 11, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnIncio = new JButton("In\u00EDcio");
		btnIncio.setForeground(Color.WHITE);
		btnIncio.setBackground(Color.DARK_GRAY);
		btnIncio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Inicio tela1 = new Inicio();
				tela1.setVisible(true);
				LoginF.this.dispose();
			}
		});
		btnIncio.setBounds(375, 11, 89, 23);
		contentPane.add(btnIncio);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Projeto Final\\imagem.jpg"));
		lblNewLabel.setBounds(0, 0, 474, 341);
		contentPane.add(lblNewLabel);
	}
}
