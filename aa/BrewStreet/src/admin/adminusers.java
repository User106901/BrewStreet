package admin;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Maini.maini;

import java.awt.*;
import java.awt.event.*;


public class adminusers{
    private JPanel panel;
    private JPanel container;
    private CardLayout cards;
    private JTextField textField;
    private JTextField textField_1;
    
    private JTextField textField_2;
    private JTextField textField_3;
    private JTable table;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;


    public adminusers(JPanel container, CardLayout cards) {
        this.container = container;
        this.cards = cards;
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 1000, 800); 
        panel.setBackground(new Color(192, 192, 192)); 
        
        JLabel lblNewLabel = new JLabel("Manage Users");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblNewLabel.setBounds(32, 21, 161, 35);
        panel.add(lblNewLabel);
        
        String[] columnNames = {"Name", "Phone Number", "Address", "Email"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model); 

        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(32, 100, 426, 507);
        panel.add(scrollPane);
        
        textField_4 = new JTextField();
        textField_4.setBounds(517, 136, 177, 26);
        panel.add(textField_4);
        textField_4.setColumns(10);
        
        textField_5 = new JTextField();
        textField_5.setBounds(517, 227, 177, 26);
        panel.add(textField_5);
        textField_5.setColumns(10);
        
        textField_6 = new JTextField();
        textField_6.setBounds(517, 305, 177, 26);
        panel.add(textField_6);
        textField_6.setColumns(10);
        
        textField_7 = new JTextField();
        textField_7.setBounds(517, 381, 177, 26);
        panel.add(textField_7);
        textField_7.setColumns(10);
        
        textField_8 = new JTextField();
        textField_8.setBounds(517, 461, 177, 26);
        panel.add(textField_8);
        textField_8.setColumns(10);
        
        JButton btnNewButton = new JButton("Save");
        btnNewButton.setBounds(497, 531, 85, 21);
        panel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Update");
        btnNewButton_1.setBounds(497, 586, 85, 21);
        panel.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Reset");
        btnNewButton_2.setBounds(609, 531, 85, 21);
        panel.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("Close\r\n");
        btnNewButton_3.setBounds(609, 586, 85, 21);
        panel.add(btnNewButton_3);
        
        JLabel lblNewLabel_1 = new JLabel("Name\r\n");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(517, 100, 101, 26);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Email");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_2.setBounds(517, 188, 102, 21);
        panel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Phone-Number");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_3.setBounds(516, 274, 102, 21);
        panel.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("Password");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4.setBounds(517, 350, 102, 21);
        panel.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("Address");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_5.setBounds(517, 430, 92, 21);
        panel.add(lblNewLabel_5);
        
        
 }
    
    public JPanel getPanel() {
        return panel;
    }
}