package State.States;

import State.StateInterface;

public class StateSauter implements StateInterface {

    @Override
    public void doAction() {
        System.out.println("Je suis en train de sauter -\n");
    }
}
