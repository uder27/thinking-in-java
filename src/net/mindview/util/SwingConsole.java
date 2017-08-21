package net.mindview.util;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingConsole {
public static void
run(final JFrame f,final int width,final int height,final String a){
	SwingUtilities.invokeLater(new Runnable(){
		public void run(){
			f.setTitle(a);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(width, height);
			f.setLocation(650,350);
			f.setVisible(true);
			
		}
	});
}
}
