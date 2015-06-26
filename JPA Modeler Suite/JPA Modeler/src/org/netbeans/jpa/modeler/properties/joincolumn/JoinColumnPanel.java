/**
 * Copyright [2014] Gaurav Gupta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.netbeans.jpa.modeler.properties.joincolumn;

import javax.swing.JOptionPane;
import org.netbeans.jpa.modeler.spec.JoinColumn;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.Entity;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.RowValue;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.internal.EntityComponent;

public class JoinColumnPanel extends EntityComponent<JoinColumn> {

//    private final ModelerFile modelerFile;
    /**
     * Creates new form CreateMessagePanel
     */
    public JoinColumnPanel() {
        super("", true);
        initComponents();

    }

    @Override
    public void init() {
    }

    @Override
    public void createEntity(Class<? extends Entity> entityWrapperType) {
        this.setTitle("Create new JoinColumn");
        if (entityWrapperType == RowValue.class) {
            this.setEntity(new RowValue(new Object[4]));
        }
        name_TextField.setText("");
        referencedColumnName_TextField.setText("");
        table_TextField.setText("");
        columnDefinition_TextArea.setText("");
        unique_CheckBox.setSelected(false);
        nullable_CheckBox.setSelected(true);
        insertable_CheckBox.setSelected(true);
        updatable_CheckBox.setSelected(true);
    }

    @Override
    public void updateEntity(Entity<JoinColumn> entityValue) {
        this.setTitle("Update JoinColumn");
        if (entityValue.getClass() == RowValue.class) {
            this.setEntity(entityValue);
            Object[] row = ((RowValue) entityValue).getRow();
            JoinColumn joinColumn = (JoinColumn) row[0];
            name_TextField.setText(joinColumn.getName());
            referencedColumnName_TextField.setText(joinColumn.getReferencedColumnName());
            table_TextField.setText(joinColumn.getTable());
            columnDefinition_TextArea.setText(joinColumn.getColumnDefinition());
            unique_CheckBox.setSelected(joinColumn.isUnique());
            nullable_CheckBox.setSelected(joinColumn.isNullable());
            insertable_CheckBox.setSelected(joinColumn.isInsertable());
            updatable_CheckBox.setSelected(joinColumn.isUpdatable());

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        name_LayeredPane = new javax.swing.JLayeredPane();
        name_Label = new javax.swing.JLabel();
        name_TextField = new javax.swing.JTextField();
        table_LayeredPane = new javax.swing.JLayeredPane();
        table_Label = new javax.swing.JLabel();
        table_TextField = new javax.swing.JTextField();
        referencedColumnName_LayeredPane = new javax.swing.JLayeredPane();
        referencedColumnName_Label = new javax.swing.JLabel();
        referencedColumnName_TextField = new javax.swing.JTextField();
        columnDefinition_LayeredPane = new javax.swing.JLayeredPane();
        columnDefinition_Label = new javax.swing.JLabel();
        columnDefinition_ScrollPane = new javax.swing.JScrollPane();
        columnDefinition_TextArea = new javax.swing.JTextArea();
        layeredPane = new javax.swing.JLayeredPane();
        nullable_CheckBox = new javax.swing.JCheckBox();
        updatable_CheckBox = new javax.swing.JCheckBox();
        insertable_CheckBox = new javax.swing.JCheckBox();
        unique_CheckBox = new javax.swing.JCheckBox();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        save_Button = new javax.swing.JButton();
        cancel_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        org.openide.awt.Mnemonics.setLocalizedText(name_Label, org.openide.util.NbBundle.getMessage(JoinColumnPanel.class, "JoinColumnPanel.name_Label.text")); // NOI18N

        name_TextField.setText(org.openide.util.NbBundle.getMessage(JoinColumnPanel.class, "JoinColumnPanel.name_TextField.text")); // NOI18N

        javax.swing.GroupLayout name_LayeredPaneLayout = new javax.swing.GroupLayout(name_LayeredPane);
        name_LayeredPane.setLayout(name_LayeredPaneLayout);
        name_LayeredPaneLayout.setHorizontalGroup(
            name_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(name_LayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        name_LayeredPaneLayout.setVerticalGroup(
            name_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(name_LayeredPaneLayout.createSequentialGroup()
                .addGroup(name_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_Label)
                    .addComponent(name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        name_LayeredPane.setLayer(name_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        name_LayeredPane.setLayer(name_TextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.openide.awt.Mnemonics.setLocalizedText(table_Label, org.openide.util.NbBundle.getMessage(JoinColumnPanel.class, "JoinColumnPanel.table_Label.text")); // NOI18N

        table_TextField.setText(org.openide.util.NbBundle.getMessage(JoinColumnPanel.class, "JoinColumnPanel.table_TextField.text")); // NOI18N

        javax.swing.GroupLayout table_LayeredPaneLayout = new javax.swing.GroupLayout(table_LayeredPane);
        table_LayeredPane.setLayout(table_LayeredPaneLayout);
        table_LayeredPaneLayout.setHorizontalGroup(
            table_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_LayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(table_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        table_LayeredPaneLayout.setVerticalGroup(
            table_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_LayeredPaneLayout.createSequentialGroup()
                .addGroup(table_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(table_Label)
                    .addComponent(table_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        table_LayeredPane.setLayer(table_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        table_LayeredPane.setLayer(table_TextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.openide.awt.Mnemonics.setLocalizedText(referencedColumnName_Label, org.openide.util.NbBundle.getMessage(JoinColumnPanel.class, "JoinColumnPanel.referencedColumnName_Label.text")); // NOI18N

        referencedColumnName_TextField.setText(org.openide.util.NbBundle.getMessage(JoinColumnPanel.class, "JoinColumnPanel.referencedColumnName_TextField.text")); // NOI18N

        javax.swing.GroupLayout referencedColumnName_LayeredPaneLayout = new javax.swing.GroupLayout(referencedColumnName_LayeredPane);
        referencedColumnName_LayeredPane.setLayout(referencedColumnName_LayeredPaneLayout);
        referencedColumnName_LayeredPaneLayout.setHorizontalGroup(
            referencedColumnName_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(referencedColumnName_LayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(referencedColumnName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(referencedColumnName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        referencedColumnName_LayeredPaneLayout.setVerticalGroup(
            referencedColumnName_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(referencedColumnName_LayeredPaneLayout.createSequentialGroup()
                .addGroup(referencedColumnName_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(referencedColumnName_Label)
                    .addComponent(referencedColumnName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        referencedColumnName_LayeredPane.setLayer(referencedColumnName_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        referencedColumnName_LayeredPane.setLayer(referencedColumnName_TextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.openide.awt.Mnemonics.setLocalizedText(columnDefinition_Label, org.openide.util.NbBundle.getMessage(JoinColumnPanel.class, "JoinColumnPanel.columnDefinition_Label.text")); // NOI18N

        columnDefinition_TextArea.setColumns(20);
        columnDefinition_TextArea.setRows(5);
        columnDefinition_ScrollPane.setViewportView(columnDefinition_TextArea);

        javax.swing.GroupLayout columnDefinition_LayeredPaneLayout = new javax.swing.GroupLayout(columnDefinition_LayeredPane);
        columnDefinition_LayeredPane.setLayout(columnDefinition_LayeredPaneLayout);
        columnDefinition_LayeredPaneLayout.setHorizontalGroup(
            columnDefinition_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(columnDefinition_LayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(columnDefinition_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(columnDefinition_ScrollPane)
                .addContainerGap())
        );
        columnDefinition_LayeredPaneLayout.setVerticalGroup(
            columnDefinition_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(columnDefinition_LayeredPaneLayout.createSequentialGroup()
                .addGroup(columnDefinition_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(columnDefinition_Label)
                    .addComponent(columnDefinition_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        columnDefinition_LayeredPane.setLayer(columnDefinition_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        columnDefinition_LayeredPane.setLayer(columnDefinition_ScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        layeredPane.setLayout(new java.awt.GridLayout(1, 4));

        org.openide.awt.Mnemonics.setLocalizedText(nullable_CheckBox, org.openide.util.NbBundle.getMessage(JoinColumnPanel.class, "JoinColumnPanel.nullable_CheckBox.text")); // NOI18N
        layeredPane.add(nullable_CheckBox);

        org.openide.awt.Mnemonics.setLocalizedText(updatable_CheckBox, org.openide.util.NbBundle.getMessage(JoinColumnPanel.class, "JoinColumnPanel.updatable_CheckBox.text")); // NOI18N
        layeredPane.add(updatable_CheckBox);

        org.openide.awt.Mnemonics.setLocalizedText(insertable_CheckBox, org.openide.util.NbBundle.getMessage(JoinColumnPanel.class, "JoinColumnPanel.insertable_CheckBox.text")); // NOI18N
        layeredPane.add(insertable_CheckBox);

        org.openide.awt.Mnemonics.setLocalizedText(unique_CheckBox, org.openide.util.NbBundle.getMessage(JoinColumnPanel.class, "JoinColumnPanel.unique_CheckBox.text")); // NOI18N
        layeredPane.add(unique_CheckBox);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(name_LayeredPane)
                    .addComponent(table_LayeredPane)
                    .addComponent(referencedColumnName_LayeredPane)
                    .addComponent(columnDefinition_LayeredPane)
                    .addComponent(layeredPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name_LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(referencedColumnName_LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(table_LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(columnDefinition_LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(name_LayeredPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(table_LayeredPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(referencedColumnName_LayeredPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(columnDefinition_LayeredPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(layeredPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.openide.awt.Mnemonics.setLocalizedText(save_Button, org.openide.util.NbBundle.getMessage(JoinColumnPanel.class, "JoinColumnPanel.save_Button.text")); // NOI18N
        save_Button.setToolTipText(org.openide.util.NbBundle.getMessage(JoinColumnPanel.class, "JoinColumnPanel.save_Button.toolTipText")); // NOI18N
        save_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_ButtonActionPerformed(evt);
            }
        });
        jLayeredPane8.add(save_Button);
        save_Button.setBounds(30, 0, 57, 23);

        org.openide.awt.Mnemonics.setLocalizedText(cancel_Button, org.openide.util.NbBundle.getMessage(JoinColumnPanel.class, "JoinColumnPanel.cancel_Button.text")); // NOI18N
        cancel_Button.setToolTipText(org.openide.util.NbBundle.getMessage(JoinColumnPanel.class, "JoinColumnPanel.cancel_Button.toolTipText")); // NOI18N
        cancel_Button.setPreferredSize(new java.awt.Dimension(60, 23));
        cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_ButtonActionPerformed(evt);
            }
        });
        jLayeredPane8.add(cancel_Button);
        cancel_Button.setBounds(90, 0, 70, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private boolean validateField() {
        if (this.name_TextField.getText().trim().length() <= 0 /*|| Pattern.compile("[^\\w-]").matcher(this.id_TextField.getText().trim()).find()*/) {
            JOptionPane.showMessageDialog(this, "Parameter column name can't be empty", "Invalid Value", javax.swing.JOptionPane.WARNING_MESSAGE);
            return false;
        }//I18n
//        if (this.referencedColumnName_TextField.getText().trim().length() <= 0 /*|| Pattern.compile("[^\\w-]").matcher(this.id_TextField.getText().trim()).find()*/) {
//            JOptionPane.showMessageDialog(this, "Parameter referenced column name can't be empty", "Invalid Value", javax.swing.JOptionPane.WARNING_MESSAGE);
//            return false;
//        }//I18n
        return true;
    }

    private void save_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_ButtonActionPerformed
        if (!validateField()) {
            return;
        }
        JoinColumn joinColumn = null;

        if (this.getEntity().getClass() == RowValue.class) {
            Object[] row = ((RowValue) this.getEntity()).getRow();
            if (row[0] == null) {
                joinColumn = new JoinColumn();
            } else {
                joinColumn = (JoinColumn) row[0];
            }
        }

        joinColumn.setName(name_TextField.getText());
        joinColumn.setReferencedColumnName(referencedColumnName_TextField.getText());
        joinColumn.setTable(table_TextField.getText());
        joinColumn.setColumnDefinition(columnDefinition_TextArea.getText());
        joinColumn.setUnique(unique_CheckBox.isSelected());
        joinColumn.setNullable(nullable_CheckBox.isSelected());
        joinColumn.setInsertable(insertable_CheckBox.isSelected());
        joinColumn.setUpdatable(updatable_CheckBox.isSelected());

        if (this.getEntity().getClass() == RowValue.class) {
            Object[] row = ((RowValue) this.getEntity()).getRow();
            row[0] = joinColumn;
            row[1] = joinColumn.getName();
            row[2] = joinColumn.getReferencedColumnName();
        }

        saveActionPerformed(evt);
    }//GEN-LAST:event_save_ButtonActionPerformed

    private void cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ButtonActionPerformed
        cancelActionPerformed(evt);
    }//GEN-LAST:event_cancel_ButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_Button;
    private javax.swing.JLabel columnDefinition_Label;
    private javax.swing.JLayeredPane columnDefinition_LayeredPane;
    private javax.swing.JScrollPane columnDefinition_ScrollPane;
    private javax.swing.JTextArea columnDefinition_TextArea;
    private javax.swing.JCheckBox insertable_CheckBox;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JLabel name_Label;
    private javax.swing.JLayeredPane name_LayeredPane;
    private javax.swing.JTextField name_TextField;
    private javax.swing.JCheckBox nullable_CheckBox;
    private javax.swing.JLabel referencedColumnName_Label;
    private javax.swing.JLayeredPane referencedColumnName_LayeredPane;
    private javax.swing.JTextField referencedColumnName_TextField;
    private javax.swing.JButton save_Button;
    private javax.swing.JLabel table_Label;
    private javax.swing.JLayeredPane table_LayeredPane;
    private javax.swing.JTextField table_TextField;
    private javax.swing.JCheckBox unique_CheckBox;
    private javax.swing.JCheckBox updatable_CheckBox;
    // End of variables declaration//GEN-END:variables
}
