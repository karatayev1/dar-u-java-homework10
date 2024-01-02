import java.util.*;

// Homework 10
public class Main {
    public static void main(String[] args) {
        // Task 1
        for (Colors colors : Colors.values()) {
            System.out.println(colors);
        }
        System.out.println("......");

        // Task 2
        Weekday wd = Weekday.SUNDAY;
        for (Weekday weekday : Weekday.values()) {
            System.out.println(wd.isWeekDay(weekday));
        }

        for (Weekday weekday : Weekday.values()) {
            System.out.println(wd.isHoliday(weekday));
        }
        System.out.println("......");

        // Task 4
        HashMap<String, Integer> studentsGrades = new HashMap<>();
        ArrayList<Integer> grades = new ArrayList<>();
        Student student1 = new Student();
        student1.iin = "845736465938";
        student1.grade = 5;
        Student student2 = new Student();
        student2.iin = "546583748593";
        student2.grade = 6;
        Student student3 = new Student();
        student3.iin = "384757633848";
        student3.grade = 7;

        studentsGrades.put(student1.iin, student1.grade);
        studentsGrades.put(student2.iin, student2.grade);
        studentsGrades.put(student3.iin, student3.grade);
        System.out.println(studentsGrades.size());
        for (Map.Entry<String, Integer> entry : studentsGrades.entrySet()) {
            System.out.printf("%s - %s %n", entry.getKey(), entry.getValue());
        }

        grades.add(student1.grade);
        grades.add(student2.grade);
        grades.add(student3.grade);
        Iterator<Integer> it = grades.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("......");

        // Task 5
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите команду: ");
            String command = scanner.nextLine();

            if (command.startsWith("ADD")) {
                String[] parts = command.split(" ");
                if (parts.length != 3) {
                    System.out.println("Неверный формат команды ADD");
                    continue;
                }
                String lastName = parts[1];
                String phoneNumber = parts[2];
                phoneBook.add(lastName, phoneNumber);
                System.out.println("Контакт успешно добавлен");
            } else if (command.startsWith("GET")) {
                String[] parts = command.split(" ");
                if (parts.length != 2) {
                    System.out.println("Неверный формат команды GET");
                    continue;
                }
                String lastName = parts[1];
                List<String> numbers = phoneBook.get(lastName);
                if (numbers.isEmpty()) {
                    System.out.println("Номера не найдены");
                } else {
                    System.out.println("Номера: " + numbers);
                }
            } else if (command.startsWith("REMOVE")) {
                String[] parts = command.split(" ");
                if (parts.length != 2) {
                    System.out.println("Неверный формат команды REMOVE");
                    continue;
                }
                String lastName = parts[1];
                phoneBook.remove(lastName);
                System.out.println("Контакт удален");
            } else if (command.equals("LIST")) {
                phoneBook.list();
            } else if (command.equals("EXIT")) {
                break;
            } else {
                System.out.println("Неизвестная команда");
            }
        }
        System.out.println("......");

        //Task 6
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Blue");
        System.out.println(colors);
        System.out.println("......");

        //Task 7
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(2);
        list2.add(1);
        list2.add(3);
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1.equals(list2));
        System.out.println("......");

        //Task 8
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Lexus");
        cars.add("Audi");
        System.out.println(cars);
        cars.set(1, "KIA");
        System.out.println(cars);
        System.out.println("......");

        //Task 9
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Integer> charIndexes = new ArrayList<>();
        char charFind = 'a';
        chars.add('b');
        chars.add('r');
        chars.add('a');
        chars.add('c');
        chars.add('t');
        chars.add('a');
        chars.add('y');
        chars.add('a');
        chars.add('n');
        for (int i = 0; i < chars.size(); i++) {
            if (chars.get(i) == charFind) {
                charIndexes.add(i);
            }
        }
        Collections.sort(charIndexes);
        System.out.println("Первое вхождение: " + charIndexes.get(0));
        System.out.println("Последнее вхождение: " + charIndexes.get(charIndexes.size() - 1));
        System.out.println("......");

        //Task 10
        ArrayList<Integer> listOld = new ArrayList<>();
        ArrayList<Integer> listNew = new ArrayList<>();
        listOld.add(1);
        listOld.add(2);
        listOld.add(3);
        listOld.add(4);
        listOld.add(5);
        System.out.println(listOld);
        listNew = replaceTwoElements(listOld, 0, 4, 6, 9);
        System.out.println(listNew);
        System.out.println("......");

        //Task 11
        HashSet<String> cities1 = new HashSet<>();
        HashSet<String> cities2 = new HashSet<>();
        ArrayList<String> copyOfCities1 = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        cities1.add("Лондон");
        cities1.add("Астана");
        cities1.add("Москва");
        cities1.add("Пекин");
        cities1.add("Токио");
        cities2.add("Париж");
        cities2.add("Сеул");
        cities2.add("Астана");
        cities2.add("Лондон");

        for (String city : cities1) {
            copyOfCities1.add(city);
        }
        for (int i = 0; i < copyOfCities1.size(); i++) {
            if (cities2.contains(copyOfCities1.get(i))) {
                results.add(copyOfCities1.get(i));
            }
        }
        System.out.println(results);
        System.out.println("......");

        //Task 12
        HashSet<Integer> integers = new HashSet<>();
        System.out.println(integers.isEmpty());
        System.out.println("......");

        //Task 13
        HashMap<String, String> employees1 = new HashMap<>();
        HashMap<String, String> employees2 = new HashMap<>();

        employees1.put("Юрист", "Жаслан");
        employees1.put("Бухгалтер", "Ольга");
        employees1.put("Кладовщик", "Мария");
        employees2.put("Программист", "Ернар");
        employees2.put("Экономист", "Айдана");

        for (Map.Entry<String, String> entry : employees1.entrySet()) {
            employees2.put(entry.getKey(), entry.getValue());
        }

        System.out.println(employees2);
        System.out.println("......");

        //Task 14
        System.out.println(employees2.containsValue("Айдана"));
    }

    static ArrayList<Integer> replaceTwoElements(ArrayList<Integer> arrList, int index1, int index2, int replaceValue1, int replaceValue2) {
        arrList.set(index1, replaceValue1);
        arrList.set(index2, replaceValue2);
        return arrList;
    }
}