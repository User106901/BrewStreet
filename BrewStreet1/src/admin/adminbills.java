package admin;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;


public class adminbills{
    
    private JPanel container;
    private CardLayout cards;
    private JTextField textField;
    private JTextField textField_1;
    
    private JTextField textField_2;
    private JTextField textField_3;
    
    private JTable table;
    private JTextField textField_4;

    /**
     * @wbp.parser.entryPoint
     */
    public JPanel getPanel() {
       
    	
    	JPanel panel = new JPanel();
    	panel.setBounds(200, 2000, 1136, 670);
    	panel.setBackground(Color.LIGHT_GRAY);
    	panel.setLayout(null);
		

        String[] columnNames = {"Name", "1", "2", "3", "4"};

        

        DefaultTableModel model = new DefaultTableModel( columnNames, 0);
        JTable table = new JTable(model);

       
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(25, 156, 407, 472);
        panel.add(scrollPane);
        
        JLabel lblNewLabel = new JLabel("Bills&Orders");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel.setBounds(25, 33, 162, 24);
        panel.add(lblNewLabel);
        
        
        
        JButton btnNewButton_1 = new JButton("Delete");
        btnNewButton_1.setBounds(473, 569, 138, 31);
        panel.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Print");
        btnNewButton_2.setBounds(473, 503, 138, 31);
        panel.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("Edit");
        btnNewButton_3.setBounds(551, 440, 60, 31);
        panel.add(btnNewButton_3);

        JComboBox comboBox = new JComboBox(new String[]{"Category ", "Item 2", "Item 3", "Item 4"});
        comboBox.setBounds(473, 380, 138, 31); // Adjusted size for better visibility
        panel.add(comboBox);
        
        JButton btnNewButton = new JButton("Save");
        btnNewButton.setBounds(473, 440, 60, 31);
        panel.add(btnNewButton);
        
        textField_4 = new JTextField();
        textField_4.setBounds(473, 202, 162, 147);
        panel.add(textField_4);
        textField_4.setColumns(10);
        
        JButton btnNewButton_4 = new JButton("View Details");
        btnNewButton_4.setBounds(473, 154, 115, 31);
        panel.add(btnNewButton_4);
        
        return panel;
        
    }
}

