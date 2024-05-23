public class multiplaSwitchCase{
    public static void main(String[] args){
        int weekDay = 8;

        switch(weekDay){
            case 1:
                System.out.printf("%s.", "Domingo");
                break;
            case 2:
                System.out.printf("%s.", "Segunda-feira");
                break;
            case 3:
                System.out.printf("%s.", "Terça-feira");
                break;
            case 4:
                System.out.printf("%s.", "Quarta-feira");
                break;
            case 5:
                System.out.printf("%s.", "Quinta-feira");
                break;
            case 6:
                System.out.printf("%s.", "Sexta-feira");
                break;
            case 7:
                System.out.printf("%s.", "Sábado");
                break;
            default:
                System.out.printf("%s.", "Há apenas 7 dias na semana");
        }
    }
}