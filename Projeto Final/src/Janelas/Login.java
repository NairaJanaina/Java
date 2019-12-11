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
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;

public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(SystemColor.desktop);
		lblLogin.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblLogin.setBounds(184, 11, 115, 44);
		contentPane.add(lblLogin);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnCliente.setBackground(Color.GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnCliente.setBackground(Color.DARK_GRAY);
			}
		});
		btnCliente.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		btnCliente.setForeground(SystemColor.window);
		btnCliente.setBackground(Color.DARK_GRAY);
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginC frame = new LoginC();
				Login.this.dispose();
				frame.setVisible(true);
			}
		});
		btnCliente.setBounds(118, 99, 198, 44);
		contentPane.add(btnCliente);
		
		JButton btnFuncionario = new JButton("Fornecedor");
		
		btnFuncionario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnFuncionario.setBackground(Color.GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnFuncionario.setBackground(Color.DARK_GRAY);
			}
		});
		btnFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginF frame = new LoginF();
				Login.this.dispose();
				frame.setVisible(true);
			}
		});
		btnFuncionario.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		btnFuncionario.setForeground(SystemColor.window);
		btnFuncionario.setBounds(118, 168, 198, 44);
		btnFuncionario.setBackground(Color.DARK_GRAY);
		contentPane.add(btnFuncionario);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBackground(Color.DARK_GRAY);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Inicio tela1 = new Inicio();
				tela1.setVisible(true);
				Login.this.dispose();
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
				Login.this.dispose();
			}
		});
		btnIncio.setBounds(357, 11, 89, 23);
		contentPane.add(btnIncio);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Projeto Final\\fundoCd.jpg"));
		lblNewLabel.setBounds(0, 0, 456, 343);
		contentPane.add(lblNewLabel);
	}
}
