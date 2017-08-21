package net.mindview.util;

import javax.swing.*;
import java.util.concurrent.*;
public class Abbb extends JFrame{
JLabel label;
public Abbb()
{
	JFrame jeww;
	jeww=new JFrame("1231");
	label=new JLabel("a apple");
	jeww.add(label);
	SwingConsole.run(jeww,300,300,"fuck");
}
static Abbb ssp;
public static void main (String[] args)throws Exception
{
	SwingUtilities.invokeLater(new Runnable(){
		public void run()
		{
			ssp=new Abbb();
		}
	});
	TimeUnit.SECONDS.sleep(1);
	SwingUtilities.invokeLater(new Runnable(){
		public void run()
		{
			ssp.label.setText("hhhhhhhh");
		}
	});
}

}
