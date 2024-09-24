
package bank.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener{
    String pinnumber;
    JButton deposit,withdrawl,pinchange,balanceenquiry,ministatement,fastcash,exit;
    Transactions(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 890, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,890);
        add(image);
        
        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(205, 300, 700, 35);text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
         deposit=new JButton("Deposit");
        deposit.setBounds(165,410,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
         withdrawl=new JButton("Cash Withdrawl");
        withdrawl.setBounds(355,410,150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
         fastcash=new JButton("Fast Cash");
        fastcash.setBounds(165,446,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
         ministatement=new JButton("Mini Statement");
        ministatement.setBounds(355,446,150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
         pinchange=new JButton("Pin Change");
        pinchange.setBounds(165,480,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
         balanceenquiry=new JButton("Balance Enquiry");
        balanceenquiry.setBounds(355,480,150,30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
         exit=new JButton("Exit");
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
      if(e.getSource()== exit)
      {
          System.exit(0);
      }else if(e.getSource()== deposit)
      {
          setVisible(false);
          new Deposit("").setVisible(true);
      }else if(e.getSource()== withdrawl)
      {
          setVisible(false);
          new Withdrawl("").setVisible(true);
      }else if(e.getSource()== fastcash)
      {
          setVisible(false);
          new FastCash("").setVisible(true);
      }else if(e.getSource()== ministatement)
      {
          setVisible(false);
          new MiniStatement("").setVisible(true);
      }else if(e.getSource()== pinchange)
      {
          setVisible(false);
          new Pin("").setVisible(true);
      }else if(e.getSource()== balanceenquiry)
      {
          setVisible(false);
          new BalanceInquiry("").setVisible(true);
      }
    }

public static void main(String args[])
{
   new Transactions(" ");
}
}