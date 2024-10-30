import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicación Básica Swing");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel label = new JLabel("Ingrese su nombre:");
        label.setBounds(30, 30, 120, 25);
        JTextField textField = new JTextField();
        textField.setBounds(150, 30, 200, 25);
        JButton button = new JButton("Saludar");
        button.setBounds(150, 70, 100, 25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(frame, "¡Hola, " + name + "!");
            }
        });
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.setVisible(true);
    }
}