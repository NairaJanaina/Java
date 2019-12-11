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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cadastro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setForeground(new Color(100, 100, 100));
		lblCadastro.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 32));
		lblCadastro.setBounds(171, 51, 146, 51);
		contentPane.add(lblCadastro);
		//centralizar
		this.setLocationRelativeTo(null);
		
		JButton btnNewButton = new JButton("Fornecedor");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(Color.DARK_GRAY);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(Color.GRAY);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroF frame = new CadastroF();
				Cadastro.this.dispose();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(158, 202, 146, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cliente");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1.setBackground(Color.GRAY);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBackground(Color.DARK_GRAY);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroC frame = new CadastroC();
				Cadastro.this.dispose();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(158, 139, 148, 43);
		contentPane.add(btnNewButton_1);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBackground(Color.DARK_GRAY);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Inicio tela1 = new Inicio();
				tela1.setVisible(true);
				Cadastro.this.dispose();
				
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
				Cadastro.this.dispose();
			}
		});
		btnIncio.setForeground(Color.WHITE);
		btnIncio.setBounds(357, 11, 89, 23);
		contentPane.add(btnIncio);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Projeto Final\\fundoCd.jpg"));
		lblNewLabel.setBounds(-1, -3, 456, 353);
		contentPane.add(lblNewLabel);
	}
}
