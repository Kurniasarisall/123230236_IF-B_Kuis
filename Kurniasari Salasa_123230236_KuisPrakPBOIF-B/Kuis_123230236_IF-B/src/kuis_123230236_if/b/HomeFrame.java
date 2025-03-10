package kuis_123230236_if.b;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.print.attribute.standard.RequestingUserName;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class HomeFrame extends JFrame{

    private String username;
    public HomeFrame(String username) {
        public HomeFrame(String username)
                setTitle("Halaman Utama");
                setSize(400,300);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE): 
    setLayout(new BorderLayout());
    JLabel welcomeLabel = new JLabel("Selamat Datang, " + username, SwingConstants.CENTER);
    add(welcomeLabel, BorderLayout.NORTH);
    
    JPanel buttonJPanel = new JPanel(new GridLayout(3, 1, 10, 10));
    JButton anakButton = NEW JButton ("Apel");
    JButton anakButton = NEW JButton ("Jeruk");
    JButton anakButton = NEW JButton ("Mangga");
    
    apelButton.addActionListener(e -> new PurchaseFrame("Apel", 15000));
    jerukButton.addActionListener(e -> new PurchaseFrame("Jeruk", 12000));
    manggaButton.addActionListener(e -> new PurchaseFrame("Mangga", 20000));
    
    
    buttonPanel.add(apelButton);
    buttonPanel.add(jerukButton);
    buttonPanel.add(jerukButton);
    
    add(buttonPanel,BorderLayout.CENTER);
    
     setLocationRelativeTo(null);
     setVisible(true);
    }         
    }
