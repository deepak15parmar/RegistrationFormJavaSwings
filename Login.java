/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
/**
 *
 * @author KIRAN PARMAR
 */
public class Login implements ActionListener {
    JFrame frame;
    
    JLabel nameLabel=new JLabel("NAME");
    
   
    JLabel passwordLabel=new JLabel("PASSWORD");
    
   
    JTextField nameTextField=new JTextField();
    
    
    JPasswordField passwordField=new JPasswordField();
    
    
    JButton registerButton=new JButton("Login");
    


    Login()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("USER LOGIN");
        frame.setBounds(40,40,380,600);
        frame.getContentPane().setBackground(Color.orange);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    public void setLocationAndSize()
    {
        nameLabel.setBounds(20,20,40,70);
        passwordLabel.setBounds(20,170,100,70);
        nameTextField.setBounds(180,43,165,23);
        passwordField.setBounds(180,193,165,23);
        registerButton.setBounds(70,400,100,35);
        
    }
    public void addComponentsToFrame()
    {
        frame.add(nameLabel);
        frame.add(passwordLabel);
        
        frame.add(nameTextField);
        
        frame.add(passwordField);
       
        frame.add(registerButton);
        
    }
    public void actionEvent()
    {
        registerButton.addActionListener(this);
        
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==registerButton)
        {
            try {
                //Creating Connection Object
                Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myDatabase","root","YES");
                //Preapared Statement
                PreparedStatement Pstatement=connection.prepareStatement("select username from student where username = ? and passwrd = ?;");
                //Specifying the values of it's parameter
                Pstatement.setString(1,nameTextField.getText());
                
                Pstatement.setString(2,passwordField.getText());
                
                ResultSet rs = Pstatement.executeQuery();
                //Checking for the Password match
                if(rs.next()) {
                if(nameTextField.getText().equals(rs.getString(1)) )
                {
                    //Executing query
                    
                    JOptionPane.showMessageDialog(null,"Welcome "+rs.getString(1));
                   
                    
                    
                }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"invalid user/password!");
                }

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        

    }
}

