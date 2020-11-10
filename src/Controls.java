import java.awt.Container;
import java.awt.event.*;

import javax.swing.*;

public class Controls  implements ActionListener
{
	JFrame jf;
	JButton back,exit,save;
	JLabel jl1,jl2,jl3;
	JTextField jtf1,jtf2;
	Container con;

	Controls() throws Exception
	{
		
		jf=new JFrame("Home");
		
		jf.setContentPane(new JLabel(new ImageIcon("img\\levelbk.gif")));
		con=jf.getContentPane();
		jf.setLayout(null);
		con.setLayout(null);
		
		con.add(back=new JButton("Back"));
		back.setBounds(500, 510, 100, 33);
		back.setIcon(new ImageIcon("img\\hsbck.gif"));
		
		con.add(exit=new JButton("Exit"));
		exit.setBounds(630, 510, 100, 36);
		exit.setIcon(new ImageIcon("img\\exit.jpg"));
		
		con.add(save=new JButton("Save"));
		save.setBounds(760, 510, 100, 36);
		save.setIcon(new ImageIcon("img\\save.jpg"));
		
		con.add(jl1=new JLabel("<html><font color='yellow' size='+4' style='strikethrough'> C O N T R O L S </html>"));
		jl1.setBounds(540,170, 300, 100);
		
		con.add(jl2=new JLabel("<html><font color='black' size='+4'> MOVE LEFT :</html>"));
		jl2.setBounds(480,250, 300, 100);
		
		con.add(jtf1=new JTextField());
		jtf1.setBounds(740,280,70,40);
		jtf1.setText("a");

		
		con.add(jl3=new JLabel("<html><font color='black' size='+4'> MOVE RIGHT :</html>"));
		jl3.setBounds(480,330, 300, 100);
		
		con.add(jtf2=new JTextField());
		jtf2.setBounds(740,360,70,40);
		jtf2.setText("d");
		
		jf.setSize(1400, 740);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(3);

		back.addActionListener(this);
		exit.addActionListener(this);
		save.addActionListener(this);
	}
	
	public static void main(String[] args) throws Exception 
	{
		new Controls();
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{	
		if(ae.getSource()==back)
		{
			new NewGame();
			jf.dispose();
		}
		
		if(ae.getSource()==exit)
		{
			System.exit(0);
		}
		
		
		if(ae.getSource()==save)
		{
			String s1=jtf1.getText().trim();
			String s2=jtf2.getText().trim();
			
			
			
			 JOptionPane.showMessageDialog(null, "Success");
			//java.awt.Toolkit.getDefaultToolkit().beep();
		}
	}
}
