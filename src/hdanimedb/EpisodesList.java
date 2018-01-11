/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdanimedb;

import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nam's PC
 */
public class EpisodesList extends javax.swing.JFrame {

    /**
     * Creates new form EpisodesList
     */
    public EpisodesList() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        malLink = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        addEpBtn = new javax.swing.JButton();
        editEpBtn = new javax.swing.JButton();
        removeEpBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        anidbLink = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Episodes", "Backup Link", "Drive Link", "GG Cloud Link", "Link 3", "Link 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(300);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(700);
            jTable1.getColumnModel().getColumn(2).setMinWidth(150);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(600);
            jTable1.getColumnModel().getColumn(3).setMinWidth(150);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(300);
            jTable1.getColumnModel().getColumn(4).setMinWidth(150);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(300);
            jTable1.getColumnModel().getColumn(5).setMinWidth(150);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(300);
            jTable1.getColumnModel().getColumn(6).setMinWidth(150);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(300);
        }

        jLabel1.setText("ID:");

        jLabel2.setText("Name:");

        jLabel3.setText("MAL Link:");

        ID.setEditable(false);
        ID.setBackground(null);
        ID.setText("jTextField1");
        ID.setBorder(null);
        ID.setRequestFocusEnabled(false);
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        malLink.setEditable(false);
        malLink.setText("jTextField2");
        malLink.setBorder(null);

        name.setEditable(false);
        name.setBackground(null);
        name.setText("jTextField3");
        name.setBorder(null);

        addEpBtn.setText("Add");

        editEpBtn.setText("Edit");
        editEpBtn.setEnabled(false);
        editEpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEpBtnActionPerformed(evt);
            }
        });

        removeEpBtn.setText("Remove");
        removeEpBtn.setEnabled(false);

        jLabel4.setText("Anidb Link:");

        anidbLink.setEditable(false);
        anidbLink.setBackground(null);
        anidbLink.setText("jTextField3");
        anidbLink.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1093, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                            .addComponent(malLink))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                            .addComponent(anidbLink)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addEpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(editEpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(removeEpBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(malLink)
                    .addComponent(jLabel4)
                    .addComponent(anidbLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEpBtn)
                    .addComponent(editEpBtn)
                    .addComponent(removeEpBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editEpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEpBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editEpBtnActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed
    
    public void setTable(Vector<Vector<Object>> data) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(JLabel.LEFT);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(leftRenderer);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        jTable1.setAutoCreateColumnsFromModel(false);
        Vector<String> header = new Vector<String>();
        header.add("ID");
        header.add("Episodes");
        header.add("Backup Link");
        header.add("Drive Link");
        header.add("GG Cloud Link");
        header.add("Link 3");
        header.add("Link 4");
        tblModel = (DefaultTableModel) jTable1.getModel();
        tblModel.setDataVector(data, header);
    }

    public javax.swing.JTable getTable() {
        return jTable1;
    }

    public void tableListener(ListSelectionListener lsl) {
        jTable1.getSelectionModel().addListSelectionListener(lsl);
    }
    
    public void setEditBtnEnable(boolean condition){
        editEpBtn.setEnabled(condition);
        removeEpBtn.setEnabled(condition);
    }
    
    public void addEditBtnListener(java.awt.event.ActionListener a) {
        editEpBtn.addActionListener(a);
    }

    public void addRemoveBtnListener(java.awt.event.ActionListener a) {
        removeEpBtn.addActionListener(a);
    }
    
    public void addAddBtnListener(java.awt.event.ActionListener a) {
        addEpBtn.addActionListener(a);
    }
    
    public void setID(String id) {
        ID.setText(id);
    }

    public void setMalLink(String link) {
        malLink.setText(link);
    }
    
    public void setAnidbLink(String link) {
        anidbLink.setText(link);
    }

    public void setAnimeName(String animeName) {
        name.setText(animeName);
    }

    private javax.swing.table.DefaultTableModel tblModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JButton addEpBtn;
    private javax.swing.JTextField anidbLink;
    private javax.swing.JButton editEpBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField malLink;
    private javax.swing.JTextField name;
    private javax.swing.JButton removeEpBtn;
    // End of variables declaration//GEN-END:variables
}
