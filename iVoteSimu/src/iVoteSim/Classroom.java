package iVoteSim;

import java.util.*;

public class Classroom {
    private List<Student> classroom = new ArrayList<Student>();
    private Set<String> classIDCheckList = new HashSet<>();
    private int classSize;
    public Classroom(){
        classSize = new Random().nextInt(50) + 30;
        for(int i=0; i<classSize; i++){
            Student kid = new Student();
            classIDCheckList = kid.setStudentID(classIDCheckList);
            classroom.add(kid);
        }
    }
    public int getClassSize(){return classSize;}
    public List<Student> getClassRoster(){return classroom;}
}
