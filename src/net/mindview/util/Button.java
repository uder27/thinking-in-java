package net.mindview.util;
import static net.mindview.util.SwingConsole.*;
import static net.mindview.util.Chaxun.*;
import static net.mindview.util.Xinjian.*;
import static net.mindview.util.Shanchu.*;
import static net.mindview.util.Xiugai.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import javax.swing.*;

import com.mysql.jdbc.Connection;

public class Button extends JFrame{
private JButton
b1=new JButton("��ѯС���"),
b2=new JButton("����С���"),
b3=new JButton("ɾ��С���"),
b4=new JButton("�޸�С���");
private JTextField txt=new JTextField(10);
private ActionListener bl=new ActionListener(){
	public void actionPerformed(ActionEvent e){
		chaxun(new Chaxun(),500,500,"��ѯС���");
	}
};
private ActionListener bp=new ActionListener(){
	public void actionPerformed(ActionEvent e){
		xinjian(new Xinjian(),400,600,"����С���");
	}
};
private ActionListener bq=new ActionListener(){
	public void actionPerformed(ActionEvent e){
		xiugai(new Shanchu(),400,300,"ɾ��С���");
	}
};
private ActionListener bw=new ActionListener(){
	public void actionPerformed(ActionEvent e){
		shanchu(new Xiugai(),500,500,"�޸�С���");
	}
};
public Button(){
	b1.addActionListener(bl);
	b2.addActionListener(bp);
	b3.addActionListener(bq);
	b4.addActionListener(bw);
	setLayout(new FlowLayout());
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	}
public static void main(String[] args){
	run(new Button(),500,300,"һ����ª��ѧ������ϵͳ= =");
}
}
