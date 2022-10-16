package State.States;

import State.StateInterface;

public class StateMarcher implements StateInterface {

    @Override
    public void doAction() {
        System.out.println("Je suis en train de marcher + \n");
    }
}
