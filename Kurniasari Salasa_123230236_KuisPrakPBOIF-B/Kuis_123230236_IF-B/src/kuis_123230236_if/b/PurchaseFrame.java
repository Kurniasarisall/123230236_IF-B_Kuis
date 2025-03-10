package kuis_123230236_if.b;

import java.awt.GridLayout;
import java.awt.PopupMenu;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PurchaseFrame extends JFrame
{
    public PurchaseFrame(String category, int price){
         setTitle("Halaman Utama");
         setSize(400,300);
         setLayout(new GridLayout(6, 2));
         
         add(new JLabel("Kategori"));
         add(new JLabel(category));
         
         add(new JLabel("Harga"));
         add(new JLabel("Rp" + price +  "/kg"));
         
         add(new JLabel("Jumlah"));
         JTextField quantityField = new JTextField();
         add(quantityField);
         
         JButton backButton = new JButton ("Kembali");
         JButton buyButton = new JButton("Beli");
         
         add(new JLabel("Total Pembelian"));
         JLabel totalLabel = new JLabel("RpO");
         add(quantityField);
         
         add(new JLabel("Jumlah"));
         JLabel finalJLabel = new JLabel("0 kg");
        PopupMenu quantityLabel = null;
         add(quantityLabel);
         
         add(new JLabel("Total Harga"));
         JLabel finalTotaLabel = new JLabel("RpO");
         add(finalTotalLabel);
         
         buyButton.addActionListener(e - > 
                 try {
                 String input = quantityField.getText().trim();
                 
                 if(input.isEmpty()){
                 
                 }
                 }
                 );
         
    }
}
