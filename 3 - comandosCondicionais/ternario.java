public class ternario{

    public static void main(String[] args){
        int nota = 85;
        int faltas = 1;
        int maxFaltas = 5;
        double media = 60.0;
        String res;

        if(faltas > maxFaltas){
            res = "Reprovado por excesso de faltas";
        }else {
            res = (nota >= media ? "Parabéns! foste aprovado" : "Sinto muito! foste reprovado");

        }

        System.out.print("Resultado: " + res);
    }
}