package bank.management.system;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.*;
import java.awt.Font;
import java.util.Random;

public class SingUp extends JFrame {

    //Random is a class in java.util package.
    //Random we used for to creating application form number
    Random ran = new Random();
    long fourDigits = (ran.nextLong() % 9000L)+1000L; //We generate four digits number
    String applicationFormNo = " "+Math.abs(fourDigits); //Math.abs() is used to convert negative value to positive value.


    //Global Variable
    JTextField userName,fathersName,email,address,city,state,pinCode,mobileNumber;
    JRadioButton male,female,married,unmarried;
    JComboBox religion,category,income;
    JButton submit,cancel;

    //This is for set Frame Size and Position and Other Option
    //setTitle("APPLICATION FORM");
    //setSize(850,800);
    //setLocation(360,40);
    //setLayout(null);
    //getContentPane().setBackground(new Color(222,255,228));
    //setVisible(true);



    //This is for set Frame Size and Position and Other Option
    //setTitle("APPLICATION FORM");
    //setSize(850,800);
    //setLocation(360,40);
    //setLayout(null);
    //getContentPane().setBackground(new Color(222,255,228));
    //setVisible(true);


    SingUp(){

        ImageIcon bankImg = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image bankImg2 = bankImg.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon bankImg3 = new ImageIcon(bankImg2);
        JLabel bankImgLabel = new JLabel(bankImg3);
        bankImgLabel.setBounds(50,10,100,100);
        add(bankImgLabel);

        //Application Form Number
        JLabel applicationFormNumber = new JLabel("APPLICATION FORM NO." + applicationFormNo);
        applicationFormNumber.setFont(new Font("Osward",Font.BOLD,38));
        applicationFormNumber.setBounds(200,50,600,40);
        add(applicationFormNumber);

        //Page Number
        JLabel pageNumber = new JLabel("Page 1/2");
        pageNumber.setFont(new Font("Osward",Font.BOLD,20));
        pageNumber.setBounds(420,10,600,30);
        add(pageNumber);

        //Personal Details
        JLabel personalDetails = new JLabel("Personal Details");
        personalDetails.setFont(new Font("Osward",Font.BOLD,38));
        personalDetails.setBounds(320,100,600,40);
        personalDetails.setForeground(new Color(100, 149, 237)); //set color of text
        add(personalDetails);

        //User Name
        JLabel userNameLabel = new JLabel("Name");
        userNameLabel.setFont(new Font("Osward",Font.BOLD,18));
        userNameLabel.setBounds(100,190,100,30);
        add(userNameLabel);

        //User Text Field
        userName = new JTextField(15);
        userName.setFont(new Font("Osward",Font.BOLD,28));
        userName.setBounds(220,190,200,30);
        add(userName);

        //this for set Frame Size and Position and Other Option
        setTitle("APPLICATION FORM");
       setSize(850,800);
       setLocation(360,40);
       setLayout(null);
       getContentPane().setBackground(new Color(222,255,228));
       setVisible(true);
    }


    public static void main(String[] args) {
        new SingUp();
    }
}
