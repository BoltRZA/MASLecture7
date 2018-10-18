package MASLecture6;

import jade.core.Agent;
import jade.core.behaviours.FSMBehaviour;

public class FSMbeh extends FSMBehaviour {
    private final static String START = "start";
    private final static String WAIT = "wait";
    private final static String SUCCESS = "success";
    private final static String FAIL = "Fail";
    private final static String END = "END";
    public FSMbeh(Agent agent) {
        registerFirstState(new SendMsg(agent), START);
        registerFirstState(new ParallelB( agent,
                new WaitingForAnswer(agent, 1000),
                new KillerBehaviour(agent,5000)),WAIT);
        registerState(new Success(), SUCCESS);
        registerState(new Fail(), FAIL);
        registerLastState(new End(), END);


        registerDefaultTransition(START, WAIT);
        registerTransition(WAIT, SUCCESS, 1); // Чекай ParallelB для понимания откуда 1
        registerTransition(WAIT,FAIL, 2);
        registerTransition(WAIT, FAIL, 0);
        registerDefaultTransition(SUCCESS, END);
        registerDefaultTransition(FAIL, END);
    }
}
