package day28_ArrayList;

public class x {
    public static void main(String[] args) {

String [] things = {"house", "shed", "slide", "zebra", "park", "garden"};

for (String s : things){

    System.out.print(s.charAt(1)+" ");
        switch (s.charAt(1)){
        case 'h':
            System.out.print(1);
        break;
        case 'a':
            System.out.print(2);
        case 's':
            System.out.print(3);
        break;
        case 'o':
        default:
            System.out.print(4);
        case 'p':
            System.out.print(5);
        break;
        case 'z':
            System.out.println(6);
        case 'l':
            break;
        case 'g':
            System.out.println(7);
    }
    System.out.println();
}}}
/*
o


print => 45145
 */