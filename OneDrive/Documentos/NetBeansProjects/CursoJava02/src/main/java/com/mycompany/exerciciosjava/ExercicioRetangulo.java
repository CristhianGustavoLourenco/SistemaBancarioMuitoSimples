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
public class ExercicioRetangulo {
    
    public static HashMap<String,HashMap<String,String>> cadastroTriangulo = new HashMap<String,HashMap<String,String>>();
    
    public static void main(String[] args){
        
        float baseRetangulo, alturaRetangulo;
        String nomeRetangulo;
        
        nomeRetangulo = JOptionPane.showInputDialog("Digite o nome do Retangulo");
        baseRetangulo = Float.parseFloat(JOptionPane.showInputDialog("Digite a Base do Retângulo"));
        alturaRetangulo = Float.parseFloat(JOptionPane.showInputDialog("Digite a Altura do Retângulo"));
        
        cadastrarTriangulo(baseRetangulo, alturaRetangulo, nomeRetangulo);
        
        String txt = "";
        
        
        
        for (String chaveNome : cadastroTriangulo.keySet()){
            
            txt += "Nome do Triângulo: " + chaveNome;
            
            HashMap<String,String> apresentarDados = new HashMap<String,String>();
            
            apresentarDados = cadastroTriangulo.get(chaveNome);
            
            for (String chaveDado : apresentarDados.keySet()){
                
                txt += "\n " + chaveDado + ": " + apresentarDados.get(chaveDado);
            }
            txt += "\n";
            {
             JOptionPane.showMessageDialog(null, txt);
            }
        }
        {
            
        }
    }
    
    public static void cadastrarTriangulo(float base, float altura, String nome){
        
        HashMap<String,String> dadosAdicionaisRetangulo = new HashMap<String,String>();
        
        double areaRetangulo = base * altura;
        double perimetroRetangulo = 2*(base + altura);
        double diagonalRetangulo = 0.5 * Math.sqrt(Math.max(0, perimetroRetangulo * perimetroRetangulo - 8 * areaRetangulo));
        
        dadosAdicionaisRetangulo.put("Área Retângulo", String.valueOf(areaRetangulo));
        dadosAdicionaisRetangulo.put("Perímetro Retângulo", String.valueOf(perimetroRetangulo));
        dadosAdicionaisRetangulo.put("Diagonal retangulo", String.valueOf(diagonalRetangulo));
        
        cadastroTriangulo.put(nome, dadosAdicionaisRetangulo);
        
    }
}
