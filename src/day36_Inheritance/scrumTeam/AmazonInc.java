package day36_Inheritance.scrumTeam;

public class AmazonInc {

    public static void main(String[] args) {

        ProductOwner productOwner = new ProductOwner();

        productOwner.setInfo("Kerem",23,'M');
        productOwner.setInfo(322,"PO",20000);

        BusinessAnalyst businessAnalyst = new BusinessAnalyst();
        businessAnalyst.setInfo(231,"BA",29000);
        businessAnalyst.setInfo("ayse",23,'F');

        ScrumMaster scrumMaster = new ScrumMaster();
        scrumMaster.setInfo(231,"Scrum Master",232333);
        scrumMaster.setInfo("Joe",54,'F');


        Tester tester1 = new Tester();
        Tester tester2 = new Tester();

        tester1.setInfo("Ali", 23,'M');
        tester1.setInfo(233,"Tester",100000);

        tester2.setInfo("Veli", 29,'M');
        tester2.setInfo(133,"Tester",110000);

        Developer developer1 = new Developer();
        Developer developer2 = new Developer();

        developer1.setInfo("gamze", 32,'F');
        developer1.setInfo(98,"developer",100000);

        developer2.setInfo("Naho", 52,'F');
        developer2.setInfo(198,"developer",130000);


        ScrumTeam scrumTeam1 = new ScrumTeam();
        scrumTeam1.addDeveloper(developer1);
        scrumTeam1.addDeveloper(developer2);
        scrumTeam1.addTester(tester1);
        scrumTeam1.addTester(tester2);

        scrumTeam1.setInfo(productOwner,businessAnalyst,scrumMaster);

     //  scrumTeam1.setInfo(productOwner, scrumTeam1.BA, scrumTeam1.SM);


       System.out.println(scrumTeam1);



    }


}


/*
9. Create a class named AmazonInc:

			create the objects of ProductOwner, ScrumMaster, and BusinessAnalyst
			Create 4 objects of Testers
			Create 5 Objects of Developers

			Create an object of ScrumTeam

			Add the ProductOwner, ScrumMaster, and BusinessAnalyst, Testers and Developers object into the scrum team

 */