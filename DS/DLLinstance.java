public class DLLinstance {
    public static void main(String[] args) {
        DLL2 list = new DLL2();
        list.insertAtbeginning(6);
        list.insertAtbeginning(5);
        list.insertAtbeginning(4);
        list.insertAtbeginning(3);
        list.insertAtbeginning(2);
        list.insertAtbeginning(1);
        list.insertAtEnd(7);
        list.insertAtinPosition(2, 5);
        System.out.println("dispay forward");
        list.display();
        System.out.println("display backward");
        list.dislayBackwared();
    }
}
