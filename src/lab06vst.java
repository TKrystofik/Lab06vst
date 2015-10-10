
// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																
public class lab06vst extends Applet
{
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
			
		// Draw Random Lines 
    //for loop initiates drawing multiple, rd grn blu set random color ints, xs and ys create random ints for line	
		for(int k = 0; k < 100; k++)
		{	
			double rd =  (Math.random()*256);
			double blu = (Math.random()*256);
			double grn = (Math.random()*256);
		    double x1 =  (Math.random()* 400) + 10;
			double y1 =  (Math.random()*295) + 10;
			double x2 =  (Math.random()*400) + 10;
			double y2 =  (Math.random()*300)+10;
			g.setColor(new Color((int)rd,(int)blu,(int)grn));
			g.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
		}
		// Draw Random Squares
		//for loop initiates drawing multiple, rd grn blu set random color ints, xs and ys create random ints for square	
		for(int k = 0; k < 100; k++)
		{	
			double rd =  (Math.random()*256);
			double blu = (Math.random()*256);
			double grn = (Math.random()*256);
		    double x1 =  (Math.random()* 300) + 400;
			double y1 =  (Math.random()*250) + 10;
			
			g.setColor(new Color((int)rd,(int)blu,(int)grn));
			g.fillRect((int)x1, (int)y1, 50, 50);
		}
			// Draw Random Circles
		//for loop initiates drawing multiple, rd grn blu set random color ints, x and y create random ints for circles	wnh are witdth and height
		for(int k = 0; k < 100; k++)
		{
			double rd =  (Math.random()*256);
	        double blu = (Math.random()*256);
	        double grn = (Math.random()*256);
	        double wnh = (Math.random()*100);
	        double x1 =  (Math.random()* 250) + 10;
			double y1 =  (Math.random()*200) + 300;
	        g.setColor(new Color((int)rd,(int)blu,(int)grn));
			g.drawOval((int)x1, (int)y1, (int)wnh, (int)wnh);
		}	
	}
	}	
 
