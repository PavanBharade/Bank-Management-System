package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
    long random;
            JTextField text,Ftext,Etext,Atext,Ctext,Stext,Ptext;
            JButton next;
            JRadioButton male,fem,marid,unmarid,other;
            JDateChooser date;
    SignupOne()
    {
        setLayout(null);
        Random ran = new Random();
       random=Math.abs((ran.nextLong() % 9000L)+1000L);
        
        JLabel formno= new JLabel("APPLICATION FORM NUMBER : "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,30));
        formno.setBounds(200,10,600,30);
        add(formno);
        
        JLabel personal= new JLabel("Page 1: personal Detail ");
        personal.setFont(new Font("Raleway",Font.BOLD,22));
        personal.setBounds(300,60,400,30);
        add(personal);
        
        JLabel name= new JLabel("Name : ");
        name.setFont(new Font("Raleway",Font.BOLD,15));
        name.setBounds(100,110,100,30);
        add(name);
        
         text=new JTextField();
        text.setFont(new Font("Raleway",Font.BOLD,13));
        text.setBounds(250,110,300,30);
        add(text);
        
        JLabel father= new JLabel("Father Name :");
        father.setFont(new Font("Raleway",Font.BOLD,15));
        father.setBounds(100,160,190,30);
        add(father);
        
         Ftext=new JTextField();
        Ftext.setFont(new Font("Raleway",Font.BOLD,13));
        Ftext.setBounds(250,160,300,30);
        add(Ftext);
        
        JLabel dob= new JLabel("Date of birth :");
        dob.setFont(new Font("Raleway",Font.BOLD,15));
        dob.setBounds(100,210,190,30);
        add(dob);
        
         date= new JDateChooser();
        date.setBounds(250,210,300,30);
        date.setForeground(new Color(150,150,150));
        add(date);
      
        JLabel gender= new JLabel("Gender :");
        gender.setFont(new Font("Raleway",Font.BOLD,15));
        gender.setBounds(100,260,190,30);
        add(gender);
        
         male=new JRadioButton("Male");
        male.setBounds(250,260,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
         fem=new JRadioButton("Female");
        fem.setBounds(330,260,100,30);
        fem.setBackground(Color.WHITE);
        add(fem);
        
        ButtonGroup gengroup=new ButtonGroup();
        gengroup.add(male);
        gengroup.add(fem);
        
        JLabel email= new JLabel("Email id :");
        email.setFont(new Font("Raleway",Font.BOLD,15));
        email.setBounds(100,310,190,30);
        add(email);
        
         Etext=new JTextField();
        Etext.setFont(new Font("Raleway",Font.BOLD,13));
        Etext.setBounds(250,310,300,30);
        add(Etext);
        
        JLabel marital= new JLabel("Marital status :");
        marital.setFont(new Font("Raleway",Font.BOLD,15));
        marital.setBounds(100,360,190,30);
        add(marital);
        
         marid=new JRadioButton("Marid");
        marid.setBounds(250,360,60,30);
        marid.setBackground(Color.WHITE);
        add(marid);
        
         unmarid=new JRadioButton("UnMarid");
        unmarid.setBounds(330,360,100,30);
        unmarid.setBackground(Color.WHITE);
        add(unmarid);
        
         other=new JRadioButton("Other");
        other.setBounds(450,360,100,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup maridgroup=new ButtonGroup();
        maridgroup.add(marid);
        maridgroup.add(unmarid);
        maridgroup.add(other);
        
        JLabel address= new JLabel("Address :");
        address.setFont(new Font("Raleway",Font.BOLD,15));
        address.setBounds(100,410,190,30);
        add(address);
        
         Atext=new JTextField();
        Atext.setFont(new Font("Raleway",Font.BOLD,13));
        Atext.setBounds(250,410,300,30);
        add(Atext);
        
        
        JLabel city= new JLabel("City :");
        city.setFont(new Font("Raleway",Font.BOLD,15));
        city.setBounds(100,460,190,30);
        add(city);
        
         Ctext=new JTextField();
        Ctext.setFont(new Font("Raleway",Font.BOLD,13));
        Ctext.setBounds(250,460,300,30);
        add(Ctext);
        
        
        JLabel state= new JLabel("State :");
        state.setFont(new Font("Raleway",Font.BOLD,15));
        state.setBounds(100,510,190,30);
        add(state);
        
         Stext= new JTextField();
        Stext.setFont(new Font("Raleway",Font.BOLD,13));
        Stext.setBounds(250,510,300,30);
        add(Stext);
        
        JLabel pin= new JLabel("Pin code :");
        pin.setFont(new Font("Raleway",Font.BOLD,15));
        pin.setBounds(100,560,190,30);
        add(pin);
        
         Ptext=new JTextField();
        Ptext.setFont(new Font("Raleway",Font.BOLD,13));
        Ptext.setBounds(250,560,300,30);
        add(Ptext);
        
         next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(490,600,60,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setTitle("");
        setSize(850,800);
         setLocation(350,10); 
         setVisible(true);
    }
    String textN,textf,Email_text,Addtext,Citytext,Statetext,Pintext;
    public boolean validation()
    {
        textN=text.getText();
        textf=Ftext.getText();
        Email_text=Etext.getText();
         Addtext=Atext.getText();
         Citytext=Ctext.getText();
         Statetext=Stext.getText();
         Pintext=Ptext.getText();
         
         
        return true;
    }  

    
    public void actionPerformed(ActionEvent e)
    {
       String formno = ""+ random;
       String name = text.getText();
       String fname = Ftext.getText();
       String dob = ((JTextField) date.getDateEditor().getUiComponent()).getText();
       String gender=null;
       if(male.isSelected())
        {
            gender = "Male";
        }else if (fem.isSelected())
        {
            gender = "Female";
        }
       
        String email = Etext.getText();
        String marital =null;
        if(marid.isSelected())
        {
            marital = "Married";
        }else if(unmarid.isSelected())
        {
            marital = "Unmarried";
        }else if(other.isSelected())
        {
            marital = "Other";
        }
        String address = Atext.getText();
        String city = Ctext.getText();
        String state = Stext.getText();
        String pin = Ptext.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the name.");
            } else if(fname.equals(""))
            {
               JOptionPane.showMessageDialog(null,"father name is requited.");
            }else if(dob.equals(""))
            {
               JOptionPane.showMessageDialog(null,"select the birth date."); 
            }
            else if(!male.isSelected() && !fem.isSelected())
            {
                JOptionPane.showMessageDialog(null," select the gender."); 
            }else if(email.equals(""))
            {
               JOptionPane.showMessageDialog(null,"Email is requited."); 
            }//else if(email.equals("@.com"))
           // {
           //     JOptionPane.showMessageDialog(null,"Email should be: Ex. abcd@gmail.com"); 
           // }
            
            else if(address.equals(""))
            {
               JOptionPane.showMessageDialog(null,"Enter the address."); 
            }else if(city.equals(""))
            {
               JOptionPane.showMessageDialog(null,"Enter the city name."); 
            }else if(state.equals(""))
            {
               JOptionPane.showMessageDialog(null,"Enter the state."); 
            }else if(pin.equals(""))
            {
               JOptionPane.showMessageDialog(null,"pin is requited."); 
            }      
            else 
            {
             Conn c = new Conn();
             String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"
                     +gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
             c.s.executeUpdate(query);
             
             
             setVisible(false);
             new SignupTwo(formno).setVisible(true);
            
            }
        } catch (Exception E)
        {
           System.out.println(E);
        }      
    }
    public static void main(String args[])
    {
        new SignupOne();
    } 
}