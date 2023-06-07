import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Painel extends JPanel{
	public Botão1 botao1;
	/*public Botão botao2;
	public Botão botao3;
	public Botão botao4; */
	public Painel(Painel2 painel2) {
		botao1= new Botão1("Cadastrar",painel2);
		add(botao1);
		/*botao2= new Botão("Listar");
		add(botao2);
		botao3= new Botão("Atualizar");
		add(botao3);
		botao4= new Botão("Deletar");
		add(botao4); */
		setBackground(Color.GRAY);
		setVisible(true);
	}
}
