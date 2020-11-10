import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class CatchItLevel2 extends JFrame implements KeyListener,Runnable,MouseMotionListener 
{
	JLabel back,basket,scorel,timer;//fruit,fruit1,fruit2,scorel;
	JLabel fruit[]=new JLabel[5];
	Thread th,th1;
	int move=300;
	static int score=500,seconds=0,hrs=0,min=0;
	static int value=0,x1,index;
	char ch3='p',ch4='r';
	  char c3='a' , c4='d';
	CatchItLevel2() throws Exception
	{
		setLayout(null);
		
		setContentPane(back=new JLabel(new ImageIcon("img\\gamebck1.jpg")));
		//back.setBounds(50, 500, 200, 50);
		getContentPane().setLayout(null);
		
		getContentPane().add(basket=new JLabel(new ImageIcon("img\\bearbasket.gif")));
		basket.setBounds(300, 530, 200, 150);
		
		getContentPane().add(fruit[0]=new JLabel(new ImageIcon("img\\cherry.gif")));
	//	fruit[0].setBounds(50, 20, 100, 50);
		
		getContentPane().add(fruit[1]=new JLabel(new ImageIcon("img\\grapes.gif")));
	//	fruit[1].setBounds(60, 20, 100, 50);
		
		getContentPane().add(scorel=new JLabel("<html><font color='red' size='+2'> SCORE :500 </html>"));
		scorel.setBounds(1100, 20, 120, 50);
		scorel.setForeground(Color.red);
		
		getContentPane().add(fruit[2]=new JLabel(new ImageIcon("img\\strawberry copy.gif")));
		//fruit[2].setBounds(70, 20, 100, 50);
		
		getContentPane().add(fruit[3]=new JLabel(new ImageIcon("img\\apple.gif")));
		getContentPane().add(fruit[4]=new JLabel(new ImageIcon("img\\banana.gif")));
		//fruit[3].setBounds(70, 20, 100, 50);
		
		getContentPane().add(timer=new JLabel());
		timer.setBounds(20, 20, 200, 50);
		
		setSize(1400,740);
		setVisible(true);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		addKeyListener(this);
		
		
		 th=new Thread(this);
		 th.start();
	}
			
	public void run() 
	{
				
				int x;
				for(int i=0;i<=50;i++)
				{
					index=(int)(Math.random()*5);
					x=(int)(Math.random()*100);
					 x1=x;
					for(int y=0;y<750;y++)//680
					{
						fruit[index].setBounds(x, y, 150, 50);
						//System.out.println(x1);
						//System.out.println(value);
						try {Thread.sleep(3);}
						catch (InterruptedException e) {e.printStackTrace();}
				
						if(fruit[index].getY()==basket.getY() && x1>value-15 && x1<value+48)
							
						{
							getContentPane().remove(fruit[index]);
							score=score+100;
							scorel.setText("<html><font color='red' size='+4'> "+score+" </html>");	
							 
							/*   if(score==1000)
							   {
								   try {
									   dispose();
									  new CatchItLevel2();
								     } catch (Exception e) {e.printStackTrace();
								}
							   }*/
						}
						
											
				}
					getContentPane().add(fruit[index]);
			}
	}
		
	public void keyPressed(KeyEvent ae) 
	{
		if(move>=0)
		{
			if(c3==ae.getKeyChar() )
			{
				basket.setBounds(move-=30, 530, 200, 150);
				value=move;
			}
		}
		
		
		if(move<=1200)
		{
			if( c4==ae.getKeyChar())
			{
				basket.setBounds(move+=30, 530, 200, 150);
				value=move;
			}
		}
		  if(ae.getKeyChar()==ch3)
		  {
			  th.suspend();
		  }
		  if(ae.getKeyChar()==ch4)
		  {
			  th.resume();
		  }
	
		
	}
		public void keyReleased(KeyEvent arg0){}public void keyTyped(KeyEvent arg0) {}

		public void mouseDragged(MouseEvent e)
		{
			 basket.setBounds(e.getX(), 400, 200, 100);
			 if(fruit[index].getY()==basket.getY() && x1>value-15 && x1<value+48)
					
				{
				 fruit[index].setBounds(0, 0, 0, 0);
					//getContentPane().remove(fruit[index]);
					score=score+5;
					scorel.setText("<html><font color='red' size='+4'> "+score+" </html>");	
				}
		}
		@Override
		public void mouseMoved(MouseEvent e)
		{
		   		
		}
}
		
		

