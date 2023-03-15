import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wybierz opcję: 1. Pole prostokąta    2. Pole trójkąta");
    int opcja = scanner.nextInt();
    switch(opcja)
      {
        case 1:
          System.out.println("Podaj wymiary prostokąta: ");
          double a = scanner.nextDouble();
          double b = scanner.nextDouble();
          System.out.println("Wynik: " + a*b);
          break;
        case 2:
          System.out.println("Podaj długości przyprostokątnych: ");
          double x = scanner.nextDouble();
          double y = scanner.nextDouble();
          System.out.println("Wynik: " + 0.5*x*y);
          break;
        default: break;
      }
  }
}