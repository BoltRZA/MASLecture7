package MASLecture6;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class WaitingForAnswer extends TickerBehaviour {
    private long period;
    private int counter;

    public WaitingForAnswer(Agent a, long period) {
        super(a, period);
        this.period = period;

    }
    @Override
    protected void onTick() {
        counter++;
        System.out.println("Time since start is " + counter*period + " s");
    }
}