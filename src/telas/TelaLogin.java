package telas;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import utils.Utils;

public class TelaLogin extends JFrame {

	private JButton btLogin;
	private JButton btLimpar;
	private JTextField txUsuario;
	private JTextField txSenha;
	private JLabel lbTitulo;
	private JLabel lbUsuario;
	private JLabel lbSenha;
    
	private JPanel panelCentro;
	
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
		Container telaLogin = getContentPane();
	    setLayout(null);
	    setLocation(500,200);
	    setSize(300,300);
	    setResizable(false);
		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
	    panelCentro = new JPanel();
	    telaLogin.add(panelCentro);
	    telaLogin.setBackground(Utils.azul);
	    panelCentro.setBackground(Utils.bege);
	    panelCentro.setBounds(10,10,280,250);
	    panelCentro.setLayout(gb);
	    
        lbTitulo = new JLabel("LOGIN");
        lbTitulo.setFont(Utils.gramond_20);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
              
	    panelCentro.add(lbTitulo, gbc);
	    
	    lbUsuario = new JLabel("Usuário");
	    lbUsuario.setFont(Utils.gramond_15);
	    //panelCentro.add(lbUsuario);
		
		setVisible(true);
		
	}
}
