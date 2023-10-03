package src;
import java.util.*;

//abstract class
abstract class employee{
    int id;
    String name;
    void input(){
        Scanner objSc = new Scanner(System.in);
        System.out.print("id: ");
        this.id = objSc.nextInt();
        objSc.nextLine();
        System.out.print("name: ");

    }
}
public class abstractDemo {
}
