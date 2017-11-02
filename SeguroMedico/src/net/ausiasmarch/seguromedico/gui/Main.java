/*
 * Main.java
 */
package net.ausiasmarch.seguromedico.gui;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.ausiasmarch.common.Convert;
import net.ausiasmarch.seguromedico.modelo.SeguroMedico;
import net.ausiasmarch.seguromedico.modelo.TipoTrabajo;

/**
 *
 * @author Administrador
 */
public class Main extends javax.swing.JFrame {

    private final SeguroMedico seguroMedico;

    private final static String EMPTY_STRING = "";
    private final static String SALTO_DE_LINEA = "\n";

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();

        seguroMedico = new SeguroMedico();

        iniciar();

    }

    private void iniciar() {
        jComboBoxTrabajo.addItem(TipoTrabajo.FUNCIONARIO.toString());
        jComboBoxTrabajo.addItem(TipoTrabajo.AUTONOMO.toString());
        jComboBoxTrabajo.addItem(TipoTrabajo.CUENTA_AJENA.toString());

        getContentPane().setBackground(Color.WHITE);
        setSize(910, 480);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGenero = new javax.swing.ButtonGroup();
        jLabelEdad = new javax.swing.JLabel();
        jTextFieldEdad = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jCheckBoxCoberturaCorazon = new javax.swing.JCheckBox();
        jCheckBoxCoberturaInVitro = new javax.swing.JCheckBox();
        jCheckBoxCoberturaDermatologia = new javax.swing.JCheckBox();
        jCheckBoxPediatria = new javax.swing.JCheckBox();
        jCheckBoxCoberturaOftalmologia = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jCheckBoxEnfermedadCorazon = new javax.swing.JCheckBox();
        jCheckBoxEnfermedadOjos = new javax.swing.JCheckBox();
        jCheckBoxEnfermedadPiel = new javax.swing.JCheckBox();
        jTextFieldNumHijos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxEmbarazada = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldImporteAnual = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxTrabajo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldImporteMensual = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPrecioBase = new javax.swing.JTextField();
        jLabelSeguro = new javax.swing.JLabel();
        jPanelBotones = new javax.swing.JPanel();
        jButtonCalcular = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPanelGenero = new javax.swing.JPanel();
        jRadioButtonHombre = new javax.swing.JRadioButton();
        jRadioButtonMujer = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contrataci�n de Seguro M�dico");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEdad.setText("Edad:");
        getContentPane().add(jLabelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, 20));
        getContentPane().add(jTextFieldEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 40, 20));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Coberturas Ampliadas"));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBoxCoberturaCorazon.setText("Coraz�n");
        jCheckBoxCoberturaCorazon.setOpaque(false);
        jPanel1.add(jCheckBoxCoberturaCorazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jCheckBoxCoberturaInVitro.setText("Fecundaci�n in vitro");
        jCheckBoxCoberturaInVitro.setOpaque(false);
        jPanel1.add(jCheckBoxCoberturaInVitro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jCheckBoxCoberturaDermatologia.setText("Dermatolog�a");
        jCheckBoxCoberturaDermatologia.setOpaque(false);
        jPanel1.add(jCheckBoxCoberturaDermatologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jCheckBoxPediatria.setText("Pediatr�a");
        jCheckBoxPediatria.setOpaque(false);
        jPanel1.add(jCheckBoxPediatria, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jCheckBoxCoberturaOftalmologia.setText("Oftalmolog�a");
        jCheckBoxCoberturaOftalmologia.setOpaque(false);
        jPanel1.add(jCheckBoxCoberturaOftalmologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 670, 60));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()), "Enfermedades"));
        jPanel2.setOpaque(false);

        jCheckBoxEnfermedadCorazon.setText("Coraz�n");
        jCheckBoxEnfermedadCorazon.setOpaque(false);

        jCheckBoxEnfermedadOjos.setText("Ojos");
        jCheckBoxEnfermedadOjos.setOpaque(false);

        jCheckBoxEnfermedadPiel.setText("Piel");
        jCheckBoxEnfermedadPiel.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jCheckBoxEnfermedadCorazon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jCheckBoxEnfermedadOjos)
                .addGap(202, 202, 202)
                .addComponent(jCheckBoxEnfermedadPiel)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxEnfermedadPiel)
                    .addComponent(jCheckBoxEnfermedadCorazon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBoxEnfermedadOjos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 660, 60));
        getContentPane().add(jTextFieldNumHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 40, 20));

        jLabel2.setText("N� Hijos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 70, 20));

        jCheckBoxEmbarazada.setText("Embarazada");
        jCheckBoxEmbarazada.setOpaque(false);
        getContentPane().add(jCheckBoxEmbarazada, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));

        jLabel4.setText("Importe Anual:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 110, 20));

        jTextFieldImporteAnual.setEditable(false);
        jTextFieldImporteAnual.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldImporteAnual.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldImporteAnual.setFocusable(false);
        getContentPane().add(jTextFieldImporteAnual, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 120, 20));

        jLabel10.setText("Trabajo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, 20));

        getContentPane().add(jComboBoxTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 200, -1));

        jLabel7.setText("�");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 10, 20));

        jLabel5.setText("Importe Mensual:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 130, 20));

        jTextFieldImporteMensual.setEditable(false);
        jTextFieldImporteMensual.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldImporteMensual.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldImporteMensual.setFocusable(false);
        getContentPane().add(jTextFieldImporteMensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 130, 20));

        jLabel8.setText("�");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 10, 20));

        jLabel1.setText("Precio Base:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, 20));

        jTextFieldPrecioBase.setEditable(false);
        jTextFieldPrecioBase.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPrecioBase.setText("35");
        getContentPane().add(jTextFieldPrecioBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 90, 20));

        jLabelSeguro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/seguromedico/recursos/seguros_salud.png"))); // NOI18N
        getContentPane().add(jLabelSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 190));

        jPanelBotones.setBackground(new java.awt.Color(170, 170, 170));

        jButtonCalcular.setBackground(new java.awt.Color(120, 120, 120));
        jButtonCalcular.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCalcular.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/seguromedico/recursos/data.png"))); // NOI18N
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.setToolTipText("");
        jButtonCalcular.setBorder(null);
        jButtonCalcular.setBorderPainted(false);
        jButtonCalcular.setContentAreaFilled(false);
        jButtonCalcular.setFocusPainted(false);
        jButtonCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCalcular.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCalcularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCalcularMouseExited(evt);
            }
        });
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jButtonLimpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/seguromedico/recursos/clean.png"))); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.setToolTipText("");
        jButtonLimpiar.setBorder(null);
        jButtonLimpiar.setBorderPainted(false);
        jButtonLimpiar.setContentAreaFilled(false);
        jButtonLimpiar.setFocusPainted(false);
        jButtonLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonLimpiarMouseExited(evt);
            }
        });
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/seguromedico/recursos/close.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setBorder(null);
        jButtonSalir.setBorderPainted(false);
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.setFocusPainted(false);
        jButtonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseExited(evt);
            }
        });
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 200, 460));

        jPanelGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("G�nero"));
        jPanelGenero.setOpaque(false);

        buttonGroupGenero.add(jRadioButtonHombre);
        jRadioButtonHombre.setSelected(true);
        jRadioButtonHombre.setText("Hombre");
        jRadioButtonHombre.setOpaque(false);

        buttonGroupGenero.add(jRadioButtonMujer);
        jRadioButtonMujer.setText("Mujer");
        jRadioButtonMujer.setOpaque(false);

        javax.swing.GroupLayout jPanelGeneroLayout = new javax.swing.GroupLayout(jPanelGenero);
        jPanelGenero.setLayout(jPanelGeneroLayout);
        jPanelGeneroLayout.setHorizontalGroup(
            jPanelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeneroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jRadioButtonHombre)
                .addGap(50, 50, 50)
                .addComponent(jRadioButtonMujer)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanelGeneroLayout.setVerticalGroup(
            jPanelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeneroLayout.createSequentialGroup()
                .addGroup(jPanelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonHombre)
                    .addComponent(jRadioButtonMujer))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 280, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        int edad, numHijos;
        double importeMensual, importeAnual, precioBase;

        StringBuilder sb = new StringBuilder();
        // 2) Limpiamos los campos de datos de salida o resultados
        jTextFieldImporteMensual.setText(EMPTY_STRING);
        jTextFieldImporteAnual.setText(EMPTY_STRING);

        if (!Convert.isValidInt(jTextFieldEdad.getText())) {
            sb.append(" - Edad: Valor no valido.\n");
        }
        if (!Convert.isValidInt(jTextFieldNumHijos.getText())) {
            sb.append(" - N�mero de hijos: Valor no valido.\n");
        }

        // Si hay errores de entrada (sintacticos)
        if (sb.length() > 0) {
            mensaje(sb.toString());
            // no continuamos

            return;
        }
        // 4) Hacemos las conversiones de datos numericos

        edad = Convert.parseInt(jTextFieldEdad.getText());
        numHijos = Convert.parseInt(jTextFieldNumHijos.getText());
        precioBase = Convert.parseDouble(jTextFieldPrecioBase.getText());

        // 5) Pasamos los datos de entrada a SeguroMedico
        // Los numericos
        seguroMedico.setEdad(edad);
        seguroMedico.setNumHijos(numHijos);
        seguroMedico.setPrecioBase(precioBase);

        // y los boleanos de los RadioButtons
        seguroMedico.setHombre(jRadioButtonHombre.isSelected());
        seguroMedico.setMujer(jRadioButtonMujer.isSelected());

        // y los boleanos de los ComboBox
        seguroMedico.setTrabajo(jComboBoxTrabajo.getSelectedItem().toString());

        // y los boleanos de los CheckBox
        seguroMedico.setEmbarazada(jCheckBoxEmbarazada.isSelected());
        seguroMedico.setEnfermedadOjos(jCheckBoxEnfermedadOjos.isSelected());
        seguroMedico.setEnfermedadCorazon(jCheckBoxEnfermedadCorazon.isSelected());
        seguroMedico.setEnfermedadPiel(jCheckBoxEnfermedadPiel.isSelected());
        seguroMedico.setCoberturaCorazon(jCheckBoxCoberturaCorazon.isSelected());
        seguroMedico.setCoberturaOftalmologica(jCheckBoxCoberturaOftalmologia.isSelected());
        seguroMedico.setCoberturaDermatologia(jCheckBoxCoberturaDermatologia.isSelected());
        seguroMedico.setCoberturaInVitro(jCheckBoxCoberturaInVitro.isSelected());
        seguroMedico.setCoberturaPediatria(jCheckBoxPediatria.isSelected());

        // Si hay errores de reglas de validaci�n
        if (seguroMedico.validate() == false) { // si hay errores
            // A�adimos los mensajes devueltos por el m�todo getMensaje() de calculoCalorias al
            // objeto sb de la clase StringBuilder
            sb.append(seguroMedico.getMensaje());

            // Mostramos los mensajes de error
            mensaje(sb.toString());
            // y no continuamos 
            return;
        }
        // 6) Obtenemos c�lculos desde el objeto calculoCalorias que hemos creado arriba (calculoCalorias = new CalculoCalorias();)
        importeMensual = seguroMedico.importeMensual();
        importeAnual = seguroMedico.importeAnual();

        // 7) Mostramos los resultados con formato en los campos de salida 
        jTextFieldImporteMensual.setText(Convert.format(importeMensual, 2));
        jTextFieldImporteAnual.setText(Convert.format(importeAnual, 2));

    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void mensaje(String mensaje) {
        StringBuilder sb = new StringBuilder(SALTO_DE_LINEA);
        sb.append(mensaje);
        sb.append(SALTO_DE_LINEA);

        mensaje = sb.toString();
        JOptionPane.showMessageDialog(this, mensaje,
                "Errores:", JOptionPane.ERROR_MESSAGE);
    }

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed

        jTextFieldPrecioBase.setText("35");
        jTextFieldEdad.setText("");
        jTextFieldNumHijos.setText("");
        jRadioButtonHombre.setSelected(true);
        jComboBoxTrabajo.setSelectedItem("Funcionario");
        jCheckBoxEmbarazada.setSelected(false);
        jCheckBoxEnfermedadCorazon.setSelected(false);
        jCheckBoxEnfermedadOjos.setSelected(false);
        jCheckBoxEnfermedadPiel.setSelected(false);
        jCheckBoxCoberturaCorazon.setSelected(false);
        jCheckBoxCoberturaOftalmologia.setSelected(false);
        jCheckBoxPediatria.setSelected(false);
        jCheckBoxCoberturaInVitro.setSelected(false);
        jCheckBoxCoberturaDermatologia.setSelected(false);
        jTextFieldImporteMensual.setText("");
        jTextFieldImporteMensual.setText("");
        jTextFieldImporteAnual.setText("");


    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonCalcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCalcularMouseEntered
        onEnterButton(jButtonCalcular);

    }//GEN-LAST:event_jButtonCalcularMouseEntered

    private void jButtonCalcularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCalcularMouseExited
        onExitButton(jButtonCalcular);
    }//GEN-LAST:event_jButtonCalcularMouseExited

    private void onEnterButton(JButton boton) {
        boton.setBackground(new Color(140, 140, 140));
        boton.setOpaque(true);
    }

    private void onExitButton(JButton boton) {
        boton.setOpaque(!boton.isEnabled());
    }


    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLimpiarMouseEntered
        onEnterButton(jButtonLimpiar);
    }//GEN-LAST:event_jButtonLimpiarMouseEntered

    private void jButtonLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLimpiarMouseExited
        onExitButton(jButtonLimpiar);
    }//GEN-LAST:event_jButtonLimpiarMouseExited

    private void jButtonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseEntered
        onEnterButton(jButtonSalir);
    }//GEN-LAST:event_jButtonSalirMouseEntered

    private void jButtonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseExited
        onExitButton(jButtonSalir);
    }//GEN-LAST:event_jButtonSalirMouseExited


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            String look = UIManager.getSystemLookAndFeelClassName();
            javax.swing.UIManager.setLookAndFeel(look);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            throw new RuntimeException(ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGenero;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JCheckBox jCheckBoxCoberturaCorazon;
    private javax.swing.JCheckBox jCheckBoxCoberturaDermatologia;
    private javax.swing.JCheckBox jCheckBoxCoberturaInVitro;
    private javax.swing.JCheckBox jCheckBoxCoberturaOftalmologia;
    private javax.swing.JCheckBox jCheckBoxEmbarazada;
    private javax.swing.JCheckBox jCheckBoxEnfermedadCorazon;
    private javax.swing.JCheckBox jCheckBoxEnfermedadOjos;
    private javax.swing.JCheckBox jCheckBoxEnfermedadPiel;
    private javax.swing.JCheckBox jCheckBoxPediatria;
    private javax.swing.JComboBox jComboBoxTrabajo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelSeguro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelGenero;
    private javax.swing.JRadioButton jRadioButtonHombre;
    private javax.swing.JRadioButton jRadioButtonMujer;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldImporteAnual;
    private javax.swing.JTextField jTextFieldImporteMensual;
    private javax.swing.JTextField jTextFieldNumHijos;
    private javax.swing.JTextField jTextFieldPrecioBase;
    // End of variables declaration//GEN-END:variables

}