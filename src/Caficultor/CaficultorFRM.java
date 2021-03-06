/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caficultor;


import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cadefihuilaltda
 */
public class CaficultorFRM extends javax.swing.JFrame { 

    /**
     * Creates new form CaficultorFRM
     */
    private DefaultTableModel modeloTablaCaficultor;
    private DefaultComboBoxModel modeloComboCiudad;
    private DefaultComboBoxModel modeloComboSexo;
    private DefaultComboBoxModel modeloComboTipoIdentificacion;
    private DefaultComboBoxModel modeloComboEstado;
    public CaficultorFRM() {
        modeloTablaCaficultor = new DefaultTableModel(null, getColumn());
        modeloComboCiudad = new DefaultComboBoxModel(new String[] {});
        modeloComboTipoIdentificacion = new DefaultComboBoxModel(new String[] {});
        modeloComboSexo = new DefaultComboBoxModel(new String[] {});
        modeloComboEstado = new DefaultComboBoxModel(new String[] {});
        
        initComponents();
        cargarTabla();
    
     //Listar en combobox las ciudades (ubicaciones)   
        Caficultor objCaficultor = new Caficultor();
        ResultSet resultado;
        resultado = objCaficultor.cargarComboCiudad();
        try {
            while(resultado.next()){
                modeloComboCiudad.addElement(new ZoomCiudad(resultado.getInt("ubi_id_ubicacion"),resultado.getString("ubi_nombre")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el combo de Ciudad debido a: "+e.getMessage());
        }
        
    cmbCaf_ubicacion.setSelectedIndex(0);
        
    //Listar en combobox Tipo de Identitifacion
        Caficultor objTipoIdentificacion = new Caficultor();
        ResultSet res;
        res = objTipoIdentificacion.cargarComboTipoIdentificacion();
            try {
                while(res.next()){
                    modeloComboTipoIdentificacion.addElement(new ZoomCaracteristicas(res.getString("car_codigo"),res.getString("car_nombre")));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cargar el combo de Tipo de Identf.  debido a: "+e.getMessage());
            }
      //Listar en combobox Sexo Caficultor
        Caficultor objSexo = new Caficultor();
        ResultSet resSexo;
        resSexo = objSexo.cargarComboSexo();
            try {
                while(resSexo.next()){
                    modeloComboSexo.addElement(new ZoomCaracteristicas(resSexo.getString("car_codigo"),resSexo.getString("car_nombre")));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cargar el combo de Tipo de Identf.  debido a: "+e.getMessage());
            }
        //Listar en combobox Estado
        Caficultor objEstado = new Caficultor();
        ResultSet resEstado;
        resEstado = objEstado.cargarComboEstado();
            try {
                while(resEstado.next()){
                    modeloComboEstado.addElement(new ZoomCaracteristicas(resEstado.getString("car_codigo"),resEstado.getString("car_nombre")));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cargar el combo de Tipo de Identf.  debido a: "+e.getMessage());
            }

    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private String[] getColumn(){
        String columnas[] = new String[]{"Identificacion", "Tipo Identificacion","Nombres", "Apellidos", "Teléfono","Dirección","Email", "Ciudad","Sexo","Estado"};
        return columnas;
    }
    
    private void cargarTabla(){
        Caficultor objCaficultor = new Caficultor();
        ResultSet resultado = objCaficultor.cargarTablaCaficultor();
        try{
            Object dato[] = new Object[10];
            while(resultado.next()){
                for(int i = 0; i < 10;i++){
                dato[i] = resultado.getObject(i+1);
                }
            modeloTablaCaficultor.addRow(dato);
            }
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Ocurrio un error: "+ex.getMessage());
        }
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCaf_identificacion = new javax.swing.JLabel();
        lblCaf_tipo_identificacion = new javax.swing.JLabel();
        lblCaf_nombres = new javax.swing.JLabel();
        lbl_Caf_apellidos = new javax.swing.JLabel();
        lblCaf_telefono = new javax.swing.JLabel();
        lblCaf_direccion = new javax.swing.JLabel();
        lblCaf_ubicacion = new javax.swing.JLabel();
        lblCaf_sexo = new javax.swing.JLabel();
        lblCaf_estado = new javax.swing.JLabel();
        txtCaf_identificacion = new javax.swing.JTextField();
        txtCaf_nombres = new javax.swing.JTextField();
        txtCaf_apellidos = new javax.swing.JTextField();
        txtCaf_telefono = new javax.swing.JTextField();
        txtCaf_direccion = new javax.swing.JTextField();
        lbl_Caf_email = new javax.swing.JLabel();
        txtCaf_email = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCaficultor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        cmbCaf_ubicacion = new javax.swing.JComboBox();
        cmbCaf_sexo = new javax.swing.JComboBox();
        cmbCaf_tipo_identificacion = new javax.swing.JComboBox();
        cmbCaf_estado = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbCaf_identificacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbCaf_identificacion.setText("Identificación:");

        lblCaf_tipo_identificacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCaf_tipo_identificacion.setText("Tipo de Identificación:");

        lblCaf_nombres.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCaf_nombres.setText("Nombres Caficultor:");

        lbl_Caf_apellidos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Caf_apellidos.setText("Apellidos Caficultor:");

        lblCaf_telefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCaf_telefono.setText("Teléfono:");

        lblCaf_direccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCaf_direccion.setText("Dirección:");

        lblCaf_ubicacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCaf_ubicacion.setText("Ciudad:");

        lblCaf_sexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCaf_sexo.setText("Sexo:");

        lblCaf_estado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCaf_estado.setText("Estado:");

        txtCaf_identificacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCaf_identificacion.setForeground(new java.awt.Color(0, 0, 153));
        txtCaf_identificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCaf_identificacionKeyTyped(evt);
            }
        });

        txtCaf_nombres.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCaf_nombres.setForeground(new java.awt.Color(0, 0, 153));
        txtCaf_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCaf_nombresKeyTyped(evt);
            }
        });

        txtCaf_apellidos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCaf_apellidos.setForeground(new java.awt.Color(0, 0, 153));
        txtCaf_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCaf_apellidosKeyTyped(evt);
            }
        });

        txtCaf_telefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCaf_telefono.setForeground(new java.awt.Color(0, 0, 153));

        txtCaf_direccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCaf_direccion.setForeground(new java.awt.Color(0, 0, 153));

        lbl_Caf_email.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Caf_email.setText("Email:");

        txtCaf_email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCaf_email.setForeground(new java.awt.Color(0, 0, 153));

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
        jtbCaficultor.setModel(modeloTablaCaficultor);
        jScrollPane1.setViewportView(jtbCaficultor);

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caficultor.jpg"))); // NOI18N
        jLabel1.setText("Caficultores");

        btnModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 97, 47));
        btnModificar.setText("Modificar");

        cmbCaf_ubicacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbCaf_ubicacion.setForeground(new java.awt.Color(0, 0, 102));
        cmbCaf_ubicacion.setModel(modeloComboCiudad);
        cmbCaf_ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCaf_ubicacionActionPerformed(evt);
            }
        });

        cmbCaf_sexo.setModel(modeloComboSexo);
        cmbCaf_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCaf_sexoActionPerformed(evt);
            }
        });

        cmbCaf_tipo_identificacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbCaf_tipo_identificacion.setForeground(new java.awt.Color(0, 0, 102));
        cmbCaf_tipo_identificacion.setModel(modeloComboTipoIdentificacion);

        cmbCaf_estado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbCaf_estado.setForeground(new java.awt.Color(0, 0, 102));
        cmbCaf_estado.setModel(modeloComboEstado);

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
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_Caf_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCaf_tipo_identificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbCaf_identificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCaf_nombres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_Caf_apellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCaf_telefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCaf_direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCaf_ubicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCaf_sexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCaf_estado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnGuardar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbCaf_estado, javax.swing.GroupLayout.Alignment.LEADING, 0, 164, Short.MAX_VALUE)
                                .addComponent(cmbCaf_sexo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbCaf_ubicacion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCaf_identificacion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbCaf_tipo_identificacion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCaf_nombres, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCaf_apellidos, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCaf_telefono, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCaf_direccion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCaf_email, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(lbCaf_identificacion)
                            .addComponent(txtCaf_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCaf_tipo_identificacion)
                            .addComponent(cmbCaf_tipo_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCaf_nombres)
                            .addComponent(txtCaf_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Caf_apellidos)
                            .addComponent(txtCaf_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCaf_telefono)
                            .addComponent(txtCaf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCaf_direccion)
                            .addComponent(txtCaf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Caf_email)
                            .addComponent(txtCaf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCaf_ubicacion)
                            .addComponent(cmbCaf_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCaf_sexo)
                            .addComponent(cmbCaf_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCaf_estado)
                    .addComponent(cmbCaf_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Caficultor objCaficultor = new Caficultor();
        int caf_identificacion =  Integer.parseInt(txtCaf_identificacion.getText());
        ZoomCaracteristicas objTipoIdentificacion = (ZoomCaracteristicas) cmbCaf_tipo_identificacion.getSelectedItem();
        String caf_tipo_identificacion = objTipoIdentificacion.getCar_codigo();
        String caf_nombres = txtCaf_nombres.getText();
        String caf_apellidos = txtCaf_apellidos.getText();
        int caf_telefono = Integer.parseInt(txtCaf_telefono.getText());
        String caf_direccion = txtCaf_direccion.getText();
        String caf_email = txtCaf_email.getText();
        ZoomCiudad objCiudad = (ZoomCiudad) cmbCaf_ubicacion.getSelectedItem();
        int caf_id_ubicacion = objCiudad.getUbi_id_ubicacion();
        //int caf_id_ubicacion = Integer.parseInt(txtCaf_ubicacion.getText());
        ZoomCaracteristicas objSexo = (ZoomCaracteristicas) cmbCaf_sexo.getSelectedItem();
        String caf_sexo = objSexo.getCar_codigo();
        //String caf_sexo = txtCaf_sexo.getText();
        ZoomCaracteristicas objEstado = (ZoomCaracteristicas) cmbCaf_estado.getSelectedItem();
        String caf_estado = objEstado.getCar_codigo();

        
        boolean resultado = objCaficultor.insertarCaficultor(caf_identificacion,caf_tipo_identificacion,caf_nombres,caf_apellidos,caf_telefono,caf_direccion,caf_email,caf_id_ubicacion,caf_sexo,caf_estado);
        if(resultado){
            JOptionPane.showMessageDialog(null, "Se inserto correctamente el Caficultor:" + "\n" + "- N° Identificación: " + caf_identificacion+ "\n" + "- Nombres y Apellidos: " + caf_nombres +  " " + caf_apellidos);
            modeloTablaCaficultor.setNumRows(0);
            cargarTabla();

            
        }else{
            JOptionPane.showMessageDialog(null, "Ocurrio un error al insertar debido a: ");
        }
        //Limpiar Datos de los campos
            txtCaf_identificacion.setText("");
            cmbCaf_tipo_identificacion.setSelectedIndex(0);
            txtCaf_nombres.setText("");
            txtCaf_apellidos.setText("");
            txtCaf_telefono.setText("");
            txtCaf_direccion.setText("");
            txtCaf_email.setText("");
            cmbCaf_ubicacion.setSelectedIndex(0);
            cmbCaf_sexo.setSelectedIndex(3);
            cmbCaf_estado.setSelectedIndex(0);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Caficultor objCaficultor = new Caficultor();
         int caf_identificacion = Integer.parseInt(txtCaf_identificacion.getText());
         boolean resultado = objCaficultor.eliminarCaficultor(caf_identificacion);
         if (resultado) {
            JOptionPane.showMessageDialog(null, "Se elimino Correctamente el Caficultor con identificación: "+ caf_identificacion);
            modeloTablaCaficultor.setNumRows(0);
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el Sistema con la Base de Datos");
        }
         
         //Limpiar Datos de los campos
            txtCaf_identificacion.setText("");
            cmbCaf_tipo_identificacion.setSelectedIndex(0);
            txtCaf_nombres.setText("");
            txtCaf_apellidos.setText("");
            txtCaf_telefono.setText("");
            txtCaf_direccion.setText("");
            txtCaf_email.setText("");
            cmbCaf_ubicacion.setSelectedIndex(0);
            cmbCaf_sexo.setSelectedIndex(0);
            cmbCaf_estado.setSelectedIndex(0);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmbCaf_ubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCaf_ubicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCaf_ubicacionActionPerformed

    private void cmbCaf_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCaf_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCaf_sexoActionPerformed

    private void txtCaf_identificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaf_identificacionKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaf_identificacionKeyTyped

    private void txtCaf_nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaf_nombresKeyTyped
        char car = evt.getKeyChar();
        if(Character.isLetter(car)){
        }else{
        evt.consume();
        getToolkit().beep();
        }
    }//GEN-LAST:event_txtCaf_nombresKeyTyped

    private void txtCaf_apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaf_apellidosKeyTyped
    char car = evt.getKeyChar();
        if(Character.isLetter(car)){
        }else{
        evt.consume();
        getToolkit().beep();
        }
    }//GEN-LAST:event_txtCaf_apellidosKeyTyped

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
            java.util.logging.Logger.getLogger(CaficultorFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaficultorFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaficultorFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaficultorFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaficultorFRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbCaf_estado;
    private javax.swing.JComboBox cmbCaf_sexo;
    private javax.swing.JComboBox cmbCaf_tipo_identificacion;
    private javax.swing.JComboBox cmbCaf_ubicacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbCaficultor;
    private javax.swing.JLabel lbCaf_identificacion;
    private javax.swing.JLabel lblCaf_direccion;
    private javax.swing.JLabel lblCaf_estado;
    private javax.swing.JLabel lblCaf_nombres;
    private javax.swing.JLabel lblCaf_sexo;
    private javax.swing.JLabel lblCaf_telefono;
    private javax.swing.JLabel lblCaf_tipo_identificacion;
    private javax.swing.JLabel lblCaf_ubicacion;
    private javax.swing.JLabel lbl_Caf_apellidos;
    private javax.swing.JLabel lbl_Caf_email;
    private javax.swing.JTextField txtCaf_apellidos;
    private javax.swing.JTextField txtCaf_direccion;
    private javax.swing.JTextField txtCaf_email;
    private javax.swing.JTextField txtCaf_identificacion;
    private javax.swing.JTextField txtCaf_nombres;
    private javax.swing.JTextField txtCaf_telefono;
    // End of variables declaration//GEN-END:variables
}
