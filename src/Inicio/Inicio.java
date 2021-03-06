/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import Caficultor.CaficultorFRM;
import Ciudad.CiudadFRM;
import Producto.ProductoFRM;

/**
 *
 * @author cadefihuilaltda
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        cmbCaficultores = new javax.swing.JButton();
        cmbProductos = new javax.swing.JButton();
        cmbUbicacion = new javax.swing.JButton();
        cmbOfertas = new javax.swing.JButton();
        cmbSalir = new javax.swing.JButton();
        cmbOfertasAplicadas1 = new javax.swing.JButton();

        setTitle("Ofertas de Café a Futuro");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImages(null);

        cmbCaficultores.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmbCaficultores.setForeground(new java.awt.Color(102, 0, 0));
        cmbCaficultores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caficultor.jpg"))); // NOI18N
        cmbCaficultores.setText(" Caficultores");
        cmbCaficultores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        cmbCaficultores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCaficultoresActionPerformed(evt);
            }
        });

        cmbProductos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmbProductos.setForeground(new java.awt.Color(102, 0, 0));
        cmbProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pepa_cafe.jpg"))); // NOI18N
        cmbProductos.setText(" Productos");
        cmbProductos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        cmbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductosActionPerformed(evt);
            }
        });

        cmbUbicacion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmbUbicacion.setForeground(new java.awt.Color(102, 0, 0));
        cmbUbicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ubicacion.png"))); // NOI18N
        cmbUbicacion.setText(" Ciudades");
        cmbUbicacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        cmbUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUbicacionActionPerformed(evt);
            }
        });

        cmbOfertas.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmbOfertas.setForeground(new java.awt.Color(102, 0, 0));
        cmbOfertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ofertas.png"))); // NOI18N
        cmbOfertas.setText(" Ofertas");
        cmbOfertas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));

        cmbSalir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmbSalir.setForeground(new java.awt.Color(102, 0, 0));
        cmbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        cmbSalir.setText(" Salir");
        cmbSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        cmbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSalirActionPerformed(evt);
            }
        });

        cmbOfertasAplicadas1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmbOfertasAplicadas1.setForeground(new java.awt.Color(102, 0, 0));
        cmbOfertasAplicadas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ofertas_aplicadas.png"))); // NOI18N
        cmbOfertasAplicadas1.setText(" Ofertas  Aplicadas"); // NOI18N
        cmbOfertasAplicadas1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCaficultores, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addComponent(cmbOfertasAplicadas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmbUbicacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addComponent(cmbOfertas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCaficultores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbOfertas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOfertasAplicadas1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCaficultoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCaficultoresActionPerformed
    //línea 1-instanciamos un objeto de la clase Formulario2.java
        Caficultor.CaficultorFRM verformulario2 =new CaficultorFRM(); 
 
         //línea 2-hacemos visible el formulario que queremos llamar 
         verformulario2.setVisible(true); 
         setVisible(false);
         
    }//GEN-LAST:event_cmbCaficultoresActionPerformed

    private void cmbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cmbSalirActionPerformed

    private void cmbUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUbicacionActionPerformed
        Ciudad.CiudadFRM verformulario2 =new CiudadFRM(); 
 
         //línea 2-hacemos visible el formulario que queremos llamar 
         verformulario2.setVisible(true); 
         setVisible(false);
    }//GEN-LAST:event_cmbUbicacionActionPerformed

    private void cmbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductosActionPerformed
       Producto.ProductoFRM verformulario2 =new ProductoFRM(); 
 
         //línea 2-hacemos visible el formulario que queremos llamar 
         verformulario2.setVisible(true); 
         setVisible(false);
    }//GEN-LAST:event_cmbProductosActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbCaficultores;
    private javax.swing.JButton cmbOfertas;
    private javax.swing.JButton cmbOfertasAplicadas1;
    private javax.swing.JButton cmbProductos;
    private javax.swing.JButton cmbSalir;
    private javax.swing.JButton cmbUbicacion;
    // End of variables declaration//GEN-END:variables
}
