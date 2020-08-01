package telas;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.Utils;

public class TelaGrid extends JFrame {

	JButton bt1, bt2, bt3, bt4, bt5;
	private JLabel lbtitulo;
    
	private JPanel panelCentro;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGrid frame = new TelaGrid();
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
	public TelaGrid() {
		Container telaLogin = getContentPane(); 
	   
	    setLocation(500,200);
	    setSize(300,300);
	    setResizable(false);
		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		 setLayout(gb);			
	    
		lbtitulo = new JLabel("LOGIN");
		lbtitulo.setFont(Utils.gramond_(25));
		gbc.gridx = 2;
		gbc.gridy = 0;  
		gbc.gridwidth = 2;
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    telaLogin.add(lbtitulo, gbc);
		
		
	    bt1 = new JButton("bt1");
	    gbc.gridx = 1;
	    gbc.gridy = 1;  
	    gbc.gridwidth = 1;
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    telaLogin.add(bt1, gbc);
	    
	    
	    bt2 = new JButton("bt2");
	    gbc.gridx = 2;
	    gbc.gridy = 1;
	    gbc.gridwidth = 3;	 
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    telaLogin.add(bt2, gbc);
	    
	    bt3 = new JButton("bt3");
	    gbc.gridx = 1;
	    gbc.gridy = 2;
	    gbc.gridwidth = 1;
	    telaLogin.add(bt3, gbc);
	    
	    bt4 = new JButton("bt4");
	    gbc.gridx = 2;
	    gbc.gridy = 2;
	    gbc.gridwidth = 1;
	    gbc.fill = GridBagConstraints.REMAINDER;
	    telaLogin.add(bt4, gbc);
	    
	    bt5 = new JButton("bt5");
	    gbc.gridx = 4;
	    gbc.gridy = 4;	 
	    telaLogin.add(bt5, gbc);
		
		
		setVisible(true);
		
	}
}
