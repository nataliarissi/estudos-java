//8.
// Implemente uma calculadora, com as 4 operações básicas

package Exercicios.Aula01;

public class Calculadora extends ClasseComLeitor {
    private final int ValorMaximoPermitido = 1000; //constante
    
    public void ExecutarExercicio8(){
        System.out.println("Calculadora");
        System.out.println("Digite o primeiro número: ");
        int valor1 = Scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int valor2 = Scanner.nextInt();

        if(ValoresSaoValidos(valor1, valor2))
            return;
        
        System.out.println("Digite a operação:  1.Adição  2.Subtração  3.Divisão  4.Multiplicação");
        int escolha = Scanner.nextInt();
        double calculo = 0;
        switch(escolha){
            case 1: calculo = Adicao(valor1, valor2);
                    break;

            case 2: calculo = Subtracao(valor1, valor2);
                    break;

            case 3: calculo = Divisao(valor1, valor2);
                    break;

            case 4: calculo = Multiplicacao(valor1, valor2);
                    break;                    
        }
        System.out.println("Resultado: " + calculo);
    }

    private int Adicao(int valor1, int valor2){
        return valor1 + valor2;
    }

    private int Subtracao(int valor1, int valor2){
        return valor1 - valor2;
    }

    private double Divisao(int valor1, int valor2){
        if(valor2 <= 0 ){
            System.out.println("Não é possível dividir por 0");
            return 0;
        }
        return valor1 / valor2;
    }

    private int Multiplicacao(int valor1, int valor2){
        return valor1 * valor2;
    }

    private boolean ValoresSaoValidos(int valor1, int valor2){
        Boolean resultado = valor1 <= ValorMaximoPermitido && valor2 <= ValorMaximoPermitido;
        if (!resultado)
            System.out.println("Valor inválido");
        return resultado;
    }

    @Override
    public void ExecutarExercicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ExecutarExercicio'");
    }
}

// Como fica na main
// public class Principal { eu te amo muito
//     public static void main(String[] args) {
//         new Exercicio8().ExecutarExercicio8(); - só para executar função
//         Exercicio8 exercicio8 = new Exercicio8(); - criar a variável se eu for utiliza-la no meio do código
//     }
// }
