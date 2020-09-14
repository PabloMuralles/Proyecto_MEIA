import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derly
 */
public class CrearUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CrearUsuario
     */
    public CrearUsuario() {
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

        jLabel4 = new javax.swing.JLabel();
        TF_Usuario3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TF_Usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TF_Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TF_Apellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TF_Password = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TF_CorreoAlt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TF_Telefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TF_Foto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        BT_CrearUsuario = new javax.swing.JButton();
        cFecha = new com.toedter.calendar.JDateChooser();
        L_Nivel = new javax.swing.JLabel();
        BT_Salir = new javax.swing.JButton();
        Dato = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        TF_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_UsuarioKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        TF_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_NombreKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        TF_Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_ApellidoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Password:");

        TF_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_PasswordKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Fecha de nacimiento:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Correo Alterno:");

        TF_CorreoAlt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_CorreoAltKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Telefono:");

        TF_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_TelefonoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Foto:");

        TF_Foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_FotoMouseClicked(evt);
            }
        });
        TF_Foto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_FotoKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        BT_CrearUsuario.setText("Crear usuario");
        BT_CrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CrearUsuarioActionPerformed(evt);
            }
        });

        L_Nivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        L_Nivel.setForeground(new java.awt.Color(255, 0, 0));

        BT_Salir.setText("SALIR");
        BT_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(L_Nivel))
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TF_Nombre)
                            .addComponent(TF_Apellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(TF_Telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(TF_CorreoAlt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_Password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TF_Foto)
                            .addComponent(TF_Usuario, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT_Salir)
                        .addGap(49, 49, 49)
                        .addComponent(Dato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BT_CrearUsuario)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TF_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TF_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TF_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Nivel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TF_CorreoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TF_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TF_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BT_CrearUsuario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BT_Salir)
                            .addComponent(Dato))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_PasswordKeyTyped
        if(TF_Password.getText().length()== 40){
            evt.consume();
        }
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,40}$");
        Matcher matcher = pattern.matcher(TF_Password.getText() + evt.getKeyChar());
        if(matcher.find()){
            L_Nivel.setText("Nivel alto");
            L_Nivel.setForeground(Color.GREEN);
        }
        else{
            L_Nivel.setText("Nivel bajo");
            L_Nivel.setForeground(Color.RED);
        }
    }//GEN-LAST:event_TF_PasswordKeyTyped

    private void TF_FotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_FotoMouseClicked
        JFileChooser dialogo = new JFileChooser();
        File ficheroImagen;
        String rutaArchivo;
        int valor = dialogo.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) 
        {
            ficheroImagen = dialogo.getSelectedFile();
            rutaArchivo = ficheroImagen.getPath();
            TF_Foto.setText(rutaArchivo);
        }
    }//GEN-LAST:event_TF_FotoMouseClicked

    private void BT_CrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CrearUsuarioActionPerformed
        var objUsuario = new ManejoUsuario();
        var fecha = cFecha.getDate();
        var strError = "";
        if(!TF_Usuario.getText().equals("") && !TF_Nombre.getText().equals("") && !TF_Apellido.getText().equals("") && !TF_Password.getText().equals("")
                    && fecha != null && !TF_CorreoAlt.getText().equals("") && !TF_Telefono.getText().equals("") && !TF_Foto.getText().equals("")){
            if(L_Nivel.getText().equals("Nivel alto")){
                var rol = Dato.getText();
                strError = objUsuario.crearUsuario(TF_Usuario.getText(), TF_Nombre.getText(), TF_Apellido.getText(), TF_Password.getText(), 
                        Integer.parseInt(rol), fecha, TF_CorreoAlt.getText(), TF_Telefono.getText(), TF_Foto.getText(), 1);
                JOptionPane.showMessageDialog(null, strError, "EXITO", 1);
                if(!strError.equals("Usuario ya existe")){
                    //INGRESO AL SISTEMA
                    var sistema = new AplicacionMenu();
                    sistema.Dato.setText(TF_Usuario.getText());
                    sistema.setVisible(true);
                    this.dispose();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Contraseña no cumple: Ingrese por lo menos una letra mayuscula, al menos una letra minuscula, al menos un digito, no espacios en blanco, al menos 1 caracter especial, minimo 8 caracteres", "ERROR", 1);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Llenar todos los campos", "FALLO", 1);
        }
    }//GEN-LAST:event_BT_CrearUsuarioActionPerformed

    private void BT_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SalirActionPerformed
        int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir? ", "¿Salir?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (iRespuesta == 0) 
        {            
            dispose();
        }
    }//GEN-LAST:event_BT_SalirActionPerformed

    private void TF_UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_UsuarioKeyTyped
        if(TF_Usuario.getText().length()== 20){
            evt.consume();
        }
    }//GEN-LAST:event_TF_UsuarioKeyTyped

    private void TF_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_NombreKeyTyped
        if(TF_Nombre.getText().length()== 30){
            evt.consume();
        }
        if (!Character.isLetter(evt.getKeyChar())&& !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_TF_NombreKeyTyped

    private void TF_ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_ApellidoKeyTyped
        if(TF_Password.getText().length()== 30){
            evt.consume();
        }
        if (!Character.isLetter(evt.getKeyChar())&& !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_TF_ApellidoKeyTyped

    private void TF_CorreoAltKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_CorreoAltKeyTyped
        if(TF_Password.getText().length()== 40){
            evt.consume();
        }
    }//GEN-LAST:event_TF_CorreoAltKeyTyped

    private void TF_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_TelefonoKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < '0') || (caracter > '9')) && (caracter != '\b'))
        {
            evt.consume();
        }
    }//GEN-LAST:event_TF_TelefonoKeyTyped

    private void TF_FotoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FotoKeyTyped
        evt.consume();
        JFileChooser dialogo = new JFileChooser();
        File ficheroImagen;
        String rutaArchivo;
        int valor = dialogo.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) 
        {
            ficheroImagen = dialogo.getSelectedFile();
            rutaArchivo = ficheroImagen.getPath();
            TF_Foto.setText(rutaArchivo);
        }
    }//GEN-LAST:event_TF_FotoKeyTyped

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
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_CrearUsuario;
    private javax.swing.JButton BT_Salir;
    public javax.swing.JLabel Dato;
    private javax.swing.JLabel L_Nivel;
    private javax.swing.JTextField TF_Apellido;
    private javax.swing.JTextField TF_CorreoAlt;
    private javax.swing.JTextField TF_Foto;
    private javax.swing.JTextField TF_Nombre;
    private javax.swing.JTextField TF_Password;
    private javax.swing.JTextField TF_Telefono;
    private javax.swing.JTextField TF_Usuario;
    private javax.swing.JTextField TF_Usuario3;
    private com.toedter.calendar.JDateChooser cFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
