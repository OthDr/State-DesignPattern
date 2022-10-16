package demo;

import State.Agent;
import State.StateInterface;
import State.States.StateCourir;
import State.States.StateMarcher;
import State.States.StateSauter;

public class Main {
    public static void main(String[] args) {

        StateInterface marcher,courir,sauter;

        //states declaration
        marcher = new StateMarcher();
        courir = new StateCourir();
        sauter = new StateSauter();

        //append states to agents
        Agent agent1 = new Agent();
        //do agent action
        agent1.getMyState().doAction();
        agent1.getMyState().doAction();
        agent1.getMyState().doAction();


    }
}