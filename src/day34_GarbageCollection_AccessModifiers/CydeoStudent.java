package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;

public CydeoStudent(String studentName){

    this.studentName = studentName;
}

static {


    schoolName = "Cydeo School";


}




}




class CydeoStudentObject{

    CydeoStudent student1 = new CydeoStudent("Jimmy");
    CydeoStudent student2 = new CydeoStudent("Kathy");


}