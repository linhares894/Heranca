/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

import Heranca.Super.Aluno;

/**
 *
 * @author Gabriel Linhares <glinhares@engebras.com.br>
 */
public class Principal {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        
        aluno.setNome("Linhares");
        aluno.setCpf("70119599120");
        aluno.setCurso("Tads");
        aluno.setEndereco("Butanta");
        
        System.out.println(aluno.getNome());
        System.out.println(aluno.getCpf());
        System.out.println(aluno.getCurso());
        System.out.println(aluno.getEndereco());
        
          
        
    }
}
