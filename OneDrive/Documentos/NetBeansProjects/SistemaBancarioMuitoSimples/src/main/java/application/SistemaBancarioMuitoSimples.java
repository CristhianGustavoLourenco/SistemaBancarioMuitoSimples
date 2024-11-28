/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package application;

import entities.Account;
import exceptions.DomainException;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class SistemaBancarioMuitoSimples {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("");
        
        try{
            System.out.println("Enter account data");
            System.out.println("\nNúmero da Conta:");
            int numberAccount = scan.nextInt();
            System.out.println("\nNome do Cliente:");
            scan.nextLine();
            String holder = scan.nextLine();
            System.out.println("\nSaldo Inicial:");
            Double balance = scan.nextDouble();
            System.out.println("\nLimite para Saque:");
            Double withdrawLimit = scan.nextDouble();
            Account account = new Account(numberAccount, holder, balance, withdrawLimit);
            
            System.out.println("Escolha (1 - Depositar | 2 - Sacar):");
            int opcao = scan.nextInt();
            
            if(opcao == 1){
            System.out.println("Digite um valor que deseja depositar: ");
            Double amount = scan.nextDouble();
            account.deposit(amount);
            
            }else if(opcao == 2){
            System.out.println("Digite um valor que deseja sacar: ");
            Double amount = scan.nextDouble();
            account.withdraw(amount);
            }
          
            System.out.println(account);
            
        }catch(InputMismatchException e){
            System.out.println("Valor Inválido!");
        }catch(DomainException e){
            System.out.println("Erro de saque: " + e.getMessage());
        }catch(RuntimeException e){
            System.out.println("Erro inesperado");
        }
        
        scan.close();
    }
}
