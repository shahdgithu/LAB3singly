public class Test {
    import java.io.Serializable;

    public class Test {
        public static void main(String[] args) {
            SinglyLinkedList<Integer> S=new SinglyLinkedList<>();

            System.out.println(S.isEmpty());
            System.out.println(S.size());

            S.addFirst(1);
            S.addLast(2);
            S.addLast(3);
            S.addFirst(0);

            System.out.println("  ");

            System.out.println(S.Last());


            while (!S.isEmpty())
                System.out.print(S.removeFirst()+"\t");

            System.out.println(S.rotate());
        }
    }

}
