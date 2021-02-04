package behavioral.iterator;

public class DeveloperRunner {
    public static void main(String[] args) {
        String[] skills = new String[] {"Java", "Spring", "Maven", "PostgresSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Sardorbek Sharifov", skills);
        Iterator iterator = javaDeveloper.getIterator();

        System.out.println(javaDeveloper.getName());
        System.out.println("Skills:");

        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
