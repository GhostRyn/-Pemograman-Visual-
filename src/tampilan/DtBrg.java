package tampilan;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class DtBrg extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel model;

    public DtBrg() {
        initComponents();
        conn = koneksi.Koneksi.connect();
        tampilData();
    }

    void tampilData() {
        model = new DefaultTableModel(
            new String[]{"Kode", "Nama Barang", "Jenis", "Harga Jual", "Harga Beli"}, 0
        );
        tblbarang.setModel(model);
        try {
            ps = conn.prepareStatement("SELECT * FROM barang");
            rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("kd_brg"),
                    rs.getString("nm_brg"),
                    rs.getString("jenis"),
                    rs.getDouble("hargajual"),
                    rs.getDouble("hargabeli")
                });
            }
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Gagal tampil: " + ex.getMessage());
        }
    }

    void bersihForm() {
        txtkode.setText("");
        txtnama.setText("");
        txtjenis.setText("");
        txthargabeli.setText("");
        txthargjual.setText("");
        txtcari.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txthargjual = new javax.swing.JTextField();
        txtjenis = new javax.swing.JTextField();
        txthargabeli = new javax.swing.JTextField();
        txtcari = new javax.swing.JTextField();
        bsimpan = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbarang = new javax.swing.JTable();
        bcari = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 20));
        jLabel1.setText("~ DATA BARANG ~");

        txtkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodeActionPerformed(evt);
            }
        });

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        txthargjual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargjualActionPerformed(evt);
            }
        });

        txthargabeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargabeliActionPerformed(evt);
            }
        });

        txtcari.setText("");
        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });

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

        bkeluar.setText("Keluar");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
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

        tblbarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, "", null, null, null}
            },
            new String [] {
                "Kode", "Nama Barang", "Jenis", "Harga Jual", "Harga Beli"
            }
        ));
        jScrollPane1.setViewportView(tblbarang);

        bcari.setText("Cari");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        jLabel2.setText("Kode Barang");
        jLabel3.setText("Nama Barang");
        jLabel4.setText("Jenis");
        jLabel5.setText("Harga Beli");
        jLabel6.setText("Harga Jual");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bhapus)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtkode)
                                    .addComponent(txtnama)
                                    .addComponent(txtjenis)
                                    .addComponent(txthargjual)
                                    .addComponent(txthargabeli, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45))
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthargjual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthargabeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsimpan)
                    .addComponent(bubah)
                    .addComponent(bkeluar)
                    .addComponent(bhapus)
                    .addComponent(bbatal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcari))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txthargjualActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txthargabeliActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            ps = conn.prepareStatement(
                "INSERT INTO barang VALUES (?,?,?,?,?)");
            ps.setString(1, txtkode.getText());
            ps.setString(2, txtnama.getText());
            ps.setString(3, txtjenis.getText());
            ps.setDouble(4, Double.parseDouble(txthargabeli.getText()));
            ps.setDouble(5, Double.parseDouble(txthargjual.getText()));
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            tampilData();
            bersihForm();
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Gagal simpan: " + ex.getMessage());
        }
    }

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {
        int row = tblbarang.getSelectedRow();
        if (row >= 0) {
            txtkode.setText(model.getValueAt(row, 0).toString());
            txtnama.setText(model.getValueAt(row, 1).toString());
            txtjenis.setText(model.getValueAt(row, 2).toString());
            txthargjual.setText(model.getValueAt(row, 3).toString());
            txthargabeli.setText(model.getValueAt(row, 4).toString());
            txtkode.setEditable(false);

            bsimpan.setText("Update");
            bsimpan.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    try {
                        ps = conn.prepareStatement(
                            "UPDATE barang SET nm_brg=?, jenis=?, hargabeli=?, hargajual=? WHERE kd_brg=?");
                        ps.setString(1, txtnama.getText());
                        ps.setString(2, txtjenis.getText());
                        ps.setDouble(3, Double.parseDouble(txthargabeli.getText()));
                        ps.setDouble(4, Double.parseDouble(txthargjual.getText()));
                        ps.setString(5, txtkode.getText());
                        ps.executeUpdate();
                        javax.swing.JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
                        tampilData();
                        bersihForm();
                        txtkode.setEditable(true);
                        bsimpan.setText("Simpan");
                    } catch (SQLException ex) {
                        javax.swing.JOptionPane.showMessageDialog(null, "Gagal ubah: " + ex.getMessage());
                    }
                }
            });
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih data yang ingin diubah!");
        }
    }

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {
        int row = tblbarang.getSelectedRow();
        if (row >= 0) {
            int konfirmasi = javax.swing.JOptionPane.showConfirmDialog(this,
                "Yakin hapus data ini?", "Konfirmasi",
                javax.swing.JOptionPane.YES_NO_OPTION);
            if (konfirmasi == javax.swing.JOptionPane.YES_OPTION) {
                try {
                    ps = conn.prepareStatement(
                        "DELETE FROM barang WHERE kd_brg=?");
                    ps.setString(1, model.getValueAt(row, 0).toString());
                    ps.executeUpdate();
                    javax.swing.JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
                    tampilData();
                    bersihForm();
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
        txtkode.setEditable(true);
        bsimpan.setText("Simpan");
    }

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            ps = conn.prepareStatement(
                "SELECT * FROM barang WHERE nm_brg LIKE ?");
            ps.setString(1, "%" + txtcari.getText() + "%");
            rs = ps.executeQuery();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("kd_brg"),
                    rs.getString("nm_brg"),
                    rs.getString("jenis"),
                    rs.getDouble("hargajual"),
                    rs.getDouble("hargabeli")
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
            java.util.logging.Logger.getLogger(DtBrg.class.getName()).log(
                java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DtBrg().setVisible(true);
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
    private javax.swing.JTable tblbarang;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txthargabeli;
    private javax.swing.JTextField txthargjual;
    private javax.swing.JTextField txtjenis;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration
}