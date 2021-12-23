package Assignment2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class LoginForm 
{
	Frame f1;
	TextField tf1,tf2;
	Label l1,l2;
	Button b1,b2;
	
	  public LoginForm() 
	  
	  {
		
		f1 = new Frame("Login Form");
		tf1 = new TextField(30);
		tf2 = new TextField(30);

		l1 = new Label("Email Id");
		l2 = new Label("Password ");
		
		b1 = new Button("Reset ");
		b2 = new Button("Login");
		
		
		f1.setSize(300,200);
		
		
		GridLayout grid = new GridLayout(3,2);
		f1.setLayout(grid);
		
		
		f1.setVisible(true);
		
		
		f1.add(l1);
		f1.add(tf1);
		f1.add(l2);
		f1.add(tf2);
		
		f1.add(b1);
		f1.add(b2);
	}
}

