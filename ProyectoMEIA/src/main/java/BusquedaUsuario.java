
import java.awt.Image;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago Bocel
 */
public class BusquedaUsuario extends javax.swing.JFrame {

    /**
     * Creates new form BusquedaUsuario
     */
    public BusquedaUsuario() {
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

        L_Usuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TF_Busquedausuario = new javax.swing.JTextField();
        BT_Buscar = new javax.swing.JButton();
        L_Imagen = new javax.swing.JLabel();
        TF_NombreB = new javax.swing.JTextField();
        TF_ApellidoB = new javax.swing.JTextField();
        TF_FechaB = new javax.swing.JTextField();
        TF_CorreoB = new javax.swing.JTextField();
        TF_TelefonoB = new javax.swing.JTextField();
        BT_Regresar = new javax.swing.JButton();
        CB_Rol = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        BT_Modificar = new javax.swing.JButton();

        L_Usuario.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Buscar Usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de Nacimiento");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Correo Alterno");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Telefono");

        BT_Buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BT_Buscar.setText("Buscar");
        BT_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_BuscarActionPerformed(evt);
            }
        });

        BT_Regresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BT_Regresar.setText("Regresar");
        BT_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_RegresarActionPerformed(evt);
            }
        });

        CB_Rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Rol");

        BT_Modificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BT_Modificar.setText("Modificar");
        BT_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BT_Regresar)
                            .addComponent(jLabel7))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CB_Rol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(141, 141, 141))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(L_Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BT_Modificar)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(TF_Busquedausuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(BT_Buscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TF_NombreB)
                                    .addComponent(TF_ApellidoB)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TF_TelefonoB)
                                    .addComponent(TF_CorreoB)
                                    .addComponent(TF_FechaB))))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TF_Busquedausuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TF_NombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TF_ApellidoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TF_FechaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TF_CorreoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TF_TelefonoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BT_Regresar)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BT_Modificar)
                            .addComponent(L_Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_BuscarActionPerformed
        // TODO add your handling code here:
        File Archivo = new File("C:/MEIA/usuario.txt");
        File Bitacora = new File("C:/MEIA/bitacora_usuario.txt");
        var objManejoArchivo = new ManejoArchivo();
        String dato = TF_Busquedausuario.getText();
        String strError = "";
        var ArchivoUser = objManejoArchivo.BuscarLinea(Archivo, dato, strError, 0, 9);
        var ArchivoBita = objManejoArchivo.BuscarLinea(Bitacora, dato, strError, 0, 9);
        if (!ArchivoUser.equals("")) 
        {
         var split = ArchivoUser.split(Pattern.quote("|"));               
          TF_NombreB.setText(split[1]);
          TF_ApellidoB.setText(split[2]);
          TF_FechaB.setText(split[5]);
          TF_FechaB.setEditable(false);
          TF_CorreoB.setText(split[6]);
          TF_TelefonoB.setText(split[7]);
        Image img = new ImageIcon(split[8]).getImage();
         Image newImg = img.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
          L_Imagen.setIcon(new ImageIcon(newImg));        
        }
        else
        {
          var split = ArchivoBita.split(Pattern.quote("|"));   
          TF_NombreB.setText(split[1]);
          TF_ApellidoB.setText(split[2]);
          TF_FechaB.setText(split[5]);
          TF_FechaB.setEditable(false);
          TF_CorreoB.setText(split[6]);
          TF_TelefonoB.setText(split[7]);
        Image img = new ImageIcon(split[8]).getImage();
         Image newImg = img.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
          L_Imagen.setIcon(new ImageIcon(newImg));
        }                               
    }//GEN-LAST:event_BT_BuscarActionPerformed

    private void BT_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_RegresarActionPerformed
        // TODO add your handling code here:
           File Archivo = new File("C:/MEIA/usuario.txt");
        File Bita = new File("C:/MEIA/bitacora_usuario.txt");
         var objManejoArchivo = new ManejoArchivo();
        var strError = "";
        var ArchivoUser = objManejoArchivo.BuscarLinea(Archivo, L_Usuario.getText(), strError, 0, 9);
        var ArchivoBita = objManejoArchivo.BuscarLinea(Bita, L_Usuario.getText(), strError, 0, 9);
         var split = ArchivoBita.split(Pattern.quote("|"));
        if(!ArchivoUser.equals("") ){
            split = ArchivoUser.split(Pattern.quote("|"));
        }
                        var sistema = new AplicacionMenu();
                        sistema.L_Bienvenida.setText("BIENVENIDO:" + split[0]);
                        sistema.Dato.setText(split[0]);
                        sistema.Dato.setVisible(false);
                        if(split[4].equals("1")){
                            sistema.L_Rol.setText("Rol: Administrador");
                        }else{
                            sistema.L_Rol.setText("Rol: Usuario");
                        }

                        try
                        {
                            Image img = new ImageIcon(split[8]).getImage();
                            Image newImg = img.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
                            sistema.L_Image.setIcon(new ImageIcon(newImg));
                        } catch(Exception ex){
                            strError = ex.getMessage();
                        }
                        sistema.setVisible(true);
                        this.dispose();
    }//GEN-LAST:event_BT_RegresarActionPerformed

    private void BT_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ModificarActionPerformed
        // TODO add your handling code here:
          File Archivo = new File("C:/MEIA/usuario.txt");
        File Bita = new File("C:/MEIA/bitacora_usuario.txt");
        var objManejoUsuario = new ManejoUsuario();
         ManejoArchivo objManejoArchivo = new ManejoArchivo();
        var strError = "";     
        var ArchivoUser = objManejoArchivo.BuscarLinea(Archivo, TF_Busquedausuario.getText(), strError, 0, 9);
        var ArchivoBita = objManejoArchivo.BuscarLinea(Bita, TF_Busquedausuario.getText(), strError, 0, 9);
        var split = ArchivoUser.split(Pattern.quote("|"));
        if(!ArchivoBita.equals("") ){
            split = ArchivoBita.split(Pattern.quote("|"));
        }   
        int rol = CB_Rol.getSelectedIndex();
       boolean mensaje =  objManejoUsuario.ModificarUsuario(TF_Busquedausuario.getText(), TF_NombreB.getText(),
          TF_ApellidoB.getText(), split[3], rol, TF_CorreoB.getText(),
          TF_TelefonoB.getText(), split[8]);
        
        if (mensaje) {
            JOptionPane.showMessageDialog(null, "Dato modificado", "EXITO", 1);
        }
        else
        {
             JOptionPane.showMessageDialog(null, "Dato No modificado", "Fallo", 1);
        }
        
    }//GEN-LAST:event_BT_ModificarActionPerformed

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
            java.util.logging.Logger.getLogger(BusquedaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Buscar;
    private javax.swing.JButton BT_Modificar;
    private javax.swing.JButton BT_Regresar;
    private javax.swing.JComboBox<String> CB_Rol;
    private javax.swing.JLabel L_Imagen;
    public javax.swing.JLabel L_Usuario;
    private javax.swing.JTextField TF_ApellidoB;
    private javax.swing.JTextField TF_Busquedausuario;
    private javax.swing.JTextField TF_CorreoB;
    private javax.swing.JTextField TF_FechaB;
    private javax.swing.JTextField TF_NombreB;
    private javax.swing.JTextField TF_TelefonoB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
