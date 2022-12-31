//wap a java program to sort an array of strings using bubble sort
public class SortNames {
    public static void main(String[] args) {
        String[] names = { "harry", "dumbledore", "ron", "lupin", "dobby", "snape", "voldemort" };
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}