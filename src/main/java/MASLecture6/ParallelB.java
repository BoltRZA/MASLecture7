package MASLecture6;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.ParallelBehaviour;
import jade.core.behaviours.WakerBehaviour;

public class ParallelB extends ParallelBehaviour {
    private Agent agent;
    private Behaviour worker;
    private WakerBehaviour killer;

    public ParallelB(Agent agent, Behaviour worker, WakerBehaviour killer){
        super(agent, ParallelBehaviour.WHEN_ANY);
        this.worker = worker;
        this.agent = agent;
        this.killer = killer;
    }

    @Override
    public int onEnd() {
        if (worker.done()){
            return 1;
        }
        else if (killer.done()){
            return 2;
        }
        else {
            return 0;
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        addSubBehaviour(worker);
        addSubBehaviour(killer);
    }
}

