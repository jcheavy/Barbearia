package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GrandeTela extends JFrame {

	private JPanel principal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GrandeTela frame = new GrandeTela();
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
	public GrandeTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		principal = new JPanel();
		principal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(principal);
		GridBagLayout gbl_principal = new GridBagLayout();
		gbl_principal.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_principal.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_principal.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_principal.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		principal.setLayout(gbl_principal);
		
		JLabel lblcima = new JLabel("New label");
		GridBagConstraints gbc_lblcima = new GridBagConstraints();
		gbc_lblcima.insets = new Insets(0, 0, 5, 5);
		gbc_lblcima.gridx = 1;
		gbc_lblcima.gridy = 0;
		principal.add(lblcima, gbc_lblcima);
		
		JLabel lblultimo = new JLabel("New label");
		GridBagConstraints gbc_lblultimo = new GridBagConstraints();
		gbc_lblultimo.insets = new Insets(0, 0, 5, 0);
		gbc_lblultimo.gridx = 13;
		gbc_lblultimo.gridy = 7;
		principal.add(lblultimo, gbc_lblultimo);
		
		JLabel lblFinal = new JLabel("final");
		GridBagConstraints gbc_lblFinal = new GridBagConstraints();
		gbc_lblFinal.gridx = 13;
		gbc_lblFinal.gridy = 8;
		principal.add(lblFinal, gbc_lblFinal);
	}

}
