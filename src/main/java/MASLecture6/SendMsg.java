package MASLecture6;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class SendMsg extends OneShotBehaviour {
    private Agent agent;

    public SendMsg(Agent agent){
        this.agent = agent;
    }
    @Override
    public void action() {
        System.out.println("It's oneshot behavioure");
    }
}

