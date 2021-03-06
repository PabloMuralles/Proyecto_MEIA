package GUI;

import Management.ManejoUsuario;
import Management.Data;
import Management.ManejoArchivo;
import GUI.CrearUsuario;
import GUI.AplicacionMenu;
import Management.ABB;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
public class AccesoSistema extends javax.swing.JFrame {

    /**
     * Creates new form AccesoSistema
     */
    private boolean visible = false;
    public AccesoSistema() {
        initComponents();
        Image img = new ImageIcon("icon.png").getImage();
        Image newImg = img.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        L_Visible.setIcon(new ImageIcon(newImg));
        ImageIcon image = new ImageIcon("logo.jpg");
        Icon Icon = new ImageIcon(image.getImage().getScaledInstance(jLabel_icon.getWidth(), jLabel_icon.getHeight(),Image.SCALE_DEFAULT));
        jLabel_icon.setIcon(Icon);
        
     
        
        ManejoArchivo objManejo = new ManejoArchivo();

        var strError = "";
        if(objManejo.ValidationUserFiles()){
            objManejo.CreationFilesUsers("usuario", strError);
            objManejo.CreationFilesUsers("contactos", strError);
            objManejo.CreationFilesUsers("lista", strError);
            objManejo.creationDescListContact("Lista_usuario");
        }
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
        TF_Usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BT_Ingresar = new javax.swing.JButton();
        BT_CrearUsuario = new javax.swing.JButton();
        BT_Salir = new javax.swing.JButton();
        TF_Password = new javax.swing.JPasswordField();
        L_Visible = new javax.swing.JLabel();
        jLabel_icon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ingresar usuario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ingresar contraseña:");

        BT_Ingresar.setText("INGRESAR");
        BT_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_IngresarActionPerformed(evt);
            }
        });

        BT_CrearUsuario.setText("CREAR USUARIO");
        BT_CrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CrearUsuarioActionPerformed(evt);
            }
        });

        BT_Salir.setText("SALIR");
        BT_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SalirActionPerformed(evt);
            }
        });

        TF_Password.setText("Ingrese password");
        TF_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clean(evt);
            }
        });
        TF_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Clean2(evt);
            }
        });

        L_Visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_VisibleMouseClicked(evt);
            }
        });

        jLabel3.setText("Inicio de Sesión ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(BT_Salir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_Usuario)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BT_Ingresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT_CrearUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TF_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L_Visible, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TF_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(TF_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(L_Visible, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Ingresar)
                    .addComponent(BT_CrearUsuario)
                    .addComponent(BT_Salir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_IngresarActionPerformed

        File Archivo = new File("C:/MEIA/usuario.txt");
        File Bitacora = new File("C:/MEIA/bitacora_usuario.txt");
        var strError = "";
        ManejoArchivo objManejo = new ManejoArchivo();
        if(objManejo.CantidadRegistros(Archivo, strError) != 0 || 
                objManejo.CantidadRegistros(Bitacora, strError) != 0){
            if(!TF_Usuario.getText().equals("") && !String.valueOf(TF_Password.getPassword()).equals("")){
                objManejo.RegresarPrincipio(Archivo, strError);
                var strActual = objManejo.BuscarLinea(Archivo, TF_Usuario.getText(), strError, 0, 9);
                if(strActual.equals("")){ 
                    strActual = objManejo.BuscarLinea(Bitacora, TF_Usuario.getText(), strError, 0, 9);
                }
                if(!strActual.equals("")){
                    var split = strActual.split(Pattern.quote("|"));
                    var objUsuario = new ManejoUsuario();
                    if(String.valueOf(TF_Password.getPassword()).equals(objUsuario.decrypt(split[3]))){
                        //INGRESO AL SISTEMA
                        JOptionPane.showMessageDialog(null, "Bienvenido", "EXITO", 1);
                        if(split[4].equals("1")){
                            Data.getData().setRole("1");
                        }else{
                            Data.getData().setRole("0");
                        }
                        Data.getData().setUser(split[0]);
                        var sistema = new AplicacionMenu();
                        sistema.L_Bienvenida.setText("BIENVENIDO:" + split[0]);
                        sistema.Dato.setText(split[0]);
                        sistema.Dato.setVisible(false);
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
                    else{
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "FALLO", 1);
                    }
                }
                else{
                    int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Desea crearlo?", "No existe el usuario ingresado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (iRespuesta == 0) 
                    {            
                        var fCrearUsuario = new CrearUsuario();
                        Data.getData().setRole("0"); 
                        fCrearUsuario.setVisible(true);
                        this.dispose();
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Llenar todos los campos", "FALLO", 1);
            }
        }
        else{
            int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Desea crearlo?", "No existe ningun usuario", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (iRespuesta == 0) 
            {
                var fCrearUsuario = new CrearUsuario();
                Data.getData().setRole("1"); 
                fCrearUsuario.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_BT_IngresarActionPerformed

    private void BT_CrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CrearUsuarioActionPerformed
        File Archivo = new File("C:/MEIA/usuario.txt");
        File Bitacora = new File("C:/MEIA/bitacora_usuario.txt");
        var fCrearUsuario = new CrearUsuario();
        ManejoArchivo objManejo = new ManejoArchivo();
        var strError = "";
        if(objManejo.CantidadRegistros(Archivo, strError) != 0 || 
                objManejo.CantidadRegistros(Bitacora, strError) != 0){ 
            Data.getData().setRole("0"); 
        }
        else{
            Data.getData().setRole("1");
        }
        fCrearUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_CrearUsuarioActionPerformed

    private void BT_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SalirActionPerformed
        int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir? ", "¿Salir?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (iRespuesta == 0) 
        {
            var objManejoArchivo = new ManejoArchivo();
            File Archivo = new File("C:/MEIA/usuario.txt");
            File Bita = new File("C:/MEIA/bitacora_usuario.txt");
            var strError = "";
            if(objManejoArchivo.CantidadRegistros(Bita, strError) != 0){
                if(objManejoArchivo.CantidadRegistros(Archivo, strError) == 0){
                    objManejoArchivo.LimpiarBitacora("usuario");
                    objManejoArchivo.ModifyFilesDescUser("usuario", 9, "root", true, strError);
                }
                else{
                    objManejoArchivo.LimpiarBitacora("usuario");
                    objManejoArchivo.ModifyFilesDescUser("usuario", 9, "root", false, strError);
                }
                objManejoArchivo.ModifyFilesDescBita("usuario", 9, "root", true, strError);
            }
            if(objManejoArchivo.CantidadRegistros(Archivo, strError) != 0){
                objManejoArchivo.LimpiarPrincipal("usuario", 9);
                if(objManejoArchivo.CantidadRegistros(Archivo, strError) == 0){
                    objManejoArchivo.ModifyFilesDescUser("usuario", 9, "root", true, strError);
                }
                else{
                    objManejoArchivo.ModifyFilesDescUser("usuario", 9, "root", false, strError);
                }
            }
            objManejoArchivo.limpiarSalir("contactos", 4);
            objManejoArchivo.limpiarSalir("lista", 5);
            objManejoArchivo.limpiarBI("Lista_usuario");
            
            System.exit(0);
        } 
    }//GEN-LAST:event_BT_SalirActionPerformed

    private void L_VisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_VisibleMouseClicked
        visible = !visible;
        if(visible){
            TF_Password.setEchoChar((char)0);
        }
        else{
            TF_Password.setEchoChar('*');
        }
    }//GEN-LAST:event_L_VisibleMouseClicked

    private void Clean(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clean
        // TODO add your handling code here:
        TF_Password.setText(null);
    }//GEN-LAST:event_Clean

    private void Clean2(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Clean2
        // TODO add your handling code here:
        if (evt.getKeyChar() == KeyEvent.VK_TAB) {
             TF_Password.setText(null);
        }
    }//GEN-LAST:event_Clean2

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
            java.util.logging.Logger.getLogger(AccesoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccesoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccesoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccesoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccesoSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_CrearUsuario;
    private javax.swing.JButton BT_Ingresar;
    private javax.swing.JButton BT_Salir;
    private javax.swing.JLabel L_Visible;
    private javax.swing.JPasswordField TF_Password;
    private javax.swing.JTextField TF_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_icon;
    // End of variables declaration//GEN-END:variables

    private String Pattern(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   

}
