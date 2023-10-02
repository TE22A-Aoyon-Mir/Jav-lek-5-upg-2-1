import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner tangentbord = new Scanner (System.in);

        //a
        int[] fält1 = new int[4];
        System.out.println("Ange elemnt 0: " );
        fält1[0] = tangentbord.nextInt();
        System.out.println("Ange elemnt 1: " );
        fält1[1] = tangentbord.nextInt();
        System.out.println("Ange elemnt 2: " );
        fält1[2] = tangentbord.nextInt();
        System.out.println("Ange elemnt 3: " );
        fält1[3] = tangentbord.nextInt();
        System.out.println("Element 0: "+fält1[0]);
        System.out.println("Element 1: "+fält1[1]);
        System.out.println("Element 2: "+fält1[2]);
        System.out.println("Element 3: "+fält1[3]);

        int plats = fält1[0];
        fält1[0] = fält1[3];
        fält1[3] = plats;
        int plats2 = fält1[1];
        fält1[1] = fält1[2];
        fält1[2] = plats2;
        System.out.println("Med bytt plats: ");
        System.out.println("Element 0: "+fält1[0]);
        System.out.println("Element 1: "+fält1[1]);
        System.out.println("Element 2: "+fält1[2]);
        System.out.println("Element 3: "+fält1[3]);
    }
}
