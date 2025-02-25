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
    private JTextField txtSearch;


    public kamarjerdashboard(JPanel container, CardLayout cards) {
        this.container = container;
        this.cards = cards;
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 1000, 800); 
        panel.setBackground(new Color(192, 192, 192)); 
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 105, 339, 652);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 339, 650);
//        scrollPane.setViewportView(panel_1);
        panel_1.add(scrollPane);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(0, 2, 10, 10));
        scrollPane.setColumnHeaderView(contentPanel);

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
        panel_2.setBounds(672, 105, 318, 430);
        panel.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("<html><center>BrewStreet Café<br>123 Main Street, City, Country<br>"
                + "Phone: +XXX-XXX-XXXX<br>Email: contact@brewstreet.com<br>"
                + "</center></html>");
        lblNewLabel_1.setBounds(66, 10, 200, 60);
        panel_2.add(lblNewLabel_1);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        
        JLabel lblNewLabel_4 = new JLabel("*****************************************************************************************************");
        lblNewLabel_4.setBounds(10, 85, 298, 13);
        panel_2.add(lblNewLabel_4);
        
        JLabel lblNewLabel_4_1 = new JLabel("*****************************************************************************************************");
        lblNewLabel_4_1.setBounds(10, 126, 298, 13);
        panel_2.add(lblNewLabel_4_1);
        
        JLabel lblNewLabel_5 = new JLabel("Item");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_5.setBounds(10, 97, 70, 19);
        panel_2.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("Quantity");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_6.setBounds(123, 97, 70, 19);
        panel_2.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("Price");
        lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_7.setBounds(223, 97, 64, 19);
        panel_2.add(lblNewLabel_7);

        
        JButton btnNewButton = new JButton("Profile");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton.setBounds(828, 10, 112, 36);
        btnNewButton.addActionListener(e -> cards.show(container, "kamarjerprofil"));
        panel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Bar");
        btnNewButton_1.setBounds(24, 67, 85, 28);
        panel.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Restorant");
        btnNewButton_2.setBounds(119, 67, 85, 28);
        panel.add(btnNewButton_2);
        
        txtSearch = new JTextField();
        txtSearch.setText("Search....");
        txtSearch.setBounds(36, 16, 168, 28);
        panel.add(txtSearch);
        txtSearch.setColumns(10);
        
        JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setBounds(363, 105, 297, 430);
        panel.add(scrollPane1);

        String[] columnNames = {"ID", "Price", "Quantity", "Item"};
        Object[][] data = {};

        JTable table = new JTable(data, columnNames);
        scrollPane1.setViewportView(table);

        
        JButton btnNewButton_3 = new JButton("Pay");
        btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnNewButton_3.setBounds(696, 585, 112, 124);
        panel.add(btnNewButton_3);
        
        JButton btnNewButton_4 = new JButton("Print");
        btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnNewButton_4.setBounds(833, 585, 112, 124);
        panel.add(btnNewButton_4);
        
        JButton btnNewButton_5 = new JButton("Delete");
        btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton_5.setBounds(559, 555, 101, 36);
        panel.add(btnNewButton_5);
        
        JLabel lblNewLabel = new JLabel("Total:");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel.setBounds(382, 625, 85, 28);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_2 = new JLabel("Cash:");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_2.setBounds(382, 675, 57, 28);
        panel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Balance:");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_3.setBounds(382, 719, 57, 28);
        panel.add(lblNewLabel_3);
 
    
    
    
    }
    
    public JPanel getPanel() {
        return panel;
    }
}
        