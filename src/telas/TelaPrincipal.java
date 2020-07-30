package telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Insets;

public class TelaPrincipal extends JFrame {

	private JPanel PainelPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,0, 1000, 700);
		PainelPrincipal = new JPanel();
		PainelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PainelPrincipal);
		
		GridBagLayout gbl_PainelPrincipal = new GridBagLayout();
		gbl_PainelPrincipal.columnWidths = new int[]{824, 177};
		gbl_PainelPrincipal.rowWeights = new double[]{1.0, 0.0};
		gbl_PainelPrincipal.columnWeights = new double[]{1.0, 1.0};
		PainelPrincipal.setLayout(gbl_PainelPrincipal);
		
		JPanel panelPrincipal = new JPanel();
		GridBagConstraints gbc_panelPrincipal = new GridBagConstraints();
		gbc_panelPrincipal.insets = new Insets(0, 0, 5, 5);
		gbc_panelPrincipal.fill = GridBagConstraints.BOTH;
		gbc_panelPrincipal.gridx = 0;
		gbc_panelPrincipal.gridy = 0;
		panelPrincipal.setBackground(Color.darkGray);
		PainelPrincipal.add(panelPrincipal, gbc_panelPrincipal);
		
		JPanel panelDireito = new JPanel();
		GridBagConstraints gbc_panelDireito = new GridBagConstraints();
		gbc_panelDireito.insets = new Insets(0, 0, 5, 0);
		gbc_panelDireito.fill = GridBagConstraints.BOTH;
		gbc_panelDireito.gridx = 1;
		gbc_panelDireito.gridy = 0;
		panelDireito.setBackground(Color.blue);
		PainelPrincipal.add(panelDireito, gbc_panelDireito);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		PainelPrincipal.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 1;
		PainelPrincipal.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		
	}
}
