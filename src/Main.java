public class Main {
    public static void main(String[] args) {

        String[] names = {"Cristina", "Paul", "Maria", "John"};

        System.out.println(names.length);

        System.out.println("==== For ====");
        for (int i=0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("==== Foreach ====");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("==== While ====");
        int i = 0;
        while(i < names.length) {
            System.out.println(names[i++]);
        }

        System.out.println("==== Do while ====");
        i = 0;
        do {
            System.out.println(names[i++]);
        } while (i < names.length);
    }
}
