package Assignment3;
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.GridLayout;
import java.awt.Label;
public class FeedbackForm 
{
	Frame f1;
	TextField tf1,tf2,tf3,tf4;
	Label l1,l2,l3,l4;
	Button b1,b2;
	
	public FeedbackForm() {
	
		f1 = new Frame("Feedback Form");
		tf1 = new TextField(30);
		tf2 = new TextField(30);
		tf3 = new TextField(30);
		tf4 = new TextField(300);
		
		l1 = new Label("Student Name ");
		l2 = new Label("Phone Number ");
		l3 = new Label("Email Id ");
		l4 = new Label("Feedback message");
		
		b1 = new Button("Reset ");
		b2 = new Button("Submit");
		
		
		f1.setSize(500,400);
		
		
		GridLayout grid = new GridLayout(5,2);
		f1.setLayout(grid);
		
		/
		f1.setVisible(true);
		
	
		f1.add(l1);
		f1.add(tf1);
		f1.add(l2);
		f1.add(tf2);
		f1.add(l3);
		f1.add(tf3);
		f1.add(l4);
		f1.add(tf4);
		
		f1.add(b1);
		f1.add(b2);
	}
}
