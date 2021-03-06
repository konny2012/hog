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
public class adminKurs extends javax.swing.JFrame {

    private InfDB idb;
    UpdateCombobox updateCBox;

    /**
     * Creates new form adminKurs
     */
    public adminKurs() {
        initComponents();
        idb = Hog.idb; //Importerar databasen

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
        btnNyKurs = new javax.swing.JButton();
        btnChangeKurs = new javax.swing.JButton();
        btnTaBortKurs = new javax.swing.JButton();
        cboxKurs = new javax.swing.JComboBox<>();
        updateCBox.cboxAddKurs(cboxKurs);
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTillbaka.setText("Gå Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnNyKurs.setText("Lägg Till Kurs");
        btnNyKurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyKursActionPerformed(evt);
            }
        });

        btnChangeKurs.setText("Ändra Kurs");
        btnChangeKurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeKursActionPerformed(evt);
            }
        });

        btnTaBortKurs.setText("Ta bort kurs");
        btnTaBortKurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortKursActionPerformed(evt);
            }
        });

        jLabel1.setText("Välj en kurs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTillbaka)
                    .addComponent(btnNyKurs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChangeKurs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTaBortKurs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cboxKurs, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNyKurs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChangeKurs)
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaBortKurs)
                    .addComponent(cboxKurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Öppnar upp en ny ruta och stänger den gamla
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new adminStart().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    //Öppnar upp en ny ruta och stänger den gamla
    private void btnNyKursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyKursActionPerformed
        new adminKursAdd().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNyKursActionPerformed

    //Öppnar upp en ny ruta och stänger den gamla
    private void btnChangeKursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeKursActionPerformed
        new adminKursChange().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnChangeKursActionPerformed

    private void btnTaBortKursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortKursActionPerformed
        //Deklarerar variabler
        String valdkurs1 = (String) cboxKurs.getSelectedItem();
        String harbetygi = null;
        String registreradpa = null;
        String kursid = null;

        try { //Skapar SQL fråga som hämtar kursID från databasen
            System.out.println(valdkurs1);
            String fraga = "SELECT KURS_ID FROM KURS WHERE KURSNAMN = '" + valdkurs1 + "';";
            System.out.println(fraga);
            kursid = idb.fetchSingle(fraga);
            System.out.println(kursid);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Kunde ej hitta den angivna kursens id");
        }
        try { //Skapar SQL fråga som hämtar kursID från databasen
            harbetygi = idb.fetchSingle("SELECT KURS_ID FROM HAR_BETYG_I WHERE KURS_ID = " + kursid);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
        try { //Skapar SQL  fråga som hämtar kursID från databasen
            registreradpa = idb.fetchSingle("SELECT KURS_ID FROM REGISTRERAD_PA WHERE KURS_ID = " + kursid);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
        if (validering.kollaStringVarde(harbetygi)) { //Kollar om harbetygi innehåller ett värde
            try { //Försöker ta bort raden med givet kursID
                idb.delete("DELETE FROM HAR_BETYG_I WHERE KURS_ID = " + kursid);
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
            }
        }
        if (validering.kollaStringVarde(registreradpa)) { //Kollar om harbetygi innehåller ett värde
            try {  //Försöker ta bort raden med givet kursID
                idb.delete("DELETE FROM REGISTRERAD_PA WHERE KURS_ID = " + kursid);
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
            }
        }
        try {  //Försöker ta bort raden med givet kursID
            idb.delete("DELETE FROM KURS WHERE KURS_ID = " + kursid);
            JOptionPane.showMessageDialog(null, "Kursen har tagits bort");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Kunde ej ta bort angiven kurs");
        }
    }//GEN-LAST:event_btnTaBortKursActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeKurs;
    private javax.swing.JButton btnNyKurs;
    private javax.swing.JButton btnTaBortKurs;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cboxKurs;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
