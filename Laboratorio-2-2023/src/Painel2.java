
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Painel2 extends JPanel{
	public Label label1;
	public Label label2;
	public Label label3;
	public Label label4; 
	public Painel2() {
		setLayout(new GridLayout(4,3));
		label1 = new Label("Nome");
		add(label1);
		JTextField caixa1= new JTextField(6);
		add(caixa1);
		label2 = new Label("Cpf");
		add(label2);
		JTextField caixa2= new JTextField(6);
		add(caixa2);
		label3 = new Label("Matricula");
		add(label3);
		JTextField caixa3= new JTextField(6);
		add(caixa3);
		label4 = new Label("Vertente");
		add(label4);
		JTextField caixa4= new JTextField(6);
		add(caixa4);
		setBackground(Color.LIGHT_GRAY);
		setVisible(false);
	}
	/*public boolean analise(boolean analise){
		if(analise) {
			analise=false;
			return analise;
		}
		else {
			analise=true;
			return analise;
		}
	} */
}
