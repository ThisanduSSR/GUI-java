import javax.swing.*; //swing is a library that allows java to create GUIs like windows, buttons, labels, text fields, check boxes
import javax.awt.*; //Abstract window Toolkit , swing needs AWT for layouts, colors, fonts, graphics
public class SimpleGUI {
    public static void main(String[] args){

        JFrame frame = new JFrame("My first GUI"); //create a new window
        frame.setSize(400,200);
        frame.setLayout(new FlowLayout()); //tells the window how to arrange components

        frame.add(new JLabel("Enter your name:"));
    }
}
