import javax.swing.*;
import java.awt.*;
public class StudentForm1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Form");
        frame.setSize(600,300);
        frame.setLayout(new GridLayout(2,3));

        frame.add(new JLabel("Enter your age:"));
        frame.add(new JTextField("Type here",15));

        //button with bold font size 18
        JButton submitBtn = new JButton("submit");
        submitBtn.setFont(new Font("Serif",Font.BOLD, 18));
        frame.add(submitBtn);

        frame.add(new JCheckBox("Bold"));
        frame.add(new JCheckBox("Italic"));
        frame.add(new JRadioButton("Red"));
        frame.add(new JRadioButton("Blue"));
        frame.add(new JComboBox<>(new String[]{"Apple","Mango","Banana"}));

        //add background color to the window
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
