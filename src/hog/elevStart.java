/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hog;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Christoffer
 */
public class elevStart extends javax.swing.JFrame {
    
    private InfDB idb;
    private validering val;

    /**
     * Creates new form elevStart
     */
    public elevStart() {
        initComponents();
        
        try {
            idb = new InfDB("C:\\Users\\Christoffer\\Documents\\NetBeansProjects\\Realisering\\HOGDB.FDB");
        }
        catch(InfException undantag) {
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

        btnElevhem = new javax.swing.JButton();
        btnLarareDatum = new javax.swing.JButton();
        cboxElevhem = new javax.swing.JComboBox<>();
        btnTillbaka = new javax.swing.JButton();
        btnSokElev = new javax.swing.JButton();
        btnPokal = new javax.swing.JButton();
        btnPrefekt = new javax.swing.JButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        txtNamn = new javax.swing.JTextField();
        svar = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnElevhem.setText("Visa elever i");
        btnElevhem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElevhemActionPerformed(evt);
            }
        });

        btnLarareDatum.setText("Visa lärares kurser");

        cboxElevhem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Slytherin", "Hufflepuff", "Gryffindor", "Ravenclaw" }));
        cboxElevhem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxElevhemActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Gå Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnSokElev.setText("Sök elevbetyg");
        btnSokElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokElevActionPerformed(evt);
            }
        });

        btnPokal.setText("Elevhemspokalen");

        btnPrefekt.setText("Visa prefekt i");
        btnPrefekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrefektActionPerformed(evt);
            }
        });

        svar.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTillbaka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPokal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnElevhem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSokElev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLarareDatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPrefekt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboxElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(svar, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnElevhem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrefekt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cboxElevhem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSokElev)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLarareDatum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPokal)
                        .addGap(125, 125, 125)
                        .addComponent(btnTillbaka))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jXDatePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(jXDatePicker2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(svar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnElevhemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElevhemActionPerformed
        String itemText = (String)cboxElevhem.getSelectedItem( ); //Tar det valda värdet ur comboxboxen och sätter det i en sträng  
        try {
        
            String fraga = "SELECT ELEV.FORNAMN FROM SOVSAL JOIN ELEV ON ELEV.SOVSAL = SOVSAL.SOVSAL_ID JOIN ELEVHEM ON ELEVHEM.ELEVHEM_ID = SOVSAL.ELEVHEM WHERE ELEVHEMSNAMN= '" + itemText + "'";
            ArrayList<String> fornamn = idb.fetchColumn(fraga);
            
            fraga = "SELECT ELEV.EFTERNAMN FROM SOVSAL JOIN ELEV ON ELEV.SOVSAL = SOVSAL.SOVSAL_ID JOIN ELEVHEM ON ELEVHEM.ELEVHEM_ID = SOVSAL.ELEVHEM WHERE ELEVHEMSNAMN= '" + itemText + "'";
            ArrayList<String> efternamn = idb.fetchColumn(fraga);
            
            String svaret = "";
            
            for (int i = 0; i < fornamn.size(); i++) {
                svaret += fornamn.get(i) + " " + efternamn.get(i) + " " + "\n";
                
            }
            svar.setText(svaret);
            System.out.println(svaret);
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
        
    }//GEN-LAST:event_btnElevhemActionPerformed

    private void cboxElevhemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxElevhemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxElevhemActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new valElevLarare().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnPrefektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrefektActionPerformed
        String itemText = (String)cboxElevhem.getSelectedItem( ); //Tar det valda värdet ur comboxboxen och sätter det i en sträng
        try {
        
            String fraga = "SELECT ELEV.FORNAMN FROM ELEVHEM JOIN ELEV ON ELEV.ELEV_ID = ELEVHEM.PREFEKT WHERE ELEVHEM.ELEVHEMSNAMN= '" + itemText + "'";
            ArrayList<String> fornamn = idb.fetchColumn(fraga);
            
            fraga = "SELECT ELEV.EFTERNAMN FROM ELEVHEM JOIN ELEV ON ELEV.ELEV_ID = ELEVHEM.PREFEKT WHERE ELEVHEM.ELEVHEMSNAMN= '" + itemText + "'";
            ArrayList<String> efternamn = idb.fetchColumn(fraga);
            
            String svaret = "";
            
            for (int i = 0; i < fornamn.size(); i++) {
                svaret += fornamn.get(i) + " " + efternamn.get(i) + " " + "\n";
                
            }
            svar.setText(svaret);
            System.out.println(svaret);
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }

    }//GEN-LAST:event_btnPrefektActionPerformed

    private void btnSokElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokElevActionPerformed
        try {
        String namn = txtNamn.getText(); //Tar indatan och sätter det till en string
        String fornamn = namn.split(" ")[0]; //Delar upp för och efternamn
        String efternamn = namn.substring(namn.indexOf(" ")+1).split(" ")[0]; //Tar bort alla mellanslag om man råkar skriva ett efter
        System.out.println(namn);//Internt test
        System.out.println(fornamn);//Internt test
        System.out.println(efternamn);//Internt test
        //Gör en sql fråga där programmet söker efter det inskrivna namnet i databasen för att se vilka kurser som eleven läser
        String fraga = "SELECT KURS.KURSNAMN FROM ELEV JOIN HAR_BETYG_I ON HAR_BETYG_I.ELEV_ID = ELEV.ELEV_ID JOIN KURS ON KURS.KURS_ID = HAR_BETYG_I.KURS_ID WHERE ELEV.FORNAMN = '" + fornamn + "' AND ELEV.EFTERNAMN = '" + efternamn + "' ";
        ArrayList<String> kurs = idb.fetchColumn(fraga);
        //Gör en sql fråga där programmet söker efter det inskrivna namnet i databasen för att se vilka betyg som en elev har
        fraga = "SELECT HAR_BETYG_I.KURSBETYG FROM ELEV JOIN HAR_BETYG_I ON HAR_BETYG_I.ELEV_ID = ELEV.ELEV_ID JOIN KURS ON KURS.KURS_ID = HAR_BETYG_I.KURS_ID WHERE ELEV.FORNAMN = '" + fornamn + "' AND ELEV.EFTERNAMN = '" + efternamn + "' ";
        ArrayList<String> betyg = idb.fetchColumn(fraga);
        //Implementera översättning av betyg från en bokstav till ett ord med hjälp av BETYG tabellen
        String svaret = "";
        
        for(int i =0; i<betyg.size(); i++) {
            svaret += betyg.get(i) + " i kursen " + kurs.get(i) + " " + "\n";
            }
        
        svar.setText(svaret);
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());            
        }
    }//GEN-LAST:event_btnSokElevActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElevhem;
    private javax.swing.JButton btnLarareDatum;
    private javax.swing.JButton btnPokal;
    private javax.swing.JButton btnPrefekt;
    private javax.swing.JButton btnSokElev;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cboxElevhem;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private java.awt.TextArea svar;
    private javax.swing.JTextField txtNamn;
    // End of variables declaration//GEN-END:variables
}
