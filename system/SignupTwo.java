
package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener {
         
            JTextField text,Ftext,Etext,Atext,Ctext,Stext,Ptext;
            JButton next;
            JRadioButton eno,eyes,Syes,Sno;
        JComboBox religion,category,incomecombo,
                   QualificationCombo,OccupationCombo;
        String formno;
    SignupTwo(String formno)
    {
        this.formno = formno;
        setLayout(null);
       
       setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetail= new JLabel("Page 2: Additional Detail ");
        additionalDetail.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetail.setBounds(300,60,400,30);
        add(additionalDetail);
        
        JLabel name= new JLabel("Religion : ");
        name.setFont(new Font("Raleway",Font.BOLD,15));
        name.setBounds(100,110,100,30);
        add(name);
        
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
         religion = new JComboBox(valReligion);
        religion.setBounds(250,110,300,30);
        religion.setBackground(Color.WHITE);
        add(religion);
       
        
        JLabel Category= new JLabel("Category :");
        Category.setFont(new Font("Raleway",Font.BOLD,15));
        Category.setBounds(100,160,190,30);
        add(Category);
        
        String valCategory[]={"General","OBC","SC","ST","Other"};
         category = new JComboBox(valCategory);
        category.setBackground(Color.WHITE);
        category.setBounds(250,160,300,30);
        add(category);
        
        JLabel income= new JLabel("Income :");
        income.setFont(new Font("Raleway",Font.BOLD,15));
        income.setBounds(100,210,190,30);
        add(income);
        
         String valIncome[]={"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
         incomecombo = new JComboBox(valIncome); 
        incomecombo.setBounds(250,210,300,30);
        incomecombo.setBackground(Color.WHITE);
        add(incomecombo);
      
        JLabel education= new JLabel("Educational");
        education.setFont(new Font("Raleway",Font.BOLD,15));
        education.setBounds(100,260,190,30);
        add(education);
       
        JLabel email= new JLabel("Qualification :");
        email.setFont(new Font("Raleway",Font.BOLD,15));
        email.setBounds(100,275,190,30);
        add(email);
        
         String valEdu[]={"Non Graduate","Gradute","Post Graduate","Doctrate","Other"};
         QualificationCombo = new JComboBox(valEdu); 
        QualificationCombo.setBounds(250,270,300,30);
        QualificationCombo.setBackground(Color.WHITE);
        add(QualificationCombo);
        
        JLabel marital= new JLabel("Occupation :");
        marital.setFont(new Font("Raleway",Font.BOLD,15));
        marital.setBounds(100,360,190,30);
        add(marital);
        
        String valOccu[]={"Salaried","Salf employed","Bussiness","Student","Retired","Other"};
         OccupationCombo = new JComboBox(valOccu); 
        OccupationCombo.setBounds(250,360,300,30);
        OccupationCombo.setBackground(Color.WHITE);
        add(OccupationCombo);
         
        
        
        
        JLabel address= new JLabel("Pan No :");
        address.setFont(new Font("Raleway",Font.BOLD,15));
        address.setBounds(100,410,190,30);
        add(address);
        
         Atext=new JTextField();
        Atext.setFont(new Font("Raleway",Font.BOLD,13));
        Atext.setBounds(250,410,300,30);
        add(Atext);
        
        
        JLabel city= new JLabel("Aadhar Number:");
        city.setFont(new Font("Raleway",Font.BOLD,15));
        city.setBounds(100,460,190,30);
        add(city);
        
         Ctext=new JTextField();
        Ctext.setFont(new Font("Raleway",Font.BOLD,13));
        Ctext.setBounds(250,460,300,30);
        add(Ctext);
        
        
        JLabel state= new JLabel("Senior citizan :");
        state.setFont(new Font("Raleway",Font.BOLD,15));
        state.setBounds(100,510,190,30);
        add(state);
        
        Syes=new JRadioButton("Yes");
        Syes.setBounds(250,510,60,30);
        Syes.setBackground(Color.WHITE);
        add(Syes);
        
         Sno=new JRadioButton("No");
        Sno.setBounds(330,510,100,30);
        Sno.setBackground(Color.WHITE);
        add(Sno);
        
        ButtonGroup maridgroup=new ButtonGroup();
        maridgroup.add(Syes);
        maridgroup.add(Sno);
        
        JLabel pin= new JLabel("Existing Account :");
        pin.setFont(new Font("Raleway",Font.BOLD,15));
        pin.setBounds(100,560,190,30);
        add(pin);
        
         eyes=new JRadioButton("Yes");
        eyes.setBounds(250,560,60,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
         eno=new JRadioButton("No");
        eno.setBounds(330,560,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup accountgroup=new ButtonGroup();
        accountgroup.add(Syes);
        accountgroup.add(Sno);
       
        
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
    
    public void actionPerformed(ActionEvent e)
    {
      
       String sreligion =(String) religion.getSelectedItem();
       String scategory =(String) category.getSelectedItem();
       String sincome = (String) incomecombo.getSelectedItem();
       String seducation = (String) QualificationCombo.getSelectedItem();
       String soccuption =(String) OccupationCombo.getSelectedItem();
       String seniorcitizon = null;
       if(Syes.isSelected())
        {
            seniorcitizon = "yes";
        }else if (Sno.isSelected())
        {
            seniorcitizon = "No";
        }
        String existingaccount =null;
        if(eyes.isSelected())
        {
            existingaccount = "Yes";
        }else if(eno.isSelected())
        {
            existingaccount = "No";
        }
        String span = Atext.getText();
        String sadhar = Ctext.getText();
               
        try {
             Conn c = new Conn();
             String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccuption+"','"+span+"','"+sadhar+"','"+seniorcitizon+"','"+existingaccount+"')";
             c.s.executeUpdate(query);
             setVisible(false);
             new SignupThree(formno).setVisible(true);
             
            }catch (Exception E)
        {
           System.out.println(E);
        }   
    }
    public static void main(String args[])
    {
        new SignupTwo("");
    }  
}