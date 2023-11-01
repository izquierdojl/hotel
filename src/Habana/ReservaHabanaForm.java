/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Habana;

import java.util.Date;
import javax.swing.JSpinner;

/**
 *
 * @author jlizquierdo
 */
public class ReservaHabanaForm extends javax.swing.JDialog {

    int modo; // modo de dialogo, 1 añadir 2 editar
    Date fecha;
    /**
     * Creates new form ReservaHabanaForm
     * @param parent
     * @param modo 1 añadir, 2 editar
     * @param fecha Feha a editar
     */
    public ReservaHabanaForm(java.awt.Dialog parent, boolean modal, int modo, Date fecha) {
        super(parent, modal);
        initComponents();
        this.modo = modo;
        this.fecha = fecha;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpRestaurante = new javax.swing.ButtonGroup();
        panelForm = new javax.swing.JPanel();
        labelContacto = new javax.swing.JLabel();
        textContacto = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();
        textTelefono = new javax.swing.JTextField();
        comTipo = new javax.swing.JComboBox<>();
        labelTipo = new javax.swing.JLabel();
        labelPersonas = new javax.swing.JLabel();
        spiPersonas1 = new javax.swing.JSpinner();
        spiFecha = new javax.swing.JSpinner();
        labelFecha = new javax.swing.JLabel();
        LabelJornadas = new javax.swing.JLabel();
        spiJornadas = new javax.swing.JSpinner();
        chkHabitaciones = new javax.swing.JCheckBox();
        panelRestaurante = new javax.swing.JPanel();
        radBufe = new javax.swing.JRadioButton();
        radCarta = new javax.swing.JRadioButton();
        radChef = new javax.swing.JRadioButton();
        radNoRest = new javax.swing.JRadioButton();
        panelBtn = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setName("dlgFormReserva"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 1, 1);
        flowLayout1.setAlignOnBaseline(true);
        getContentPane().setLayout(flowLayout1);

        panelForm.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Reserva"));
        panelForm.setName(""); // NOI18N

        labelContacto.setText("Contacto:");

        textContacto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textContacto.setToolTipText("Introduzca la persona de contacto");

        labelTelefono.setText("Teléfono:");

        textTelefono.setToolTipText("Introduzca el teléfono de contacto");

        comTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banquete", "Jornada", "Congreso" }));
        comTipo.setToolTipText("Seleccione el tipo de reserva");

        labelTipo.setText("Tipo:");

        labelPersonas.setText("Personas:");

        spiPersonas1.setModel(new javax.swing.SpinnerNumberModel(1, null, 80, 1));
        spiPersonas1.setToolTipText("Introduzca el número de Jornadas");
        spiPersonas1.setName("spiPersonas"); // NOI18N

        spiFecha.setModel(new javax.swing.SpinnerDateModel());
        spiFecha.setToolTipText("Fecha de la Reserva");
        spiFecha.setName("spiFecha"); // NOI18N

        labelFecha.setText("Fecha:");

        LabelJornadas.setText("Jornadas:");

        spiJornadas.setToolTipText("Introduzca el número de Jornadas");

        chkHabitaciones.setText("Requiere Habitaciones");
        chkHabitaciones.setToolTipText("Indique si requiere habitaciones");

        panelRestaurante.setBorder(javax.swing.BorderFactory.createTitledBorder("Servicio de Restaurante"));

        grpRestaurante.add(radBufe);
        radBufe.setText("Bufé");
        radBufe.setToolTipText("Pulse para seleccionar bufé");
        panelRestaurante.add(radBufe);

        grpRestaurante.add(radCarta);
        radCarta.setText("Carta");
        radCarta.setToolTipText("Pulse para seleccionar carta");
        panelRestaurante.add(radCarta);

        grpRestaurante.add(radChef);
        radChef.setText("Chef");
        radChef.setToolTipText("Pulse para seleccionar chef");
        panelRestaurante.add(radChef);

        grpRestaurante.add(radNoRest);
        radNoRest.setText("No Precisa");
        radNoRest.setToolTipText("Pulse si no precisa servicio de restaurante");
        panelRestaurante.add(radNoRest);

        javax.swing.GroupLayout panelFormLayout = new javax.swing.GroupLayout(panelForm);
        panelForm.setLayout(panelFormLayout);
        panelFormLayout.setHorizontalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelFormLayout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(LabelJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(spiJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormLayout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(panelRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panelFormLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(spiFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(textContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addComponent(labelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTipo)
                            .addComponent(labelPersonas))
                        .addGap(31, 31, 31)
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spiPersonas1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        panelFormLayout.setVerticalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spiFecha))
                .addGap(10, 10, 10)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTipo)
                    .addComponent(comTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spiPersonas1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPersonas))
                .addGap(18, 18, 18)
                .addComponent(panelRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spiJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkHabitaciones))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(LabelJornadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(panelForm);

        panelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBtn.setPreferredSize(new java.awt.Dimension(300, 100));
        panelBtn.setLayout(new java.awt.GridBagLayout());

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Pulse para cancelar las modificaciones de la freserva actual");
        panelBtn.add(btnCancelar, new java.awt.GridBagConstraints());

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Pulse para guardar la reserva");
        panelBtn.add(btnGuardar, new java.awt.GridBagConstraints());

        getContentPane().add(panelBtn);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(this.spiFecha, "dd/MM/yyyy"); // Puedes cambiar el formato según tus preferencias
        this.spiFecha.setEditor(dateEditor);     
        if ( this.modo==1 ) // añadir, 
        {
           this.spiFecha.setValue(new Date());
        }
        else
        {
            // editar cargamos el objeto guardado en el array list y asignamos sus datos
            
           
            
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelJornadas;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox chkHabitaciones;
    private javax.swing.JComboBox<String> comTipo;
    private javax.swing.ButtonGroup grpRestaurante;
    private javax.swing.JLabel labelContacto;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelPersonas;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JPanel panelBtn;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelRestaurante;
    private javax.swing.JRadioButton radBufe;
    private javax.swing.JRadioButton radCarta;
    private javax.swing.JRadioButton radChef;
    private javax.swing.JRadioButton radNoRest;
    private javax.swing.JSpinner spiFecha;
    private javax.swing.JSpinner spiJornadas;
    private javax.swing.JSpinner spiPersonas1;
    private javax.swing.JTextField textContacto;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
