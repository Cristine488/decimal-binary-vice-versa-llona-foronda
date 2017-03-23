import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DecimalBinary 
{
    DecimalBinary() 
    {
    	JLabel lblconvert = new JLabel("Convert: ");
    	JButton btndecimal = new JButton("Decimal");
    	JButton btnbinary = new JButton("Binary");
    	JButton btnexit = new JButton("Exit");
    	JPanel panel = new JPanel();
    	JFrame frame = new JFrame("Converter Decimal to Binary App");
    	
    	frame.add(panel);
    	frame.setSize(350, 150);
    	frame.setLayout(null);
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	panel.setBounds(10,10,340,340);
        panel.setLayout(null);
        panel.validate();
    	panel.repaint();
    	panel.add(lblconvert);
    	panel.add(btndecimal);
    	panel.add(btnbinary);
    	
    	lblconvert.setBounds(5,5,50,20);
    	
    	btndecimal.setBounds(5,30,100,50);
    	btnbinary.setBounds(200,30,100,50);
    	btndecimal.addActionListener(new Action());
    	btnbinary.addActionListener(new ActionListen());
    }
    public static void main(String[] args)
    {
    	new DecimalBinary();
    }
    static class Action implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		int dec;
    		String decimalInput;
    		String binary;
    		decimalInput = JOptionPane.showInputDialog(null, "Enter a Decimal Number:");
			dec = Integer.parseInt(decimalInput);
			
			binary = Integer.toBinaryString(dec);
			JOptionPane.showMessageDialog(null, "The Binary equivalent is: " + binary);
    	}
    }
    static class ActionListen implements ActionListener
    {
    	public void actionPerformed(ActionEvent actevent)
    	{
    		int bin;
    		String binaryInput;
    		String decimal;
    		binaryInput = JOptionPane.showInputDialog(null, "Enter a Binary Number:");
			JOptionPane.showMessageDialog(null, "The Decimal equivalent is: " + Integer.parseInt(binaryInput,2));
    	}
    }
    
}