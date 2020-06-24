package IU;

import BaseDeDatos.EventoParticular;
import BaseDeDatos.Materia;

import javax.swing.*;

/**
 * @author marco
 */
public class VistaAgregar extends javax.swing.JFrame {
    VistaPrincipal vistaPrincipal;

    public VistaAgregar(VistaPrincipal vp) {
        //asignar usuario


        //inicializar componentes
        initComponents();
        this.vistaPrincipal = vp;
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        AgMateriaFrame.setVisible(false);
        AgEventoPFrame.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgMateriaFrame = new javax.swing.JInternalFrame();
        NombreMateria = new javax.swing.JTextField();
        AnioMateria = new javax.swing.JTextField();
        SemestreBox = new javax.swing.JComboBox<>();
        ObligatorieadMateria = new javax.swing.JCheckBox();
        MateriaNombreLabel = new javax.swing.JLabel();
        MateriaAnioLabel = new javax.swing.JLabel();
        SemestreLabel = new javax.swing.JLabel();
        BtAgMateria = new javax.swing.JButton();
        AgEventoPFrame = new javax.swing.JInternalFrame();
        NombreEventoPLabel = new javax.swing.JLabel();
        NombreEventoP = new javax.swing.JTextField();
        RubroEventoP = new javax.swing.JTextField();
        RubroLabel = new javax.swing.JLabel();
        EventoObligatorio = new javax.swing.JCheckBox();
        BtAgEventoP = new javax.swing.JButton();
        AgregarMateria = new javax.swing.JCheckBox();
        AgregarEventoP = new javax.swing.JCheckBox();
        BtVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AgMateriaFrame.setVisible(true);

        SemestreBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Primero", "Segundo"}));

        ObligatorieadMateria.setText("Obligatoria");

        MateriaNombreLabel.setText("Nombre");

        MateriaAnioLabel.setText("Anio");

        SemestreLabel.setText("Semestre");

        BtAgMateria.setText("Agregar");
        BtAgMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAgMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AgMateriaFrameLayout = new javax.swing.GroupLayout(AgMateriaFrame.getContentPane());
        AgMateriaFrame.getContentPane().setLayout(AgMateriaFrameLayout);
        AgMateriaFrameLayout.setHorizontalGroup(
                AgMateriaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AgMateriaFrameLayout.createSequentialGroup()
                                .addGroup(AgMateriaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(AgMateriaFrameLayout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(AgMateriaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(AgMateriaFrameLayout.createSequentialGroup()
                                                                .addGroup(AgMateriaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(MateriaNombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(MateriaAnioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(SemestreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                                        .addGroup(AgMateriaFrameLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(BtAgMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(AgMateriaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(AnioMateria)
                                        .addComponent(SemestreBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ObligatorieadMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(NombreMateria, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
        );
        AgMateriaFrameLayout.setVerticalGroup(
                AgMateriaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AgMateriaFrameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(AgMateriaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(MateriaNombreLabel))
                                .addGap(18, 18, 18)
                                .addGroup(AgMateriaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(MateriaAnioLabel))
                                .addGap(18, 18, 18)
                                .addGroup(AgMateriaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SemestreBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SemestreLabel))
                                .addGroup(AgMateriaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(AgMateriaFrameLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ObligatorieadMateria)
                                                .addContainerGap(43, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgMateriaFrameLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BtAgMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
        );

        AgEventoPFrame.setVisible(true);

        NombreEventoPLabel.setText("Nombre");

        NombreEventoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreEventoPActionPerformed(evt);
            }
        });

        RubroLabel.setText("Rubro");

        EventoObligatorio.setText("Obligatorio");

        BtAgEventoP.setText("Agregar");
        BtAgEventoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAgEventoPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AgEventoPFrameLayout = new javax.swing.GroupLayout(AgEventoPFrame.getContentPane());
        AgEventoPFrame.getContentPane().setLayout(AgEventoPFrameLayout);
        AgEventoPFrameLayout.setHorizontalGroup(
                AgEventoPFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgEventoPFrameLayout.createSequentialGroup()
                                .addGroup(AgEventoPFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(AgEventoPFrameLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(AgEventoPFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(NombreEventoPLabel)
                                                        .addComponent(RubroLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                                        .addGroup(AgEventoPFrameLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(BtAgEventoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(AgEventoPFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(EventoObligatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(RubroEventoP)
                                        .addComponent(NombreEventoP))
                                .addContainerGap())
        );
        AgEventoPFrameLayout.setVerticalGroup(
                AgEventoPFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AgEventoPFrameLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(AgEventoPFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NombreEventoPLabel)
                                        .addComponent(NombreEventoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(AgEventoPFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(RubroEventoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RubroLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(AgEventoPFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgEventoPFrameLayout.createSequentialGroup()
                                                .addComponent(EventoObligatorio)
                                                .addGap(41, 41, 41))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgEventoPFrameLayout.createSequentialGroup()
                                                .addComponent(BtAgEventoP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
        );

        AgregarMateria.setText("Materia");
        AgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarMateriaActionPerformed(evt);
            }
        });

        AgregarEventoP.setText("Evento Particular");
        AgregarEventoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarEventoPActionPerformed(evt);
            }
        });

        BtVolver.setText("Volver");
        BtVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(AgMateriaFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(AgEventoPFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(BtVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(AgregarMateria)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(AgregarEventoP, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)))
                                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AgregarEventoP)
                                        .addComponent(AgregarMateria))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(AgMateriaFrame)
                                        .addComponent(AgEventoPFrame))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtVolver)
                                .addContainerGap())
        );
        setUndecorated(true);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreEventoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreEventoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreEventoPActionPerformed

    private void AgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarMateriaActionPerformed
        AgMateriaFrame.setVisible(true);
        AgregarEventoP.setSelected(false);
        AgEventoPFrame.setVisible(false);
    }//GEN-LAST:event_AgregarMateriaActionPerformed

    private void AgregarEventoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarEventoPActionPerformed
        AgEventoPFrame.setVisible(true);
        AgregarMateria.setSelected(false);
        AgMateriaFrame.setVisible(false);
    }//GEN-LAST:event_AgregarEventoPActionPerformed

    private void BtVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVolverActionPerformed
        vistaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtVolverActionPerformed

    private void BtAgMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAgMateriaActionPerformed

        boolean controlFlag = true;
        boolean nombreDupliFlag = true;
        boolean nombreFlag = true;
        boolean anioFlag = true;

        //creo materia
        Materia nuevaMateria = new Materia();
        //agrego nombre y chequeo estado
        nombreFlag = nuevaMateria.setNombre(this.NombreMateria.getText());
        if(!nombreFlag) {
            JOptionPane.showMessageDialog(null, "El nombre es invalido");
            controlFlag = false;
        }

        //cheque el año
        anioFlag = anioValido(this.AnioMateria.getText());
        if(anioFlag) {
            anioFlag = nuevaMateria.setAnio(Integer.parseInt(this.AnioMateria.getText()));
        }
        if(!anioFlag) {
            controlFlag = false;
            JOptionPane.showMessageDialog(null, "Anio invalido");
        }

        //agrego obligatoriedad
        nuevaMateria.setObligatoriedad(this.ObligatorieadMateria.isSelected());
        //agrego semestre
        nuevaMateria.setSemestre(this.SemestreBox.getSelectedIndex() == 0);

        //trato de agregar la materia en la base de datos
        if(controlFlag) {
            nombreDupliFlag = this.vistaPrincipal.getUsuarioSeleccionado().addEvento(nuevaMateria);
        }
        if(!nombreDupliFlag) {
            JOptionPane.showMessageDialog(null, "Nombre de materia duplicado");
            controlFlag = false;
        }

        //si alguno de los datos no fue valido, no salgo de la vista
        if (controlFlag) {
            vistaPrincipal.agregarEventoLista(NombreMateria.getText());
            //si esta todito bien se agrega el evento y se hace visible la vista principal
            this.setVisible(false);
            vistaPrincipal.setVisible(true);
            //reseteo valores-------------------------
            AnioMateria.setText("");
            NombreMateria.setText("");
            ObligatorieadMateria.setSelected(false);
            AgregarMateria.setSelected(false);
            AgMateriaFrame.setVisible(false);
            //-----------------------------------------
        }
    }
    private void BtAgEventoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAgEventoPActionPerformed
        boolean controlFlag = true;
        boolean nombreDupliFlag = true;
        boolean nombreFlag = true;
        boolean rubroFlag = true;

        //creo evento
        EventoParticular nuevoEvento = new EventoParticular();
        //agrego nombre y chequeo estado
        nombreFlag = nuevoEvento.setNombre(this.NombreEventoP.getText());
        if(!nombreFlag) {
            JOptionPane.showMessageDialog(null, "El nombre es invalido");
            controlFlag = false;
        }
        //agrego rubro y chequeo estado
        rubroFlag = nuevoEvento.setRubro(this.RubroEventoP.getText());
        if(!rubroFlag){
            JOptionPane.showMessageDialog(null, "El rubro es invalido");
            controlFlag = false;
        }
        //agrego obligatoriedad
        nuevoEvento.setObligatoriedad(this.EventoObligatorio.isSelected());

        //trato de agregar la materia en la base de datos
        if(controlFlag) {
            nombreDupliFlag = this.vistaPrincipal.getUsuarioSeleccionado().addEvento(nuevoEvento);
        }

        if(!nombreDupliFlag) {
            JOptionPane.showMessageDialog(null, "Nombre de evento duplicado");
            controlFlag = false;
        }

        if (controlFlag) {
            vistaPrincipal.agregarEventoLista(NombreEventoP.getText());
            this.setVisible(false);
            vistaPrincipal.setVisible(true);
            //-------------------------
            RubroEventoP.setText("");
            NombreEventoP.setText("");
            EventoObligatorio.setSelected(false);
            AgEventoPFrame.setVisible(false);
            AgregarEventoP.setSelected(false);
        }
    }
    //-------------METODOS-------------------
    //******************************************

    public boolean anioValido(String val){
        //cheque contenido
        if(val.length() == 0)
            return false;
        //agrego anio y chequeo estado
        for(int a = 0 ; a<val.length() ; a++) {
            if(!(val.charAt(a) > 47 && val.charAt(a) < 58))
                return false;
        }
        return  true;
    }

    //-------------INTOCABLE-------------------
    //******************************************

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame AgEventoPFrame;
    private javax.swing.JInternalFrame AgMateriaFrame;
    private javax.swing.JCheckBox AgregarEventoP;
    private javax.swing.JCheckBox AgregarMateria;
    private javax.swing.JTextField AnioMateria;
    private javax.swing.JButton BtAgEventoP;
    private javax.swing.JButton BtAgMateria;
    private javax.swing.JButton BtVolver;
    private javax.swing.JCheckBox EventoObligatorio;
    private javax.swing.JLabel MateriaAnioLabel;
    private javax.swing.JLabel MateriaNombreLabel;
    private javax.swing.JTextField NombreEventoP;
    private javax.swing.JLabel NombreEventoPLabel;
    private javax.swing.JTextField NombreMateria;
    private javax.swing.JCheckBox ObligatorieadMateria;
    private javax.swing.JTextField RubroEventoP;
    private javax.swing.JLabel RubroLabel;
    private javax.swing.JComboBox<String> SemestreBox;
    private javax.swing.JLabel SemestreLabel;
    // End of variables declaration//GEN-END:variables
}