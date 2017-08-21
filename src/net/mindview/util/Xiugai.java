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

public class Xiugai extends JFrame{
	private JButton
	c1=new JButton("确认修改");
	JTextField txt1=new JTextField(10);
	JTextField txt2=new JTextField(10);
	JTextField txt3=new JTextField(10);
	JTextField txt4=new JTextField(10);
	JTextField txt5=new JTextField(10);
	JTextField txt6=new JTextField(10);
	JTextField txt7=new JTextField(10);
	JTextField txt8=new JTextField(10);
	public Xiugai(){
		setLayout(null);
		JLabel l1=new JLabel("输入新的姓名:");
		JLabel l2=new JLabel("输入新的性别:");
		JLabel l3=new JLabel("输入新的专业:");
		JLabel l4=new JLabel("输入新的学号:");
		JLabel l5=new JLabel("输入新的语文成绩:");
		JLabel l6=new JLabel("输入新的英语成绩:");
		JLabel l7=new JLabel("输入新的数学成绩:");
		JLabel l8=new JLabel("输入要修改的小朋友的学号:");
		l1.setBounds(50, 60, 200, 30);
		l2.setBounds(50, 100, 200, 30);
		l3.setBounds(50, 140, 200, 30);
		l4.setBounds(50, 180, 200, 30);
		l5.setBounds(50, 220, 200, 30);
		l6.setBounds(50, 260, 200, 30);
		l7.setBounds(50, 300, 200, 30);
		l8.setBounds(50, 20, 200, 30);
		c1.setBounds(200, 400, 90, 30);
		txt1.setBounds(250,20,200,30);
		txt2.setBounds(250,60,200,30);
		txt3.setBounds(250,100,200,30);
		txt4.setBounds(250,140,200,30);
		txt5.setBounds(250,180,200,30);
		txt6.setBounds(250,220,200,30);
		txt7.setBounds(250,260,200,30);
		txt8.setBounds(250,300,200,30);
		c1.addActionListener(xl);
		add(c1);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(txt1);
		add(txt2);
		add(txt3);
		add(txt4);
		add(txt5);
		add(txt6);
		add(txt7);
		add(txt8);
	}
	private ActionListener xl=new ActionListener(){
		public void actionPerformed(ActionEvent e){
			java.sql.Connection con = null;
			 Statement stat = null;
            java.sql.PreparedStatement ps=null;
            String number=new String();
            number=txt8.getText();
            String sql = "DELETE FROM student WHERE number='"+number+"'";
            String sqll= "INSERT INTO student(name,number,sex,zhuanye,yuwen,yingyu,shuxue) "
                    + "values(?,?,?,?,?,?,?)";
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
                ps=con.prepareStatement(sql);
                ps.setString(1,txt1.getText());
                ps.setString(2,txt4.getText());
                ps.setString(3,txt2.getText());
                ps.setString(4,txt3.getText());
                ps.setString(5,txt5.getText());
                ps.setString(6,txt6.getText());
                ps.setString(7,txt7.getText());
                ps.executeUpdate(); 
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
shanchu(final JFrame f,final int width,final int height,final String a){
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
