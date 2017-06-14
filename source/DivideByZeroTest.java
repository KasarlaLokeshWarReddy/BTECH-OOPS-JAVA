/*Write a program that creates a user interface to perform integer divisions. The user enters two numbers in the textfields, Num1 and Num2. The division of Num1 and Num2 is displayed in the Result field when the Divide button is clicked. If Num1 or Num2 were not an integer, the program would throw a NumberFormatException. If Num2 were Zero, the program would throw an ArithmeticException Display the  exception in a message dialog box.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class DivideByZeroTest  extends JFrame implements ActionListener{
private JTextField input1,input2,output;
private int number1,number2;
private double result;
 public DivideByZeroTest()
{
  	super("Demonstrating Exceptions"); 	  Container c=getContentPane();
c.setLayout(new GridLayout(3,2));
c.add(new JLabel("Enter Numerator",SwingConstants.RIGHT));
input1= new JTextField(10);  	c.add(input1);
c.add(new JLabel("Enter Denominator and  press Enter",SwingConstants.RIGHT));
input2= new JTextField(10);		c.add(input2);
input2.addActionListener(this);
c.add(new JLabel("RESULT",SwingConstants.RIGHT));
output=new JTextField();		c.add(output);
setSize(425,100);			show();
}
public void actionPerformed(ActionEvent ae)
{
DecimalFormat precision3=new DecimalFormat("0.000");
output.setText(" ");
try{	number1=Integer.parseInt(input1.getText());
number2=Integer.parseInt(input2.getText());
result=quotient(number1,number2);
output.setText(precision3.format(result));
      }
catch(NumberFormatException nfe)
{
JOptionPane.showMessageDialog(this,"you must enter two integers","Invalid number foprmat",JOptionPane.ERROR_MESSAGE);
}

catch(DivideByZeroException dbze)
{
JOptionPane.showMessageDialog(this,dbze.toString(),"Attempted to Divide By Zero",JOptionPane.ERROR_MESSAGE);
}
}
public double quotient(int numerator,int denominator)throws DivideByZeroException
{
if(denominator==0)
throw new DivideByZeroException();
return (double)numerator/denominator;
}

public class DivideByZeroException extends ArithmeticException
{
public DivideByZeroException()
{
super("attempted to dividebyzero");
}
public DivideByZeroException(String message)
{
super(message);
}
}
public static void main(String args[])
{
DivideByZeroTest app=new DivideByZeroTest();
app.addWindowListener(
new WindowAdapter(){
public void windowClosing(WindowEvent e)
{
e.getWindow().dispose();
System.exit(0);
}
}
);
}
}

