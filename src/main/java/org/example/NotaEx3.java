package org.example;

public class NotaEx3 {
    private int numAluno;
    private double nota;

    public NotaEx3(double nota,int numAluno) {
        this.nota = nota;
        this.numAluno = numAluno;
    }

    public int getNumAluno() {
        return numAluno;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Notas:\n" + "\nNº Aluno=" + numAluno + "\nNota=" + nota;
    }
}
