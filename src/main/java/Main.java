// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj pierwszy wyraz: ");
    String a = scanner.nextLine();
    System.out.println("Podaj drugi wyraz: ");
    String b = scanner.nextLine();
    if (a.length() != b.length()) {
      System.out.println("Podane wyrazy nie są anagramami");
    }

    
    
    else if(a.length() == b.length()) {
      String c = sortujAlfabetycznie(a);
      String d = sortujAlfabetycznie(b);
      if(c.equals(d)) {
      System.out.println("Podane wyrazy są anagramami");
    }
    else {
      System.out.println("Podane wyrazy nie są anagramami");
    }
    }


    


    
    }
  public static String sortujAlfabetycznie(String wyraz) {
    char[] tablicaZnakow = wyraz.toCharArray();
    Arrays.sort(tablicaZnakow);
    return String.valueOf(tablicaZnakow);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}