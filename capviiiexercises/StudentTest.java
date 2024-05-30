import java.util.Vector;
import java.io.IOException;
import java.util.Scanner;


public class StudentTest {
  private static Vector<Student> allStudents = new Vector<>(50);
  
  public static void InsertStudent(){

    Scanner kbScanner = new Scanner(System.in);

    System.out.print("\nNome: ");
    String name = kbScanner.nextLine();
    System.out.print("Idade: ");
    int age = kbScanner.nextInt();
    System.out.print("Nº de estudante: ");
    int student_num = kbScanner.nextInt();

    allStudents.add(new Student(name, age, student_num));
    
  }

  public static void ConsultingStudent(){

    Scanner kbScanner = new Scanner(System.in);

    System.out.println("\nNumero de estudante: ");
    int num = kbScanner.nextInt();

    if(allStudents.isEmpty()){
      System.out.println("Ainda não há alunos, insira alunos.");
    }else {

      for(Student student : allStudents){
        
        if(num == student.student_num){
          System.out.println("\nName: " + student.name);
          System.out.println("Idade: " + student.age);
          System.out.println("Nº de estudante: " + student.student_num);
        }else {
          System.out.println("\nEstudante não existe.");
        }
      }
    }
  }

  public static void ListStudents(){
    
    if(allStudents.isEmpty()){  
      System.out.println("\nAinda não há alunos, insira alunos.");
    }else {

      for(Student student : allStudents){
        System.out.println("\nName: " + student.name);
        System.out.println("Idade: " + student.age);
        System.out.println("Nº de estudante: " + student.student_num);
        System.out.println("\n----------------------------------");     
      }
    }
  }

  public static void main(String[] args) throws IOException{
    
    try {
      
      Scanner kbScanner = new Scanner(System.in);
      int opt;

      do{
        System.out.printf("1 - Inserir Aluno\n2 - Consultar Aluno\n3 - Listar Alunos\n4 -Sair\n\n");
        opt = kbScanner.nextInt();

        switch (opt) {
          case 1:
            InsertStudent();
            System.out.println("\n");
            break;
          case 2:
            ConsultingStudent();
            System.out.println("\n");
            break;
          case 3:
            ListStudents();
            System.out.println("\n");
            break;
          case 4:
            break;
          default:
            System.out.println("Opcao não existe");
            System.out.println("\n");
            break;
        }
      }while(opt != 4);

    } catch (Exception e) {
      System.out.println("Something went wrong!");
      e.printStackTrace();
    }
  }
}
