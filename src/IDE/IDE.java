/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IDE;

import lp_rhs.LP_RHS;
import lp_rhs.AuxLexico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.AttributeSet;

/**
 *
 * @author AkiibaRichard
 */

public class IDE extends javax.swing.JFrame {
    public IDE() {
        initComponents();
       
    }

    String pahtFile="";//est avriable guarda la ruta del archivo a analizar
    String Resultado="";//esta variable guardara la entrada para el auxiliar del analizador lexico
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_ejecutar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tokenTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaContenido = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnAbrirArchivo = new javax.swing.JMenuItem();
        btnGuardar = new javax.swing.JMenuItem();
        btn_GuardarComo = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        btn_ejecutar.setText("Ejecutar");
        btn_ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ejecutarActionPerformed(evt);
            }
        });

        txtSalida.setFont(new java.awt.Font("HP Simplified Light", 1, 13)); // NOI18N
        txtSalida.setForeground(new java.awt.Color(255, 0, 0));
        jScrollPane4.setViewportView(txtSalida);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tokenTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lexema", "Token"
            }
        ));
        jScrollPane3.setViewportView(tokenTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Salida");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Tokens");

        txtAreaContenido.setColumns(20);
        txtAreaContenido.setRows(5);
        jScrollPane1.setViewportView(txtAreaContenido);

        jMenu1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu1.setText("Inicio");
        jMenu1.setFont(new java.awt.Font("HP Simplified Jpan Light", 3, 18)); // NOI18N

        btnAbrirArchivo.setFont(new java.awt.Font("HP Simplified Light", 3, 15)); // NOI18N
        btnAbrirArchivo.setText("Abrir");
        btnAbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirArchivoActionPerformed(evt);
            }
        });
        jMenu1.add(btnAbrirArchivo);

        btnGuardar.setFont(new java.awt.Font("HP Simplified Light", 3, 15)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(btnGuardar);

        btn_GuardarComo.setFont(new java.awt.Font("HP Simplified Light", 1, 14)); // NOI18N
        btn_GuardarComo.setText("Guardar como");
        btn_GuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarComoActionPerformed(evt);
            }
        });
        jMenu1.add(btn_GuardarComo);

        btnSalir.setFont(new java.awt.Font("HP Simplified Light", 3, 15)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jMenu1.add(btnSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenu2.setFont(new java.awt.Font("HP Simplified Jpan Light", 3, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("HP Simplified Light", 3, 15)); // NOI18N
        jMenuItem2.setText("Manual de Usuario");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("HP Simplified Light", 3, 15)); // NOI18N
        jMenuItem3.setText("Manual Tecnico");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("HP Simplified Light", 3, 15)); // NOI18N
        jMenuItem4.setText("Temas de Ayuda");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel1)
                .addGap(270, 270, 270)
                .addComponent(btn_ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirArchivoActionPerformed
        try {
             Resultado=ArbrirArchivo();//la variable resultado recive un string preparado para el analisis lexico
            if(Resultado.equals("")){}
        } 
        catch (IOException ex) {
            Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAbrirArchivoActionPerformed

    private void btn_ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ejecutarActionPerformed
        if(txtAreaContenido.getText().toString().equals("") && pahtFile.equals("")){
            txtSalida.setText(txtSalida.getText() + "\n" + "No hay codigo por ejecutar");
        }
        else{
         new LP_RHS().ejecutaLP(pahtFile, txtSalida);//ejecutamos en codigo con el nalaizador lexico javacc
         new AuxLexico().Analizar(Resultado, tokenTable);//llamamos el analizador lexico
                                           //mandamos la cadena a analizar y la tabla de tokens
        }
    }//GEN-LAST:event_btn_ejecutarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);//cerramos la ejecucion
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btn_GuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarComoActionPerformed
        GuardarComo();
    }//GEN-LAST:event_btn_GuardarComoActionPerformed
    
    //metodo que permite abrir el archivo y a analizar y prepara la entrada para el analizador lexico
    public String ArbrirArchivo() throws IOException
    {
        Scanner entrada = null, entrada2 = null;
        String Cadena = "";
        String Contenido="";//esta variable ira guardando el contedio del archivo seleccionado
           JFileChooser fileChooser = new JFileChooser();
           fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);//aplicamso un filtr en el jFileChooser 
           FileNameExtensionFilter filtro = new FileNameExtensionFilter("txt","txt");//solo elejimos archivos de texto
           fileChooser.setFileFilter(filtro);//aplicamos el filtro
          int seleccionado= fileChooser.showOpenDialog(fileChooser);
           if(seleccionado == JFileChooser.APPROVE_OPTION){
            try {
               String ruta = fileChooser.getSelectedFile().getAbsolutePath(); 
               pahtFile=ruta;//al abrir un arcvhivo guradamos su direccion para despues mandarsela al compilador de LP_RHS 
               File f = new File(ruta);       
               entrada = new Scanner(f);
               entrada2=new Scanner(f);
               while (entrada.hasNext()) {//preparamos la entradad ára el analizador lexico
                   Cadena += entrada.nextLine() + " ";
               }
               while(entrada2.hasNext()){//este segundo siclo es epara llenar el contenido que se presentara en la primera venta
                   Contenido+=entrada2.nextLine() + "\n";
               }
           } 
           catch (FileNotFoundException e) {
               txtSalida.setText(txtSalida.getText() + "\n" + e.getMessage());
               //System.out.println(e.getMessage());
           } 
           catch (NullPointerException e) {
               txtSalida.setText(txtSalida.getText() + "\n" + e.getMessage() + "No se ha seleccionado ningún fichero");
           } 
           catch (Exception e) {
               txtSalida.setText(txtSalida.getText() + "\n" + e.getMessage());
               //System.out.println(e.getMessage());
           } 
           finally {
               if (entrada != null && entrada2!=null) {
                   entrada.close();
                   entrada2.close();
               }
           }  
           txtAreaContenido.setText(Contenido);
           return Cadena;//retornamos la cadena la cadena con lostoken si se llego a lejir un archivo .txt
           }
          return Cadena;//si no se llego a seleccionar un archivo .txt retornamos una cadena vacio
	}
  
        public void guardar(){
            if(pahtFile.equals("")){
                GuardarComo();
            }
            else{
                FileWriter fichero = null;
               PrintWriter pw = null;
               try
               {
                   fichero = new FileWriter(pahtFile);
                   pw = new PrintWriter(fichero);
                   pw.write(txtAreaContenido.getText());

               } 
                   catch (Exception e) {
                   e.printStackTrace();
               } 
               finally 
               {
                  try {
                      CargarArchivo();//si hacemos modificaciones sobre el jTextPane y damos en guardar, cargamos el archivo nuevamente
                   // Nuevamente aprovechamos el finally para 
                   // asegurarnos que se cierra el fichero.
                   if (null != fichero){
                      fichero.close();
                    }
                  } 
                  catch (Exception e2) {
                     e2.printStackTrace();
                  }
               }    
            }
        }
        
        public void GuardarComo(){
            String texto = txtAreaContenido.getText();//variable para comparacion
        
        if (texto.matches("[[ ]*[\n]*[\t]]*")) {//compara si en el JTextArea hay texto sino muestrtra un mensaje en pantalla
            JOptionPane.showMessageDialog(null,"No hay texto para guardar!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("todos los archivos *.txt", "txt","txt"));//filtro para ver solo archivos .legnf
            int seleccion = fileChooser.showSaveDialog(null);
            try{
                if (seleccion == JFileChooser.APPROVE_OPTION){//comprueba si ha presionado el boton de aceptar
                    File JFC = fileChooser.getSelectedFile();
                    String PATH = JFC.getAbsolutePath();//obtenemos el path del archivo a guardar
                    pahtFile=PATH;//actualizamos la varible glovalq ue guarda la direccion del archivo a ejecutar
                    PrintWriter printwriter = new PrintWriter(JFC);
                    printwriter.print(txtAreaContenido.getText());//escribe en el archivo todo lo que se encuentre en el JTextArea
                    printwriter.close();//cierra el archivo
                    
                    //comprobamos si a la hora de guardar obtuvo la extension y si no se la asignamos
                    if(!(PATH.endsWith(".txt"))){
                        File temp = new File(PATH+".txt");
                        JFC.renameTo(temp);
                    }
                    
                    JOptionPane.showMessageDialog(null,"Guardado exitoso!", "Guardado exitoso!", JOptionPane.INFORMATION_MESSAGE);
                    CargarArchivo();
                }
            }catch (Exception e){//por alguna excepcion salta un mensaje de error
                JOptionPane.showMessageDialog(null,"Error al guardar el archivo!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }    
        
    
    
        }
        
        public void CargarArchivo(){
            Scanner entrada=null, entrada2=null; 
            String Cadena="", Contenido="";
            try{
               File f = new File(pahtFile);  //cuando valvamos a cargar el archivo, utilizamos la variable global que guarda la direccion dle archivo abierto     
               entrada = new Scanner(f);
               entrada2=new Scanner(f);
               while (entrada.hasNext()) {//preparamos la entradad ára el analizador lexico
                   Cadena += entrada.nextLine() + " ";
               }
               while(entrada2.hasNext()){//este segundo siclo es epara llenar el contenido que se presentara en la primera venta
                   Contenido+=entrada2.nextLine() + "\n";
               }
           } 
           catch (FileNotFoundException e) {
               txtSalida.setText(txtSalida.getText() + "\n" + e.getMessage());
               //System.out.println(e.getMessage());
           } 
           catch (NullPointerException e) {
               txtSalida.setText(txtSalida.getText() + "\n" + e.getMessage() + "No se ha seleccionado ningún fichero");
           } 
           catch (Exception e) {
               txtSalida.setText(txtSalida.getText() + "\n" + e.getMessage());
               //System.out.println(e.getMessage());
           } 
           finally {
               if (entrada != null && entrada2!=null) {
                   entrada.close();
                   entrada2.close();
               }
           }  
            Resultado=Cadena;
        }
    
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
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IDE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAbrirArchivo;
    private javax.swing.JMenuItem btnGuardar;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenuItem btn_GuardarComo;
    private javax.swing.JButton btn_ejecutar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTable tokenTable;
    private javax.swing.JTextArea txtAreaContenido;
    public javax.swing.JTextPane txtSalida;
    // End of variables declaration//GEN-END:variables

    private Object getDocument() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setCaretPosition(int len) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setCharacterAttributes(AttributeSet aset, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
