package iVoteSim;

import java.util.*;

public class MultiSelection implements VoteType {
    private List<Boolean> options;
    public MultiSelection(int numOfChoices){
        options = new ArrayList<Boolean>();
        for(int i=0; i<numOfChoices; i++){
            options.add(Boolean.FALSE);
        }
    }


    //allows for as many revotes; however, any repeat votes will count as the student "unticking" the option
    public List<Boolean> vote(){
        int reSelects = new Random().nextInt( options.size()) + 10;


        for(int i=0; i< reSelects; i++){
            int selection = new Random().nextInt(options.size());
            options.set(selection, !options.get(selection));
        }


        //if at least one options has not been selected, pick one at random
        if(!options.contains(Boolean.TRUE)){
            options.set(new Random().nextInt(options.size()), Boolean.TRUE);
        }
        return options;
    }

}
