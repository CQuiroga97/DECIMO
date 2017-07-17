
package game_2d;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author CristianDavid
 */
public class Sprite extends javax.swing.JFrame {
 Stand postura = new Stand();
 Patada kick = new Patada();
 Imagen Imagen = new Imagen();
 Izquierda izquierda = new Izquierda();
 Derecha derecha = new Derecha();
    public Sprite() {
        initComponents();
        Stand=0;
         postura.start();
         Derecha();
    }

public int b, a, Stand, x, y, i, Derecha_ini, Izquierda_ini;

boolean pat=true;
String Imagen2;

public class Imagen extends javax.swing.JPanel{
    
public Imagen(){
    setSize(150, 300);
    setLocation(x,y);
   setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));

}    
    
@Override
    public void paint(Graphics G){
 
        ImageIcon Img = new ImageIcon(getClass().getResource(Imagen2));
        G.drawImage(Img.getImage(), a, b, 1000, 300, null);
        //JOptionPane.showMessageDialog(null, Integer.toString(H.height) + " " + Integer.toString(H.width));
        super.paintComponents(G);
        
    }
}

public class Patada extends Thread{
    @Override
    public void run(){
     patada_ini=1;


a=0;
b=0;

 try {

while(pat){
    Imagen2 = "/Spriters/Kick.png";
    jPanel1.add(Imagen);
    jPanel1.repaint();
   Thread.sleep(120);
   a= a-145;
   if(a==-725)pat=false;
      // JOptionPane.showMessageDialog(null, Integer.toString(d));
    }

a=0;
 postura.resume();
   //this.suspend();
 } catch (InterruptedException ex) {
     Logger.getLogger(Sprite.class.getName()).log(Level.SEVERE, null, ex);
}
}
}

public class Stand extends Thread{
        @Override
    public void run(){
        Stand=0;
        //int i=0;

        try {
            
            a=0;
        while(Stand==0){
           // i++;
            Imagen2 = "/Spriters/Stand.png";
            //Imagen.setLocation(i, 0);
            jPanel1.add(Imagen);
            jPanel1.repaint();
            a=a-150;
             
   
                Thread.sleep(120);
                if(a==-750)a=0;
            
                        }
        } catch (InterruptedException ex) {
                Logger.getLogger(Sprite.class.getName()).log(Level.SEVERE, null, ex);
                                                }
    }
}

public class Derecha extends Thread{
        @Override
    public void run(){
        Derecha_ini=1;
        Stand=0;
         i=0;

        try {
            
            a=0;
        while(Stand==0){
           i=i+2;
            Imagen2 = "/Spriters/Stand.png";
            Imagen.setLocation(i, 0);
            jPanel1.add(Imagen);
            jPanel1.repaint();
            a=a-150;
             
   
                Thread.sleep(120);
                if(a==-750)a=0;
            
                        }
        } catch (InterruptedException ex) {
                Logger.getLogger(Sprite.class.getName()).log(Level.SEVERE, null, ex);
                                                }
    }
}

public class Izquierda extends Thread{
        @Override
    public void run(){
        Izquierda_ini=1;
        Stand=0;
        

        try {
            
            a=0;
        while(Stand==0){
           i=i-2;
            Imagen2 = "/Spriters/Stand.png";
            Imagen.setLocation(i, 0);
            jPanel1.add(Imagen);
            jPanel1.repaint();
            a=a-150;
             
   
                Thread.sleep(120);
                if(a==-750)a=0;
            
                        }
        } catch (InterruptedException ex) {
                Logger.getLogger(Sprite.class.getName()).log(Level.SEVERE, null, ex);
                                                }
    }
}

int patada_ini=0;

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton1KeyReleased(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(662, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("Stop");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Patada");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });

        jButton4.setText("Derecha");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Izquierda");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(366, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    postura.resume();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    postura.suspend();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    if(patada_ini==1){

        postura.suspend();
        pat=true;
        Patada kick = new Patada();
        kick.start();
       

    }else{
        postura.suspend();
        kick.start();
    }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed

    }//GEN-LAST:event_jButton3KeyPressed
boolean R_Pressed, L_Pressed;
public void Izquierda(){
    if(L_Pressed){
         if(Izquierda_ini==1){
    postura.suspend();
derecha.suspend();
izquierda.resume();
}else{
    postura.suspend();
    derecha.suspend();
    izquierda.start();
}
    }else if(!L_Pressed){
        postura.resume();
        izquierda.suspend();
    }
   
}
public void Derecha(){
     if(R_Pressed){
        if(Derecha_ini==1){
    postura.suspend();
izquierda.suspend();
derecha.resume();
}else{
    postura.suspend();
izquierda.suspend();
derecha.start();
}
        
        }else if(!R_Pressed){
            postura.resume();
            derecha.suspend();
    }
}
    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
   if(evt.getKeyCode()==KeyEvent.VK_RIGHT){
    R_Pressed=true;
    Derecha();
} else if(evt.getKeyCode()==KeyEvent.VK_LEFT){
    L_Pressed=true;
    Izquierda();
}
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased
if(evt.getKeyCode()==KeyEvent.VK_RIGHT){
        R_Pressed=false;
Derecha();}else if(evt.getKeyCode()==KeyEvent.VK_LEFT){
    L_Pressed=false;
    Izquierda();
}
    }//GEN-LAST:event_jButton1KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
if(Derecha_ini==1){
    postura.suspend();
izquierda.suspend();
derecha.resume();
}else{
    postura.suspend();
izquierda.suspend();
derecha.start();
}


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
if(Izquierda_ini==1){
    postura.suspend();
derecha.suspend();
izquierda.resume();
}else{
    postura.suspend();
    derecha.suspend();
    izquierda.start();
}

    }//GEN-LAST:event_jButton5ActionPerformed


    
    
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
            java.util.logging.Logger.getLogger(Sprite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sprite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sprite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sprite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sprite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
