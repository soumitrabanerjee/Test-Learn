import java.util.*;
import java.io.*;

class Test{
  void animal(String str){
    System.out.println("Tiger "+str);
  }
}

public class TestProgram{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(str);
    Test obj = new Test();
    obj.animal(str);
    obj.animal("Modified");
  }
}
