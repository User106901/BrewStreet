package kamarjer;


import javax.swing.*;
import Maini.maini;

import java.awt.*;
import java.awt.event.*;


public class kamarjerdashboard{
    private JPanel panel;
    private JPanel container;
    private CardLayout cards;
    private JTextField textField;
    private JTextField textField_1;
    
    private JTextField textField_2;
    private JTextField textField_3;


    public kamarjerdashboard(JPanel container, CardLayout cards) {
        this.container = container;
        this.cards = cards;
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 1000, 800); 
        panel.setBackground(new Color(192, 192, 192)); 
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 67, 603, 723);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 603, 761);
        panel_1.add(scrollPane);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(0, 2, 10, 10));
        scrollPane.setViewportView(contentPanel);

        for (int i = 0; i < 9; i++) {
            JPanel labelPanel = new JPanel();
            labelPanel.setLayout(new BorderLayout());
            
            JLabel imageLabel = new JLabel(new ImageIcon("bk.jpg"));
            imageLabel.setPreferredSize(new java.awt.Dimension(150, 150));
            labelPanel.add(imageLabel, BorderLayout.CENTER);
            
            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new GridLayout(1, 2, 10, 10));
            
            for (int j = 0; j < 2; j++) {
                JButton button = new JButton("Button " + (j + 1));
                buttonPanel.add(button);
            }
            
            labelPanel.add(buttonPanel, BorderLayout.SOUTH);
            contentPanel.add(labelPanel);
        }

        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);


        
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(623, 67, 367, 723);
        panel.add(panel_2);
        
        JLabel lblNewLabel_1 = new JLabel("Menu Items");
        panel_2.add(lblNewLabel_1);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        JButton btnNewButton = new JButton("Profile");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton.setBounds(828, 10, 112, 36);
        btnNewButton.addActionListener(e -> cards.show(container, "kamarjerprofil"));
        panel.add(btnNewButton);
 
    
    
    
    }
    
    public JPanel getPanel() {
        return panel;
    }
}
        