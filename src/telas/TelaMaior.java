package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class TelaMaior extends JFrame {

	private JPanel painelPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMaior frame = new TelaMaior();
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
	public TelaMaior() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 1, 1000, 600);
		painelPrincipal = new JPanel();
		painelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelPrincipal);
		GridBagLayout gbl_painelPrincipal = new GridBagLayout();
		gbl_painelPrincipal.columnWidths = new int[]{800, 228, 0};
		gbl_painelPrincipal.rowHeights = new int[]{0, 0, 0, 0};
		gbl_painelPrincipal.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_painelPrincipal.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		painelPrincipal.setLayout(gbl_painelPrincipal);
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBackground(Color.GRAY);
		GridBagConstraints gbc_panelCentral = new GridBagConstraints();
		gbc_panelCentral.insets = new Insets(0, 0, 5, 5);
		gbc_panelCentral.fill = GridBagConstraints.BOTH;
		gbc_panelCentral.gridx = 0;
		gbc_panelCentral.gridy = 0;
		painelPrincipal.add(panelCentral, gbc_panelCentral);
		
		JPanel panelDireito = new JPanel();
		panelDireito.setBackground(Color.YELLOW);
		GridBagConstraints gbc_panelDireito = new GridBagConstraints();
		gbc_panelDireito.insets = new Insets(0, 0, 5, 0);
		gbc_panelDireito.fill = GridBagConstraints.BOTH;
		gbc_panelDireito.gridx = 1;
		gbc_panelDireito.gridy = 0;
		painelPrincipal.add(panelDireito, gbc_panelDireito);
		GridBagLayout gbl_panelDireito = new GridBagLayout();
		gbl_panelDireito.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panelDireito.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelDireito.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelDireito.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelDireito.setLayout(gbl_panelDireito);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 0;
		panelDireito.add(comboBox, gbc_comboBox);
		
		JPanel panelUsuario = new JPanel();
		GridBagConstraints gbc_panelUsuario = new GridBagConstraints();
		gbc_panelUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_panelUsuario.fill = GridBagConstraints.BOTH;
		gbc_panelUsuario.gridx = 1;
		gbc_panelUsuario.gridy = 1;
		panelDireito.add(panelUsuario, gbc_panelUsuario);
		panelUsuario.setLayout(new BorderLayout(0, 0));
		
		JLabel lblUsuario = new JLabel("NomeUser");
		panelUsuario.add(lblUsuario, BorderLayout.NORTH);
		
		JLabel lblData = new JLabel("Data");
		panelUsuario.add(lblData, BorderLayout.CENTER);
		
		JLabel lblIcon = new JLabel("icon");
		panelUsuario.add(lblIcon, BorderLayout.WEST);
		
		JLabel lblTipo = new JLabel("Tipo");
		panelUsuario.add(lblTipo, BorderLayout.EAST);
		
		JLabel lblSetor = new JLabel("Setor");
		panelUsuario.add(lblSetor, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 15;
		panelDireito.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 2;
		painelPrincipal.add(btnNewButton, gbc_btnNewButton);
	}

}
