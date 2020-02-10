/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_prototype;

/**
 *
 * @author John_Riaño
 */
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Administrator extends javax.swing.JFrame {
    
    String user = Login.username, nombre_usuario;
    public static int sesion_usuario;

    /**
     * Creates new form Administrador
     */
    public Administrator() {
        initComponents();
        sesion_usuario = 1;
        
        setSize(650, 430);
        setResizable(false);
        setTitle("Administrador - Sesión de " + user);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
        jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
}
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/un.gif"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        cerrar();
        jLabel_NombreUsuario = new javax.swing.JLabel();
        jButton_RegistrarUsuario = new javax.swing.JButton();
        jButton_GestionarUsuarios = new javax.swing.JButton();
        jButton_Pedidos = new javax.swing.JButton();
        jButton_Inventario = new javax.swing.JButton();
        jButton_Tecnico = new javax.swing.JButton();
        jButton_AcercaDe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_NombreUsuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel_NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NombreUsuario.setText(user.toUpperCase());
        getContentPane().add(jLabel_NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton_RegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUser.png"))); // NOI18N
        jButton_RegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 100));

        jButton_GestionarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informationuser.png"))); // NOI18N
        jButton_GestionarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GestionarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_GestionarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 120, 100));
        
        jButton_Pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paquetes.png"))); // NOI18N
         jButton_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PedidosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 120, 100));

        jButton_Inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        jButton_Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InventarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 100));

        jButton_Tecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grafica.png"))); // NOI18N
        getContentPane().add(jButton_Tecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 120, 100));

        jButton_AcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/opciones.png"))); // NOI18N
        getContentPane().add(jButton_AcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 120, 100));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Administrador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestionar Cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ver Pedidos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Inventario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Finanzas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Acerca de");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        jLabel7.setText(" Creado por Grupo 7 ®");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
        try{
             new RegistryAdmin().setVisible(true);
             dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en el sistema intenta de nuevo");
        }
    }

    private void jButton_GestionarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {
        try{
             new usersManager().setVisible(true);
             dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en el sistema intenta de nuevo"+e);
        }
    }
    private  void jButton_PedidosActionPerformed(ActionEvent evt) {
            try{
                new Pedidos().setVisible(true);
                 dispose();
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"Error en el sistema intenta de nuevo"+e);
            }
    }
    private void jButton_InventarioActionPerformed(ActionEvent evt) {
            ;
            try{
                new InventarioAdmin().setVisible(true);
                dispose();
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"Error en el sistema intenta de nuevo"+e);
            }
    }
    
    public void cerrar(){
        try{
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e){           
                    new Login().setVisible(true);
                    dispose();     
                }
            });
            this.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    private javax.swing.JButton jButton_AcercaDe;
    private javax.swing.JButton jButton_Inventario;
    private javax.swing.JButton jButton_Pedidos;
    private javax.swing.JButton jButton_GestionarUsuarios;
    private javax.swing.JButton jButton_RegistrarUsuario;
    private javax.swing.JButton jButton_Tecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_NombreUsuario;
    private javax.swing.JLabel jLabel_Wallpaper;
}
