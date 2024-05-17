package nezet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import modell.Asztal;
import modell.Bor;
import modell.Ital;
import modell.Sor;

public class GuiForm extends javax.swing.JFrame {
private Asztal asztal;
private Konzol konzol;
    public GuiForm() {
        initComponents();
        konzol = new Konzol();
        asztal = new Asztal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnAtmasol = new javax.swing.JButton();
        btnUjItal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuProgram = new javax.swing.JMenu();
        mnuBeolvas = new javax.swing.JMenuItem();
        mnuKilep = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        btnAtmasol.setText("Átmásol");
        btnAtmasol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtmasolActionPerformed(evt);
            }
        });

        btnUjItal.setText("új ital");
        btnUjItal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjItalActionPerformed(evt);
            }
        });

        jLabel1.setText("Asztalon lévő italok");

        jCheckBox1.setText("Átmozgat");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Italok");

        mnuProgram.setText("Program");

        mnuBeolvas.setText("Beolvas");
        mnuBeolvas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        mnuBeolvas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBeolvasActionPerformed(evt);
            }
        });
        mnuProgram.add(mnuBeolvas);

        mnuKilep.setText("Kilépés");
        mnuKilep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKilepActionPerformed(evt);
            }
        });
        mnuProgram.add(mnuKilep);

        jMenuBar1.add(mnuProgram);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnUjItal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAtmasol)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboBox1, 0, 108, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtmasol)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jCheckBox1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUjItal)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuKilepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKilepActionPerformed
        kilepes();
    }//GEN-LAST:event_mnuKilepActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        kilepes();
    }//GEN-LAST:event_formWindowClosing

    private void mnuBeolvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBeolvasActionPerformed
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("adar.ser"))) {
            asztal = (Asztal) ois.readObject();
            ArrayList<String> list = new ArrayList<>();
            
            for (Ital ital : asztal.getItalok()) {
                if(ital instanceof Sor){
                    list.add(ital.getNev()+ "(Sör)");
                }else if(ital instanceof Bor){
                    list.add(ital.getNev() + "(Bor)\n");
                }
            }
            jList1.setListData(list.toArray(new String [0]));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuiForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GuiForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(GuiForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_mnuBeolvasActionPerformed

    private void btnUjItalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjItalActionPerformed
        String nev = "Kadarka (Bor)";
        
        ListModel<String> elem = jList1.getModel();
        String [] uj = new String[elem.getSize()+1];
        for (int i = 0; i < elem.getSize(); i++) {
           uj[i] = elem.getElementAt(i);
        }
        uj[uj.length-1] = nev;
        jList1.setListData(uj);
    }//GEN-LAST:event_btnUjItalActionPerformed

    private void btnAtmasolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtmasolActionPerformed
        String kivalsaztott = jList1.getSelectedValue();
        jComboBox1.addItem(kivalsaztott);
        

    }//GEN-LAST:event_btnAtmasolActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
      String kivalasztottElem = jList1.getSelectedValue();
       int torlendoIdx =  jList1.getSelectedIndex();
       
       jComboBox1.addItem(kivalasztottElem);
       
       ListModel<String> before = jList1.getModel();
       String[] uj = new String[before.getSize() - 1];
       int fillIdx = 0;
        for (int i = 0; i < before.getSize(); i++) {
            if (i != torlendoIdx) {
                uj[fillIdx++] = before.getElementAt(i);              
            }
        }
        
        jList1.setListData(uj);
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    private void kilepes() {
        String cim = "KILÉPÉS";
        String msg = "Biztos hogy kilép?";
        int gombok = JOptionPane.OK_CANCEL_OPTION;
        int gomb = JOptionPane.showConfirmDialog(rootPane, msg, cim, gombok);
               if(gomb == JOptionPane.OK_OPTION){
                   this.dispose();
               }}

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
            java.util.logging.Logger.getLogger(GuiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtmasol;
    private javax.swing.JButton btnUjItal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuBeolvas;
    private javax.swing.JMenuItem mnuKilep;
    private javax.swing.JMenu mnuProgram;
    // End of variables declaration//GEN-END:variables

}
