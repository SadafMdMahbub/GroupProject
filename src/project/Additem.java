
package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Additem extends javax.swing.JFrame {

 
    public Additem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        prdtnamelbl = new javax.swing.JLabel();
        prdnametf = new javax.swing.JTextField();
        prdtidlbl = new javax.swing.JLabel();
        prdidtf = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        prdtble = new javax.swing.JTable();
        prddesciplbl = new javax.swing.JLabel();
        prddescriptf = new javax.swing.JTextField();
        clearbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        prdpricelbl = new javax.swing.JLabel();
        prdpricetf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        prdquanttf = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        allprdbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        prdtnamelbl.setBackground(new java.awt.Color(255, 51, 0));
        prdtnamelbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prdtnamelbl.setForeground(new java.awt.Color(255, 51, 0));
        prdtnamelbl.setText("Product name");

        prdnametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prdnametfActionPerformed(evt);
            }
        });

        prdtidlbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prdtidlbl.setForeground(new java.awt.Color(255, 51, 0));
        prdtidlbl.setText("Product id");

        prdidtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prdidtfActionPerformed(evt);
            }
        });

        addbtn.setBackground(new java.awt.Color(255, 51, 0));
        addbtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(255, 51, 0));
        deletebtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        prdtble.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prdtble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "product name", "product id", "Description", "quantity", "price"
            }
        ));
        prdtble.setSelectionBackground(new java.awt.Color(255, 51, 0));
        prdtble.setSelectionForeground(new java.awt.Color(255, 255, 255));
        prdtble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prdtbleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(prdtble);

        prddesciplbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prddesciplbl.setForeground(new java.awt.Color(255, 51, 0));
        prddesciplbl.setText("Description");

        prddescriptf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prddescriptfActionPerformed(evt);
            }
        });

        clearbtn.setBackground(new java.awt.Color(255, 51, 0));
        clearbtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setText("CLEAR");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        editbtn.setBackground(new java.awt.Color(255, 51, 0));
        editbtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        editbtn.setForeground(new java.awt.Color(255, 255, 255));
        editbtn.setText("EDIT");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        savebtn.setBackground(new java.awt.Color(255, 51, 0));
        savebtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        savebtn.setForeground(new java.awt.Color(255, 255, 255));
        savebtn.setText("SAVE");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        prdpricelbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prdpricelbl.setForeground(new java.awt.Color(255, 51, 0));
        prdpricelbl.setText("PRICE");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Quantity");

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INVENTORY MANAGEMENT SYSTEM");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADD ITEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("MAIN MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        allprdbtn.setBackground(new java.awt.Color(255, 51, 0));
        allprdbtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        allprdbtn.setForeground(new java.awt.Color(255, 255, 255));
        allprdbtn.setText("ALL PRODUCT");
        allprdbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allprdbtnActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(255, 51, 0));
        updatebtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CLEAR TABLE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(prdtidlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prdtnamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(prddesciplbl)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prdpricelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(prdpricetf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(prdnametf)
                                    .addComponent(prdidtf)
                                    .addComponent(prddescriptf, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(prdquanttf))
                                .addGap(71, 71, 71)
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(allprdbtn))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prdtnamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(prdnametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prdtidlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prdidtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(prddesciplbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(prddescriptf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addbtn)
                        .addComponent(deletebtn)
                        .addComponent(clearbtn)
                        .addComponent(editbtn)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(prdquanttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prdpricetf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prdpricelbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatebtn))
                        .addGap(15, 15, 15)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(allprdbtn)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
 if(prdnametf.getText().equals("")||prdidtf.getText().equals("")||prddescriptf.getText().equals("")||prdquanttf.getText().isEmpty()||prdpricetf.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "please enter all data");
            
            
            
        }
        
        else{
            int price = Integer.parseInt(prdpricetf.getText());
            int qty = Integer.parseInt(prdquanttf.getText());
            Object[] data = {prdnametf.getText(),prdidtf.getText(),prddescriptf.getText(),qty,price};
            DefaultTableModel tblmodel = (DefaultTableModel)prdtble.getModel();
            tblmodel.addRow(data);
//             tblmodel.addRow(new Object[]{"", "",""});    
            JOptionPane.showMessageDialog(this, "Data added succesfully");
            

            
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void prdidtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prdidtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prdidtfActionPerformed

    private void prdnametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prdnametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prdnametfActionPerformed

    private void prddescriptfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prddescriptfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prddescriptfActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
        
        
            prdnametf.setText("");
            prdidtf.setText("");
            prddescriptf.setText("");
            
            prdquanttf.setText("");
            prdpricetf.setText("");
            
    }//GEN-LAST:event_clearbtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
        
        
        //update button
        DefaultTableModel tblmodel = (DefaultTableModel) prdtble.getModel();
            int numberofRow = prdtble.getSelectedRow();
            
            String name = prdnametf.getText();
            String id = prdidtf.getText();
            String description = prddescriptf.getText();
            
           int qty = Integer.parseInt(prdquanttf.getText());
           int price = Integer.parseInt(prdpricetf.getText());
            
            tblmodel.setValueAt(name,numberofRow,0);
            tblmodel.setValueAt(id,numberofRow,1);
            tblmodel.setValueAt(description,numberofRow,2);
            
            tblmodel.setValueAt(qty, numberofRow,3);
            tblmodel.setValueAt(price, numberofRow,4);
    }//GEN-LAST:event_editbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        
        
        
        //deletebutton
        DefaultTableModel tblmodel = (DefaultTableModel)prdtble.getModel();
        if(prdtble.getSelectedRowCount()==1){
            tblmodel.removeRow(prdtble.getSelectedRow());
        }
        else if (prdtble.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Table is empty");
        }
        else{
                JOptionPane.showMessageDialog(this, "please select single row");

        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void prdtbleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prdtbleMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel tblmodel = (DefaultTableModel) prdtble.getModel();
        
        
        int num = prdtble.getSelectedRow();
        
    
        String name = tblmodel.getValueAt(num,0).toString();
        String id = tblmodel.getValueAt(num,1).toString();
        String description = tblmodel.getValueAt(num,2).toString();
        
        String qtystr = tblmodel.getValueAt(num,3).toString();
        String pricestr = tblmodel.getValueAt(num,4).toString();
        
        try{
            
            int qty = Integer.parseInt(qtystr);
            int price = Integer.parseInt(pricestr);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Failed to parse quantity from the table. Invalid number format.");
        return;
        }

    
    prdnametf.setText(name);
    prdidtf.setText(id);
    prddescriptf.setText(description);
    
    prdquanttf.setText(qtystr);
    prdpricetf.setText(pricestr);
        
        
        
        
    }//GEN-LAST:event_prdtbleMouseClicked

    
    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) prdtble.getModel(); 
//       DefaultTableModel table = (DefaultTableModel) jTable2.getModel();

    try (FileWriter fp = new FileWriter(new File("test.txt"), true)) {
        // Writing data rows to the file
        for (int i = 0; i < table.getRowCount(); i++) {
            for (int j = 0; j < table.getColumnCount(); j++) {
                fp.write(table.getValueAt(i, j).toString() + ",");
            }
            fp.write("\n");
        }

        fp.flush();
        JOptionPane.showMessageDialog(this, "Data saved to " + "test.txt");
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error saving file!");
    }
        
    }//GEN-LAST:event_savebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Menu().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void allprdbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allprdbtnActionPerformed
        // TODO add your handling code here:
        
        
         String filepath = "test.txt";
        File file = new File(filepath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            DefaultTableModel model = (DefaultTableModel)prdtble.getModel();

            // Clear the table first
            model.setRowCount(0); // This will remove all rows from the table

            Object[] tablelines = br.lines().toArray();
            for(int i = 0; i < tablelines.length; i++) {
                String line = tablelines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }

        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_allprdbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        String productFilepath = "test.txt";
        DefaultTableModel prdModel = (DefaultTableModel) prdtble.getModel();

        try (FileWriter fp = new FileWriter(new File(productFilepath), false)) {
            for (int i = 0; i < prdModel.getRowCount(); i++) {
                for (int j = 0; j < prdModel.getColumnCount(); j++) {
                    fp.write(prdModel.getValueAt(i, j).toString() + ",");
                }
                fp.write("\n");
            }
            fp.flush();
            JOptionPane.showMessageDialog(this, "Product data saved to " + "test.txt");

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving product file!");
        }
        
        
        
        
        
    }//GEN-LAST:event_updatebtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) prdtble.getModel();
    model.setRowCount(0); // This will remove all rows from the table
    JOptionPane.showMessageDialog(this, "Table cleared successfully!");
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Additem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Additem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Additem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Additem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Additem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton allprdbtn;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel prddesciplbl;
    private javax.swing.JTextField prddescriptf;
    private javax.swing.JTextField prdidtf;
    private javax.swing.JTextField prdnametf;
    private javax.swing.JLabel prdpricelbl;
    private javax.swing.JTextField prdpricetf;
    private javax.swing.JTextField prdquanttf;
    private javax.swing.JTable prdtble;
    private javax.swing.JLabel prdtidlbl;
    private javax.swing.JLabel prdtnamelbl;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
