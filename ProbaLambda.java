import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class ProbaLambda extends Applet{
	
	private Button b;

	public void init(){
		b= new Button("ok");
		b.addActionListener((ActionEvent e) -> System.out.println("click con lambdas"));
		this.add(b);
		
	}
}
