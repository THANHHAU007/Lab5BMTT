package bai8lab5;


import bai8lab5.ThuVien.Keys;
import java.io.BufferedReader; 
import java.io.BufferedWriter;  
import java.io.FileReader; 
import java.io.FileWriter; 
import java.security.MessageDigest;
import javax.swing.JOptionPane; 
import java.math.BigInteger; 

public class DIGITAL extends javax.swing.JFrame {

    Keys keys = new Keys();
    int blockSize = 4;
    String user;
    String pass;
    ThuVien obj = new ThuVien();
    public DIGITAL() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtgoc = new javax.swing.JTextArea();
        btndangnhap = new javax.swing.JButton();
        btnDangKy = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtvanban = new javax.swing.JTextArea();
        btnguivanban = new javax.swing.JButton();
        txtmovanban = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtcipher = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtdigital = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DIGITAL-MD5");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jLabel4.setText("Chuỗi:Username + Pass");

        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });

        txtgoc.setColumns(20);
        txtgoc.setRows(5);
        jScrollPane1.setViewportView(txtgoc);

        btndangnhap.setText("Đăng nhập");
        btndangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhapActionPerformed(evt);
            }
        });

        btnDangKy.setText("Đăng ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        jLabel5.setText("Chữ ký số + Plaintext");

        txtvanban.setColumns(20);
        txtvanban.setRows(5);
        jScrollPane2.setViewportView(txtvanban);

        btnguivanban.setText("Gửi văn bản");
        btnguivanban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguivanbanActionPerformed(evt);
            }
        });

        txtmovanban.setText("Mở Pi");
        txtmovanban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmovanbanActionPerformed(evt);
            }
        });

        jLabel6.setText("CipherText");

        txtcipher.setColumns(20);
        txtcipher.setRows(5);
        jScrollPane3.setViewportView(txtcipher);

        jLabel7.setText("Digital");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtdigital, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btndangnhap)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDangKy))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnguivanban)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtmovanban))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndangnhap)
                    .addComponent(btnDangKy))
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguivanban)
                    .addComponent(txtmovanban))
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtdigital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
         try { 
            // TODO add your handling code here: 
            String user = txtuser.getText();             String pass = txtpass.getText(); 
            String bam = ""; 
            bam = user + pass; 
            MessageDigest md = MessageDigest.getInstance("MD5"); 
            md.update(bam.getBytes()); 
            byte[] byteData = md.digest(); 
            //convert the byte to hex  
           StringBuffer hexString = new StringBuffer(); 
            for (int i = 0; i < byteData.length; i++) { 
                String hex = Integer.toHexString(0xff & byteData[i]); 
                if (hex.length() == 1) { 
                    hexString.append('0'); 
                } 
                hexString.append(hex); 
            } 
            System.out.println("Digest(in  hex  format)::  "  + 
hexString.toString()); 
            txtgoc.setText(hexString.toString()); 
            //Viết chức năng ghi File 
            BufferedWriter bw = null; 
            //ghi van ban da ma hoa 
            String fileName = "D:\\BamMD5.txt"; 
            //luu van ban  
              bw = new  BufferedWriter(new FileWriter(fileName)); 
            // ghi van ban 
            bw.write(hexString.toString()); 
            bw.close(); 
            JOptionPane.showMessageDialog(null, "Bạn Đã Đăng Ký Thành Công .Vui lòng Đăng nhập lại !!!"); 
                } catch (Exception ex) { 
           System.out.println(" Loi bam username và password :" + ex);         }
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btndangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhapActionPerformed
        String user = txtuser.getText();
            String pass = txtpass.getText();
            String bam ="";
            bam= user+pass;
            BufferedReader br= null;
            String fileName ="D:\\bamMD5.txt";
            try{
                br = new BufferedReader (new FileReader(fileName));
                StringBuffer sb = new StringBuffer();
                char[] ca = new char[5];
                while (br.ready()){
                    int len= br.read(ca);
                    sb.append(ca,0,len);
                    
                }
                br.close();
                System.out.println("chung thuc:"+" "+sb);
                String chuoi = sb.toString();
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(bam.getBytes());
        byte[] byteData = md.digest();
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i< byteData.length;i++)
        {
            String hex = Integer.toHexString(0xff & byteData[i]);
            if(hex.length() == 1){
                hexString.append('0');
            }
            hexString.append(hex);
        }
        System.out.println("Bam username vả password: " + " " +hexString.toString());
        Boolean k = hexString.toString().equals(chuoi);
        if(k==true)
        {
            JOptionPane.showMessageDialog(null,"Đăng nhập thành công");
            txtgoc.setText("Username : " +user );
        }
        else
            JOptionPane.showMessageDialog(null,"Đăng nhập thất bại");
    }catch(Exception ex){
        System.out.println("Loi dang nhap:  " + ex);
            }
    }//GEN-LAST:event_btndangnhapActionPerformed

    private void txtmovanbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmovanbanActionPerformed
         try{ 
         BufferedReader br = null; 
            String fileName = "D:\\Digital.txt";  
            br = new BufferedReader(new FileReader(fileName)); 
            StringBuffer sb = new StringBuffer(); 
            JOptionPane.showMessageDialog(null, " Đã mở file"); 
            char[] ca = new char[5];             while (br.ready()) { 
                int len = br.read(ca); 
                sb.append(ca, 0, len); 
            } 
            br.close(); 
          String chuoi = sb.toString(); 
         txtvanban.setText(chuoi); 
         String signedMsg1=chuoi; 
         String extractedMsgText =signedMsg1.substring(0,signedMsg1.indexOf('_'));    
         System.out.println("Bob's Van Ban Goc:\n" + extractedMsgText);   
        txtcipher.setText(extractedMsgText); 
   String extractedSignature = signedMsg1.substring(signedMsg1.indexOf('_') + 1);   
         System.out.println( "Bob's Digital signature:\n" + extractedSignature); 
         txtdigital.setText(extractedSignature); 
String decipheredSignature =obj.doRSA(extractedSignature,keys.e,keys.n,blockSize);    
         String decodedSignature = obj.decode(decipheredSignature);   
System.out.println("Bob's Decoded digital signature:\n" + decodedSignature); 
              if(extractedMsgText.equals(decodedSignature))    
            {      System.out.println("KO : Valid signature");  
            } 
          else{   
             System.out.println("KO: Invalid signature");    
              }//end else  }//end main 
          
           
        }catch(Exception ex){}  
    }//GEN-LAST:event_txtmovanbanActionPerformed

    private void btnguivanbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguivanbanActionPerformed
        BufferedReader br= null;
        String fileName = "D:\\BamMD5.txt";
        try{
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            char[] ca = new char[5];
            while (br.ready()){
                int len = br.read(ca);
                sb.append(ca,0,len);
            }
            br.close();
            System.out.println("Chung thuc : "+""+sb);
            String message =sb.toString();
            System.out.println("Alice's keys:");
            System.out.println("e: "+ keys.e);
            System.out.println("d: "+ keys.d);
            System.out.println("n: "+ keys.n);
            while (message.length()%(blockSize/2)!=0) {                
                message+="_";
            }
            System.out.println("chu ky goc\n" +message);
            String vanban= txtvanban.getText();
            String encodedMsg = obj.encode(message);
            String signature = obj.doRSA(encodedMsg,keys.d,keys.n,blockSize);
            System.out.println("Digital sigature\n"+signature );
            String signedMsg=vanban+""+message+""+signature +user;
            System.out.println("Van ban + Digital + xac thuc:\n"+signedMsg);
            txtcipher.setText(signedMsg);
                BufferedWriter bw = null;
            String fileNam1="D:\\Digital.txt";
            bw=new BufferedWriter(new FileWriter(fileNam1));
            bw.write(signedMsg);
            bw.close();
            JOptionPane.showMessageDialog(null,"Da Ghi File");
	}catch(Exception ex){}

    }//GEN-LAST:event_btnguivanbanActionPerformed

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
            java.util.logging.Logger.getLogger(DIGITAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DIGITAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DIGITAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DIGITAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DIGITAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btndangnhap;
    private javax.swing.JButton btnguivanban;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtcipher;
    private javax.swing.JTextField txtdigital;
    private javax.swing.JTextArea txtgoc;
    private javax.swing.JButton txtmovanban;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtuser;
    private javax.swing.JTextArea txtvanban;
    // End of variables declaration//GEN-END:variables

     
}