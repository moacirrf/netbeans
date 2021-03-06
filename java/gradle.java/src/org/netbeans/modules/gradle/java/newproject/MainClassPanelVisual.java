/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.gradle.java.newproject;

import org.openide.WizardDescriptor;

/**
 *
 * @author Laszlo Kishalmi
 */
public class MainClassPanelVisual extends javax.swing.JPanel {

    /**
     * Creates new form MainClassPanelVisual
     */
    public MainClassPanelVisual() {
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
        tfMainClass = new javax.swing.JTextField();

        jLabel1.setLabelFor(tfMainClass);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(MainClassPanelVisual.class, "MainClassPanelVisual.jLabel1.text")); // NOI18N

        tfMainClass.setText(org.openide.util.NbBundle.getMessage(MainClassPanelVisual.class, "MainClassPanelVisual.tfMainClass.text")); // NOI18N
        tfMainClass.setToolTipText(org.openide.util.NbBundle.getMessage(MainClassPanelVisual.class, "MainClassPanelVisual.tfMainClass.toolTipText")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMainClass, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMainClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    void write(WizardDescriptor settings) {
        settings.putProperty(MainClassPanel.PROP_MAIN_CLASS_NAME, tfMainClass.getText());
    }

    void read(WizardDescriptor settings) {
        String mc = (String) settings.getProperty(MainClassPanel.PROP_MAIN_CLASS_NAME);
        tfMainClass.setText(mc != null ? mc : "Main"); //NOI18N
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfMainClass;
    // End of variables declaration//GEN-END:variables
}
