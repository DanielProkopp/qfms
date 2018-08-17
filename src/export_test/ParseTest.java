import java.io.*;

public class ParseTest
{

  public static void main(String args[])
  {
    FSM_klee m = new FSM_klee();

    int res = m.parse(args[0]);
    System.out.print(args[0] + "  ");
    System.out.print("res: ");
    System.out.println(res);
  }
}

