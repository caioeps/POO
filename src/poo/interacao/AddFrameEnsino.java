/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.interacao;

import poo.tipo.*;
import poo.exceptions.*;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author caioe_000
 */
public class AddFrameEnsino extends javax.swing.JFrame {
    //Minhas variaveis
    private Empregado emp;
    private ListaFrame listaFrame; //Para copiar, modificar e retornar a lista de alunos.
    
    //Minhas funções
    public AddFrameEnsino(ListaFrame listaFrame) {
        initComponents();
        this.listaFrame = listaFrame;
    }
    
    public Empregado getEmpregado(){
        return this.emp;
    }
    
    public int dataMesParaNumero(String str){
        int r;
        switch(str){
            case "Janeiro":
                r = 1;
                break;
            case "Fevereiro":
                r = 2;
                break;
            case "Marco":
                r = 3;
                break;
            case "Abril":
                r = 4;
                break;
            case "Maio":
                r = 5;
                break;
            case "Junho":
                r = 6;
                break;
            case "Julho":
                r = 7;
                break;
            case "Agosto":
                r = 8;
                break;
            case "Setembro":
                r = 9;
                break;
            case "Outubro":
                r = 10;
                break;
            case "Novembro":
                r = 11;
                break;
            case "Dezembro":
                r = 12;
            default:
                throw new DataException("Erro ao computar data");
        }
        
        return r;
    }
    
    public String dataNumeroParaMes(int i){
        String r;
        switch(i){
            case 1:
                r = "Janeiro";
                break;
            case 2:
                r = "Fevereiro";
                break;
            case 3:
                r = "Marco";
                break;
            case 4:
                r = "Abril";
                break;
            case 5:
                r = "Maio";
                break;
            case 6:
                r = "Junho";
                break;
            case 7:
                r = "Julho";
                break;
            case 8:
                r = "Agosto";
                break;
            case 9:
                r = "Setembro";
                break;
            case 10:
                r = "Outubro";
                break;
            case 11:
                r = "Novembro";
                break;
            case 12:
                r = "Dezembro";
            default:
                throw new DataException("Erro ao computar data");
        }
        
        return r;
    } 
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        labelSalario = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        fieldSalario = new javax.swing.JTextField();
        fieldEmail = new javax.swing.JTextField();
        btnAdd = new javax.swing.JToggleButton();
        labelCpf = new javax.swing.JLabel();
        fieldCpf = new javax.swing.JTextField();
        labelEmail1 = new javax.swing.JLabel();
        boxDia = new javax.swing.JComboBox();
        boxMes = new javax.swing.JComboBox();
        fieldAno = new javax.swing.JTextField();
        labelFormacao = new javax.swing.JLabel();
        fieldFormacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelNome.setText("Nome");

        labelSalario.setText("Salario");

        labelEmail.setText("Email");

        fieldNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomeActionPerformed(evt);
            }
        });

        fieldSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSalarioActionPerformed(evt);
            }
        });

        fieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEmailActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        labelCpf.setText("CPF");

        fieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCpfActionPerformed(evt);
            }
        });

        labelEmail1.setText("Data de admissão");

        boxDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        boxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDiaActionPerformed(evt);
            }
        });

        boxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        fieldAno.setToolTipText("AAAA");
        fieldAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAnoActionPerformed(evt);
            }
        });

        labelFormacao.setText("Formacao");

        fieldFormacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFormacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdd)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(labelSalario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldSalario)
                            .addComponent(fieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelEmail1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelFormacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSalario)
                    .addComponent(fieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpf)
                    .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmail)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFormacao))
                .addGap(26, 26, 26)
                .addComponent(labelEmail1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNomeActionPerformed

    private void fieldSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSalarioActionPerformed

    private void fieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEmailActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String nome=null, email=null, cpf=null, formacao=null; //Apenas inicializando para posterior checagem
        Double salario=null;
        ArrayList<Integer> data = new ArrayList<>();
        Ensino aux;
        
        if(!this.fieldNome.getText().isEmpty()) 
            nome = this.fieldNome.getText();
        else{
            this.labelNome.setText("<HTML><font color=black>Nome</font><font color=red>*</font></HTML>"); //Nome*, com * em vermelho
        }
        
        if(!this.fieldSalario.getText().isEmpty()) 
            salario = Double.parseDouble(this.fieldSalario.getText());
        else{
            this.labelSalario.setText("<HTML><font color=black>Salario</font><font color=red>*</font></HTML>"); //Salario*, com * em vermelho
        }
        
        if(!this.fieldEmail.getText().isEmpty())  
            email = this.fieldEmail.getText();
        else{
            this.labelEmail.setText("<HTML><font color=black>Email</font><font color=red>*</font></HTML>"); //Email*, com * em vermelho
        }
        
        if(!this.fieldCpf.getText().isEmpty())  
            cpf = this.fieldCpf.getText();
        else{
            this.labelCpf.setText("<HTML><font color=black>CPF</font><font color=red>*</font></HTML>"); //CPF*, com * em vermelho
        }
        
        if(!this.fieldFormacao.getText().isEmpty())  
            formacao = this.fieldFormacao.getText();
        else{
            this.labelFormacao.setText("<HTML><font color=black>Formcao</font><font color=red>*</font></HTML>"); //Formacao*, com * em vermelho
        }
        
        data.add(Integer.parseInt(this.fieldAno.getText())); //Pega o campo ano e transforma p/ int
        data.add((this.boxMes.getSelectedIndex() + 1)); // Número do mês
        data.add((this.boxDia.getSelectedIndex() +1)); //Número do dia
                       
        aux = new Ensino(nome, salario, cpf, data, email, formacao);
        
        

        
        if((email==null) || (nome==null) || (cpf==null) || (formacao==null) || (salario==null)) {
           //faz nada
        }else{
            listaFrame.passaLista(aux);
            this.listaFrame.atualizaLista();
            this.dispose();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void fieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCpfActionPerformed

    private void boxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxDiaActionPerformed

    private void fieldAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAnoActionPerformed

    private void fieldFormacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFormacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldFormacaoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxDia;
    private javax.swing.JComboBox boxMes;
    private javax.swing.JToggleButton btnAdd;
    private javax.swing.JTextField fieldAno;
    private javax.swing.JTextField fieldCpf;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldFormacao;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldSalario;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmail1;
    private javax.swing.JLabel labelFormacao;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSalario;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the listaFrame
     */
    public ListaFrame getListaFrame() {
        return listaFrame;
    }

    /**
     * @param listaFrame the listaFrame to set
     */
    public void setListaFrame(ListaFrame listaFrame) {
        this.listaFrame = listaFrame;
    }

}
