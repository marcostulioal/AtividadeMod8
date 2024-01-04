public class Nota {

    public static void main (String[] args){

        todasNotas();
    }
    public static void todasNotas(){

        double nota1 = 8.5;
        double nota2 = 6.0;
        double nota3 = 9.0;
        double nota4 = 10.0;

        System.out.println("Notas do aluno Marcos em matemática: ");
        System.out.println();
        System.out.println("1º bismestre: " + nota1);
        System.out.println("2º bismestre: " + nota2);
        System.out.println("3º bismestre: " + nota3);
        System.out.println("4º bismestre: " + nota4);
        System.out.println();
        System.out.println("A média de Marcos é: " + String.format ("%.2f", (nota1 + nota2 + nota3 + nota4) / 4));
    }
}
