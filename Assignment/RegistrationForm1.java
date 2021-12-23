package Assignment;
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.GridLayout;
import java.awt.Label;
public class RegistrationForm1 
{
	Frame f1;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	Button b1,b2;
	
	public RegistrationForm1() 
	{
		f1 = new Frame("Student Registration");
		tf1 = new TextField(30);
		tf2 = new TextField(30);
		tf3 = new TextField(30);
		tf4 = new TextField(30);
		tf5 = new TextField(30);
		tf6 = new TextField(30);
		tf7 = new TextField(30);
		tf8 = new TextField(200);
		l1 = new Label("Student Name ");
		l2 = new Label("Mail Id ");
		l3 = new Label("Age ");
		l4 = new Label("Phone Number");
		l5 = new Label("Gender ");
		l6 = new Label("Qualification");
		l7 = new Label("Password ");
		l8 = new Label("Address ");
		b1 = new Button("Reset ");
		b2 = new Button("Register");
		
		
		f1.setSize(500,400);
		
		
		GridLayout grid = new GridLayout(9,2);
		f1.setLayout(grid);
		
		
		f1.setVisible(true);
		
		
		f1.add(l1);
		f1.add(tf1);
		f1.add(l2);
		f1.add(tf2);
		f1.add(l3);
		f1.add(tf3);
		f1.add(l4);
		f1.add(tf4);
		f1.add(l5);
		f1.add(tf5);
		f1.add(l6);
		f1.add(tf6);
		f1.add(l7);
		f1.add(tf7);
		f1.add(l8);
		f1.add(tf8);
		f1.add(b1);
		f1.add(b2);
	}
}
