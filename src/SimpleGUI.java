import javax.swing.*; //swing is a library that allows java to create GUIs like windows, buttons, labels, text fields, check boxes
import javax.awt.*; //Abstract window Toolkit , swing needs AWT for layouts, colors, fonts, graphics
public class SimpleGUI {
    public static void main(String[] args){

        JFrame frame = new JFrame("My first GUI"); //create a new window
        frame.setSize(400,200);
        frame.setLayout(new FlowLayout()); //tells the window how to arrange components

        frame.add(new JLabel("Enter your name:"));
        frame.add(new JTextField("Type here", 15)); //width take spase after here eg.- type here - _______
        frame.add(new JButton("OK"));
        frame.add(new JCheckBox("Bold"));
        frame.add(new JRadioButton("Red"));
        frame.add(new JComboBox<>(new String[]{"Red","Green","Blue"})); //Add a dropdown list with 3 choices
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //This makes sure that when u click the  X button on the window, the entire program end. if u didnt add this the window closes but the program still run in the background
        frame.setVisible(true); //this line display the window, if u dont wirte this line, the window will not appear.

    }
}
