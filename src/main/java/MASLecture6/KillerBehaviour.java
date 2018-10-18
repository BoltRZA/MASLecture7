package MASLecture6;

import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;

public class KillerBehaviour extends WakerBehaviour {

    public KillerBehaviour(Agent a, long timeout) {
        super(a, timeout);
    }

    @Override
    protected void onWake() {
        super.onWake();
        System.out.println("I've woke up");
    }
}
