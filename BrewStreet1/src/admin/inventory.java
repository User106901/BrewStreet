package admin;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Maini.maini;

import java.awt.*;
import java.awt.event.*;


public class inventory{
    private JPanel panel;
    private JPanel container;
    private CardLayout cards;
    private JTextField textField;
    private JTextField textField_1;
    
    private JTextField textField_2;
    private JTextField textField_3;
   
    private JTable table;
    private JTextField txtSearch;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_4;

    public inventory(JPanel layeredPane, CardLayout cards) {
        this.container = layeredPane;
        this.cards = cards;
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 1000, 800); 
        panel.setBackground(new Color(128, 128, 128)); 
        
        JLabel lblNewLabel = new JLabel("Inventory");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel.setBounds(25, 10, 125, 40);
        panel.add(lblNewLabel);
        
 String[] columnNames = {"Name", "1", "2", "3", "4"};

        

        DefaultTableModel model = new DefaultTableModel( columnNames, 0);
        JTable table = new JTable(model);

       
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(25, 156, 407, 472);
        panel.add(scrollPane);
        
        txtSearch = new JTextField();
        txtSearch.setFont(new Font("Tahoma", Font.PLAIN, 12));
        txtSearch.setText("Search....");
        txtSearch.setBounds(25, 78, 148, 31);
        panel.add(txtSearch);
        txtSearch.setColumns(10);
        
        textField_5 = new JTextField();
        textField_5.setBounds(493, 199, 156, 31);
        panel.add(textField_5);
        textField_5.setColumns(10);
        
        textField_6 = new JTextField();
        textField_6.setBounds(493, 288, 156, 31);
        panel.add(textField_6);
        textField_6.setColumns(10);
        
        
        JComboBox comboBox = new JComboBox(new String[]{"Category ", "Item 2", "Item 3", "Item 4"});
        comboBox.setBounds(213, 79, 138, 31); // Adjusted size for better visibility
        panel.add(comboBox);
        
        JLabel lblNewLabel_1 = new JLabel("Name");
        lblNewLabel_1.setBounds(493, 156, 113, 33);
        panel.add(lblNewLabel_1);
        
        textField_4 = new JTextField();
        textField_4.setBounds(493, 374, 156, 31);
        panel.add(textField_4);
        textField_4.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("Price");
        lblNewLabel_2.setBounds(493, 254, 92, 23);
        panel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Quantity");
        lblNewLabel_3.setBounds(493, 341, 92, 23);
        panel.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("State");
        lblNewLabel_4.setBounds(469, 425, 92, 23);
        panel.add(lblNewLabel_4);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Active");
        chckbxNewCheckBox.setBounds(458, 454, 79, 31);
        panel.add(chckbxNewCheckBox);
        
        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Not Active");
        chckbxNewCheckBox_1.setBounds(458, 498, 79, 31);
        panel.add(chckbxNewCheckBox_1);
        
        
        JComboBox comboBox1 = new JComboBox(new String[]{"Category ", "Item 2", "Item 3", "Item 4"});
        comboBox1.setBounds(583, 454, 138, 31); // Adjusted size for better visibility
        panel.add(comboBox1);
        
        JButton btnNewButton = new JButton("Add+");
        btnNewButton.setBounds(469, 560, 85, 21);
        panel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Clear");
        btnNewButton_1.setBounds(469, 607, 85, 21);
        panel.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Delete");
        btnNewButton_2.setBounds(607, 560, 85, 21);
        panel.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("Edit");
        btnNewButton_3.setBounds(607, 607, 85, 21);
        panel.add(btnNewButton_3);
        
        JButton btnNewButton_4 = new JButton("Print");
        btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton_4.setBounds(536, 81, 113, 23);
        panel.add(btnNewButton_4);
        
        
 }
    
    public JPanel getPanel() {
        return panel;
    }
}