import java.util.*;

public class CiprianCiocanWeek3Homework {
    private static void checkStringEquality(String firstString, String secondString){
        if(firstString.equals(secondString)){
            System.out.println("The strings are equal!");
        } else {
            System.out.println("The strings are different!");
        }
    }

    private static void checkPalindrome(String st){
        System.out.println("The word " + st + " is "
                + (st.equals(new StringBuilder(st).reverse().toString()) ? "a palindrome." : "not a palindrome."));
    }

    private static void buildListArrayString(List<String> lista, ArrayList<String> array, String builtString){
        addListElements(lista);
        for (String item : lista
        ) {
            if (item.toLowerCase().charAt(0) == 'a' || item.toLowerCase().charAt(0) == 'e' || item.toLowerCase().charAt(0) == 'i' || item.toLowerCase().charAt(0) == 'o' || item.charAt(0) == 'u') {
                builtString = builtString.concat(item.toLowerCase());
            } else {
                array.add(item.toUpperCase());
            }
            if (item.indexOf('x') != -1 || item.indexOf('X') != -1 || item.length() < 3){
                System.out.println("skipped " + item );
                Collections.replaceAll(lista, item, "skipped");
            }
        }
        System.out.println();
        System.out.println("The built string is: "+ builtString);
        System.out.println("The array is: "+ array);
        System.out.println("The modified list is: " + lista);
    }

    private static void addListElements(List<String> lista){
        lista.add("aUtOmAtIoN");
        lista.add("Eu");
        lista.add("TeStInG");
        lista.add("pixel");
        lista.add("wOrKsHoP");
        lista.add("OnGoInG");
        lista.add("tU");
        lista.add("Xenia");
    }

    private static HashMap<String, String> addMapElements(){
        HashMap<String, String> personInformation = new HashMap<>();
        personInformation.put("Ciprian Ciocan", "cipriciocan83@gmail.com");
        personInformation.put("Sergiu Logigan", "sergiu.logigan@softvision.ro");
        personInformation.put("Oana Arbuzov", "oana.arbuzov@softvision.ro");
        personInformation.put("Mihai Muresan", "mihai.muresan@softvision.ro");
        personInformation.put("Vlad Muresan", "vlad.muresan@softvision.ro");
        return personInformation;

    }
    private static void printMap(HashMap<String, String> personInformation){
        System.out.println("The map contains the following items: ");
        for (Map.Entry<String, String> entry : personInformation.entrySet()){
            System.out.println("Name = " + entry.getKey() +
                    ", Email = " + entry.getValue());
        }
    }
    private static void printMapSize(HashMap<String, String> personInformation){
        System.out.println( "The size of the map is " + personInformation.size());
    }

    private static void checkIfMapContainsKey(HashMap<String, String> personInformation, String studentName){
        if (personInformation.containsKey(studentName)){
            System.out.println("The map contains the specified name!");
        } else {
            System.out.println("The map doesn't contain the specified name");
        }
    }

    private static void getEmailOfSpecifiedName(HashMap<String, String> personInformation, String studentName){
        if (personInformation.containsKey(studentName)){
            System.out.println("The email corresponding to the specified name is: " + personInformation.get(studentName));
        } else {
            System.out.println("The map doesn't contain the specified name");
        }
    }

    private static HashMap<String, String> removeEntry(HashMap<String, String> personInformation, String studentName){
         personInformation.remove(studentName);
         return personInformation;
    }

    private static void sortAndPrintMap(HashMap<String, String> personInformation){
        TreeMap<String, String> sortedMap = new TreeMap<>();
        sortedMap.putAll(personInformation);
        for (Map.Entry<String, String> entry : sortedMap.entrySet()){
            System.out.println("Name = " + entry.getKey() +
                    ", Email = " + entry.getValue());
        }
    }
    public static void main(String[] args) {

        // Task 1

        String firstString = "automation";
        String secondString = "testing";
        System.out.println("**Task 1**");
        checkStringEquality(firstString, secondString);

        // Task 2
        String st = "aerisirea";
        System.out.println();
        System.out.println("**Task 2**");
        checkPalindrome(st);

        // Task 3
        System.out.println();
        System.out.println("**Task 3**");

        String builtString = "";
        List<String> lista = new ArrayList<>();
        ArrayList<String> array = new ArrayList<>();
        buildListArrayString(lista, array, builtString);

        // Task 4
        System.out.println();
        System.out.println("**Task 4a**");

        // Task 4a
        HashMap<String, String> personInformation = addMapElements();
        printMap(personInformation);

        // Task 4b
        System.out.println();
        System.out.println("**Task 4b**");
        printMapSize(personInformation);

        // Task 4c
        System.out.println();
        System.out.println("**Task 4c**");
        checkIfMapContainsKey(personInformation,"Ciprian Ciocan");

        //Task 4d
        System.out.println();
        System.out.println("**Task 4d**");
        getEmailOfSpecifiedName(personInformation, "Vlad Muresan");

        // Task 4e
        System.out.println();
        System.out.println("**Task 4e**");
        personInformation = removeEntry(personInformation, "Oana Arbuzov");
        printMap(personInformation);

        //Task 4f
        System.out.println();
        System.out.println("**Task 4f**");
        System.out.println("The sorted map by key is: ");
        sortAndPrintMap(personInformation);



    }

}

