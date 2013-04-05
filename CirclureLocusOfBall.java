import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
public class CirclureLocusOfBall extends Applet 
{
	public void paint(Graphics g)
	{
		int theta; //angle (deg)
		double radious = 150;
		
		for(theta = 0; theta < 360; theta += 10)
		{
			double a;
			int x; 
			int y;
			a = (double) theta * Math.PI/180.0;
			x = (int) (radious * Math.sin(a));
			y = (int)(radious * Math.cos(a));
			
			g.setColor(Color.blue);
			g.fillOval(x+200-10, -y+200-10, 21,21 );
		}
	}
}
