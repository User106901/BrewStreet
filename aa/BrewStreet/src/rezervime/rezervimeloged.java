package rezervime;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import Maini.maini;

import java.awt.*;
import java.awt.event.*;


public class rezervimeloged {
    private JPanel panel;
    private JPanel container;
    private CardLayout cards;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_3;
    private JTextField textField_2;
    private JTable table;


    public rezervimeloged(JPanel container, CardLayout cards) {
        this.container = container;
        this.cards = cards;
    
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 1000, 800); 
        panel.setBackground(new Color(192, 192, 192)); 
        
        JButton btnNewButton = new JButton("Back");
        btnNewButton.setBounds(890, 10, 100, 32);
       
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 cards.show(container, "rezervime");
            }

        });
        
        panel.add(btnNewButton);
        
//        textField_3 = new JTextField();
//        textField_3.setColumns(10);
//        textField_3.setBounds(152, 241, 158, 32);
//        panel.add(textField_3);
//        
//        
//        JDateChooser dateChooser = new JDateChooser();
//        panel.add(dateChooser);
//
//        panel.setLayout(null);
//        dateChooser.setBounds(152, 147, 158, 32);
//        
//        textField_2 = new JTextField();
//        textField_2.setColumns(10);
//        textField_2.setBounds(561, 147, 158, 32);
//        panel.add(textField_2);
//        
//        JLabel lblNewLabel = new JLabel("Data");
//        lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 18));
//        lblNewLabel.setBounds(42, 147, 100, 32);
//        panel.add(lblNewLabel);
//        
//        JLabel lblEmri = new JLabel("Emri");
//        lblEmri.setFont(new Font("Sitka Small", Font.PLAIN, 18));
//        lblEmri.setBounds(42, 241, 100, 32);
//        panel.add(lblEmri);
//        
//        JLabel lblDetaje = new JLabel("Detaje");
//        lblDetaje.setFont(new Font("Sitka Small", Font.PLAIN, 18));
//        lblDetaje.setBounds(455, 241, 69, 32);
//        panel.add(lblDetaje);
//        
//        JLabel lblNumriIPersonave = new JLabel("Nr. Personave");
//        lblNumriIPersonave.setFont(new Font("Sitka Small", Font.PLAIN, 18));
//        lblNumriIPersonave.setBounds(385, 147, 139, 32);
//        panel.add(lblNumriIPersonave);
//        
        JButton btnNewButton_1 = new JButton("Shto");
        btnNewButton_1.setBounds(757, 205, 120, 109);
        panel.add(btnNewButton_1);
        JButton btnNewButton_2 = new JButton("New button");
        btnNewButton_2.setBounds(637, 716, 22, 21);
        panel.add(btnNewButton_2);
        
        table = new JTable();
        table.setBounds(44, 91, 615, 646);
        panel.add(table);
       
        JFrame miniFrame = new JFrame();
        miniFrame.setSize(200,200);
        miniFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miniFrame.setLocation(250,250);
        
        
       
        JButton btnNewButton_1_1 = new JButton("Shiko Rezervimin");
        btnNewButton_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
                miniFrame.setVisible(true);
        	}
        });
        btnNewButton_1_1.setBounds(757, 434, 120, 109);
        panel.add(btnNewButton_1_1);
        
//        JTextArea textArea = new JTextArea();
//        textArea.setText("Enter Discription... ");
//        textArea.setBounds(561, 244, 272, 97);
//               panel.add(textArea);
//       

        
    }
    
        public JPanel getPanel() {
            return panel;
        }
    }