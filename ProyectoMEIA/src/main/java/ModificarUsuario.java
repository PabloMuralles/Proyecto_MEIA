
import java.awt.Color;
import java.awt.Image;
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
 * @author Santiago Bocel
 */
public class ModificarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form ModificarUsuario
     */
    private boolean visible1 = false;
    private boolean visible = false;
    private boolean visible2 = false;
    public ModificarUsuario() {
        initComponents();
        Image img = new ImageIcon("icon.png").getImage();
        Image newImg = img.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
         L_visible2.setIcon(new ImageIcon(newImg));
         L_visible1.setIcon(new ImageIcon(newImg));
          L_visible3.setIcon(new ImageIcon(newImg));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TF_Usuariofijo = new javax.swing.JTextField();
        BT_Regresar = new javax.swing.JButton();
        BT_GuardarCambios = new javax.swing.JButton();
        TF_NombreModificar = new javax.swing.JTextField();
        TF_ApellidoModificar = new javax.swing.JTextField();
        L_nivel = new javax.swing.JLabel();
        TF_CorreoModificar = new javax.swing.JTextField();
        TF_TelefonoModificar = new javax.swing.JTextField();
        TF_FotoModificar = new javax.swing.JTextField();
        TF_PaswordModificar = new javax.swing.JPasswordField();
        Nueva_Contraseña = new javax.swing.JPasswordField();
        ValidarNueva_contraseña = new javax.swing.JPasswordField();
        L_visible2 = new javax.swing.JLabel();
        L_visible1 = new javax.swing.JLabel();
        L_visible3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DC_Fecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Pasword Anterior:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Pasword :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Ingresar nuevamente password :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Foto:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Correo Alterno:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Telefono:");

        TF_Usuariofijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_UsuariofijoActionPerformed(evt);
            }
        });

        BT_Regresar.setText("Regresar");
        BT_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_RegresarActionPerformed(evt);
            }
        });

        BT_GuardarCambios.setText("Guardar Cambios");
        BT_GuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_GuardarCambiosActionPerformed(evt);
            }
        });

        TF_FotoModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_FotoModificarMouseClicked(evt);
            }
        });
        TF_FotoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_FotoModificarActionPerformed(evt);
            }
        });
        TF_FotoModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_FotoModificarKeyTyped(evt);
            }
        });

        TF_PaswordModificar.setText("Pasword Anterior");

        Nueva_Contraseña.setText("Ingrese Password");
        Nueva_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nueva_ContraseñaActionPerformed(evt);
            }
        });
        Nueva_Contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nueva_ContraseñaKeyTyped(evt);
            }
        });

        ValidarNueva_contraseña.setText("Ingrese Password");

        L_visible2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_visible2MouseClicked(evt);
            }
        });

        L_visible1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_visible1MouseClicked(evt);
            }
        });

        L_visible3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_visible3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de nacimiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_FotoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_TelefonoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_CorreoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BT_Regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BT_GuardarCambios)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addComponent(DC_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(44, 44, 44)
                                        .addComponent(L_nivel)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TF_Usuariofijo, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TF_NombreModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                            .addComponent(TF_ApellidoModificar)
                                            .addComponent(TF_PaswordModificar)
                                            .addComponent(Nueva_Contraseña))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27)
                                .addComponent(ValidarNueva_contraseña)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(L_visible1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(L_visible2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(L_visible3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TF_Usuariofijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(TF_NombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TF_ApellidoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(TF_PaswordModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(L_visible1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_visible2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(L_nivel)
                        .addComponent(Nueva_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ValidarNueva_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_visible3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(DC_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TF_CorreoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TF_TelefonoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TF_FotoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Regresar)
                    .addComponent(BT_GuardarCambios))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_UsuariofijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_UsuariofijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_UsuariofijoActionPerformed

    private void BT_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_RegresarActionPerformed
        // TODO add your handling code here:
        File Archivo = new File("C:/MEIA/usuario.txt");
        File Bita = new File("C:/MEIA/bitacora_usuario.txt");
         var objManejoArchivo = new ManejoArchivo();
        var strError = "";
        var ArchivoUser = objManejoArchivo.BuscarLinea(Archivo, TF_Usuariofijo.getText(), strError, 0, 9);
        var ArchivoBita = objManejoArchivo.BuscarLinea(Bita, TF_Usuariofijo.getText(), strError, 0, 9);
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

    private void BT_GuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_GuardarCambiosActionPerformed
        // TODO add your handling code here:
        File Archivo = new File("C:/MEIA/usuario.txt");
        File Bita = new File("C:/MEIA/bitacora_usuario.txt");
        var objManejoUsuario = new ManejoUsuario();
         ManejoArchivo objManejoArchivo = new ManejoArchivo();
        var strError = "";     
        var ArchivoUser = objManejoArchivo.BuscarLinea(Archivo, TF_Usuariofijo.getText(), strError, 0, 9);
        var ArchivoBita = objManejoArchivo.BuscarLinea(Bita, TF_Usuariofijo.getText(), strError, 0, 9);
        var split = ArchivoUser.split(Pattern.quote("|"));
        if(!ArchivoBita.equals("") ){
            split = ArchivoBita.split(Pattern.quote("|"));
        }
        String Password = objManejoUsuario.decrypt(split[3]);
        if(String.valueOf(TF_PaswordModificar.getPassword()).equals(Password))
        {          
          //si la contraseña es la correcta
          if(String.valueOf(Nueva_Contraseña.getPassword()).equals(String.valueOf(ValidarNueva_contraseña.getPassword()))){          
          if (L_nivel.getText().equals("Nivel alto")){        
          Password = String.valueOf(Nueva_Contraseña.getPassword());
          Password = objManejoUsuario.encrypt(Password, 2, 8);
          }
          else  
          {
            JOptionPane.showMessageDialog(null, "Contraseña no cumple: Ingrese por lo menos una letra mayuscula, al menos una letra minuscula, al menos un digito, no espacios en blanco, al menos 1 caracter especial, minimo 8 caracteres", "ERROR", 1);
          }         
          }
          else
          {
              JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "ERROR", JOptionPane.ERROR_MESSAGE);
          }         
        }
        else
        {
         // la contraseña no coinside mantener la misma    
         JOptionPane.showMessageDialog(null, "Mantener misma contraseña", "ADVERTENCIA", 1);
          Password =  objManejoUsuario.encrypt(Password,2,8);
        }                                         
       boolean mensaje =  objManejoUsuario.ModificarUsuario(TF_Usuariofijo.getText(), TF_NombreModificar.getText(),
          TF_ApellidoModificar.getText(), Password,Integer.parseInt(split[4]),TF_CorreoModificar.getText(),
          TF_TelefonoModificar.getText(), TF_FotoModificar.getText());
        
        if (mensaje) {
            JOptionPane.showMessageDialog(null, "Dato modificado", "EXITO", 1);
        }
        else
        {
             JOptionPane.showMessageDialog(null, "Dato No modificado", "Fallo", 1);
        }              
    }//GEN-LAST:event_BT_GuardarCambiosActionPerformed

    private void TF_FotoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_FotoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_FotoModificarActionPerformed

    private void Nueva_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nueva_ContraseñaActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_Nueva_ContraseñaActionPerformed

    private void Nueva_ContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nueva_ContraseñaKeyTyped
        // TODO add your handling code here:
        if(String.valueOf(Nueva_Contraseña.getPassword()).length()== 40){
            evt.consume();
        }
        else{
            Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,40}$");
            Matcher matcher = pattern.matcher(String.valueOf(Nueva_Contraseña.getPassword()) + evt.getKeyChar());
            if(matcher.find()){
                L_nivel.setText("Nivel alto");
                L_nivel.setForeground(Color.GREEN);
            }else{
                L_nivel.setText("Nivel bajo");
                L_nivel.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_Nueva_ContraseñaKeyTyped

    private void L_visible1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_visible1MouseClicked
        // TODO add your handling code here:
         visible = !visible;
        if( visible){
            TF_PaswordModificar.setEchoChar((char)0);
        }
        else{
            TF_PaswordModificar.setEchoChar('*');
        }
    }//GEN-LAST:event_L_visible1MouseClicked

    private void L_visible2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_visible2MouseClicked
        // TODO add your handling code here:
        visible1 = !visible1;
        if( visible1){
            Nueva_Contraseña.setEchoChar((char)0);
        }
        else{
            Nueva_Contraseña.setEchoChar('*');
        }
    }//GEN-LAST:event_L_visible2MouseClicked

    private void L_visible3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_visible3MouseClicked
        // TODO add your handling code here:
         visible2 = !visible2;
        if( visible2){
            ValidarNueva_contraseña.setEchoChar((char)0);
        }
        else{
            ValidarNueva_contraseña.setEchoChar('*');
        }
    }//GEN-LAST:event_L_visible3MouseClicked

    private void TF_FotoModificarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FotoModificarKeyTyped
        evt.consume();
        JFileChooser dialogo = new JFileChooser();
        File ficheroImagen;
        String rutaArchivo;
        int valor = dialogo.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) 
        {
            ficheroImagen = dialogo.getSelectedFile();
            rutaArchivo = ficheroImagen.getPath();
            var dataUser = Data.getData();
            var objUsuario = new ManejoUsuario();
            TF_FotoModificar.setText(objUsuario.copyImage(rutaArchivo, dataUser.getUser()));
        }
    }//GEN-LAST:event_TF_FotoModificarKeyTyped

    private void TF_FotoModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_FotoModificarMouseClicked
        JFileChooser dialogo = new JFileChooser();
        File ficheroImagen;
        String rutaArchivo;
        int valor = dialogo.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) 
        {
            ficheroImagen = dialogo.getSelectedFile();
            rutaArchivo = ficheroImagen.getPath();
            var dataUser = Data.getData();
            var objUsuario = new ManejoUsuario();
            TF_FotoModificar.setText(objUsuario.copyImage(rutaArchivo, dataUser.getUser()));
        }
    }//GEN-LAST:event_TF_FotoModificarMouseClicked

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
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BT_GuardarCambios;
    private javax.swing.JButton BT_Regresar;
    public com.toedter.calendar.JDateChooser DC_Fecha;
    private javax.swing.JLabel L_nivel;
    private javax.swing.JLabel L_visible1;
    private javax.swing.JLabel L_visible2;
    private javax.swing.JLabel L_visible3;
    private javax.swing.JPasswordField Nueva_Contraseña;
    public javax.swing.JTextField TF_ApellidoModificar;
    public javax.swing.JTextField TF_CorreoModificar;
    public javax.swing.JTextField TF_FotoModificar;
    public javax.swing.JTextField TF_NombreModificar;
    private javax.swing.JPasswordField TF_PaswordModificar;
    public javax.swing.JTextField TF_TelefonoModificar;
    public javax.swing.JTextField TF_Usuariofijo;
    private javax.swing.JPasswordField ValidarNueva_contraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
