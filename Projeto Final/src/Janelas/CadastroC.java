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
import javax.swing.ButtonGroup;

public class CadastroC extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroC frame = new CadastroC();
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
	public CadastroC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nome:");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(109, 80, 83, 30);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(109, 111, 281, 20);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("Endere\u00E7o:");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(109, 130, 83, 30);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(109, 156, 281, 20);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("Setor\r\n:");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(109, 227, 83, 30);
		contentPane.add(label_2);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setForeground(Color.BLACK);
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCodigo.setBounds(109, 176, 83, 30);
		contentPane.add(lblCodigo);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(109, 206, 281, 20);
		contentPane.add(textField_3);
		
		JRadioButton rd1 = new JRadioButton("Gerente");
		rd1.setBounds(109, 256, 109, 23);
		contentPane.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("Comprador");
		rd2.setBounds(250, 256, 109, 23);
		contentPane.add(rd2);
		
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
		button.setBounds(164, 301, 144, 30);
		contentPane.add(button);
		
		JLabel lblCadastro = new JLabel("Cadastro ");
		lblCadastro.setForeground(Color.DARK_GRAY);
		lblCadastro.setFont(new Font("Dialog", Font.PLAIN, 32));
		lblCadastro.setBounds(183, 14, 136, 55);
		contentPane.add(lblCadastro);
		
		ButtonGroup relacionando = new ButtonGroup();
		relacionando.add(rd1);
		relacionando.add(rd2);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBackground(Color.DARK_GRAY);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cadastro tela1 = new Cadastro();
				tela1.setVisible(true);
				CadastroC.this.dispose();
			}
		});
		btnVoltar.setBounds(10, 11, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnInicio = new JButton("In\u00EDcio");
		btnInicio.setForeground(Color.WHITE);
		btnInicio.setBackground(Color.DARK_GRAY);
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Inicio tela1 = new Inicio();
				tela1.setVisible(true);
				CadastroC.this.dispose();
			}
		});
		btnInicio.setBounds(375, 11, 89, 23);
		contentPane.add(btnInicio);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Projeto Final\\imagem.jpg"));
		lblNewLabel.setBounds(0, 0, 474, 341);
		contentPane.add(lblNewLabel);
		
	}
}
