import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Janela extends JFrame{
	public Label label;
	public Painel painel1;
	public Painel2 painel2;
	public Cliente cliente;
	public Janela() {
		painel2 = new Painel2();
		painel1 = new Painel(painel2);
		setLayout(new BorderLayout(2,1));
		setSize(1000,600);
		add(painel2,BorderLayout.CENTER);
		add(painel1,BorderLayout.NORTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
