package MASLecture6;

import jade.core.behaviours.OneShotBehaviour;

public class Fail extends OneShotBehaviour {
    @Override
    public void action() {
        System.out.println("Fail");
    }
}
