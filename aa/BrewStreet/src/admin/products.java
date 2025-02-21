package admin;


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.io.File;


public class products{
    private JPanel panel;
    private JPanel container;
    private CardLayout cards;
    private JTextField textField;
    private JTextField textField_1;
    
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField txtSearch;
    private JTextField textField_8;


    public products(JPanel container, CardLayout cards) {
        this.container = container;
        this.cards = cards;
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 1000, 800); 
        panel.setBackground(new Color(192, 192, 192)); 
        
        
        String[] columnNames = {"Name", "Quantity", "Price", "Category"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);

       
        JButton uploadButton = new JButton("Upload Image");
        uploadButton.setBounds(504, 334, 131, 30);
        panel.add(uploadButton);

 
        uploadButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png"));
            int result = fileChooser.showOpenDialog(panel);
            
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                
             

                
                ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                JLabel imageLabel = new JLabel(imageIcon);
                imageLabel.setBounds(170, 520, 100, 100); 
                panel.add(imageLabel);

              
                panel.revalidate();
                panel.repaint();
            }
        });

        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(32, 100, 426, 507);
        panel.add(scrollPane);
        
        
        
        JLabel lblNewLabel = new JLabel("Products");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel.setBounds(32, 29, 159, 30);
        panel.add(lblNewLabel);
        
        textField_4 = new JTextField();
        textField_4.setBounds(651, 335, 131, 30);
        panel.add(textField_4);
        textField_4.setColumns(10);
        
        textField_5 = new JTextField();
        textField_5.setBounds(651, 421, 131, 30);
        panel.add(textField_5);
        textField_5.setColumns(10);
        
        textField_6 = new JTextField();
        textField_6.setBounds(504, 249, 131, 30);
        panel.add(textField_6);
        textField_6.setColumns(10);
        
        textField_7 = new JTextField();
        textField_7.setBounds(504, 421, 131, 30);
        panel.add(textField_7);
        textField_7.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Name\r\n");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(504, 217, 107, 22);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Quantity");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_2.setBounds(650, 388, 107, 22);
        panel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Price");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_3.setBounds(651, 303, 99, 22);
        panel.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("Category\r\n");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4.setBounds(504, 388, 107, 22);
        panel.add(lblNewLabel_4);
        
        JButton btnNewButton = new JButton("Edit");
        btnNewButton.setBounds(504, 524, 85, 21);
        panel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Clear");
        btnNewButton_1.setBounds(504, 586, 85, 21);
        panel.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Add+");
        btnNewButton_2.setBounds(651, 524, 85, 21);
        panel.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("Delete");
        btnNewButton_3.setBounds(651, 586, 85, 21);
        panel.add(btnNewButton_3);
        
        JLabel lblNewLabel_5 = new JLabel("Filter");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_5.setBounds(673, 133, 107, 20);
        panel.add(lblNewLabel_5);
        
        JComboBox comboBox = new JComboBox(new String[]{"Category ", "Item 2", "Item 3", "Item 4"});
        comboBox.setBounds(673, 163, 138, 31); // Adjusted size for better visibility
        panel.add(comboBox);
        
        txtSearch = new JTextField();
        txtSearch.setText("Search....");
        txtSearch.setBounds(504, 163, 131, 31);
        panel.add(txtSearch);
        txtSearch.setColumns(10);
        
        JLabel lblNewLabel_6 = new JLabel("Search?");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_6.setBounds(504, 134, 99, 22);
        panel.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("Photo");
        lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_7.setBounds(504, 303, 93, 21);
        panel.add(lblNewLabel_7);
        
        textField_8 = new JTextField();
        textField_8.setBounds(651, 249, 131, 30);
        panel.add(textField_8);
        textField_8.setColumns(10);
        
        JLabel lblNewLabel_8 = new JLabel("Description");
        lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_8.setBounds(651, 217, 85, 20);
        panel.add(lblNewLabel_8);


        
        
 }
    
    public JPanel getPanel() {
        return panel;
    }
}