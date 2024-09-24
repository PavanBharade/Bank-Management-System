package bank.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class log extends JFrame implements ActionListener{
    JButton login,clear,Signup;
    JTextField card;
    JPasswordField pinno;
    log(){
        
          ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
          Image i22 = i11.getImage().getScaledInstance(1540,830, Image.SCALE_DEFAULT);
          ImageIcon i33 = new ImageIcon(i22);
          JLabel l22 = new JLabel(i33);
          l22.setBounds(0, 0, 1540, 830);
          add(l22); 
         
        
           
          setTitle("AUTOMATED TELLER MACHINE");
          setLayout(null);
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
          Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel label = new JLabel(i3);
          label.setBounds(70,10,100,100);
          add(label);
          
          JLabel text = new JLabel("WELCOME TO ATM");
          l22.add(text);
          text.setBounds(120,140,500,50);
          text.setFont(new Font("Palatino",Font.BOLD,40));
          text.setForeground(Color.white);
          
          JLabel cardno = new JLabel("Card No :");
          l22.add(cardno);
          cardno.setBounds(120,245,200,40);
          cardno.setFont(new Font("Raleway",Font.BOLD,35));
           cardno.setForeground(Color.WHITE);
          
          card = new JTextField();
          card.setBounds(300,250,200,30);
          card.setFont(new Font("Arial",Font.BOLD,14));
          l22.add(card);
          
           JLabel pin = new JLabel(" Set Pin :");
          l22.add(pin);
          pin.setBounds(120,310,500,40);
          pin.setFont(new Font("Raleway",Font.BOLD,35));
          pin.setForeground(Color.WHITE);
          
          login = new JButton("SIGN IN");
          login.setBounds(300,380,90,30);
          login.addActionListener(this);
          l22.add(login);
          login.setBackground(Color.green);
          login.setForeground(Color.black);
          
          clear = new JButton("CLEAR");
          clear.setBounds(410,380,90,30);
          l22.add(clear);
          clear.addActionListener(this);
          clear.setBackground(Color.red);
          clear.setForeground(Color.black);
          
          Signup = new JButton("SIGN UP");
          Signup.setBounds(300,460,200,30);
          l22.add(Signup);
          Signup.addActionListener(this);
          Signup.setBackground(Color.orange);
          Signup.setForeground(Color.black);
          
           pinno = new JPasswordField();
          pinno.setBounds(300,320,200,30);
          pinno.setFont(new Font("Arial",Font.BOLD,14));
          l22.add(pinno);
          
          
          getContentPane().setBackground(Color.WHITE);
         // setLocation(0,0);
          setSize(1540,830);
          setUndecorated(true);
          setVisible(true);
    }
     
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==clear)
       {
         card.setText("");
         pinno.setText("");
       }
       else if(e.getSource()==login)
       {
          Conn conn = new Conn();
          String cardnumber = card.getText();
          String pinnumber = pinno.getText();
          String query="select * from login where cardnumber = '"+cardnumber+"' and pin ='" +pinnumber+"'";
          
          try{
              ResultSet rs = conn.s.executeQuery(query);
              if(rs.next())
              {
                  setVisible(false);
                  new Transactions(" ").setVisible(true);
              }else{
                  JOptionPane.showMessageDialog(null,"Incorrect card number or pin");
              }
          }catch(Exception ae){
              
          }
       }
       else if(e.getSource()==Signup)
       {
         setVisible(false);
         new SignupOne().setVisible(true);
       }
    }
    public static void main(String args[])
    {
        new Login();     
    }   
}
