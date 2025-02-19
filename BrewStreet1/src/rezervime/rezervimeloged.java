package rezervime;

import javax.swing.*;
import Maini.maini;

import java.awt.*;
import java.awt.event.*;


public class rezervimeloged {
    private JPanel panel;
    private JPanel container;
    private CardLayout cards;
    private JTextField textField;
    private JTextField textField_1;


    public rezervimeloged(JPanel container, CardLayout cards) {
        this.container = container;
        this.cards = cards;
    
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 1000, 800); 
        panel.setBackground(new Color(192, 192, 192)); 
        
        JButton btnNewButton = new JButton("Back");
        btnNewButton.setBounds(772, 94, 85, 21);
       
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 cards.show(container, "rezervime");
            }

        });
        
        panel.add(btnNewButton);
    }
    
        public JPanel getPanel() {
            return panel;
        }
    }