package iVoteSim;

import java.util.*;

public class Student{
    private String charList = "01234567890123456789qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
    private String ID;
    public Set<String> setStudentID(Set<String> classRoom){
        String idTrial="";

        do{
            idTrial = "";
            for(int i=0; i<10; i++){
                idTrial += charList.charAt(new Random().nextInt(charList.length()));
            }

        }while (classRoom.contains(idTrial));
        classRoom.add(idTrial);
        return classRoom;
    }
    public List<Boolean> studentVote(VoteType test){
        return test.vote();
    }
    public String getID(){return ID;}
}
