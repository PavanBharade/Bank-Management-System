
package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener {
     
    JTextField amount;
    JButton back,deposit;
    String pinnumber;
    Deposit(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 870, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,870);
        add(image);
        
        JLabel text= new JLabel("Enter the amount you want to deposit");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(170,300,400,20);
        image.add(text);
        
         amount = new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(170,350,320,25);
        image.add(amount);
        
         deposit = new JButton("Deposit");
        deposit.setBounds(375,467,130,28);
        deposit.addActionListener(this);
        image.add(deposit);
        
         back = new JButton("Back");
        back.setBounds(375,502,130,28);
       back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
        public void actionPerformed(ActionEvent a)
        {
          if(a.getSource()== deposit)
          {
             String number = amount.getText();
             Date date =new Date();
             if(number.equals(""))
             {
                 JOptionPane.showMessageDialog(null,"please enter a amount.");
             }else {
                 try{
                 Conn conn = new Conn();
                 String query = "insert into bank values ('"+pinnumber+"','"+date+"','Deposit','"+number+"')";       
                 conn.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Rs."+number+"  Deposited Successfully.");
             
                 setVisible(false);
                  new Transactions(pinnumber).setVisible(true);
                 }catch(Exception e){
               System.out.println(e);
             }
             }
          }
          else if(a.getSource()== back)
          {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
          }
        }
   
    public static void main (String args[])
    {
        new Deposit(" ");
    } 
}
