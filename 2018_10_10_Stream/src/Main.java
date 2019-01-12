import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        List<Employee> list = new LinkedList<>();
        list.add(new Employee(1));
        list.add(new Employee(5));

        Integer salarySum = list
                .stream()
                .map(Employee::getSalary)
                .reduce(0,(a, b)->a + b);

        System.out.println(salarySum);
    }

    static class Employee {
        private Integer salary;

        public Employee (Integer salary) {
            this.salary = salary;
        }

        public Integer getSalary() {
            return salary;
        }


    }
}
