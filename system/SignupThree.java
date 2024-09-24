
package bank.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
     
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno,pinnumber;
    SignupThree(String formno)
    {
        this.formno = formno;
        setLayout(null);
        
        JLabel l1= new JLabel("Page 3 : ACCOUNT DETAILS");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(250, 50, 400, 50);
        add(l1);
        
        JLabel type= new JLabel(" Account Type : ");
        type.setFont(new Font("Raleway",Font.BOLD,20));
        type.setBounds(100, 140, 200, 30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180, 150, 20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(300, 180, 200, 20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 210, 150, 20);
        add(r3);
        
        r4 = new JRadioButton("Recurrign Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(Color.WHITE);
        r4.setBounds(300, 210, 230, 20);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card= new JLabel(" Card Number : ");
        card.setFont(new Font("Raleway",Font.BOLD,20));
        card.setBounds(100, 260, 200, 30);
        add(card);
        
         JLabel carddetail= new JLabel(" Your 16 Digit Card Number ");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(100, 280, 300, 30);
        add(carddetail);
        
        JLabel number= new JLabel(" xxxx-xxxx-xxxx-5643 ");
        number.setFont(new Font("Raleway",Font.BOLD,20));
        number.setBounds(310, 260, 300, 30);
        add(number);
        
        JLabel pin= new JLabel("Pin :");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(110, 340, 50, 30);
        add(pin);
        
        JLabel pindetail= new JLabel(" Your 4 Digit Pin ");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(100, 360, 300, 30);
        add(pindetail);
        
        
        JLabel pnumber= new JLabel(" xxxx ");
        pnumber.setFont(new Font("Raleway",Font.BOLD,20));
        pnumber.setBounds(310, 340, 300, 30);
        add(pnumber);
        
        JLabel services= new JLabel(" Service Required : ");
        services.setFont(new Font("Raleway",Font.BOLD,20));
        services.setBounds(100, 400, 300, 30);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,14));
        c1.setBounds(100,440,200,20);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,14));
        c2.setBounds(320,440,200,20);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,14));
        c3.setBounds(100,470,200,20);
        add(c3);
        c4 = new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,14));
        c4.setBounds(320,470,200,20);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,14));
        c5.setBounds(100,500,200,20);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,14));
        c6.setBounds(320,500,200,20);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that above entered detais are"
                             +" correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,14));
        c7.setBounds(100,540,650,20);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(280,620 ,90 ,30 );
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(440,620 ,90 ,30 );
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.white);
        setSize(850,820);
        setTitle("Banking");
        setLocation(450,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
      //try{ 
      if(ae.getSource()==submit)
      {
          String accountType = null;
          if(r1.isSelected())
          {
              accountType ="Saving Account";
          }else if(r2.isSelected())
          {
              accountType ="Fixed Deposit Account";
          }else if(r3.isSelected())
          {
              accountType ="Current Account";
          }else if(r4.isSelected())
          {
              accountType ="Reccuring Deposit Account";
          }
          
          Random random = new Random();
          String cardnumber ="" +Math.abs ((random.nextLong() % 90000000L )+ 5040936000000000L);
     
            pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
     
           String facility = "";
           if(c1.isSelected())
           {
               facility = facility + "ATM Card";
           }else if(c2.isSelected())
           {
               facility = facility + "Internet Bnaking";
           }else if(c3.isSelected())
           {
               facility = facility + "Mobile Banking";
           }else if(c4.isSelected())
           {
               facility = facility + "EMAIL & SMS Alert";
           }else if(c5.isSelected())
           {
               facility = facility + "Check Book";
           }else if(c6.isSelected())
           {
               facility = facility + "E-Statement";
           }
     // }catch(Exception ae)
              {
              
              }
           
           try{
               if(accountType.equals(""))
               {
                   JOptionPane.showMessageDialog(null,"Account Type is Required");
               }//else if(facility.equals(""))
               //{
                 //JOptionPane.showMessageDialog(null,"Service Type is Required");   
              // }
               
               else{
                   Conn conn = new Conn();
                   String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                   String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";

                   conn.s.executeUpdate(query1);
                   conn.s.executeUpdate(query2);
                   JOptionPane.showMessageDialog(null,"Card Number :" +cardnumber +"\n Pin : " + pinnumber);
               
                   setVisible(false);
                   new Deposit(pinnumber).setVisible(false);
               }
           }catch(Exception e) {
               System.out.println(e);
           }
           
      }else if(ae.getSource()== cancel)
       {
          setVisible(false);
          new Login().setVisible(true);
       }
    }
    
    public static void main(String args[])
    {
       new SignupThree(" ");
    }    
}