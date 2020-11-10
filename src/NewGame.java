import java.awt.Container;
import java.awt.event.*;

import javax.swing.*;

public class NewGame implements ActionListener
{
	JFrame jf;
	JButton jb1,jb2,jb3,jb4;
	Container con;
	NewGame()
	{
		
		jf=new JFrame("Home");
		
		jf.setContentPane(new JLabel(new ImageIcon("img\\forestpg1.jpg")));
		con=jf.getContentPane();
		jf.setLayout(null);
		con.setLayout(null);
		con.add(jb1=new JButton("NewGame"));
		jb1.setBounds(273, 278, 210, 45);
		jb1.setIcon(new ImageIcon("img\\newgame.jpg"));
	
		con.add(jb2=new JButton("Highest Score"));
		jb2.setBounds(273, 350, 210, 45);
		jb2.setIcon(new ImageIcon("img\\hs.jpg"));
		
		con.add(jb3=new JButton("Controls"));
		jb3.setBounds(273, 420, 210, 45);
		jb3.setIcon(new ImageIcon("img\\gamectrl.jpg"));
		
		con.add(jb4=new JButton("Exit"));
		jb4.setBounds(273, 490, 210, 45);
		jb4.setIcon(new ImageIcon("img\\exit.jpg"));
		
		
		
		jf.setSize(1400, 740);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(3);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		
	}
	
	public static void main(String[] args) 
	{
		new NewGame();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==jb1)
		{
			try 
			{
			new CatchIt();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			jf.dispose();
		}
		
		if(ae.getSource()==jb2)
		{
			try 
			{
				new HighS();
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
			jf.dispose();
		
		}
		if(ae.getSource()==jb3)
		{
			try {
				new Controls();
			} catch (Exception e) {
				e.printStackTrace();
			}
			jf.dispose();
		
		}
		
		if(ae.getSource()==jb4)
		{
			
			System.exit(0);
		}
	}
}
