package State.States;

import State.StateInterface;

public class StateCourir implements StateInterface {

    @Override
    public void doAction() {
        System.out.println("Je suis en train de courir *\n");
    }
}
