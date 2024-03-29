package boliNacinApstraktnaKlasa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author student2
 */
public class KafeAparatForm extends javax.swing.JFrame {

    private int price;
    private int change;

    /**
     * Creates new form KafeAparatForm
     */
    public KafeAparatForm() {
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

        btnKapucino = new javax.swing.JButton();
        btnMocca = new javax.swing.JButton();
        btnNes = new javax.swing.JButton();
        btn3u1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIznos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtKusur = new javax.swing.JTextField();
        btnKusur = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtStrukturaKusura = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKapucino.setText("Kapucino 120din");
        btnKapucino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKapucinoActionPerformed(evt);
            }
        });

        btnMocca.setText("Mocca 140din");
        btnMocca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoccaActionPerformed(evt);
            }
        });

        btnNes.setText("Nes 150din");
        btnNes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNesActionPerformed(evt);
            }
        });

        btn3u1.setText("3u1 80din");
        btn3u1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3u1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Iznos");

        jLabel2.setText("Kusur:");

        btnKusur.setText("Vrati kusur");
        btnKusur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKusurActionPerformed(evt);
            }
        });

        txtStrukturaKusura.setColumns(20);
        txtStrukturaKusura.setRows(5);
        jScrollPane1.setViewportView(txtStrukturaKusura);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnKapucino, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(btnMocca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn3u1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIznos, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKusur, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKusur, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnKapucino)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtIznos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnMocca)
                        .addGap(12, 12, 12)
                        .addComponent(btnNes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtKusur, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btn3u1)
                .addGap(22, 22, 22)
                .addComponent(btnKusur, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKapucinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKapucinoActionPerformed
        // TODO add your handling code here:
        price = 120;
        calculateChange();

    }//GEN-LAST:event_btnKapucinoActionPerformed

    private void btnMoccaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoccaActionPerformed
        // TODO add your handling code here:
        price = 140;
        calculateChange();
    }//GEN-LAST:event_btnMoccaActionPerformed

    private void btnNesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNesActionPerformed
        // TODO add your handling code here:
        price = 150;
        calculateChange();
    }//GEN-LAST:event_btnNesActionPerformed

    private void btn3u1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3u1ActionPerformed
        // TODO add your handling code here:
        price = 80;
        calculateChange();
    }//GEN-LAST:event_btn3u1ActionPerformed

    private void btnKusurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKusurActionPerformed
        // TODO add your handling code here:
        AbstractHandler handler50 = new Handler50();
        AbstractHandler handler20 = new Handler20();
        AbstractHandler handler10 = new Handler10();
        AbstractHandler handler5 = new Handler5();
        AbstractHandler handler2 = new Handler2();
        AbstractHandler handler1 = new Handler1();
        
        Zahtev z = new Zahtev(change);
        
        handler50.setNext(handler20);
        handler20.setNext(handler10);
        handler10.setNext(handler5);
        handler5.setNext(handler2);
        handler2.setNext(handler1);
        
        handler50.vratiKusur(z);
        
//        System.out.println(z.getTxt());
        txtStrukturaKusura.setText(z.getTxt());
        
        
        
    }//GEN-LAST:event_btnKusurActionPerformed

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
            java.util.logging.Logger.getLogger(KafeAparatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KafeAparatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KafeAparatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KafeAparatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KafeAparatForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn3u1;
    private javax.swing.JButton btnKapucino;
    private javax.swing.JButton btnKusur;
    private javax.swing.JButton btnMocca;
    private javax.swing.JButton btnNes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtIznos;
    private javax.swing.JTextField txtKusur;
    private javax.swing.JTextArea txtStrukturaKusura;
    // End of variables declaration//GEN-END:variables

    private void calculateChange() {
        
        final Integer iznos = Integer.parseInt(txtIznos.getText().trim());
        change = iznos - price;
        txtKusur.setText(String.valueOf(change));
        
        
        
    }

}
