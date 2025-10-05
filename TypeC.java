import java.util.*;

public class TypeC extends Thing {

    public TypeC (int row, int col, int dir, char lab) {
        super(row, col, dir, lab);
    }

    @Override
    public void maybeTurn(Random rand) {
        int i = rand.nextInt(6);
        if (i == 1) {
            rightTurn();
        }

        if (i == 2) {
            leftTurn();
        }

        if (i == 3) {
            rightTurn();
        }

        if (i == 4) {
            leftTurn();
        }

        if (i == 5) {
            rightTurn();
        }
    }
}