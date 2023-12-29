package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SingUp extends JFrame implements ActionListener {

    //We Add Jar File in Project Structure
    JDateChooser dateChooser;


    //Random is a class in java.util package.
    //Random we used for to creating application form number
    Random ran = new Random();
    long fourDigits = (ran.nextLong() % 9000L)+1000L; //We generate four digits number
    String applicationFormNo = " "+Math.abs(fourDigits); //Math.abs() is used to convert negative value to positive value.


    //Global Variable
    JTextField userName,fathersName,email,address,city,state,pinCode,mobileNumber;
    JRadioButton male,female,married,unmarried;
    JComboBox religion,category,income;
    JButton submit,cancel,next;

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
        userName.setBounds(240,190,450,30);
        add(userName);


        //Father's Name
        JLabel fathersNameLabel = new JLabel("Father's Name");
        fathersNameLabel.setFont(new Font("Osward",Font.BOLD,18));
        fathersNameLabel.setBounds(100,230,200,30);
        add(fathersNameLabel);


        //Father's Name Text Field
        fathersName = new JTextField(15);
        fathersName.setFont(new Font("Osward",Font.BOLD,28));
        fathersName.setBounds(240,230,450,30);
        add(fathersName);

        //DOB
        JLabel dobLabel = new JLabel("Date of Birth");
        dobLabel.setFont(new Font("Osward",Font.BOLD,18));
        dobLabel.setBounds(100,270,200,30);
        add(dobLabel);

        //DOB Text Field
        dateChooser = new JDateChooser();
        dateChooser.setBounds(240,270,450,30);
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setFont(new Font("Osward",Font.BOLD,20));
        add(dateChooser);


        //Email
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Osward",Font.BOLD,18));
        emailLabel.setBounds(100,310,200,30);
        add(emailLabel);


        //Email Text Field
        email = new JTextField(15);
        email.setFont(new Font("Osward",Font.BOLD,28));
        email.setBounds(240,310,450,30);
        add(email);


        //Address
        JLabel addressLabel = new JLabel("Address");
        addressLabel.setFont(new Font("Osward",Font.BOLD,18));
        addressLabel.setBounds(100,350,200,30);
        add(addressLabel);


        //Address Text Field
        address = new JTextField(15);
        address.setFont(new Font("Osward",Font.BOLD,28));
        address.setBounds(240,350,450,30);
        add(address);


        //City
        JLabel cityLabel = new JLabel("City");
        cityLabel.setFont(new Font("Osward",Font.BOLD,18));
        cityLabel.setBounds(100,390,200,30);
        add(cityLabel);


        //City Text Field
        city = new JTextField(15);
        city.setFont(new Font("Osward",Font.BOLD,28));
        city.setBounds(240,390,450,30);
        add(city);

        //State
        JLabel stateLabel = new JLabel("State");
        stateLabel.setFont(new Font("Osward",Font.BOLD,18));
        stateLabel.setBounds(100,430,200,30);
        add(stateLabel);


        //State Text Field
        state = new JTextField(15);
        state.setFont(new Font("Osward",Font.BOLD,28));
        state.setBounds(240,430,450,30);
        add(state);

        //Pin Code
        JLabel pinCodeLabel = new JLabel("Pin Code");
        pinCodeLabel.setFont(new Font("Osward",Font.BOLD,18));
        pinCodeLabel.setBounds(100,470,200,30);
        add(pinCodeLabel);


        //Pin Code Text Field
        pinCode = new JTextField(15);
        pinCode.setFont(new Font("Osward",Font.BOLD,28));
        pinCode.setBounds(240,470,450,30);
        add(pinCode);

        //Gender
        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("Osward",Font.BOLD,18));
        genderLabel.setBounds(100,510,200,30);
        add(genderLabel);

        //Radio Button for Gender
        male = new JRadioButton("Male");
        male.setBounds(240,510,100,30);
        male.setBackground(new Color(222,255,228));
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(360,510,100,30);
        female.setBackground(new Color(222,255,228));
        add(female);

        //Button Grouping for Choosing Male or Female
        ButtonGroup btnMaleFemale = new ButtonGroup();
        btnMaleFemale.add(male);
        btnMaleFemale.add(female);


        //Gender
        JLabel marriedStatusLabel = new JLabel("Married Status");
        marriedStatusLabel.setFont(new Font("Osward",Font.BOLD,18));
        marriedStatusLabel.setBounds(100,550,200,30);
        add(marriedStatusLabel);

        married = new JRadioButton("Married");
        married.setBounds(240,550,100,30);
        married.setBackground(new Color(222,255,228));
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(360,550,100,30);
        unmarried.setBackground(new Color(222,255,228));
        add(unmarried);

        //Button Grouping for Choosing Male or Female
        ButtonGroup btnMarriedStatus = new ButtonGroup();
        btnMarriedStatus.add(married);
        btnMarriedStatus.add(unmarried);

        //Religion
        JLabel religionLabel = new JLabel("Religion");
        religionLabel.setFont(new Font("Osward",Font.BOLD,18));
        religionLabel.setBounds(100,590,200,30);
        add(religionLabel);

        //Religion Combo Box
        String religionOption[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(religionOption);
        religion.setBackground(Color.WHITE);
        religion.setFont(new Font("Osward",Font.BOLD,18));
        religion.setBounds(240,590,450,30);
        add(religion);


        //Category
        JLabel categoryLabel = new JLabel("Category");
        categoryLabel.setFont(new Font("Osward",Font.BOLD,18));
        categoryLabel.setBounds(100,630,200,30);
        add(categoryLabel);

        //Category Combo Box
        String categoryOption[] = {"General","OBC","SC","ST"};
        category = new JComboBox(categoryOption);
        category.setBackground(Color.WHITE);
        category.setFont(new Font("Osward",Font.BOLD,18));
        category.setBounds(240,630,450,30);
        add(category);

        //JButton
        //Next Button
        next = new JButton("Next");
        next.setFont(new Font("Osward", Font.BOLD, 18));
        next.setBounds(340,690,100,30);
        next.addActionListener(this);
        add(next);

        //Clear Button

        cancel = new JButton("Clear");
        cancel.setFont(new Font("Osward", Font.BOLD,18));
        cancel.setBounds(500,690,100,30);
        cancel.addActionListener(this);
        add(cancel);


        //this for set Frame Size and Position and Other Option
        setTitle("APPLICATION FORM");
        setSize(850,800);
        setLocation(360,40);
        setLayout(null);
        getContentPane().setBackground(new Color(222,255,228));
        setVisible(true);
    }

    //Action Listener
    @Override
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource()==next){
                //from Number
                String formNumber = applicationFormNo;
                //from Name
                String name = userName.getText();
                //from Father's Name
                String fatherName = fathersName.getText();
                //from DOB
                String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
                //from Email
                String emailId = email.getText();
                //from Address
                String address1 = address.getText();
                //from City
                String city1 = city.getText();
                //from State
                String state1 = state.getText();
                //from Pin Code
                String pinCode1 = pinCode.getText();

                //for JRadioButton we have to use isSelected() method to check the button is selected or not.
                //if button is selected then we have to get the text of the button.
                //if button is not selected then we have to set the text of the button to null.
                //from Gender
                String gender = null;
                if(male.isSelected()){
                    gender = "Male";
                }
                else if(female.isSelected()){
                    gender = "Female";
                }


                //for JRadioButton we have to use isSelected() method to check the button is selected or not.
                //if button is selected then we have to get the text of the button.
                //if button is not selected then we have to set the text of the button to null.
                //from Married Status
                String marriedStatus = null;
                if(married.isSelected()){
                    marriedStatus = "Married";
                }
                else if(unmarried.isSelected()){
                    marriedStatus = "Unmarried";
                }


                //for JComboBox we have to use getSelectedItem() for Selected Item
                //from Religion
                String religion1 = (String) religion.getSelectedItem();
                //from Category
                String category1 = (String) category.getSelectedItem();


                //Now we Store our data to database
                try{
                    // Validation
                    if(name.equals("") || fatherName.equals("") || dob.equals("") || emailId.equals("") || address1.equals("") || city1.equals("") || state1.equals("") || pinCode1.equals("") || gender.equals("") && marriedStatus.equals("") || religion1.equals("") || category1.equals("")){
                        JOptionPane.showMessageDialog(null,"All Fields are Required");
                        return;
                    }else{
                        Conn con1 = new Conn();
                        String query = "insert into singup values('"+formNumber+"','"+name+"','"+fatherName+"','"+dob+"','"+emailId+"','"+address1+"','"+city1+"','"+state1+"','"+pinCode1+"','"+gender+"','"+marriedStatus+"','"+religion1+"','"+category1+"')";
                        con1.statement.executeUpdate(query); // executeUpdate() method is used for inserting data into database.
                        new SingUp2();
                        setVisible(false);
                    }



                }catch(Exception E){
                    E.printStackTrace();
                }



            }else{
                pinCode.setText("");
                state.setText("");
                city.setText("");
                address.setText("");
                email.setText("");
                fathersName.setText("");
                userName.setText("");
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }



    public static void main(String[] args) {
        new SingUp();
    }
}
