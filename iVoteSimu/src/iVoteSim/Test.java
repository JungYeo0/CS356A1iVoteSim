package iVoteSim;

import java.util.*;

public class Test {
    private List<Integer> answerSum;
    private int numOfTestQ;
    public Test(){
        numOfTestQ = new Random().nextInt(10) + 2;
        answerSum = new ArrayList<>(numOfTestQ);
    }
    public List<Integer> getAnswerSum(){return answerSum;}
    public int getNumOfTestQ(){return numOfTestQ;}
}
