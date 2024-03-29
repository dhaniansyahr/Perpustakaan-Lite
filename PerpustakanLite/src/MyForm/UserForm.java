/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyForm;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author meone
 */
public class UserForm extends javax.swing.JFrame {

    /**
     * Creates new form UserForm
     */
    
    MyClass.Activity a = new MyClass.Activity();
    MyClass.centerText center = new MyClass.centerText();
    
    public UserForm() {
        initComponents();
    }
    
    public void displayName(String nama, String user){
        NamaDisplay.setText(nama);
        Username.setText(user);
    }
    
    public boolean validateText(){
        if (kodeBuku.getText().trim().isEmpty() || judulBuku.getText().trim().isEmpty() || Username.getText().trim().isEmpty() 
                || Tpeminjaman.getDate().equals(null) || Tpengembalian.getDate().equals(null) || Status.getItemAt(Status.getSelectedIndex()).equals("-")){
            JOptionPane.showMessageDialog(null, "Tolong isi Data dengan Benar!!", "Failed", 2);
            return false;
        }else{
            return true;
        }
    }
    
    public void fillTable(){
        
        //add to table
        a.FillToTableInventory1(TableBook, "Dipinjam");
        
        //Set VAlue to Center
        for (int i = 0; i < TableBook.getColumnCount(); i++){
            TableBook.getColumnModel().getColumn(i).setCellRenderer(center);
        }
        
        //set Tbale Header to Center
        JTableHeader header = TableBook.getTableHeader();
        ((DefaultTableCellRenderer)header.getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        
        //Set Column Width
        TableBook.getColumnModel().getColumn(0).setPreferredWidth(70); //Kolom Kode Buku
        TableBook.getColumnModel().getColumn(1).setPreferredWidth(200); // Kolom Judul Buku
        TableBook.getColumnModel().getColumn(2).setPreferredWidth(150); // Kolon Pengarang
        TableBook.getColumnModel().getColumn(3).setPreferredWidth(150); // Kolom Penerbit
        TableBook.getColumnModel().getColumn(4).setPreferredWidth(70); // Kolom Status
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBook = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        judulBuku = new javax.swing.JTextField();
        AjukanButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kodeBuku = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Username = new javax.swing.JTextField();
        RegisButton1 = new javax.swing.JButton();
        NamaDisplay = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        LogOutLogo = new javax.swing.JLabel();
        LogOut = new javax.swing.JLabel();
        Tpengembalian = new com.toedter.calendar.JDateChooser();
        Tpeminjaman = new com.toedter.calendar.JDateChooser();
        Status = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(189, 195, 199));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableBook.setBackground(new java.awt.Color(108, 122, 137));
        TableBook.setFont(new java.awt.Font("Bitstream Charter", 0, 12)); // NOI18N
        TableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Buku", "Judul Buku", "Pengarang", "Penerbit", "Status"
            }
        ));
        TableBook.setRowHeight(40);
        TableBook.getTableHeader().setResizingAllowed(false);
        TableBook.getTableHeader().setReorderingAllowed(false);
        TableBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableBook);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 560, 480));

        jLabel3.setFont(new java.awt.Font("Bitstream Charter", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Perpustakaan Lite");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 630, 50));

        jLabel5.setFont(new java.awt.Font("Bitstream Charter", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyImage/DashboardLogolibrary.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 700, 10));

        jLabel4.setFont(new java.awt.Font("Bitstream Charter", 0, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Pengajuan ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 700, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        jLabel6.setFont(new java.awt.Font("Bitstream Charter", 0, 22)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Kode Buku");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 230, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyImage/UserProfile.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 0, -1, 60));

        judulBuku.setEditable(false);
        judulBuku.setBackground(new java.awt.Color(189, 195, 199));
        judulBuku.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        judulBuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108, 122, 137)));
        jPanel1.add(judulBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 360, 320, 30));

        AjukanButton.setBackground(new java.awt.Color(189, 195, 199));
        AjukanButton.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        AjukanButton.setText("Ajukan");
        AjukanButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108, 122, 137)));
        AjukanButton.setContentAreaFilled(false);
        AjukanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjukanButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AjukanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 560, 100, 30));

        jLabel7.setFont(new java.awt.Font("Bitstream Charter", 0, 22)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Judul Buku");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 230, -1));

        jLabel8.setFont(new java.awt.Font("Bitstream Charter", 0, 22)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Tanggal Peminjaman");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, 230, -1));

        jLabel9.setFont(new java.awt.Font("Bitstream Charter", 0, 22)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Tanggal Pengembalian");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 230, -1));

        jLabel10.setFont(new java.awt.Font("Bitstream Charter", 0, 22)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Status");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 230, -1));

        kodeBuku.setEditable(false);
        kodeBuku.setBackground(new java.awt.Color(189, 195, 199));
        kodeBuku.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        kodeBuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108, 122, 137)));
        jPanel1.add(kodeBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 310, 320, 30));

        jLabel11.setFont(new java.awt.Font("Bitstream Charter", 0, 22)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Username");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 230, -1));

        jLabel12.setFont(new java.awt.Font("Bitstream Charter", 0, 22)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Nama");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 230, -1));

        Nama.setBackground(new java.awt.Color(189, 195, 199));
        Nama.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        Nama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108, 122, 137)));
        jPanel1.add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 260, 320, 30));

        Username.setEditable(false);
        Username.setBackground(new java.awt.Color(189, 195, 199));
        Username.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        Username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108, 122, 137)));
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 210, 320, 30));

        RegisButton1.setBackground(new java.awt.Color(189, 195, 199));
        RegisButton1.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        RegisButton1.setText("Cancel");
        RegisButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108, 122, 137)));
        RegisButton1.setContentAreaFilled(false);
        jPanel1.add(RegisButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 560, 100, 30));

        NamaDisplay.setFont(new java.awt.Font("Bitstream Charter", 0, 15)); // NOI18N
        NamaDisplay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NamaDisplay.setText("jLabel2");
        jPanel1.add(NamaDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 0, 300, 60));

        jSeparator2.setForeground(new java.awt.Color(108, 122, 137));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 700, 10));

        jLabel13.setFont(new java.awt.Font("Bitstream Charter", 0, 48)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText(" Pinjaman");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 700, 80));

        LogOutLogo.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        LogOutLogo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LogOutLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyImage/Next[32px].png"))); // NOI18N
        LogOutLogo.setToolTipText("");
        LogOutLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutLogoMouseClicked(evt);
            }
        });
        jPanel1.add(LogOutLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 646, -1, 55));

        LogOut.setFont(new java.awt.Font("Bitstream Charter", 0, 24)); // NOI18N
        LogOut.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LogOut.setText("LogOut");
        LogOut.setToolTipText("");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });
        jPanel1.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, 670, 60));

        Tpengembalian.setBackground(new java.awt.Color(189, 195, 199));
        Tpengembalian.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        jPanel1.add(Tpengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 460, 320, 30));

        Tpeminjaman.setBackground(new java.awt.Color(189, 195, 199));
        Tpeminjaman.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        jPanel1.add(Tpeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 410, 320, 30));

        Status.setBackground(new java.awt.Color(189, 195, 199));
        Status.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Dipinjam" }));
        jPanel1.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 510, 320, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutLogoMouseClicked
        // TODO add your handling code here:
        LoginForm l = new LoginForm();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutLogoMouseClicked

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        // TODO add your handling code here:
        LoginForm l = new LoginForm();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try{
            DefaultTableModel model = new DefaultTableModel();
            model = (DefaultTableModel) TableBook.getModel();
            model.setRowCount(0);
            fillTable();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void TableBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableBookMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) TableBook.getModel();
        int index = TableBook.getSelectedRow();
        
        kodeBuku.setText(model.getValueAt(index, 0).toString());
        judulBuku.setText(model.getValueAt(index, 1).toString());
        Nama.setText(NamaDisplay.getText());
        
    }//GEN-LAST:event_TableBookMouseClicked

    private void AjukanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjukanButtonActionPerformed
        // TODO add your handling code here:
        String user = Username.getText().trim();
        String nama = Nama.getText().trim();
        String kode = kodeBuku.getText().trim();
        String judul = judulBuku.getText().trim();
        
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        String pinjam = dt.format(Tpeminjaman.getDate());
        String kembali = dt.format(Tpengembalian.getDate());
        String status = Status.getItemAt(Status.getSelectedIndex());
        
        a.InsertPeminjaman(user, nama, kode, judul, pinjam, kembali, status);
    }//GEN-LAST:event_AjukanButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjukanButton;
    private javax.swing.JLabel LogOut;
    private javax.swing.JLabel LogOutLogo;
    private javax.swing.JTextField Nama;
    private javax.swing.JLabel NamaDisplay;
    private javax.swing.JButton RegisButton1;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JTable TableBook;
    private com.toedter.calendar.JDateChooser Tpeminjaman;
    private com.toedter.calendar.JDateChooser Tpengembalian;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField judulBuku;
    private javax.swing.JTextField kodeBuku;
    // End of variables declaration//GEN-END:variables
}
