package coding.practice.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {

    public static class Demo {
        int sid;
        String name; 
        String rollNo;
        String address;

        public Demo(int sid, String name, String rollNo, String address) {
            this.sid = sid;
            this.name = name;
            this.rollNo = rollNo;
            this.address = address;
        }
    }

    public static void main(String[] args) {
        List<Demo> studentList = new ArrayList<>();
        studentList.add(new Demo(1, "Mustafa", "101", "satna"));
        studentList.add(new Demo(2, "ALisha", "102", "Rewa"));
        studentList.add(new Demo(3, "Satyam", "103", "Nagod"));
        studentList.add(new Demo(4, "Swadeep", "104", "Bhopal"));
        studentList.add(new Demo(5, "Sakshi", "105", "Durg"));

        List<Integer> statelist = studentList.stream()
                .filter(p -> p.sid > 3)
                .map(m -> m.sid)
                .collect(Collectors.toList());
        System.out.println(statelist);
    }
}
