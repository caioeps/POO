/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.tipo;

import java.util.ArrayList;

public class Ensino extends Empregado{
    
    private String formacao;
    
    public Ensino(String nome, double salario, String cpf, ArrayList<Integer> dataAdm, ArrayList<Integer> dataDem, String formacao){
        super(nome, salario, cpf, dataAdm, dataDem);
        this.formacao = formacao;
        
    }

    public String getFormacao() {
        return formacao;
    }
    
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}