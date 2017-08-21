package net.mindview.util;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Shanchu extends JFrame{
	private JButton
	c1=new JButton("确认删除");
	JTextField txt=new JTextField(10);
	public Shanchu(){
		setLayout(null);
		JLabel l1=new JLabel("输入要删除的小朋友的学号:");
		l1.setBounds(50, 20, 200, 30);
		txt.setBounds(150,80,200,30);
		c1.setBounds(150, 200, 90, 30);
		add(c1);
		c1.addActionListener(xl);
		add(txt);
		add(l1);
	}
	private ActionListener xl=new ActionListener(){
		public void actionPerformed(ActionEvent e){
			java.sql.Connection con = null;
			 Statement stat = null;
            java.sql.PreparedStatement ps=null;
            String number=new String();
            number=txt.getText();
            String sql = "DELETE FROM student WHERE number='"+number+"'";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("JBDC 加载成功!");
            }catch(Exception a){
                System.out.println("JBDC 狗带!");
                a.printStackTrace();
            }
            try{
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/co","root","444427");
                stat = con.createStatement();
                stat.executeUpdate(sql);
            }catch (SQLException b){
                b.printStackTrace();
            }
            finally{
                try{
                    con.close();
                    System.out.println("MySQL 关闭成功");
                }catch (SQLException c){
                    System.out.println("MySQL 关闭失败 ");
                    c.printStackTrace();
                }                  
            }
		}
	};
public static void
xiugai(final JFrame f,final int width,final int height,final String a){
	SwingUtilities.invokeLater(new Runnable(){
		public void run(){
			f.setTitle(a);
			f.setSize(width, height);
			f.setLocation(750,400);
			f.setVisible(true);
		}
	});
}
}
