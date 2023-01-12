package classes_project;

public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            MyStudents student = new MyStudents("S345" + i,
//                    switch (i) {
//                        case 1 -> "Adrian";
//                        case 2 -> "Bogdan";
//                        case 3 -> "Vasile";
//                        case 4 -> "Mariana";
//                        case 5 -> "Ioana";
//                        default -> "Name";
//                    },
//                    "19/10/1996",
//                    "Java Masterclass");
//            System.out.println(student);
//        }
//        Student pojoStudent = new Student("S345", "Adrian",
//                "05/11/1995", "Java Masterclass");
//        MyStudents recordStudent = new MyStudents("S346", "Bogdan",
//                "05/11/1995", "Java Masterclass");
//        System.out.println(recordStudent);
//        System.out.println(pojoStudent);
//        System.out.println(pojoStudent.getName() + " is taking " +pojoStudent.getClassList());
//        System.out.println(recordStudent.name() + " is taking " +pojoStudent.getClassList());
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }
}
