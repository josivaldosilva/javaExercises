public class Student {
  String name;
  int age;
  int student_num = 0;

  public Student(String name, int age, int student_num){
    this.name = name;
    this.age = age;
    this.student_num = student_num;
  }

  public int nameSize(){
    return name.length();
  }

  public void printData(){
    System.out.println("Nome: " +name);
    System.out.println("Idade: " +age);
    System.out.println("Nº de estudante: " +student_num);
  }
}
