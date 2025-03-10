
package kuis_123230236_if.b;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Kuis_123230236_IFB {
   
    public class LoginFrame extends JFrame{
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton logiButton;
    private final String correctUsername = "kurniasari";
    private final String correctPassword = "123230236";
    
    public LoginFrame(){
        setTitle("Login");
        setSize(300,200);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,2));
        
        add(new JLabel("Username:"));
        usernameField = new JPasswordField();
        add(usernameField);
        
        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        
        JButton loginButton = new JButton("Login");
        add(new JLabel());
        add(logiButton);
        
        loginButton.addActionListener(e -> new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText().trim();
                String password = new String(passwordField.getPassword()).trim();
                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(LoginFrame.this, "username dan password tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (username.equals(correctUsername) && password.equals(correctPassword)) {
                    dispose();
                    new HomeFrame(username);
                            } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Login Gagal! Username dan password salah.", "Error",JOptionPane.ERROR_MESSAGE);
                }
            }   
        });
            setLocationRelativeTo(null);
            setVisible(true);
        }
    
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Kuis_123230236_IFB::new);
    }
    
}
