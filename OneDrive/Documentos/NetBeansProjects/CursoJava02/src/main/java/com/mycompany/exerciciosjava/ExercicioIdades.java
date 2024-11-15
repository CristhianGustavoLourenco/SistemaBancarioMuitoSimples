/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosjava;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ExercicioIdades {

    public static HashMap<String, String> cadastroPessoa = new HashMap<String, String>();

    public static void main(String[] args) {

        int controlador;
        String nome;
        int idade;
        int somaIdades = 0;

        for (controlador = 0; controlador < 2; controlador++)
        {

            nome = JOptionPane.showInputDialog("Nome da " + (controlador + 1) + " ª pessoa");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Idade da " + (controlador + 1) + " ª pessoa"));
            cadastrarPessoa(nome, idade);

        }

        JOptionPane.showMessageDialog(null, cadastroPessoa);
        calcularMediaIdade(somaIdades);
        JOptionPane.showMessageDialog(null, soma);

    }

    public static void cadastrarPessoa(String nome, int idade) {

        cadastroPessoa.put(nome, String.valueOf(idade));

    }
    
    public static void calcularMediaIdade(int somaIdade){
        
        int soma = 0;
        
        for (String chaveNome : cadastroPessoa.keySet())
        {
            
            HashMap<String,String> somarIdades = new  HashMap<String,String>();
            
            for (Object chaveDados : somarIdades.keySet())
            {
                soma += Integer.parseInt(somarIdades.get(chaveDados));
            }
            
        }
        
        return(soma);
    }

}
