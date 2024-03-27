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
public class Convenio {
    
    private int codigo;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void cadastrar(){
        Scanner cad = new Scanner (System.in);
        System.out.print("Convênio: ");
        this.setNome(cad.nextLine());
    }
    
    public void imprimirConvenio(){
        System.out.println("Convênio: " + this.getNome());
    }
    
}
