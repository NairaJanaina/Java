package Janelas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 327);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//centralizar
		this.setLocationRelativeTo(null);
		
		JButton btnCadastro = new JButton("Cadastro");
		btnCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnCadastro.setBackground(Color.GRAY);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnCadastro.setBackground(Color.DARK_GRAY);
			}
		});
		btnCadastro.setForeground(Color.WHITE);
		btnCadastro.setBackground(Color.DARK_GRAY);
		btnCadastro.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnCadastro.setBackground(Color.DARK_GRAY);
		
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cadastro frame = new Cadastro();
				frame.setVisible(true);
				Inicio.this.dispose();
				
			}
		});
		
		
		btnCadastro.setBounds(46, 152, 158, 35);
		contentPane.add(btnCadastro);
		
		JButton btnNewButton = new JButton("Login\r\n\r\n");
		
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(Color.GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(Color.DARK_GRAY);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login frame = new Login();
				Inicio.this.dispose();
				frame.setVisible(true);
				
			}
		});
		
		btnNewButton.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnNewButton.setBounds(251, 152, 158, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblBemvindo = new JLabel("Bem-vindo!");
		lblBemvindo.setFont(new Font("Dialog", Font.PLAIN, 26));
		lblBemvindo.setForeground(Color.DARK_GRAY);
		lblBemvindo.setBounds(162, 33, 254, 71);
		contentPane.add(lblBemvindo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Projeto Final\\imagem.jpg"));
		lblNewLabel.setBounds(0, 0, 465, 325);
		contentPane.add(lblNewLabel);
	}
}
