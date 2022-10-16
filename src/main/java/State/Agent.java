package State;

public class Agent {
    public Agent() {

    }
    public Agent(StateInterface myState) {

        this.myState = myState;
    }
    StateInterface myState;

    public StateInterface getMyState() {
        return this.myState;
    }

    public void setMyState(StateInterface myState) {
        this.myState = myState;
    }




}
