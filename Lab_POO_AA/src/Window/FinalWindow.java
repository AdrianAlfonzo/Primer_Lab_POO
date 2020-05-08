package Window;
import Class.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AA2020
 */
public class FinalWindow extends javax.swing.JFrame {
    ArrayList<Animals> animalsList;
    DefaultTableModel modelTable;
    
    /**
     * Creates new form FinalWindow
     */
    public FinalWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.animalsList = new ArrayList<>();
        this.modelTable= (DefaultTableModel) this.jTableInfoMasctoas.getModel();
        
        //Fish null = new Fish(fishFood, fishType, fishName, fishColor, fishSize, fishGenre, animalType);
        Fish fishOne = new Fish("Concentrado", "Pez Payaso", "Adán", "Naranja y Blanco", "10", "Masculino", "Pez");
        Fish fishTwo = new Fish("Concentrado", "Pez Beta", "Ágata", "Rojo", "10", "Femenino", "Pez");
        Fish fishThree = new Fish("Algas", "Pez Guppy", "Happy", "Verde", "15", "Masculino", "Pez");
        Fish fishFour = new Fish("Concentrado", "Pez Cirujano Azul", "Rufus", "Azúl, Negro y Amarillo", "9", "Masculino", "Pez");
        Fish fishFive = new Fish("Concentrado", "Pez Luna", "Arizona", "Azúl", "11", "Femenino", "Pez");
        //Bird null = new Bird(birdType, birdFood, birdName, birdColor, birdSize, birdGenre, animalType)
        Bird birdOne = new Bird("Diamante Mandarín", "Semillas", "Kiwi", "Naranja y Blanco", "10", "Masculino", "Ave");
        Bird birdTwo = new Bird("Cotorra", "Concentrado", "Ciro", "Verde", "35", "Masculino", "Ave");
        Bird birdThree = new Bird("Perico Australiano", "Pan", "Nigel", "Azúl", "18", "Masculino", "Ave");
        Bird birdFour = new Bird("Canario", "Semillas", "Rubí", "Amarillo", "8", "Femenino", "Ave");
        Bird birdFive = new Bird("Loro", "Semillas", "Saly Tiky", "Verde", "40", "Femenino", "Ave");
        //Rodent rodent = new Rodent(rodentSpecie, rodentFood, rodentName, rodentColor, rodentSize, rodentGenre, animalType)
        Rodent rodentOne = new Rodent("Hámster", "Come de todo", "Lizzy", "Blanca", "12", "Femenino", "Roedor");
        Rodent rodentTwo = new Rodent("Ratón", "Hierbas", "Ingrid", "Café", "40", "Femenino", "Roedor");
        Rodent rodentThree = new Rodent("Rata", "Granos", "Bigotes", "Negro", "6", "Masculino", "Roedor");
        Rodent rodentFour = new Rodent("Cobaya", "Hierbas", "Mimi", "Café", "12", "Femenino", "Roedor");
        Rodent rodentFive = new Rodent("Hurón", "Granos", "Blu", "Negro", "50", "Masculino", "Roedor");
        //Reptile reptile = new Reptile(reptileSpecie, reptileVenom, reptileName, reptileColor, reptileSize, reptileGenre, animalType)
        Reptile reptileOne = new Reptile("Iguana", "Hierva", "Abadi", "Verde", "20", "Masculino", "Reptil");
        Reptile reptileTwo = new Reptile("Camaleón", "Come de todo", "Acacio", "Café", "20", "Masculino", "Reptil");
        Reptile reptileThree = new Reptile("Serpiente", "Come de todo", "Alvin", "Amarillo", "40", "Masculino", "Reptil");
        Reptile reptileFour = new Reptile("Tortuga", "Hierbas y Frutas", "Apple", "Café", "20", "Masculino", "Reptil");
        Reptile reptileFive = new Reptile("Tortuga", "Hierbas", "Arquimedes", "Verde", "20", "Masculino", "Reptil");
        //Bug bug = new Bug(bugSpecie, bugVenom, bugName, bugColor, bugSize, bugGenre, animalType)
        Bug bugOne = new Bug("Tarantula", "Come de todo", "Gizmo", "Negro", "25", "Masculino", "Insecto");
        Bug bugTwo = new Bug("Tarantula", "Come de todo", "Omega", "Café", "24", "Femenino", "Insecto");
        Bug bugThree = new Bug("Molusco", "Verduras", "Gokú", "Azúl con Verde", "8", "Masculino", "Insecto");
        Bug bugFour = new Bug("Molusco", "Verduras y Frutas", "Crack", "Verde", "7", "Masculino", "Insecto");
        Bug bugFive = new Bug("Escorpión", "Come de todo", "Hércules", "Rojo Oscuro", "12", "Masculino", "Insecto");
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        this.animalsList.add(new Animals(fishOne, birdOne, rodentOne, reptileOne, bugOne));
        this.animalsList.add(new Animals(fishTwo, birdTwo, rodentTwo, reptileTwo, bugTwo));
        this.animalsList.add(new Animals(fishThree, birdThree, rodentThree, reptileThree, bugThree));
        this.animalsList.add(new Animals(fishFour, birdFour, rodentFour, reptileFour, bugFour));
        this.animalsList.add(new Animals(fishFive, birdFive, rodentFive, reptileFive, bugFive));
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
        lblPETSTORE = new javax.swing.JLabel();
        lblIMAGEN = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTIPOMASCOTA = new javax.swing.JLabel();
        comboTipoMascota = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInfoMasctoas = new javax.swing.JTable();
        jButtonCOMPRAR = new javax.swing.JButton();
        jButtonSALIR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido a Pet Store | Tienda de Mascotas 2020 | v1.9");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        lblPETSTORE.setFont(new java.awt.Font("Broadway", 1, 36)); // NOI18N
        lblPETSTORE.setForeground(new java.awt.Color(255, 255, 0));
        lblPETSTORE.setText("PET STORE");

        lblIMAGEN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tienda.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPETSTORE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblIMAGEN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPETSTORE, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIMAGEN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        lblTIPOMASCOTA.setFont(new java.awt.Font("Broadway", 1, 24)); // NOI18N
        lblTIPOMASCOTA.setForeground(new java.awt.Color(0, 0, 204));
        lblTIPOMASCOTA.setText("Tipo de Mascota:");

        comboTipoMascota.setFont(new java.awt.Font("Broadway", 0, 24)); // NOI18N
        comboTipoMascota.setForeground(new java.awt.Color(0, 255, 255));
        comboTipoMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AVE", "INSECTO", "PEZ", "REPTIL", "ROEDOR" }));
        comboTipoMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoMascotaActionPerformed(evt);
            }
        });

        jTableInfoMasctoas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableInfoMasctoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Nombre", "Color", "Comida", "Tamaño (cm)", "Género", "Especie"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableInfoMasctoas);

        jButtonCOMPRAR.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCOMPRAR.setFont(new java.awt.Font("Broadway", 1, 24)); // NOI18N
        jButtonCOMPRAR.setForeground(new java.awt.Color(255, 255, 0));
        jButtonCOMPRAR.setText("COMPRAR");
        jButtonCOMPRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCOMPRARActionPerformed(evt);
            }
        });

        jButtonSALIR.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSALIR.setFont(new java.awt.Font("Broadway", 1, 24)); // NOI18N
        jButtonSALIR.setForeground(new java.awt.Color(255, 0, 0));
        jButtonSALIR.setText("SALIR");
        jButtonSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSALIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCOMPRAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSALIR)
                .addGap(7, 7, 7))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(lblTIPOMASCOTA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboTipoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTIPOMASCOTA, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipoMascota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCOMPRAR)
                    .addComponent(jButtonSALIR))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTipoMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoMascotaActionPerformed
        switch (comboTipoMascota.getSelectedItem().toString().toLowerCase()) {
            case "pez":
                this.modelTable.setRowCount(0);
                for (int i = 0; i < animalsList.size(); i++) {
                    String[] registro1 = {
                        this.animalsList.get(i).GetFish().GetFishType(), this.animalsList.get(i).GetFish().GetName(),
                        this.animalsList.get(i).GetFish().GetColor(), this.animalsList.get(i).GetFish().GetFishFood(),
                        this.animalsList.get(i).GetFish().GetSize(), this.animalsList.get(i).GetFish().GetGenre(), "PEZ"
                    };
                    this.modelTable.addRow(registro1);
                }   
                break;
            case "ave":
                this.modelTable.setRowCount(0);
                for (int i = 0; i < animalsList.size(); i++) {
                    String[] registro2 = {
                        this.animalsList.get(i).GetBird().GetBirdType(), this.animalsList.get(i).GetBird().GetName(),
                        this.animalsList.get(i).GetBird().GetColor(), this.animalsList.get(i).GetBird().GetBirdFood(),
                        this.animalsList.get(i).GetBird().GetSize(), this.animalsList.get(i).GetBird().GetGenre(), "AVE"
                    };
                    this.modelTable.addRow(registro2);
                }   
                break;
            case "roedor":
                this.modelTable.setRowCount(0);
                for (int i = 0; i < animalsList.size(); i++) {
                    String[] registro3 = {
                        this.animalsList.get(i).GetRodent().GetRodentSpecie(), this.animalsList.get(i).GetRodent().GetName(),
                        this.animalsList.get(i).GetRodent().GetColor(), this.animalsList.get(i).GetRodent().GetRodentFood(),
                        this.animalsList.get(i).GetRodent().GetSize(), this.animalsList.get(i).GetRodent().GetGenre(), "ROEDOR"
                    };
                    this.modelTable.addRow(registro3);
                }   
                break;
            case "reptil":
                this.modelTable.setRowCount(0);
                for (int i = 0; i < animalsList.size(); i++) {
                    String[] registro4 = {
                        this.animalsList.get(i).GetReptile().GetReptileSpecie(), this.animalsList.get(i).GetReptile().GetName(),
                        this.animalsList.get(i).GetReptile().GetColor(), this.animalsList.get(i).GetReptile().GetReptileVenom(),
                        this.animalsList.get(i).GetReptile().GetSize(), this.animalsList.get(i).GetReptile().GetGenre(), "REPTIL"
                    };
                    this.modelTable.addRow(registro4);
                }   
                break;
            case "insecto":
                this.modelTable.setRowCount(0);
                for (int i = 0; i < animalsList.size(); i++) {
                    String[] registro5 = {
                        this.animalsList.get(i).GetBug().GetBugSpecie(), this.animalsList.get(i).GetBug().GetName(),
                        this.animalsList.get(i).GetBug().GetColor(), this.animalsList.get(i).GetBug().GetBugVenom(),
                        this.animalsList.get(i).GetBug().GetSize(), this.animalsList.get(i).GetBug().GetGenre(), "INSECTO"
                    };
                    this.modelTable.addRow(registro5);
                }   
                break;
            default:
                break;
        }
    }//GEN-LAST:event_comboTipoMascotaActionPerformed

    private void jButtonCOMPRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCOMPRARActionPerformed
        if (jTableInfoMasctoas.getSelectedRow() != -1) {
            modelTable.removeRow(jTableInfoMasctoas.getSelectedRow());
        }
        JOptionPane.showMessageDialog(this, "Has comprado una nueva mascota, cuídala bien");
    }//GEN-LAST:event_jButtonCOMPRARActionPerformed

    private void jButtonSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSALIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSALIRActionPerformed

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
            java.util.logging.Logger.getLogger(FinalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboTipoMascota;
    private javax.swing.JButton jButtonCOMPRAR;
    private javax.swing.JButton jButtonSALIR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInfoMasctoas;
    private javax.swing.JLabel lblIMAGEN;
    private javax.swing.JLabel lblPETSTORE;
    private javax.swing.JLabel lblTIPOMASCOTA;
    // End of variables declaration//GEN-END:variables
}