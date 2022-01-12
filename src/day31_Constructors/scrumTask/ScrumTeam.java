package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA , SM;
    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList<Developer> devopsList = new ArrayList<>();
    public int daysOfSpring;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSpring) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSpring = daysOfSpring;
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }

    public void addTesters(Tester [] testers){
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }

    public void  removeTester (int employeeID){
        testersList.removeIf(p-> p.employeeID == employeeID);
    }

    public void removeDeveloper(int employeeID){

        devopsList.removeIf(p -> p.employeeID == employeeID);
    }


    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of devopsList=" + devopsList.size() +
                ", daysOfSpring=" + daysOfSpring +
                '}';
    }
}



/*
create a class called ScrumTeam
	           Attributes:
	                String PO, BA, SM;
	                ArrayList<Tester> testersList = new ArrayList<>();
	                ArrayList<Developer> devopsList = new ArrayList<>();
	                int daysOfSprint;

	               Add A constructor that can set the fileds PO, BA, and SM


 */