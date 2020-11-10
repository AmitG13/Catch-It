import java.awt.Container;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.*;

public class HighS  implements ActionListener
{
	JFrame jf;
	JButton jb1,jb2;
	JLabel jl1,jl2;
	Container con1;
	
	HighS() throws Exception
	{
		
		jf=new JFrame("Home");
		
		jf.setContentPane(new JLabel(new ImageIcon("img\\hscorepg.gif")));
		con1=jf.getContentPane();
		jf.setLayout(null);
		con1.setLayout(null);
		
		con1.add(jb1=new JButton(""));
		jb1.setBounds(540, 510, 100, 33);
		jb1.setIcon(new ImageIcon("img\\hsbck.gif"));
		
		con1.add(jb2=new JButton("Exit"));
		jb2.setBounds(670, 510, 100, 36);
		jb2.setIcon(new ImageIcon("img\\exit.jpg"));
		
		con1.add(jl1=new JLabel("<html><font color='blue' size='+2'>  Under Construction :))</html>"));
		jl1.setBounds(500, 220, 300, 100);
		con1.add(jl2=new JLabel("<html><font color='blue' size='+2'>  Temporary :250 </html>"));
		jl2.setBounds(500, 260, 300, 100);
		
		
		
		jf.setSize(1400, 740);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(3);

		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
	
	public static void main(String[] args) throws Exception
	{
		new HighS();
	}
	
	public void actionPerformed(ActionEvent ae)
	{	
		if(ae.getSource()==jb1)
		{
			new NewGame();
			jf.dispose();
		}
		
		if(ae.getSource()==jb2)
		{
			System.exit(0);
		}
	}
}
