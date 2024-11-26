package classes;

public class Cleaner {

  public void cls() {
      try {
          if (System.getProperty("os.name").contains("Windows")) {
              // Comando do Windows
              new ProcessBuilder("cmd", "/c", "cls", "clear").inheritIO().start().waitFor();
          } else {
              // Comando para Linux/macOS
              new ProcessBuilder("clear").inheritIO().start().waitFor();
          }
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
}
