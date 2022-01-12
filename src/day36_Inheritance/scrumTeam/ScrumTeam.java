package day36_Inheritance.scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {



    public ProductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;

    ArrayList<Tester> testersList = new ArrayList<>();

    ArrayList<Developer> developersList =new ArrayList<>();

    public void setInfo(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester){

        testersList.add(tester);
    }
    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));

    }

    public void removeTester(int id){
        testersList.removeIf(p->p.id==id);
    }

    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }
    public void addDeveloper(Developer[] developers){
        developersList.addAll(Arrays.asList(developers));

    }
    public void removeDeveloper(int id){
        developersList.removeIf(p->p.id==id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +
                "PO=" + PO +
                ", BA=" + BA.name +
                ", SM=" + SM.name +
                ", testersList=" + testersList.size() +
              //  ", testersList=" + testersList +
                ", developersList=" + developersList.size() +
                '}';
    }


}

/*
Variables:
				PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
				testers (ArrayList<Testers>),  developers (ArrayList<Developers>)

			Methods:
				addTester(Tester tester): adds the given tester to testers arraylist

				ddTesters(Tester[] testers): adds the given testers to testers arraylist

				removeTester(int id): removes the tester with the given id from the arraylist of tester

				addDeveloper(Developer developer): adds the given developer to testers arraylist

				addDeveloper(Developer[] developer): adds the given developers to testers arraylist

				removeDeveloper(int id): removes the developer with the given id from the arraylist of developer

				toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers

 */