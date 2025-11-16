import javax.swing.*;
//javax.swing is a toolbox for GUI (buttons,windows,text fields)
//the * means import everything from swing

public class MyWindow { //this creates a class named MyWindow, a class is like a container that holds your program code
    public static void main(String[] args){ // this is the start point of java program, when u press run java begins here
        JFrame frame = new JFrame("My Window"); // this creates window JFrame=the window, "My Window"= the title on the top of the window
        JButton btn = new JButton("Click me"); // this create the button, JButton=button project, "click me"= text written on the button, but button is not inside the window yet
        frame.add(btn); // this places the button inside the window, like sticking it onto the window
        frame.setSize(300, 200); //this set the window width+height ,
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // if you dont incue this, the window closes but the program keeps running in the background. , this line says"When the user click X, close the program completely "
        frame.setVisible(true); //this line shows the window, without this the window will not appear.

    }

}
