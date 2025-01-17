package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JTextField textname,textFname,textEmail,textMs,textAdd,textCity,textState,textPin;

    JRadioButton r1,r2,r3,r4;
    JButton next;
    JDateChooser dateChooser;

    Random ran=new Random();
    long first4=(ran.nextLong()%9000L) +1000L;

    String  first= " "+ Math.abs(first4);
    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/logoturfit-removebg-preview.png"));
        Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Ralway",Font.BOLD,38));
        add(label1);

        JLabel label2= new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3= new JLabel("Personal Details");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Ralway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textname=new JTextField();
        textname.setFont(new Font("Ralway",Font.BOLD,14));
        textname.setBounds(300,190,400,30);
        add(textname);

        JLabel labelfName = new JLabel("Father's Name : ");
        labelfName.setFont(new Font("Ralway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textFname=new JTextField();
        textFname.setFont(new Font("Ralway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth : ");
        DOB.setFont(new Font("Ralway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG=new JLabel("Gender :");
        labelG.setFont(new Font("Ralway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,90,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail= new JLabel("Email Address :");
        labelEmail.setFont(new Font("Ralway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail=new JTextField();
        textEmail.setFont(new Font("Ralway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMs= new JLabel("Marital Status :");
        labelMs.setFont(new Font("Ralway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        r3=new JRadioButton("Married");
        r3.setFont(new Font("Ralway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(300,440,90,30);
        add(r3);

        r4=new JRadioButton("Unmarried");
        r4.setFont(new Font("Ralway",Font.BOLD,14));
        r4.setBackground(new Color(222,255,228));
        r4.setBounds(450,440,110,30);
        add(r4);

        ButtonGroup bbuttonGroup=new ButtonGroup();
        bbuttonGroup.add(r3);
        bbuttonGroup.add(r4);

        //textMs=new JTextField();
        //  textMs.setFont(new Font("Ralway",Font.BOLD,14));
        //textMs.setBounds(300,440,400,30);
        // add(textMs);

        JLabel labelAdd= new JLabel("Address :");
        labelAdd.setFont(new Font("Ralway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd=new JTextField();
        textAdd.setFont(new Font("Ralway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelCity= new JLabel("City :");
        labelCity.setFont(new Font("Ralway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity=new JTextField();
        textCity.setFont(new Font("Ralway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel labelPin= new JLabel("Pin Code :");
        labelPin.setFont(new Font("Ralway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin=new JTextField();
        textPin.setFont(new Font("Ralway",Font.BOLD,14));
        textPin.setBounds(300,590,400,30);
        add(textPin);

        JLabel labelState= new JLabel("State :");
        labelState.setFont(new Font("Ralway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState=new JTextField();
        textState.setFont(new Font("Ralway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);

        next=new JButton("Next");
        next.setFont(new Font("Ralway",Font.BOLD,14));
        next.setOpaque(true);
        next.setContentAreaFilled(true);
        next.setFocusPainted(false);
        next.setBorderPainted(false);
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);
        next.setBounds(620,710,80,30);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=first;
        String name=textname.getText();
        String fname=textFname.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if (r1.isSelected()) {
            gender = "Male";
        }else if(r2.isSelected()){
            gender="Female";
        }
        String email=textEmail.getText();
        String marital=null;
        if(r3.isSelected()){
            marital="Married";
        }else if(r4.isSelected()){
            marital="Unmarried";
        }
        String address=textAdd.getText();
        String city=textCity.getText();
        String pincode= textPin.getText();
        String state=textState.getText();

        try{
            if(textname.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con con1 = new Con();
                String q ="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"' )";
                con1.statement.executeUpdate(q);
                new Signup2();
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args){
        new Signup();

    }
}
