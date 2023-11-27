package classProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

;public class Admin_Interface {

		
		
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/javaproject";
		String username = "root";
		String password = "Bn110501";
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement st = connection.createStatement();
			
			{ String sql = "CREATE TABLE leaves" +
					"(name Text, " +
					"reason Text, " +
					"dates Text, " +
					"dateamount Text)";
			
			st.executeUpdate(sql);
			System.out.println("Created table in javaproject");
			}
			
		} catch (SQLException e) {
			System.out.println("Unable to Connect");
			
			e.printStackTrace();
		}
		
		Admin_Interface obj = new Admin_Interface();
		
	}

	
	public Admin_Interface() {
		JFrame j = new JFrame();
		j.setSize(500,500);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Buttons
		JButton a = new JButton("View Leaves");
		JButton b = new JButton("Review Leaves");
		//Button Sizes
		a.setBounds(350, 100, 140, 30);
		a.setVisible(true);
		b.setBounds(500, 100, 140, 30);
		b.setVisible(true);
		
		JPanel panel = new JPanel();
		j.add(panel); 
		panel.add(a);
		panel.add(b);
		
		
		
		
		
		
		j.setVisible(true);
		
	}
	
	
	
	
	
	}
	
	

