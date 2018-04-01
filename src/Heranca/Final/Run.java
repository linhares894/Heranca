/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca.Final;

/**
 *
 * @author Gabriel Linhares <glinhares@engebras.com.br>
 */
public class Run {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        //Pessoa aluno = new Aluno();
        //Pessoa professor = new Professor();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        
        
        pessoa.setEndereco("rua 1, num 1");
        aluno.setCurso("TADS");
        professor.setNomeCurso("TADS A-B \n");
        
        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.getCurso());
        System.out.println(professor.getNomeCurso());
        
        System.out.println("CONSTANTES: ");
        
        //Constantes
        System.out.println(Constantes.URL_BLOG);
        Constantes.URL_BLOG = "Modified";
        System.out.println(Constantes.URL_BLOG);
        
    }
}
