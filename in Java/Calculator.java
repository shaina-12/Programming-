import java.awt.*;
import java.awt.event.*;
class Window extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
public class Calculator extends Frame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField t;
	Panel p;
	String str[]= {"7","8","9","+",
			"4","5","6","-",
			"1", "2", "3","*",
			"C","0","=","/"};
	Button b[] = new Button[16];
	int num1=0,num2=0,result=0;
	char op;
	public Calculator() {
		t= new TextField(10);
		p= new Panel();
		add(t,"North");
		add(p,"Center");
		p.setLayout(new GridLayout(4,4));
		for(int i=0;i<16;i++) {
			b[i]=new Button(str[i]);
			b[i].addActionListener(this);
			p.add(b[i]);
		}
		addWindowListener(new Window());
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s=e.getActionCommand();
		if(s.equals("+")) {
			op='+';
			num1=Integer.parseInt(t.getText());
			t.setText("");
		}
		else if(s.equals("-")) {
			op='-';
			num1=Integer.parseInt(t.getText());
			t.setText("");
		}
		else if(s.equals("*")) {
			op='*';
			num1=Integer.parseInt(t.getText());
			t.setText("");
		}
		else if(s.equals("/")) {
			op='/';
			num1=Integer.parseInt(t.getText());
			t.setText("");
		}
		else if(s.equals("=")) {
			num2=Integer.parseInt(t.getText());
			switch(op) {
			case '+': result=num1+num2;
			break;
			case '-': result=num1-num2;
			break;
			case '*': result=num1*num2;
			break;
			case '/': result=num1/num2;
			break;
			}
			t.setText(result+"");
			result=0;
		}
		else if(s.equals("C")) {
			t.setText("");
			num1=num2=result=0;
		}
		else {
			t.setText(t.getText()+s);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c= new Calculator();
		c.setTitle("Practice");
		c.setSize(new Dimension(250,300));
		c.setVisible(true);
	}
}
