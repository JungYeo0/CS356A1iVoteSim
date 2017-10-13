package iVoteSim;

import java.util.*;

public class SimulationDriver {
    public static void main(String[] args){
        SimulationDriver tester = new SimulationDriver();
        for(int i=0; i<20; i++)
            tester.startTestSim();

    }

    public void startTestSim(){
        VoteType myTestType;
        Classroom myClass = new Classroom();
        Test myTest = new Test();

        System.out.println("Total number of students: " + myClass.getClassSize());
        System.out.println("Number of Test Q: " + myTest.getNumOfTestQ());
        //single selection
        System.out.println("\nSingle Answer\n");
        myTestType = new SingleSelection(myTest.getNumOfTestQ());
        this.start(myTestType,myClass,myTest);

        System.out.println("\nMultiple Answer");
        //multt selection test
        myTestType = new MultiSelection(myTest.getNumOfTestQ());
        this.start(myTestType,myClass,myTest);
        System.out.println("\n\n");
    }

    private void start(VoteType brain, Classroom myClass, Test myTest){
        List<Integer> myTestTotal;                                  //holds total selections for each test answer
        List<Student> myClassStudents = myClass.getClassRoster();   //holds the list of students
        myTestTotal = new ArrayList<>();
        for(int i=0; i< myTest.getNumOfTestQ(); i++){
            myTestTotal.add(0);
        }

        for(Student s: myClassStudents){
            List<Boolean> myChoices = s.studentVote(brain);
            for(int i=0; i<myChoices.size(); i++){
                if(myChoices.get(i))
                    myTestTotal.set(i, myTestTotal.get(i)+1);

            }

        }
        int Total =0;
        for(int i=0; i<myTestTotal.size(); i++){
            char letChoice = (char)(i + 65);
            System.out.print(letChoice + ": " + myTestTotal.get(i) + "  ");
            Total += myTestTotal.get(i);
        }
        System.out.println("Total: " + Total);
    }
}
