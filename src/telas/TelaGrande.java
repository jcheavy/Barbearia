package telas;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TelaGrande extends JFrame{
	
	private JButton bt01, bt02, bt03, bt04, bt05, bt06;
	private JTextField tx01, tx02, tx03, tx05, tx06;
	GridBagConstraints cons = new GridBagConstraints();
	
	public TelaGrande() {
		
		setLayout(new GridBagLayout());
		
		setVisible(true);
		setSize(600,500);
		
		bt01 = new JButton("b01");
		cons.gridx = 0;
		cons.gridy = 0;
		cons.gridheight = 3;
		cons.fill = GridBagConstraints.VERTICAL;
		add(bt01, cons);
		
		bt02 = new JButton("b02");
		cons.gridx = 1;
		cons.gridy = 1;
		cons.gridheight = 1;
		add(bt02, cons);
		
		bt03 = new JButton("b03");
		cons.gridx = 2;
		cons.gridy = 2;
		cons.gridheight = 1;
		add(bt03, cons);
		
		bt04 = new JButton("b04");
		cons.gridx = 3;
		cons.gridy = 3;
		cons.gridheight = 1;
		add(bt04, cons);
		
		bt05 = new JButton("b05");
		cons.gridx = 1;
		cons.gridy = 4;
		cons.gridwidth = 3;
		cons.fill = GridBagConstraints.HORIZONTAL;
		add(bt05, cons);
	}
		
		
	public static void main(String[] args) {
		TelaGrande teG = new TelaGrande();
		teG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
