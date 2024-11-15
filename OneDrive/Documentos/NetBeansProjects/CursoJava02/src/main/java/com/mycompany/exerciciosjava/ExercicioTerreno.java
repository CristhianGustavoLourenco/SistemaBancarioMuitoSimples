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
public class ExercicioTerreno {

    public static HashMap<String, HashMap<String, String>> cadastroTerreno = new HashMap<String, HashMap<String, String>>();

    public static void main(String[] args) {

        int controlador = 0;
        String nomeTerreno;
        float larguraTerreno, comprimentoTerreno, valorMetroTerreno;

        while (controlador == 0)
        {
            nomeTerreno = JOptionPane.showInputDialog("Digite o nome do Terreno");
            larguraTerreno = Float.parseFloat(JOptionPane.showInputDialog("Digite a Largura Do Terreno"));
            comprimentoTerreno = Float.parseFloat(JOptionPane.showInputDialog("Digite o Comprimento do Terreno"));
            valorMetroTerreno = Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor do Metro Cúbico do Terreno"));

            cadastrarTerreno(nomeTerreno, comprimentoTerreno, larguraTerreno, valorMetroTerreno);
            
            nomeTerreno = JOptionPane.showInputDialog("Digite qualquer Letra - Continuar Cadastro \nSair - Para parar o Cadastro");
            
            if(nomeTerreno.equalsIgnoreCase("sair")){
                controlador = 1;
            }
        }
        JOptionPane.showMessageDialog(null, cadastroTerreno);
        
        String txt = "";
        
        for( String chaveNome : cadastroTerreno.keySet()){
            
            txt += "Nome do Terreno: " + chaveNome;
            
            HashMap<String,String> apresentarDadosTerreno = new HashMap<String,String>();
            apresentarDadosTerreno = cadastroTerreno.get(chaveNome);
            
            for(String chaveDado : apresentarDadosTerreno.keySet()){
                txt += " " + chaveDado + ": " + apresentarDadosTerreno.get(chaveDado);
            }
            
            txt += "\n";
        }
        
        JOptionPane.showMessageDialog(null, txt);
        
    }

    public static float CalcularValorTerreno(float largura, float comprimento, float valorMetro) {

        return ((largura * comprimento) * valorMetro);

    }

    public static void cadastrarTerreno(String nome, float comprimento, float largura, float valor) {

        HashMap<String, String> dadosTerreno = new HashMap<>();

        float areaTerreno = largura * comprimento;

        dadosTerreno.put("Área Terreno", String.valueOf(areaTerreno));

        dadosTerreno.put("Valor Terreno", String.valueOf(CalcularValorTerreno(largura, comprimento, valor)));

        cadastroTerreno.put(nome, dadosTerreno);
    }

}
