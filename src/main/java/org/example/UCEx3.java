package org.example;

import java.util.ArrayList;

public class UCEx3 {
    private String nomeUc;
    private ArrayList<NotaEx3> notas;
    private int totalDeAlunos;

    public UCEx3(String nomeUc, int totalDeAlunos) {
        this.nomeUc = nomeUc;
        notas = new ArrayList<NotaEx3>();
        this.totalDeAlunos = totalDeAlunos;
    }
    public boolean insereNotaUc(int numAluno,double nota){
        NotaEx3 novaNota = new NotaEx3(nota,numAluno);
        notas.add(novaNota);
        return true;
        //return false;
    }
    public double pesquisaAluno(int numAluno){
        double nota;
        for(int i = 0;i<notas.size();i++){
            if(notas.get(i).getNumAluno()==numAluno){
                nota = notas.get(i).getNota();
                return nota;
            }
        }
        return -1;
    }
    public double media(){
        double soma = 0;
        for(int i = 0;i<notas.size();i++){
            soma = soma + notas.get(i).getNota();
        }
        double media = soma/notas.size();
        return media;
    }
    public boolean aprovado(int numAluno){
        double nota = 0;
        for(int i = 0;i<notas.size();i++){
            if(notas.get(i).getNumAluno()==numAluno){
                nota = notas.get(i).getNota();
            }
        }
        if(nota>=9.5){
            return true;
        }
        return false;
    }

    public String getNomeUc() {
        return nomeUc;
    }

    public ArrayList<NotaEx3> getNotas() {
        return notas;
    }

    public int getTotalDeAlunos() {
        return totalDeAlunos;
    }
}
