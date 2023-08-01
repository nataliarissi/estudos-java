package Exercicios.Aula01;

import java.util.Scanner;

public abstract class ClasseComLeitor {
    public ClasseComLeitor() {
        Scanner = new Scanner(System.in);

        ExecutarExercicio();
    }

    public abstract void ExecutarExercicio();

    public java.util.Scanner Scanner;
}
