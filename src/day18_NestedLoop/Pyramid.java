package day18_NestedLoop;



public class Pyramid {
    public static void main(String[] args) {


int h = 5;

// for left side of pyramid
for (int i = 0; i < h ; i++)
{
    for (int j = 0 ; j < i+1; j++) {
        System.out.print("*");
    }
    System.out.println("");
}


for (int k = 0; k < h ;k++){

    for (int l = 0; l < h-k-1 ; l++)
        System.out.print(" ");


    for (int m = 0; m < k+1 ; m++)
        System.out.print("*");

    System.out.println("");



}










    }

}
