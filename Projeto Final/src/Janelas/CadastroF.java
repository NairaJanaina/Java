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
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CadastroF extends JFrame {

	private JPanel contentPane;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroF frame = new CadastroF();
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
	public CadastroF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nome:");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(41, -39, 83, 30);
		contentPane.add(label);
		
		JLabel label_4 = new JLabel("Nome:");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(95, 78, 83, 30);
		contentPane.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(95, 109, 281, 20);
		contentPane.add(textField_3);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setForeground(Color.BLACK);
		lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCnpj.setBounds(95, 140, 83, 30);
		contentPane.add(lblCnpj);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(95, 172, 281, 20);
		contentPane.add(textField_4);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setForeground(Color.BLACK);
		lblCdigo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCdigo.setBounds(95, 204, 83, 30);
		contentPane.add(lblCdigo);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(95, 234, 281, 20);
		contentPane.add(textField_5);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setForeground(Color.DARK_GRAY);
		lblCadastro.setFont(new Font("Dialog", Font.PLAIN, 28));
		lblCadastro.setBounds(166, 11, 132, 70);
		contentPane.add(lblCadastro);
		
		JButton button = new JButton("Enviar");
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
		button.setBackground(Color.DARK_GRAY);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(166, 279, 144, 30);
		contentPane.add(button);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBackground(Color.DARK_GRAY);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cadastro tela1 = new Cadastro();
				tela1.setVisible(true);
				CadastroF.this.dispose();
			}
		});
		btnVoltar.setBounds(10, 11, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnIncio = new JButton("In\u00EDcio");
		btnIncio.setForeground(Color.WHITE);
		btnIncio.setBackground(Color.DARK_GRAY);
		btnIncio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Inicio tela1 = new Inicio();
				tela1.setVisible(true);
				CadastroF.this.dispose();
			}
		});
		btnIncio.setBounds(375, 11, 89, 23);
		contentPane.add(btnIncio);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Projeto Final\\imagem.jpg"));
		lblNewLabel.setBounds(0, 0, 474, 342);
		contentPane.add(lblNewLabel);
	}

}
