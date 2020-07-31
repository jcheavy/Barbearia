package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class TelaLogin extends JFrame {

	private JPanel painelPrincipal;
	private JTextField textUsuario;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 299);
		painelPrincipal = new JPanel();
		painelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelPrincipal);
		painelPrincipal.setLayout(null);
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBounds(12, 12, 329, 233);
		painelPrincipal.add(panelCentral);
		panelCentral.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(132, 40, 64, 15);
		panelCentral.add(lblLogin);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(107, 75, 114, 25);
		panelCentral.add(textUsuario);
		textUsuario.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("password");
		pwdPassword.setBounds(107, 115, 114, 25);
		panelCentral.add(pwdPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(104, 155, 117, 25);
		panelCentral.add(btnLogin);
	}
}
