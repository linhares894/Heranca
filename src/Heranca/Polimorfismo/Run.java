/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca.Polimorfismo;

/**
 *
 * @author Gabriel Linhares <glinhares@engebras.com.br>
 */
public class Run {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        
        pessoa.setEndereco("rua 1, num 1");
        aluno.setEndereco("rua 2, num 2");
        professor.setEndereco("rua 3, num 3");
        
        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
        
    }
}
