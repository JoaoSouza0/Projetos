/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Joao victor
 */
public class Calculadora0 extends javax.swing.JFrame {
   String n, oldv="" ,newval, conta = "0", cn="0";
   
   int numero1 , numero2, result;
    
    /**
     * Creates new form Calculadora0
     */
    public Calculadora0() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jMenu1 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        label1 = new java.awt.Label();
        panel1 = new java.awt.Panel();
        canvas1 = new java.awt.Canvas();
        Show = new javax.swing.JLabel();
        Label = new javax.swing.JLabel();
        jFrame3 = new javax.swing.JFrame();
        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        N01 = new javax.swing.JButton();
        N2 = new javax.swing.JButton();
        N4 = new javax.swing.JButton();
        N5 = new javax.swing.JButton();
        N6 = new javax.swing.JButton();
        N7 = new javax.swing.JButton();
        N8 = new javax.swing.JButton();
        N9 = new javax.swing.JButton();
        Equal = new javax.swing.JButton();
        N1 = new javax.swing.JButton();
        N10 = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        sum = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        division = new javax.swing.JButton();
        N3 = new javax.swing.JButton();
        label = new javax.swing.JTextField();
        Show2 = new javax.swing.JTextField();
        apagar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");
        jLabel1.setEnabled(false);

        jTextPane1.setEnabled(false);
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        label1.setText("label1");

        Show.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addComponent(Show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(Label)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Show, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Body");
        setBackground(new java.awt.Color(255, 255, 255));

        N01.setText("1");
        N01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N01ActionPerformed(evt);
            }
        });

        N2.setText("2");
        N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N2ActionPerformed(evt);
            }
        });

        N4.setText("4");
        N4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N4ActionPerformed(evt);
            }
        });

        N5.setText("5");
        N5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N5ActionPerformed(evt);
            }
        });

        N6.setText("6");
        N6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N6ActionPerformed(evt);
            }
        });

        N7.setText("7");
        N7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N7ActionPerformed(evt);
            }
        });

        N8.setText("8");
        N8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N8ActionPerformed(evt);
            }
        });

        N9.setText("9");
        N9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N9ActionPerformed(evt);
            }
        });

        Equal.setText("=");
        Equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualActionPerformed(evt);
            }
        });

        N1.setText("C");
        N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N1ActionPerformed(evt);
            }
        });

        N10.setText("0");
        N10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N10ActionPerformed(evt);
            }
        });

        multiply.setText("x");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        sum.setText("+");
        sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
            }
        });

        subtract.setText("-");
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });

        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        N3.setText("3");
        N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N3ActionPerformed(evt);
            }
        });

        label.setEnabled(false);
        label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelActionPerformed(evt);
            }
        });

        Show2.setEnabled(false);
        Show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show2ActionPerformed(evt);
            }
        });

        apagar.setText("<X");
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label)
                    .addComponent(Show2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(N01, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(N10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(N3, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                    .addComponent(Equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(N5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(N6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(N7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(N8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(N9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subtract, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(division, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(multiply, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(sum, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(apagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Show2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(N7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(N01, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Equal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualActionPerformed
        // TODO add your handling code here:
        switch (conta) {

        case "+":
          numero2 = Integer.valueOf(Show2.getText());
          result = numero1 + numero2;
          msg();
        break;
        
        case "-":
          numero2 = Integer.valueOf(Show2.getText());
          result = numero1 - numero2;
         msg();
        break;
        case "/":
          numero2 = 
          result = numero1 / numero2;
          msg();
        break;
        case "*":
          numero2 = Integer.valueOf(Show2.getText());
          result = numero1 * numero2;
          msg();
        break;
        case "0":
          n = Show2.getText();
          label.setText(n+" ="); 
          Show2.setText(""); 
        break;
        }
        
    }//GEN-LAST:event_EqualActionPerformed
 public void msg(){
 label.setText(String.valueOf(numero1 +" "+conta+" "+numero2+" ="));
 Show2.setText(String.valueOf(result));
 conta ="0";
 cn="1";
 }
 
    
    public void takenumber (String numero)
    {     
        switch(cn){
        case "1":      
        n = numero;
        oldv = Show2.getText();
        Show2.setText(n);
        label.setText("");
        cn="0";
        
        break;
        default:
        n = numero;
        oldv = Show2.getText();
        Show2.setText(oldv+""+ n);
        break;
        }
    }
    
   public void Dcont (String wich){
   
        conta = wich;
        oldv = Show2.getText();
        
      switch (oldv) {
      case "":
         label.setText(n+" "+wich); 
         Show2.setText(""); 
      break;
       default:
        numero1 = Integer.valueOf(oldv); 
        label.setText(oldv+" "+wich);
        Show2.setText("");
        }
   }
            
    private void N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N1ActionPerformed
        // TODO add your handling code here:
        label.setText("");
        Show2.setText("");
    }//GEN-LAST:event_N1ActionPerformed

    private void N10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N10ActionPerformed
        takenumber("0");        // TODO add your handling code here:
    }//GEN-LAST:event_N10ActionPerformed

    private void N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N2ActionPerformed
        takenumber("2");   
    
           // TODO add your handling code here:
    }//GEN-LAST:event_N2ActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        Dcont("*");        // TODO add your handling code here:
    }//GEN-LAST:event_multiplyActionPerformed

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumActionPerformed
        // TODO add your handling code here:
       Dcont("+");
       
    }//GEN-LAST:event_sumActionPerformed

    private void N01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N01ActionPerformed
        takenumber("1");        // TODO add your handling code here:
     
        
    }//GEN-LAST:event_N01ActionPerformed

    private void N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N3ActionPerformed
        takenumber("3");     
    }//GEN-LAST:event_N3ActionPerformed

    private void N4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N4ActionPerformed
        takenumber("4");        // TODO add your handling code here:
      
    }//GEN-LAST:event_N4ActionPerformed

    private void N9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N9ActionPerformed
        // TODO add your handling code here:
        takenumber("9");
        
    }//GEN-LAST:event_N9ActionPerformed

    private void N5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N5ActionPerformed
       takenumber("5"); // TODO add your handling code here:
    }//GEN-LAST:event_N5ActionPerformed

    private void N6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N6ActionPerformed
       takenumber("6");        // TODO add your handling code here:
    }//GEN-LAST:event_N6ActionPerformed

    private void N7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N7ActionPerformed
        takenumber("7");        // TODO add your handling code here:
    }//GEN-LAST:event_N7ActionPerformed

    private void N8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N8ActionPerformed
        takenumber("8");        // TODO add your handling code here:
    }//GEN-LAST:event_N8ActionPerformed

    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformed
         Dcont("-");        // TODO add your handling code here:
    }//GEN-LAST:event_subtractActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        Dcont("/");        // TODO add your handling code here:
    }//GEN-LAST:event_divisionActionPerformed

    private void labelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelActionPerformed

    private void Show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Show2ActionPerformed

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed
        // TODO add your handling code here:
        int clean;
        oldv = Show2.getText();
        clean = Integer.valueOf(oldv);
        oldv = String.valueOf(clean/10)
                ;
        if( !"0".equals(oldv))
        {
        Show2.setText(oldv+"");
        }else
        {  
        label.setText("");
        Show2.setText("");
        }
        
        
        
    }//GEN-LAST:event_apagarActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora0().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Equal;
    private javax.swing.JLabel Label;
    private javax.swing.JButton N01;
    private javax.swing.JButton N1;
    private javax.swing.JButton N10;
    private javax.swing.JButton N2;
    private javax.swing.JButton N3;
    private javax.swing.JButton N4;
    private javax.swing.JButton N5;
    private javax.swing.JButton N6;
    private javax.swing.JButton N7;
    private javax.swing.JButton N8;
    private javax.swing.JButton N9;
    private javax.swing.JLabel Show;
    private javax.swing.JTextField Show2;
    private javax.swing.JButton apagar;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton division;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField label;
    private java.awt.Label label1;
    private javax.swing.JButton multiply;
    private java.awt.Panel panel1;
    private javax.swing.JButton subtract;
    private javax.swing.JButton sum;
    // End of variables declaration//GEN-END:variables
}