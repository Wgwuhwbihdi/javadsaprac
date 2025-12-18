import java.util.List;

public class SLinkedlistL {
    public static void main(String[] args) {
        LLclass list = new LLclass();
        list.inserfirst(1);
        list.inserfirst(2);
        list.inserfirst(3);
        list.inserfirst(4);
        list.inserLast(5);
        list.inseratMiddle(100, 2);
        System.out.println("Deleted first value: " + list.deleteFirst());
        list.Display();
        System.out.println("Deleted last value:  " + list.DeletelatElemnet());
        list.Display();
        System.out.println("Delete at position of value" + list.deleteatperticularindex(3));
        list.Display();
        System.out.println("searched item: "+ list.find(2));
        list.Display();
    }
}
