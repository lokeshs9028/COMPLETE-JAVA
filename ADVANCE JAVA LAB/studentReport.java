import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
public class studentReport extends Frame implements ActionListener{
    String studentName,emailId;
    int studentAge,collegeId;
    JFrame frame;
    JLabel details,name,email,age,collgeid;
    JTextField nameField,emailField,ageField,CidField;
    JButton Submit;
    public studentReport(){
        frame=new JFrame();
        frame.setTitle("Student Details");
        frame.setSize(700,800);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        details=new JLabel("Student Details");
        details.setBounds(350,20,200,40);
        frame.add(details);

        name=new JLabel("Enter Name: ");
        name.setBounds(100,80,100,40);
        frame.add(name);

        email=new JLabel("Enter emailId: ");
        email.setBounds(100,120,100,40);
        frame.add(email);

        age=new JLabel("Enter Age: ");
        age.setBounds(100,160,100,40);
        frame.add(age);

        collgeid=new JLabel("Enter Coll. Id: ");
        collgeid.setBounds(100,200,100,40);
        frame.add(collgeid);

        nameField=new JTextField();
        nameField.setBounds(180,90,200,30);
        frame.add(nameField);

        emailField=new JTextField();
        emailField.setBounds(180,130,200,30);
        frame.add(emailField);

        ageField=new JTextField();
        ageField.setBounds(180,170,200,30);
        frame.add(ageField);

        CidField=new JTextField();
        CidField.setBounds(180,210,200,30);
        frame.add(CidField);

        Submit=new JButton("Submit");
        Submit.setBounds(350,250,100,40);
        frame.add(Submit);
        Submit.addActionListener(this);
    }
    public static void main(String args[]){
        studentReport obj=new studentReport();
        System.out.println("Details obtained from the form are: ");
        
        
        
    }
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==Submit){
            studentName=nameField.getText();
            System.out.println(studentName);
            studentAge=Integer.parseInt(ageField.getText());
            System.out.println(studentAge);
            emailId=emailField.getText();
            
            System.out.println(emailId);
            collegeId=Integer.parseInt(CidField.getText());
            System.out.println(collegeId);
        }

    }

}