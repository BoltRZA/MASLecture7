package MASLecture6;


public class Agent extends jade.core.Agent {

    protected void setup() {
        super.setup();
        addBehaviour(new FSMbeh(this));
    }
}
