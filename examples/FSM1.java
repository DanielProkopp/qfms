public class FSM1
{
  private final FSM1Context fsm;
  public int a;

  FSM1()
  {
    fsm = new FSM1Context(this);
  }

  public void action1() { System.out.println("executing action1()"); }
  public void do1() { System.out.println("executing do1()"); }
  public void do2() { System.out.println("executing do2()"); }
  public void entering() { System.out.println("entering State"); }
  public void exiting() { System.out.println("exiting State"); }
  public void aa() { System.out.println("executing aa()"); }
  public void bb() { System.out.println("executing bb()"); }
  public void default_action() { System.out.println("executing default_action()"); }

  public void testit()
  {
    a=1;
    fsm.init();
    fsm.run();
    fsm.init();
  }

  public static void main(String[] args)
  {
    FSM1 f = new FSM1();
    f.testit();
  }
}

