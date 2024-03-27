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
public class GrupoExame {
    
    private int codigo;
    private String Descricao;    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    public void cadastrar(){
        Scanner cad = new Scanner (System.in);
        System.out.print("Código do Grupo: ");
        this.setCodigo(cad.nextInt());
        cad.nextLine();
        
        System.out.print("Grupo do Exame: ");
        this.setDescricao(cad.nextLine());
    }
    public void imprimirGrupoExame(){
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Grupo do Exame: " + this.getDescricao());
        System.out.println("--------------------");
    }
    public void listarGrupoExame(){
        System.out.print(" | " + this.getDescricao());
    }    
    
}
