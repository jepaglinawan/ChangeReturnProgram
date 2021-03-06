
import javax.swing.JOptionPane;

/* Change Return Program
The user enters a cost and then the amount of money given. The program will
figure out the change and the number of quarters, dimes, nickels, pennies
needed for the change. Contributor contributes a user interface and loop code of similar processes.
Programmer:             Victoria Brown
Date:                   September 2016
Contributor:            John Eric Paglinawan
Date:			November 2016
ChangeReturn.java    */

public class ChangeReturn_withInterface extends javax.swing.JFrame {
    // Variables
    private final double bill[]={100,50,20,10,5,1,0.25,0.10,0.05,0.01};
    private final String billinWords[]={
        "Hundred dollar bills", "Fifty dollar bills", "Twenty dollar bills",
        "Ten dollar bills", "Five dollar bills", "One dollar bills",
        "Quarters", "Dimes", "Nickels", "Pennies"
    };
    double amount = 0;
    int num = 0;
    int iteration = 0;
    
    /**
     * Creates new form MainChangeReturn
     */
    public ChangeReturn_withInterface() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtAGiven = new javax.swing.JTextField();
        jTxtCost = new javax.swing.JTextField();
        jBtnClear = new javax.swing.JButton();
        jBtnCompute = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtResult = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Return Program");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(405, 413));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Result History:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 190, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cost:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 100, 60, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Amount Given:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 140, 100, 30);

        jTxtAGiven.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTxtAGiven);
        jTxtAGiven.setBounds(130, 140, 240, 30);

        jTxtCost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTxtCost);
        jTxtCost.setBounds(130, 100, 240, 30);

        jBtnClear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtnClear.setText("Clear");
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnClear);
        jBtnClear.setBounds(160, 180, 100, 30);

        jBtnCompute.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtnCompute.setText("Compute");
        jBtnCompute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnComputeActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCompute);
        jBtnCompute.setBounds(270, 180, 100, 30);

        jTxtResult.setEditable(false);
        jTxtResult.setColumns(20);
        jTxtResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTxtResult.setRows(5);
        jScrollPane1.setViewportView(jTxtResult);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 220, 340, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 390);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnComputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnComputeActionPerformed
        double aGiven = Double.parseDouble(jTxtAGiven.getText().trim());
        double cost = Double.parseDouble(jTxtCost.getText().trim());
        // Greater Cost than Amount Given
        if (cost>aGiven) {
            JOptionPane.showMessageDialog(rootPane, "Your cost is greater than your given amount.","Error",JOptionPane.ERROR_MESSAGE);
        } else {
            iteration++;
            // Seperating Calculation(1) to Calculation(n) where n>1
            if (iteration>1) {
                System.out.println("");
            }
            
            // Print computation information
            jTxtResult.append("Computation ("+iteration+")\n");
            jTxtResult.append("Calculating "+aGiven+"-"+cost+"...\n");
            amount = aGiven-cost;
            jTxtResult.append("Remaining amount:"+amount+"\n\n");
            
            // Count the remaining amount in bills
            for (int i = 0; i < bill.length; i++) {
                num=0;
                if ((amount/bill[i]) >= 1) {
                    do {
                        num++;
                        amount -= bill[i];
                    } while ((amount/bill[i]) >= 1);
                    jTxtResult.append(billinWords[i]+": "+num+"\n");
                }
            }
        }
        
    }//GEN-LAST:event_jBtnComputeActionPerformed

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        // Clear Fields
        jTxtAGiven.setText("");
        jTxtCost.setText("");
        jTxtResult.setText("");
    }//GEN-LAST:event_jBtnClearActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeReturn_withInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeReturn_withInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeReturn_withInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeReturn_withInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeReturn_withInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnCompute;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtAGiven;
    private javax.swing.JTextField jTxtCost;
    private javax.swing.JTextArea jTxtResult;
    // End of variables declaration//GEN-END:variables
}
