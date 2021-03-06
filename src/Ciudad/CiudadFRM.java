/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciudad;


import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cadefihuilaltda
 */
public class CiudadFRM extends javax.swing.JFrame {

    /**
     * Creates new form CaficultorFRM
     */
    private DefaultTableModel modeloTablaCiudad;
    private DefaultComboBoxModel modeloComboEstado;
    public CiudadFRM() {
        modeloTablaCiudad = new DefaultTableModel(null, getColumn());
        modeloComboEstado = new DefaultComboBoxModel(new String[] {});
        
        initComponents();
        cargarTabla();
    
     
        //Listar en combobox Estado
        Ciudad objEstado = new Ciudad();
        ResultSet resEstado;
        resEstado = objEstado.cargarComboEstado();
            try {
                while(resEstado.next()){
                    modeloComboEstado.addElement(new ZoomCaracteristicas(resEstado.getString("car_codigo"),resEstado.getString("car_nombre")));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cargar el combo de Estado de Ciudad debido a: "+e.getMessage());
            }

    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private String[] getColumn(){
        String columnas[] = new String[]{"Código Ciudad", "Nombre Ciudad","Estado Ciudad"};
        return columnas;
    }
    
    private void cargarTabla(){
        Ciudad objCiudad = new Ciudad();
        ResultSet resultado = objCiudad.cargarTablaUbicacion();
        try{
            Object dato[] = new Object[3];
            while(resultado.next()){
                for(int i = 0; i < 3;i++){
                dato[i] = resultado.getObject(i+1);
                }
            modeloTablaCiudad.addRow(dato);
            }
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Ocurrio un error: "+ex.getMessage());
        }
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUbi_id_ubicacion = new javax.swing.JLabel();
        lblUbi_nombre = new javax.swing.JLabel();
        lblUbi_estado = new javax.swing.JLabel();
        txtUbi_id_ubicacion = new javax.swing.JTextField();
        txtUbi_nombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCaficultor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        cmbUbi_estado = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUbi_id_ubicacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUbi_id_ubicacion.setText("Código Ciudad");

        lblUbi_nombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUbi_nombre.setText("Nombre Ciudad:");

        lblUbi_estado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUbi_estado.setText("Estado:");

        txtUbi_id_ubicacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtUbi_id_ubicacion.setForeground(new java.awt.Color(0, 0, 153));
        txtUbi_id_ubicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUbi_id_ubicacionKeyTyped(evt);
            }
        });

        txtUbi_nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtUbi_nombre.setForeground(new java.awt.Color(0, 0, 153));
        txtUbi_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUbi_nombreKeyTyped(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 102));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(153, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jtbCaficultor.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtbCaficultor.setForeground(new java.awt.Color(0, 0, 102));
        jtbCaficultor.setModel(modeloTablaCiudad);
        jScrollPane1.setViewportView(jtbCaficultor);

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ubicacion.png"))); // NOI18N
        jLabel1.setText("Ciudades");

        btnModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 97, 47));
        btnModificar.setText("Modificar");

        cmbUbi_estado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbUbi_estado.setForeground(new java.awt.Color(0, 0, 102));
        cmbUbi_estado.setModel(modeloComboEstado);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras_pequeño.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir_pequenio.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblUbi_id_ubicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblUbi_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                            .addComponent(lblUbi_estado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cmbUbi_estado, javax.swing.GroupLayout.Alignment.LEADING, 0, 164, Short.MAX_VALUE)
                                            .addComponent(txtUbi_id_ubicacion, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUbi_nombre, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addGap(22, 22, 22)
                                        .addComponent(btnModificar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar)))
                                .addGap(18, 18, 18)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUbi_id_ubicacion)
                    .addComponent(txtUbi_id_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUbi_nombre)
                    .addComponent(txtUbi_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUbi_estado)
                    .addComponent(cmbUbi_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Ciudad objCiudad = new Ciudad();
        int ubi_id_ubicacion =  Integer.parseInt(txtUbi_id_ubicacion.getText());
        String ubi_nombre = txtUbi_nombre.getText();
        ZoomCaracteristicas objEstado = (ZoomCaracteristicas) cmbUbi_estado.getSelectedItem();
        String ubi_estado = objEstado.getCar_codigo();

        
        boolean resultado = objCiudad.insertarCiudad(ubi_id_ubicacion,ubi_nombre,ubi_estado);
        if(resultado){
            JOptionPane.showMessageDialog(null, "Se inserto correctamente la Ciudad (Ubicación) :" + "\n" + "- Código Ciudad: " + ubi_id_ubicacion+ "\n" + "- Nombre Ciudad: " + ubi_nombre);
            modeloTablaCiudad.setNumRows(0);
            cargarTabla();

            
        }else{
            JOptionPane.showMessageDialog(null, "Ocurrio un error al insertar debido a: ");
        }
        //Limpiar Datos de los campos
            txtUbi_id_ubicacion.setText("");
            txtUbi_nombre.setText("");
            cmbUbi_estado.setSelectedIndex(0);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Ciudad objCiudad = new Ciudad();
         int ubi_id_ubicacion = Integer.parseInt(txtUbi_id_ubicacion.getText());
         boolean resultado = objCiudad.eliminarCiudad(ubi_id_ubicacion);
         if (resultado) {
            JOptionPane.showMessageDialog(null, "Se elimino Correctamente la Ubicación con código: "+ ubi_id_ubicacion);
            modeloTablaCiudad.setNumRows(0);
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el Sistema con la Base de Datos");
        }
         
         //Limpiar Datos de los campos
            txtUbi_id_ubicacion.setText("");
            txtUbi_nombre.setText("");
            cmbUbi_estado.setSelectedIndex(0);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtUbi_id_ubicacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUbi_id_ubicacionKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbi_id_ubicacionKeyTyped

    private void txtUbi_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUbi_nombreKeyTyped
        /// validaciones
    }//GEN-LAST:event_txtUbi_nombreKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Inicio.Inicio verformulario2 =new Inicio.Inicio();
 
         //línea 2-hacemos visible el formulario que queremos llamar 
         verformulario2.setVisible(true); 
         setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(CiudadFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CiudadFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CiudadFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CiudadFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CiudadFRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbUbi_estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbCaficultor;
    private javax.swing.JLabel lblUbi_estado;
    private javax.swing.JLabel lblUbi_id_ubicacion;
    private javax.swing.JLabel lblUbi_nombre;
    private javax.swing.JTextField txtUbi_id_ubicacion;
    private javax.swing.JTextField txtUbi_nombre;
    // End of variables declaration//GEN-END:variables
}
