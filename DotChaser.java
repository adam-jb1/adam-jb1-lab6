import java.util.*;

public class DotChaser {
  /**
   * This static method is ok :)
   */
  public static void main(String[] args) {
    Random rand = new Random(System.currentTimeMillis());
    int N = 200;

    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    // INSTEAD OF A NODE, CREATE SOMETHING MORE USER-FRIENDLY.
    //Node L = null;
    ThingList list = new ThingList();
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) {

        // Add a typeA thing to the list.
        // (GEE, THAT'S A LOT OF CODE FOR JUST CREATING ONE THING)
        TypeA tA = new TypeA(45, 50, 0, 'r');
        list.addThing(tA);
        //tA.row = 45;
        //tA.col = 50;
        //Node nA = new Node();
        //nA.data = tA;
        //nA.next = L;
        //L       = nA;

        // Add a typeB thing to the list
        TypeB tB = new TypeB(55, 50, 0, 'b');
        list.addThing(tB);
        //tB.row     = 55;
        //tB.col     = 50;
        //tB.lab     = 'b';
        //tB.isTypeB = true;
        //Node nB = new Node();
        //nB.data = tB;
        //nB.next = L;
        //L       = nB;
      }

      // Print out each thing.
      // (SEEMS LIKE A NICE PRINTALL() METHOD CALL WOULD WORK HERE)
      // (SEEMS LIKE A toString() METHOD IN THE CLASS WOULD ALSO BE NICE)
      //for( Node T = L; T != null; T = T.next )
        //System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);

      list.printAll();
      System.out.println("done");
      System.out.flush();

      // Move each thing.
      // (SEEMS LIKE A NICE MOVEALL() METHOD CALL WOULD WORK HERE)
      //for( Node T = L; T != null; T = T.next ) {
       // maybeTurn(T.data);
      //  step(T.data);
      //}
      list.moveAll(rand);
      count++;
    }
  }
}