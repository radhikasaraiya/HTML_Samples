import java.awt.*;
import java.applet.*;


public class Sample1 extends Applet{

	public void init ()
	{
		setBackground(Color.red);
		setForeground(Color.white);
	}

	public void paint(Graphics g)
	{
		g.drawString("Hello",10,10);
	}

}