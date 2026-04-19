package tampilan;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Pelanggan extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel model;

    public Pelanggan() {
        initComponents();
        conn = koneksi.Koneksi.connect();
        tampilData();
        setStatus(false);
    }

    // =====================
    // SET STATUS TOMBOL
    // =====================
    void setStatus(boolean status) {
        txtid.setEditable(status);
        txtnm.setEditable(status);
        txttelp.setEditable(status);
        txtalamat.setEditable(status);
        rlaki.setEnabled(status);
        rperempuan.setEnabled(status);
        bsimpan.setEnabled(status);
        bbatal.setEnabled(status);
        bubah.setEnabled(!status);
        bhapus.setEnabled(!status);
    }

    // =====================
    // TAMPIL DATA
    // =====================
    void tampilData() {
        model = new DefaultTableModel(
            new String[]{"ID", "Nama", "Jenis Kelamin", "No. Telepon", "Alamat"}, 0
        );
        tblplgn.setModel(model);
        try {
            String sql = "SELECT * FROM pelanggan";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id_pelanggan"),
                    rs.getString("nama"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("no_telepon"),
                    rs.getString("alamat")
                });
            }
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Gagal tampil: " + ex.getMessage());
        }
    }

    // =====================
    // BERSIH FORM
    // =====================
    void bersihForm() {
        txtid.setText("");
        txtnm.setText("");
        txttelp.setText("");
        txtalamat.setText("");
        rlaki.setSelected(true);
        txtcari.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnm = new javax.swing.JTextField();
        rlaki = new javax.swing.JRadioButton();
        rperempuan = new javax.swing.JRadioButton();
        txttelp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        bsimpan = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        txtcari = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblplgn = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {{null,null,null,null},{null,null,null,null}},
            new String [] {"Title 1","Title 2","Title 3","Title 4"}
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA PELANGGAN");

        txtid.setText("");
        txtnm.setText("");
        txttelp.setText("");
        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        rlaki.setText("Laki-Laki");
        rperempuan.setText("Perempuan");

        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bubah.setText("Ubah");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bbatal.setText("Batal");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        bkeluar.setText("Keluar");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        bcari.setText("Cari");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        tblplgn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {{null,null,null,null},{null,null,null,null}},
            new String [] {"Title 1","Title 2","Title 3","Title 4"}
        ));
        jScrollPane3.setViewportView(tblplgn);

        jLabel2.setText("ID Pelanggan");
        jLabel3.setText("Nama Pelanggan");
        jLabel4.setText("Jenis Kelamin");
        jLabel5.setText("No.Telp");
        jLabel6.setText("Alamat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bsimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bkeluar)
                                .addGap(23, 23, 23))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(txttelp)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rlaki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rperempuan)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtnm)
                            .addComponent(txtid))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rlaki)
                    .addComponent(rperempuan)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bsimpan)
                            .addComponent(bubah)
                            .addComponent(bhapus)
                            .addComponent(bbatal)
                            .addComponent(bkeluar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bcari))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    // =====================
    // ACTION PERFORMED
    // =====================
    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {
        String jk = rlaki.isSelected() ? "Laki-laki" : "Perempuan";
        try {
            String sql = "INSERT INTO pelanggan VALUES (?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, txtid.getText());
            ps.setString(2, txtnm.getText());
            ps.setString(3, jk);
            ps.setString(4, txttelp.getText());
            ps.setString(5, txtalamat.getText());
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            tampilData();
            bersihForm();
            setStatus(false);
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Gagal simpan: " + ex.getMessage());
        }
    }

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {
        int row = tblplgn.getSelectedRow();
        if (row >= 0) {
            setStatus(true);
            txtid.setText(model.getValueAt(row, 0).toString());
            txtnm.setText(model.getValueAt(row, 1).toString());
            String jk = model.getValueAt(row, 2).toString();
            if (jk.equals("Laki-laki")) rlaki.setSelected(true);
            else rperempuan.setSelected(true);
            txttelp.setText(model.getValueAt(row, 3).toString());
            txtalamat.setText(model.getValueAt(row, 4).toString());
            txtid.setEditable(false);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih data yang ingin diubah!");
        }
    }

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {
        int row = tblplgn.getSelectedRow();
        if (row >= 0) {
            int konfirmasi = javax.swing.JOptionPane.showConfirmDialog(this,
                "Yakin ingin hapus data ini?", "Konfirmasi",
                javax.swing.JOptionPane.YES_NO_OPTION);
            if (konfirmasi == javax.swing.JOptionPane.YES_OPTION) {
                try {
                    String id = model.getValueAt(row, 0).toString();
                    String sql = "DELETE FROM pelanggan WHERE id_pelanggan=?";
                    ps = conn.prepareStatement(sql);
                    ps.setString(1, id);
                    ps.executeUpdate();
                    javax.swing.JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
                    tampilData();
                } catch (SQLException ex) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Gagal hapus: " + ex.getMessage());
                }
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!");
        }
    }

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {
        bersihForm();
        setStatus(false);
    }

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String sql = "SELECT * FROM pelanggan WHERE nama LIKE ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + txtcari.getText() + "%");
            rs = ps.executeQuery();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id_pelanggan"),
                    rs.getString("nama"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("no_telepon"),
                    rs.getString("alamat")
                });
            }
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Gagal cari: " + ex.getMessage());
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | 
                 IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rlaki;
    private javax.swing.JRadioButton rperempuan;
    private javax.swing.JTable tblplgn;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnm;
    private javax.swing.JTextField txttelp;
    // End of variables declaration
}