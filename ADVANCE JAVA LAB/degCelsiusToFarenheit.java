import javax.swing.*;

import org.w3c.dom.events.Event;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
public class degCelsiusToFarenheit extends Frame implements ActionListener{
    double degCel,degFahrenheit;
    JTextField degCelField,degFahrenField;
    JLabel cel,fahrenheit;
    JButton Convert;
    public degCelsiusToFarenheit(){
        JFrame frame=new JFrame("Celsius to Fahrenheit conversion");
        frame.setBounds(350,20,500,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cel=new JLabel("Enter temperature in degCelsius: ");
        cel.setBounds(100,80,300,40);
        frame.add(cel);

        fahrenheit=new JLabel("Fahrenheit temperature is");
        fahrenheit.setBounds(100,120,300,40);
        frame.add(fahrenheit);

        degCelField=new JTextField();
        degCelField.setBounds(300,80,100,30);
        frame.add(degCelField);

        degFahrenField=new JTextField();
        degFahrenField.setBounds(300,120,100,30);
        frame.add(degFahrenField);

        Convert=new JButton("Convert");
        Convert.setBounds(350,170,100,30);
        frame.add(Convert);
        Convert.addActionListener(this);

    }
    public static void main(String args[]){
        degCelsiusToFarenheit obj=new degCelsiusToFarenheit();

    }
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==Convert){
            degCel=Double.parseDouble(degCelField.getText());
            degFahrenheit=1.8*degCel+32;
            degFahrenField.setText(degFahrenheit+"Fahrenheit");
        }
    }
}
