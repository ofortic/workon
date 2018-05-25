/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.i.datos.ii;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.DefaultListModel;
/**
 *
 * @author ofortich
 * @author cdcasalins
 */
public class GestorFrame extends javax.swing.JFrame {
    Nodo ptr = new Nodo("ptr",true);
    
    File file = new File("file.txt");
    File cuenta = new File("cuenta.txt");
    FileWriter fw;
    BufferedWriter bw2;
    PrintWriter pw2;
    FileWriter w;
    BufferedWriter bw;
    PrintWriter pw;
    Nodo auxilio;
    
    Usuario usuarioUnico = new Usuario();
    DefaultTreeModel modelo = new DefaultTreeModel(ptr);
    /**
     * Creates new form GestorFrame
     */
    public GestorFrame() throws IOException {
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

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        nombrePaquetetxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        añadir = new javax.swing.JButton();
        txtEntregable = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jFrame2 = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        modelo1 = new DefaultListModel();
        preList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        modelo2 = new DefaultListModel();
        inList = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        modelo3 = new DefaultListModel();
        postList = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        depFrame = new javax.swing.JFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        modeloDep = new DefaultListModel();
        depList = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        selectDepend = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        nombreAccounttxt = new javax.swing.JTextField();
        contraseñaAccounttxt = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jFrame1.setMinimumSize(new java.awt.Dimension(500, 350));

        jLabel1.setText("Nombre del Paquete");

        jButton1.setText("Agregar Paquete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTree.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jTree.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTreeFocusGained(evt);
            }
        });
        jTree.addTreeExpansionListener(new javax.swing.event.TreeExpansionListener() {
            public void treeCollapsed(javax.swing.event.TreeExpansionEvent evt) {
                jTreeTreeCollapsed(evt);
            }
            public void treeExpanded(javax.swing.event.TreeExpansionEvent evt) {
                jTreeTreeExpanded(evt);
            }
        });
        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        añadir.setText("Añadir Entregable");
        añadir.setEnabled(false);
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        txtEntregable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntregableActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre Entregable");

        jButton2.setText("Generar Reporte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setText("Guardar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nombrePaquetetxt)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(añadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEntregable))
                    .addComponent(jButton6))
                .addGap(22, 22, 22))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrePaquetetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(40, 40, 40)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEntregable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(añadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton6))))
                .addContainerGap())
        );

        jFrame2.setMinimumSize(new java.awt.Dimension(400, 400));
        jFrame2.setPreferredSize(new java.awt.Dimension(400, 351));

        jLabel5.setText("Recorrido PreOrden");

        jLabel6.setText("Recorrido InOrden");

        jLabel7.setText("Recorrido PostOrden");

        preList.setModel(modelo1);
        jScrollPane2.setViewportView(preList);

        inList.setModel(modelo2);
        jScrollPane3.setViewportView(inList);

        postList.setModel(modelo3);
        jScrollPane4.setViewportView(postList);

        jButton3.setText("Recorrer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jButton3))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(14, 14, 14))
        );

        depFrame.setMinimumSize(new java.awt.Dimension(288, 288));

        depList.setModel(modeloDep);
        jScrollPane5.setViewportView(depList);

        jLabel8.setText("Seleccione la dependencia del entregable");

        selectDepend.setText("Seleccionar");
        selectDepend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDependActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout depFrameLayout = new javax.swing.GroupLayout(depFrame.getContentPane());
        depFrame.getContentPane().setLayout(depFrameLayout);
        depFrameLayout.setHorizontalGroup(
            depFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depFrameLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(depFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(depFrameLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(selectDepend)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        depFrameLayout.setVerticalGroup(
            depFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(depFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectDepend, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.setText("Iniciar sesion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Crear cuenta");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre de usuario");

        jLabel4.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contraseñaAccounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(nombreAccounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreAccounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseñaAccounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Subrutina encargada de verificar si el usuario y contraseña ingresado
     * son los correctos, leyendolos del archivo cuenta
     * @param evt 
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        try{
            FileReader fr3 = new FileReader(cuenta);
            BufferedReader br3 = new BufferedReader(fr3);
            String aux, aux2;
            aux2="";
            String comp = "1"+nombreAccounttxt.getText()+contraseñaAccounttxt.getText();
            System.out.println(comp);
            Scanner lector = new Scanner(cuenta);
            while(lector.hasNextLine()){
                aux2=aux2+lector.nextLine();
            }
            System.out.println(aux2);
            if (aux2.equals(comp)) {
                jFrame1.setVisible(true);
                leerArchivo(file,ptr,modelo,jTree);
                jTree.setModel(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "Error, usuario invalido");
                nombreAccounttxt.setText("");
                contraseñaAccounttxt.setText("");
            }
        } catch(Exception s){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error desconocido");
        }        
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Subrutina para agregar paquetes tanto al arbol como al modelo del jtree
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        Nodo p=ptr;
        if (!(ptr.existe(nombrePaquetetxt.getText(), p)) && !(nombrePaquetetxt.getText().equals(""))) {
            System.out.println("agrega "+nombrePaquetetxt.getText());
            ptr.add(nombrePaquetetxt.getText(),true);
            DefaultMutableTreeNode padre = new DefaultMutableTreeNode(nombrePaquetetxt.getText());
            modelo.insertNodeInto(padre, ptr, ptr.getChildCount());
            nombrePaquetetxt.setText("");
        }else{
            if(nombrePaquetetxt.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nombre de paquete invalido");
                nombrePaquetetxt.setText("");
            }
            if(ptr.existe(nombrePaquetetxt.getText(), p)){
                JOptionPane.showMessageDialog(null, "Ese paquete ya existe");
                nombrePaquetetxt.setText("");
            }
        } 
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * Subrutina encargada de crear un usuario, guardando su informacion en 
     * el archivo cuenta
     * @param evt 
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            FileReader fr2 = new FileReader(cuenta);
            BufferedReader br2 = new BufferedReader(fr2);
            String linea1=br2.readLine();
            if(linea1.equals("")){
                if (nombreAccounttxt.getText().equals("") && contraseñaAccounttxt.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "parametros incorrectos");
                } else {
                    usuarioUnico.setName(nombreAccounttxt.getText());
                    usuarioUnico.setPassword(contraseñaAccounttxt.getText());
                    nombreAccounttxt.setText("");
                    contraseñaAccounttxt.setText("");
                    try {
                        fw = new FileWriter(cuenta);
                        bw2 = new BufferedWriter(fw);
                        pw2 = new PrintWriter(bw2);
                        pw2.println("1");
                        pw2.println(usuarioUnico.getName());
                        pw2.println(usuarioUnico.getPassword());
                        System.out.println("gg");
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (null != cuenta) {
                                System.out.println("gg");
                                pw2.close();
                            }
                            bw2.close();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Cuenta creada con exito");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ya ha sido creada una cuenta, por favor ingresar con esta");
                nombreAccounttxt.setText("");
                contraseñaAccounttxt.setText("");
            }
        } catch(Exception a){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error desconocido");
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
        añadir.enable(true);
    }//GEN-LAST:event_jTreeValueChanged

    private void jTreeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTreeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTreeFocusGained

    private void jTreeTreeExpanded(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_jTreeTreeExpanded
        // TODO add your handling code here:
        añadir.setEnabled(true);
    }//GEN-LAST:event_jTreeTreeExpanded

    private void jTreeTreeCollapsed(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_jTreeTreeCollapsed
        // TODO add your handling code here:
        añadir.setEnabled(false);
    }//GEN-LAST:event_jTreeTreeCollapsed
/**
 * Subrutina encargada de agregar entregables tanto al arbol como al modelo del
 * jtree
 * @param evt 
 */
    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        Nodo q=ptr;
        llenarLista(q);
        String nombreEntregable=txtEntregable.getText();
        Nodo p=ptr;
        if (!((ptr.existe(nombreEntregable, p)) || txtEntregable.getText().equals(""))&&(jTree.getLastSelectedPathComponent()!=null)) {
            System.out.println("agrega "+nombreEntregable);
            String e=jTree.getLastSelectedPathComponent().toString();
            DefaultMutableTreeNode n = (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();
            ptr.buscarPaquete(e, ptr).add(nombreEntregable,false);
            DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(nombreEntregable);
            modelo.insertNodeInto(hijo, n, n.getChildCount());
            jTree.setModel(modelo);
            txtEntregable.setText("");
        }else{
            if(txtEntregable.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nombre de entregable invalido");
                txtEntregable.setText("");
            }
            if(ptr.existe(txtEntregable.getText(), p)){
                JOptionPane.showMessageDialog(null, "Ese entregable ya existe");
                txtEntregable.setText("");
            }
            if (jTree.getLastSelectedPathComponent()==null) {
                JOptionPane.showMessageDialog(null, "Seleccione un Paquete");
                txtEntregable.setText("");
            }
        }
        auxilio=p;
        depFrame.setVisible(true);
    }//GEN-LAST:event_añadirActionPerformed

    public void llenarLista(Nodo p){
        if(p == null){
            return;
        }    
        if(p.paquete == false){
            modeloDep.addElement(p.getNombre());
        }
        llenarLista(p.getlLink());
        llenarLista(p.getrLink());
        
    }
    
    private void txtEntregableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntregableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntregableActionPerformed
    /**
     * Subrutina encargada de mostrar el reporte
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "los nodos terminales son: "+ ptr.nodosHoja(ptr));
        if (ptr.unSoloEntregable(ptr).equals("")) {
            JOptionPane.showMessageDialog(null, "No hay nodos con un solo entregable");
        }else{
            JOptionPane.showMessageDialog(null, "Los paquetes con un solo entrgable son: "+ ptr.unSoloEntregable(ptr));
        }
        JOptionPane.showMessageDialog(null, "La altura del arbol es: "+ ptr.altura(ptr));
       //frame para mostrar los recorridos
         jFrame2.setVisible(true); 
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * Llamado a los recorridos
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        recorridoPreorden();
        recorridoInorden();
        recorridoPosorden();
    }//GEN-LAST:event_jButton3ActionPerformed
    /**
     * Subrutina encargada de guardar los elementos del arbol en el archivo file
     * @param evt 
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try
        {
            w = new FileWriter(file);
            bw = new BufferedWriter(w);
            pw = new PrintWriter(bw);

            Nodo p = ptr.getlLink();
            Nodo h = null;
                if (p!=null) {
                    while (p != null) {
                        h = p;
                        pw.println(p.getNombre());
                        p = p.getlLink();
                        while (h.getrLink() != null) {
                            h = h.getrLink();
                            pw.println("   "+h.getNombre());
                        }                       
                    }
                }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != file)
              pw.close();
              bw.close();
              JOptionPane.showMessageDialog(rootPane, "Se ha guardado correctamente");
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void selectDependActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDependActionPerformed
        
        int indice = depList.getSelectedIndex();
        Object dep = modeloDep.getElementAt(indice);
        String s = dep.toString();
        Nodo auxi = ptr;
        auxi.buscarEntregable(s, ptr);
        auxilio.dependencia = auxi;
        depFrame.setVisible(false);
    }//GEN-LAST:event_selectDependActionPerformed

    public void recorridoPreorden()
    {
        ayudantePreorden(ptr);
    }
    
    //recorrido preorden 
    private void ayudantePreorden(Nodo nodo) {
        if (nodo == null) {
            return;
        }
        System.out.print(nodo.getNombre() + " ");
        modelo1.addElement(nodo.getNombre());
        ayudantePreorden(nodo.getlLink());   
        ayudantePreorden(nodo.getrLink());     
    }
    
    public void recorridoInorden()
    {
        ayudanteInorden(ptr);
    }
    
     //recorrido inorden
    private void ayudanteInorden( Nodo nodo)
    {
        if(nodo == null)
            return;
         
        ayudanteInorden(nodo.getlLink());
        System.out.print(nodo.getNombre() + " ");
        modelo2.addElement(nodo.getNombre());
        ayudanteInorden(nodo.getrLink());
    }
    
    public void recorridoPosorden()
    {
        ayudantePosorden(ptr);        
    }
     
    //recorrido posorden
    private void ayudantePosorden(Nodo nodo)
    {
        if( nodo == null )
            return;
         
        ayudantePosorden(nodo.getlLink());
        ayudantePosorden(nodo.getrLink());
        System.out.print(nodo.getNombre() + " ");
        modelo3.addElement(nodo.getNombre());
    }
    
    /**
     * Subrutina ecargada de cargar los datos del archivo en el programa, los 
     * carga tanto en el jtree como en el arbol
     * @param archivo
     * @param ptr
     * @param modelo
     * @param jTree
     * @throws FileNotFoundException
     * @throws IOException 
     */
    void leerArchivo(File archivo, Nodo ptr, DefaultTreeModel modelo, javax.swing.JTree jTree) throws FileNotFoundException, IOException {
        String a;
        Nodo p=ptr;
        FileReader f = new FileReader(archivo);
        String padr="";
        DefaultMutableTreeNode padre=null;
        try (BufferedReader b = new BufferedReader(f)) {
            while((a = b.readLine())!=null) {
                if (!(a.contains("   "))) {
                    if (!(ptr.existe(a, p)) && !(a.equals(""))) {
                        System.out.println("agrega "+a);
                        ptr.add(a,true);
                        padre = new DefaultMutableTreeNode(a.trim());
                        modelo.insertNodeInto(padre, ptr, ptr.getChildCount());
                    }else{
                        if(a.equals("")){
                            //JOptionPane.showMessageDialog(null, "Nombre de paquete invalido");
                        }
                        if(ptr.existe(a, p)){
                            //JOptionPane.showMessageDialog(null, "Ese paquete ya existe");
                        }
                    }
                    padr = a;
                }
                
                if(a.startsWith("   ")){
                        String nombreEntregable=a.trim();
                        //String nombrePaquete=jTree.get;
                        //Nodo padre=ptr.buscarPaquete(nombrePaquete, ptr);
                        if (!(ptr.existe(nombreEntregable, p))) {
                            System.out.println("agrega "+nombreEntregable);
                            ptr.buscarPaquete(padr, ptr).add(nombreEntregable,false);
                            DefaultMutableTreeNode n = new DefaultMutableTreeNode(nombreEntregable);
                            DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(nombreEntregable);
                            modelo.insertNodeInto(hijo, padre, n.getChildCount());
                        }else{
                            if(a.equals("")){
                                JOptionPane.showMessageDialog(null, "Nombre de entregable invalido");
                            }
                            if(ptr.existe(a, p)){
                                JOptionPane.showMessageDialog(null, "Ese entregable ya existe");
                            }
                            if (jTree.getLastSelectedPathComponent()==null) {
                                JOptionPane.showMessageDialog(null, "Seleccione un Paquete");
                            }
                        }
                }
            }
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(GestorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GestorFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GestorFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadir;
    private javax.swing.JPasswordField contraseñaAccounttxt;
    private javax.swing.JFrame depFrame;
    private javax.swing.JList<String> depList;
    public DefaultListModel modeloDep;
    private javax.swing.JList<String> inList;
    public DefaultListModel modelo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTree jTree;
    private javax.swing.JTextField nombreAccounttxt;
    private javax.swing.JTextField nombrePaquetetxt;
    private javax.swing.JList<String> postList;
    public DefaultListModel modelo3;
    private javax.swing.JList<String> preList;
    public DefaultListModel modelo1;
    private javax.swing.JButton selectDepend;
    private javax.swing.JTextField txtEntregable;
    // End of variables declaration//GEN-END:variables
}
