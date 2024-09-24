
package bank.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
public class FastCash extends JFrame implements ActionListener{
    String pinnumber;
    JButton deposit,withdrawl,pinchange,balanceenquiry,ministatement,fastcash,exit;
    FastCash(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 890, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,890);
        add(image);
        
        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(205, 300, 700, 35);text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
         deposit=new JButton("Rs 100");
        deposit.setBounds(165,410,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
         withdrawl=new JButton("Rs 500");
        withdrawl.setBounds(355,410,150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
         fastcash=new JButton("Rs 1000");
        fastcash.setBounds(165,446,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
         ministatement=new JButton("Rs 2000");
        ministatement.setBounds(355,446,150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
         pinchange=new JButton("Rs 5000");
        pinchange.setBounds(165,480,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
         balanceenquiry=new JButton("Rs 10000");
        balanceenquiry.setBounds(355,480,150,30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
         exit=new JButton("Back");
        exit.setBounds(355,514,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900,890);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
       try{
      if(e.getSource()== exit)
      {
          setVisible(false);
          new Transactions(pinnumber).setVisible(true);
      }
       else 
      {
          String amount = ((JButton)e.getSource()).getText().substring(3);
          Conn c = new Conn();
          //try{
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            int balance = 0;
            while(rs.next()){
              if(rs.getString("type").equals("Deposit"));
               {
                 balance +=Integer.parseInt(rs.getString("amount"));   
               }
                 balance -= Integer.parseInt(rs.getString("amount"));      
            }
            
             if(e.getSource() != exit && balance < Integer.parseInt(amount)){
                 JOptionPane.showMessageDialog(null,"Insufficient Balance");
                 return;
             }
            
              Date date = new Date();
              String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')"; 
              c.s.executeUpdate(query);
              JOptionPane.showMessageDialog(null,"Rs"+amount +"Debited Successfully");
              setVisible(false);
              new Transactions(pinnumber).setVisible(true);
          }
          
          /*catch(Exception ae)
          {
             System.out.println(ae);
          }*/
      }
      catch(Exception ae)
          {
             System.out.println(ae);
          }
    }

public static void main(String args[])
{
   new FastCash("");
}
}