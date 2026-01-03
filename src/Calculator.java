import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton,subButton,mulButton,divButton;
    JButton decButton, equButton,delButton,clrButton;
    JPanel panel;
    Font myFont = new Font("Ink free",Font.BOLD,30);
    double num1=0,num2=0,resault=0;
    char operator;
    Calculator()
    {

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
