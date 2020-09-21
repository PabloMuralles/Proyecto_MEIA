import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
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
    private boolean visible1 = false;
    private boolean visible = false;
    public CrearUsuario() {
        initComponents();
        Image img = new ImageIcon("icon.png").getImage();
        Image newImg = img.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        L_Visible.setIcon(new ImageIcon(newImg));
        L_Visible1.setIcon(new ImageIcon(newImg));
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
        TF_Password = new javax.swing.JPasswordField();
        L_Visible = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TF_Password1 = new javax.swing.JPasswordField();
        L_Visible1 = new javax.swing.JLabel();

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

        TF_Password.setText("Ingrese Password");
        TF_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_PasswordKeyTyped(evt);
            }
        });

        L_Visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_VisibleMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ingrese nuevamente Password:");

        TF_Password1.setText("Ingrese Password");

        L_Visible1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_Visible1MouseClicked(evt);
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
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(BT_Salir)
                                .addGap(306, 306, 306)
                                .addComponent(BT_CrearUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Dato))
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(L_Nivel))
                            .addComponent(jLabel6))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TF_Password1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(L_Visible1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TF_Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TF_Apellido)
                            .addComponent(TF_Usuario)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TF_Password)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(L_Visible, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TF_CorreoAlt)
                            .addComponent(TF_Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(TF_Foto, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_Visible, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(L_Nivel)
                        .addComponent(TF_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_Visible1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(TF_Password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dato))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_CorreoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TF_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TF_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BT_CrearUsuario)
                            .addComponent(BT_Salir))))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        if(!TF_Usuario.getText().equals("") && !TF_Nombre.getText().equals("") && !TF_Apellido.getText().equals("") && !String.valueOf(TF_Password.getPassword()).equals("")
                    && fecha != null && !TF_CorreoAlt.getText().equals("") && !TF_Telefono.getText().equals("") && !TF_Foto.getText().equals("")){
            if(String.valueOf(TF_Password.getPassword()).equals(String.valueOf(TF_Password1.getPassword()))){
                if(L_Nivel.getText().equals("Nivel alto")){
                    var rol = Dato.getText();
                    strError = objUsuario.crearUsuario(TF_Usuario.getText(), TF_Nombre.getText(), TF_Apellido.getText(), String.valueOf(TF_Password.getPassword()), 
                            Integer.parseInt(rol), fecha, TF_CorreoAlt.getText(), TF_Telefono.getText(), TF_Foto.getText(), 1);
                    JOptionPane.showMessageDialog(null, strError, "EXITO", 1);
                    if(!strError.equals("Usuario ya existe")){
                        //INGRESO AL SISTEMA
                        JOptionPane.showMessageDialog(null, "Bienvenido", "EXITO", 1);
                        var objManejo = new ManejoArchivo();
                        var sistema = new AplicacionMenu();
                        var Archivo = new File("C:/MEIA/usuario.txt");
                        var user = TF_Usuario.getText();
                        var actual = objManejo.BuscarLinea(Archivo, user, strError, 0, 9);
                        var split = actual.split(Pattern.quote("|"));

                        sistema.L_Bienvenida.setText("BIENVENIDO " + user);
                        sistema.Dato.setText(user);
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
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Contraseña no cumple: Ingrese por lo menos una letra mayuscula, al menos una letra minuscula, al menos un digito, no espacios en blanco, al menos 1 caracter especial, minimo 8 caracteres", "ERROR", 1);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "ERROR", 1);
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
        if(TF_Apellido.getText().length()== 30){
            evt.consume();
        }
        if (!Character.isLetter(evt.getKeyChar())&& !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_TF_ApellidoKeyTyped

    private void TF_CorreoAltKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_CorreoAltKeyTyped
        if(TF_CorreoAlt.getText().length()== 40){
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

    private void L_VisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_VisibleMouseClicked
        visible = !visible;
        if(visible){
            TF_Password.setEchoChar((char)0);
        }
        else{
            TF_Password.setEchoChar('*');
        }
    }//GEN-LAST:event_L_VisibleMouseClicked

    private void TF_PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_PasswordKeyTyped
        if(String.valueOf(TF_Password.getPassword()).length()== 40){
            evt.consume();
        }
        else{
            Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,40}$");
            Matcher matcher = pattern.matcher(String.valueOf(TF_Password.getPassword()) + evt.getKeyChar());
            if(matcher.find()){
                L_Nivel.setText("Nivel alto");
                L_Nivel.setForeground(Color.GREEN);
            }else{
                L_Nivel.setText("Nivel bajo");
                L_Nivel.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_TF_PasswordKeyTyped

    private void L_Visible1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_Visible1MouseClicked
        visible1 = !visible1;
        if(visible1){
            TF_Password1.setEchoChar((char)0);
        }
        else{
            TF_Password1.setEchoChar('*');
        }
    }//GEN-LAST:event_L_Visible1MouseClicked

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
    private javax.swing.JLabel L_Visible;
    private javax.swing.JLabel L_Visible1;
    private javax.swing.JTextField TF_Apellido;
    private javax.swing.JTextField TF_CorreoAlt;
    private javax.swing.JTextField TF_Foto;
    private javax.swing.JTextField TF_Nombre;
    private javax.swing.JPasswordField TF_Password;
    private javax.swing.JPasswordField TF_Password1;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
