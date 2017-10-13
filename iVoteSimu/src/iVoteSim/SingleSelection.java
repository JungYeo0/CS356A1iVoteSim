package iVoteSim;
import java.util.*;

public class SingleSelection implements VoteType {
    private List<Boolean> options = null;

    //initalizes the
    public SingleSelection(int numOfChoices){
        options = new ArrayList<Boolean>();
        for(int i=0; i<numOfChoices; i++){
            options.add(Boolean.FALSE);
        }
    }

    //allows the student to vote as many times as they want, BUT can only sumbit one answer
    public List<Boolean> vote(){
        int reSelects = new Random().nextInt(10);

        for(int i=0; i< reSelects; i++){
            Collections.fill(options,Boolean.FALSE);
            int set =Math.abs(new Random().nextInt(options.size()));
            options.set(set, Boolean.TRUE);
        }
        return options;
    }
}
