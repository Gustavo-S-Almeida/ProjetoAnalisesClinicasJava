/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desenvolvimento;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Medico {
    private int CRM;
    private String nome;

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void cadastrar(){
        Scanner cad = new Scanner(System.in);
        System.out.print("Nome: ");
        this.setNome(cad.nextLine());
        System.out.print("CRM: ");
        this.setCRM(cad.nextInt());
    }
    
    public void imprimirMedico(){
        System.out.println("Médico: " + this.getNome());
        System.out.println("CRM: " + this.getCRM());
    }
    
    public void listarMedico(){
        System.out.print(" | " + this.getNome());
        System.out.print(" | " + this.getCRM());
        System.out.print(" | " + this.getClass());
    }     
    
}
