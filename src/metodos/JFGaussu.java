/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;


public class JFGaussu extends javax.swing.JFrame implements TableModelListener {

    JFDatos r = new JFDatos();

    // Definimos tres arreglos para guardar los datos de la tabla 
    
    double A[][]= new double[JFDatos.numFilasMatriz][JFDatos.numColumnasMatriz];
    double X[]= new double[JFDatos.numFilasMatriz];
    double C[]= new double[JFDatos.numFilasMatriz];
    double aux[]=new double[JFDatos.numFilasMatriz];
      double aux2[]=new double[JFDatos.numFilasMatriz];
       double aux3[]=new double[JFDatos.numFilasMatriz];
      // double errores[]=new double[JFDatos.numIteraciones-1];
      String MatrizF[][]= new String[JFDatos.numFilasMatriz][JFDatos.numIteraciones];
  
         
    /**
     * Creates new form JFMetJacobiU3MetNum
     */
    public JFGaussu() {
        initComponents();
        //Definir que la ventana aparezca desde el centro de la pantalla...
        setLocationRelativeTo(this);
        //Definimos las dimensiones de las tablas A, X y C (Vectores resultantes del problema)...
        String[] titulos = new String[JFDatos.numColumnasMatriz];
        for (int contador = 0; contador < JFDatos.numFilasMatriz; contador++) {

            titulos[contador] = "X" + (contador + 1);
        }
        String[] x = new String[1];
        x[0] = "X";
        String[] c = new String[1];
        c[0] = "C";

        frmTablaAbs modelo = new frmTablaAbs(r.datos, titulos);
        frmTablaAbs modelo2 = new frmTablaAbs(r.datos, x);
        frmTablaAbs modelo3 = new frmTablaAbs(r.datos, c);
        //DefaultTableModel  x = new DefaultTableModel(5,6);
        jTable1.setModel(modelo);
        jTable2.setModel(modelo2);
        //jTable3.setModel(modelo3);
        
       jTable4.setModel(tabla);

    }

  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setAutoscrolls(true);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel4.setText("MATRIZ  A");

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
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel5.setText(" MATRIZ X(0)");

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosmodulometjacobi/Impresora-icon.png"))); // NOI18N
        jButton1.setText("CALCULAR ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        jLabel7.setText("RESULTADOS:");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosmodulometjacobi/metodo fr gauss.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(13, 13, 13))))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(46, 46, 46)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
        
        for (int fil = 0; fil < JFDatos.numFilasMatriz; fil++) {

            for (int col = 0; col < JFDatos.numColumnasMatriz; col++) {
                    String  test= (String) jTable1.getValueAt(fil, col);
                this.A[fil][col]=Double.parseDouble(test); 
                System.out.print( this.A[fil][col]+ ", ");
                 // System.out.print( test+ ", ");
            }
            System.out.println();
        }
        System.out.println();

        for (int fil = 0; fil < JFDatos.numFilasMatriz; fil++) {
                String  test= (String) jTable2.getValueAt(fil, 0);
                this.X[fil]=Double.parseDouble(test);
            System.out.print(this.X[fil] + ", ");
        }
          System.out.println();
     
        System.out.println();
        System.out.println("----------------------");
     

         System.out.println();
        this.aux= met.multVect(A, X, X);
        this.aux2= met.multVect(A, X, X);
        for(int id= 0; id< JFDatos.numIteraciones; id++)
       {
         
             for(int pas= 0; pas <  JFDatos.numFilasMatriz; pas++)
             {
               this.aux3[pas]= this.aux[pas];
       
                 this.MatrizF[pas][id]= String.valueOf(this.aux2[pas]);
                 // linea donde se imprimen los datos
                  System.out.print( aux2[pas]  +" ," );  
           
             

               
            
             }
              
             this.aux2=  met.multVect(A, this.aux3, X);  
            // solo lo imprime de manera horizontal
              System.out.println();
       }
         System.out.println("------------");
         for(int id= 0; id< JFDatos.numFilasMatriz; id++)
       {
         
             for(int pas= 0; pas <  JFDatos.numIteraciones; pas++)
             {
               
             System.out.print(this.MatrizF[id][pas]+" | ");
             }
           System.out.println();
       }
        
         jTable4.setModel(new DefaultTableModel(MatrizF, tabla.generador('R',JFDatos.numFilasMatriz,JFDatos.numIteraciones) ));
        
          System.out.println("IMPRESION DE ERRORES-----");
         //error
        /** this.errores=met.CalcularError(this.A);
         for (int i=0; i<(JFPreDatoMetJacobiU3MetNum.numIteraciones-1); i++)
         {
         System.out.print(this.errores[i]+" ,");
         }
       **/
         //jTable4.setModel(new  DefaultTableModel);
        
        
      
          
          // TableColumn c=jTable4.getColumnModel().getColumn(1);
           
         
              /* JComboBox combo=new JComboBox(xd);        
             TableColumn c = jTable4.getColumnModel().getColumn(1);
              TableCellEditor tce= new DefaultCellEditor(combo);
                c.setCellEditor(tce);*/
         System.out.println();
       }
       
      
    
    
       
       
       
    
       catch (Exception ex)
               {
               
               JOptionPane.showMessageDialog(null, "HUBO UN ERROR AL PROCESAR LOS DATOS :("+ex);
               }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        JFDatos ventana=new JFDatos();
        ventana.show();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(JFGaussu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGaussu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGaussu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGaussu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGaussu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void tableChanged(TableModelEvent e) {
        for (int contador = 0; contador < JFDatos.numFilasMatriz; contador++) {
            for (int contador1 = 0; contador1 < JFDatos.numColumnasMatriz; contador1++) {
                jTable1.setValueAt(jTable1.getValueAt(contador, contador1), contador, contador1);
            }
        }
    }
    JFDatos im = new JFDatos();
clsMetodos  met=new  clsMetodos ();
ValoreDe_Tabla tabla=new ValoreDe_Tabla('R',JFDatos.numFilasMatriz,JFDatos.numIteraciones);
}
