/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ondemandmotors;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class fillData extends javax.swing.JDialog {

    public fillData(java.awt.Frame parent, boolean modal, String location, String fileLocation) {
        super(parent, modal);
        this.location = location;
        this.fileLocation = fileLocation;
        initComponents();
    }
    
    
    /*Variables used*/
    String[] list = new String[11];
    String location = "";
    String fileLocation = "";
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeGroup = new javax.swing.ButtonGroup();
        categoryGroup = new javax.swing.ButtonGroup();
        conditionGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        companyTextField = new javax.swing.JTextField();
        modelTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        hpTextField = new javax.swing.JTextField();
        carOption = new javax.swing.JRadioButton();
        bikeOption = new javax.swing.JRadioButton();
        adventureOption = new javax.swing.JRadioButton();
        sportsOption = new javax.swing.JRadioButton();
        cityOption = new javax.swing.JRadioButton();
        usedOption = new javax.swing.JRadioButton();
        newOption = new javax.swing.JRadioButton();
        yearTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Records");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Enter the details of new entry");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Vehicle ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Company:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Model:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Price:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("HP:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Type: ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Category:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Relese year:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Condition:");

        typeGroup.add(carOption);
        carOption.setText("Car");
        carOption.setActionCommand("car");

        typeGroup.add(bikeOption);
        bikeOption.setText("Bike");
        bikeOption.setActionCommand("bike");

        categoryGroup.add(adventureOption);
        adventureOption.setText("Adventure");
        adventureOption.setActionCommand("adv");

        categoryGroup.add(sportsOption);
        sportsOption.setText("Sport");
        sportsOption.setActionCommand("sport");

        categoryGroup.add(cityOption);
        cityOption.setText("City");
        cityOption.setActionCommand("city");

        conditionGroup.add(usedOption);
        usedOption.setText("Used");
        usedOption.setActionCommand("used");

        conditionGroup.add(newOption);
        newOption.setText("New");
        newOption.setActionCommand("new");

        addButton.setText("Add Record");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameTextField)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(hpTextField))
                                    .addComponent(idTextField)
                                    .addComponent(companyTextField)
                                    .addComponent(modelTextField)
                                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sportsOption)
                                    .addComponent(adventureOption)
                                    .addComponent(cityOption)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(carOption)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(bikeOption))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(10, 10, 10)
                                                    .addComponent(usedOption)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(newOption)))))
                                    .addGap(4, 4, 4))
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(companyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(hpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(carOption)
                                .addComponent(bikeOption))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adventureOption)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sportsOption)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cityOption)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usedOption)
                            .addComponent(newOption))
                        .addGap(17, 17, 17)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(doneButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        //Check to see if all the button groups have been selected
        if( (typeGroup.getSelection() == null) || (categoryGroup.getSelection() == null) || (conditionGroup.getSelection() == null) ){
            JOptionPane.showMessageDialog(null,"Sellect one from each button group", "Alert",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        //Check to see if all the fields have been filed
        if( idTextField.getText().trim().equals("") || nameTextField.getText().trim().equals("") ||
            companyTextField.getText().trim().equals("") || modelTextField.getText().trim().equals("") ||
            priceTextField.getText().trim().equals("") || hpTextField.getText().trim().equals("") ||
            yearTextField.getText().trim().equals("") ){
            
            JOptionPane.showMessageDialog(null,"Fill all the fields", "Alert",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        //Check if there are only numbers in price, hp and year field
        if( !(priceTextField.getText().trim().matches("[0-9]+")) || !(yearTextField.getText().trim().matches("[0-9]+"))
            || !(hpTextField.getText().trim().matches("[0-9]+"))    ){
            JOptionPane.showMessageDialog(null,"Please Enter Numeric Values for Price, Year and HP", "Alert",JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        
        //ID
        list[0] = idTextField.getText();
        
        //Name
        list[1] = nameTextField.getText();
        
        //Type
        list[2] = typeGroup.getSelection().getActionCommand();
        
        //Category
        list[3] = categoryGroup.getSelection().getActionCommand();
        if(list[3].trim().toLowerCase().equals("car")){
            list[10] = "image/car.jpg";
        } else {
            list[10] = "image/bike.jpg";
        }
        
        //Company
        list[4] = companyTextField.getText();
        
        //Model
        list[5] = modelTextField.getText();
        
        //Year
        list[6] = yearTextField.getText();
        
        //Price
        list[7] = priceTextField.getText();
        
        //BHP
        list[8] = hpTextField.getText();
        
        //Condition
        list[9] = conditionGroup.getSelection().getActionCommand();
        
        writeData();
    }//GEN-LAST:event_addButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // clear everything when pressed
        typeGroup.clearSelection();
        conditionGroup.clearSelection();
        categoryGroup.clearSelection();
        
        //Clearing all the text fields
         //ID
        idTextField.setText("");
        //Name
        nameTextField.setText("");
        //Company
        companyTextField.setText("");
        //Model
        modelTextField.setText("");
        //Year
        yearTextField.setText("");
        //Price
        priceTextField.setText("");
        //BHP
        hpTextField.setText("");
        
        //Clear the list
        for(int i=0; i<list.length; i++){
            list[i] = null;
        }
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_doneButtonActionPerformed
    
    //METHOD to write to the file
    public void writeData(){
        try {
            List<String> ls = Arrays.asList(list);
            String line = String.join(",", ls);
            
            Writer output;
            output = new BufferedWriter(new FileWriter(fileLocation, true));
            output.append(line);
            output.close();
            // After adding display the record
            JOptionPane.showMessageDialog(null,"1 new record added. \n" + line, "Alert",JOptionPane.INFORMATION_MESSAGE);
            
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JRadioButton adventureOption;
    private javax.swing.JRadioButton bikeOption;
    private javax.swing.JRadioButton carOption;
    private javax.swing.ButtonGroup categoryGroup;
    private javax.swing.JRadioButton cityOption;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField companyTextField;
    private javax.swing.ButtonGroup conditionGroup;
    private javax.swing.JButton doneButton;
    private javax.swing.JTextField hpTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JRadioButton newOption;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JRadioButton sportsOption;
    private javax.swing.ButtonGroup typeGroup;
    private javax.swing.JRadioButton usedOption;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
