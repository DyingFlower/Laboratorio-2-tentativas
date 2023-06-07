import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Botão1 extends JButton implements ActionListener{
	public String texto;
	public Painel2 painel;
	public Botão1(String texto,Painel2 painel) {
		this.painel=painel;
		this.texto=texto;
		setBackground(Color.blue);
		setSize(200,300);
		setText(texto);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		painel.setVisible(true);
	}

}
