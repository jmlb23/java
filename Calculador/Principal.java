import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

final class Simbolos{
	public static final char[] ARRAY =
	{
		'1','2','3','+','4','5','6','-','7','8','9','/','0',',','=','*'
	};
}
public class Principal extends JFrame{
	private JTextArea texto;
	private JPanel panel;
	private JMenuBar menu;
	private JLabel l;
	private JButton b;	
	private ArrayList<JButton> lista = new ArrayList<JButton>();
	private Font fo;
	private String 	xanela;
	private int acumulador;
	public Principal(){
		l = new JLabel();
		texto = new JTextArea(4,4);
		fo = texto.getFont();
		texto.setBackground(Color.yellow);
		texto.setFont(fo.deriveFont(fo.getSize()+20f));
		texto.setEditable(false);
		panel = new JPanel();
		panel.setLayout(new GridLayout(5,4,10,10));
		this.setLayout(new BorderLayout(10,5));
		crearMenu();
		agregaCompoñentes();
		agregaEscoita();	
		this.setVisible(true);	
		this.setSize(285,325);
		//this.setResizable(false);
		
	}
	
	public static void main(String... args){
		Principal p = new Principal();
	}


	public void crearMenu(){
				
		menu = new JMenuBar();
		menu.add(new JMenu("proba"));
		

	}

	public void agregaCompoñentes(){
				
		for(char c : Simbolos.ARRAY){
			b = new JButton(""+c);
			lista.add(b);		
			panel.add(b);
			
			
		}
		
		this.add(l, BorderLayout.NORTH);
		this.add(texto, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
		this.setJMenuBar(menu);
	}
	public void agregaEscoita(){
		for(JButton t : lista){
			t.addActionListener(new Escoita());
		}
	}
	
	class Escoita implements ActionListener{

        	public void actionPerformed(ActionEvent ae){
			switch(((JButton)ae.getSource()).getText()){
				case "+":
					System.out.println(acumulador);
					acumulador = (texto.getText().equals("")? 0 : (acumulador + Integer.parseInt(texto.getText())));
					texto.setText("");
				break;
				case "-":
                                        System.out.println(acumulador);
                                        acumulador = (texto.getText().equals("")? Integer.parseInt(texto.getText()): (acumulador - Integer.parseInt(texto.getText())));
                                        texto.setText("");
                                break;

				case "=":
					texto.setText(""+acumulador);
				break;
				default:
				texto.append(((JButton)ae.getSource()).getText());
			}

        	}
	}
	
}

