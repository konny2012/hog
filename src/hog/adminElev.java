/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hog;


import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Jamie
 */
public class adminElev extends javax.swing.JFrame {

    private InfDB idb;
    UpdateCombobox swag;
    /**
     * Creates new form adminElev
     */
    public adminElev() {
        initComponents();
        try {
            idb = new InfDB("C:\\db\\HOGDB.FDB");
        } catch (InfException undantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTillbaka = new javax.swing.JButton();
        btnAddElev = new javax.swing.JButton();
        btnChangeElev = new javax.swing.JButton();
        btnDeleteElev = new javax.swing.JButton();
        txtFaltFornamn = new javax.swing.JTextField();
        txtFaltEfternamn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAndraPrefekt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSvar = new javax.swing.JTextArea();
        cboxElevhem = new javax.swing.JComboBox<>();
        cboxSovsal = new javax.swing.JComboBox<>();
        swag.cboxAddSovsal(cboxSovsal);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTillbaka.setText("Gå Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnAddElev.setText("Registrera Elev");
        btnAddElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddElevActionPerformed(evt);
            }
        });

        btnChangeElev.setText("Ändra Elevinfo");
        btnChangeElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeElevActionPerformed(evt);
            }
        });

        btnDeleteElev.setText("Ta bort Elev");
        btnDeleteElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteElevActionPerformed(evt);
            }
        });

        txtFaltFornamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaltFornamnActionPerformed(evt);
            }
        });

        jLabel1.setText("Förnamn");

        jLabel2.setText("Efternamn");

        jLabel3.setText("Sovsal");

        btnAndraPrefekt.setText("Ändra Prefekt");
        btnAndraPrefekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraPrefektActionPerformed(evt);
            }
        });

        txtSvar.setEditable(false);
        txtSvar.setColumns(20);
        txtSvar.setRows(5);
        jScrollPane1.setViewportView(txtSvar);

        cboxElevhem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Slytherin", "Hufflepuff", "Gryffindor", "Ravenclaw" }));
        cboxElevhem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxElevhemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnChangeElev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAndraPrefekt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTillbaka, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddElev, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteElev, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFaltFornamn, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFaltEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cboxSovsal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboxElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnAddElev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteElev))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFaltFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFaltEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxSovsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAndraPrefekt)
                    .addComponent(cboxElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChangeElev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new adminStart().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnChangeElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeElevActionPerformed
        new adminElevInfo().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnChangeElevActionPerformed

    private void btnAddElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddElevActionPerformed
        try {
            String fornamn = txtFaltFornamn.getText();
            String efternamn = txtFaltEfternamn.getText();
            String sovsal = (String) cboxSovsal.getSelectedItem();

            if (validering.txtFieldEmpty(txtFaltFornamn) && validering.txtFieldEmpty(txtFaltEfternamn)) {
                if(validering.isString(txtFaltFornamn) && validering.isString(txtFaltEfternamn)) {
                    String increment = idb.getAutoIncrement("ELEV", "ELEV_ID");
                    System.out.println(increment);
                    String fraga = "INSERT INTO ELEV VALUES (" + "" + increment + " " + ", '" + fornamn + "', '" + efternamn + "', '" + sovsal + "');";
                    System.out.println(fraga);
                    idb.insert(fraga);

                txtSvar.setText("En ny elev har registrerats");
                txtFaltFornamn.setText(null);
                txtFaltEfternamn.setText(null);
                swag.cboxAddSovsal(cboxSovsal);
                }
            }
        } catch (InfException undantag) { //om databasen inte hittas så kommer ett felmeddelande upp
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
    }//GEN-LAST:event_btnAddElevActionPerformed

    private void txtFaltFornamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaltFornamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaltFornamnActionPerformed

    private void btnDeleteElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteElevActionPerformed
        try {
            String fornamn = txtFaltFornamn.getText();
            String efternamn = txtFaltEfternamn.getText();

            String fraga = "Delete from ELEV where FORNAMN = '" + fornamn + "' AND EFTERNAMN = '" + efternamn + "'; "; //Tar bort raden med givet för- och efternamn.
            idb.delete(fraga); //Uppdaterar databasen.
            txtSvar.setText(fornamn + " " + efternamn + " har tagits bort");
            txtFaltFornamn.setText(null);
            txtFaltEfternamn.setText(null);

        } catch (InfException undantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
    }//GEN-LAST:event_btnDeleteElevActionPerformed

    private void cboxElevhemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxElevhemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxElevhemActionPerformed

    private void btnAndraPrefektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraPrefektActionPerformed

        //Validering som kollar att eleven är med i det elevhem som hen ska bli prefekt i
        try {
            String itemText = (String) cboxElevhem.getSelectedItem(); //Tar det valda värdet ur comboxboxen och sätter det i en sträng
            String fornamn = txtFaltFornamn.getText();
            String efternamn = txtFaltEfternamn.getText();
            
            if(validering.txtFieldEmpty(txtFaltFornamn) && validering.txtFieldEmpty(txtFaltEfternamn)) {
                if(validering.isString(txtFaltFornamn) && validering.isString(txtFaltEfternamn)) {
                    
                String fraga = "SELECT ELEV_ID FROM ELEV WHERE FORNAMN = '" + fornamn + "' AND EFTERNAMN = '" + efternamn + "'; ";
                String elevid = idb.fetchSingle(fraga);
                
                //kollar att personen är med i elevhemmet den ska bli prefekt i
                //String arMedElevhem = idb.fetchSingle("SELECT ELEV.ELEV_ID FROM ELEV JOIN SOVSAL ON SOVSAL.SOVSAL_ID = ELEV.SOVSAL JOIN ELEVHEM ON SOVSAL.ELEVHEM = ELEVHEM.ELEVHEM_ID WHERE ELEVHEMSNAMN = '" + itemText + "' ");
                //if() {

                fraga = "UPDATE ELEVHEM SET PREFEKT = '" + elevid + "' WHERE ELEVHEMSNAMN = '" + itemText + "';";
                System.out.println(fraga);
                idb.update(fraga);
                txtSvar.setText("En ny prefekt har registrerats");
                //} else {
                
                //}
                }
            }
        }
        catch (InfException undantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
    }//GEN-LAST:event_btnAndraPrefektActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddElev;
    private javax.swing.JButton btnAndraPrefekt;
    private javax.swing.JButton btnChangeElev;
    private javax.swing.JButton btnDeleteElev;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cboxElevhem;
    private javax.swing.JComboBox<String> cboxSovsal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFaltEfternamn;
    private javax.swing.JTextField txtFaltFornamn;
    private javax.swing.JTextArea txtSvar;
    // End of variables declaration//GEN-END:variables
}
