package java_techie_java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8MethodCheatSheet {
    public static void main(String[] args) throws Exception {
        List<Employee> employees=EmployeeDataBase.getAllEmployees();
        employees.forEach(e-> System.out.println(e.getName()+" "+e.getSalary()));

        employees.stream().filter(t->t.getName().toLowerCase().startsWith("j")).forEach(System.out::println);

        //double filter check
        List<Employee> employees1=employees.stream().filter(t->t.getDept().equals("Development") && t.getSalary()>80000).toList();
        System.out.println(employees1);

        //map method
        Set<String> dept = employees.stream().map(Employee::getDept).collect(Collectors.toSet());
        System.out.println(dept);

        //flatMap() ->one to many mapping
        List<String> list= employees.stream().flatMap(t -> t.getProjects().stream().map(Project::getName)).distinct().toList();
        System.out.println(list);

        //max()
       Employee maxElement= employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(maxElement);

        //Comparing getName and getSalary
        employees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary))
                .forEach(System.out::println);

        //printing employee object in asc
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

        //printing employee object in desc
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

        //sorting with collections class
        employees.stream().sorted(Collections.reverseOrder(Comparator.comparing(e->e.getSalary()))).forEach(System.out::println);

        //min method
       Employee minEmployee=  employees.stream().min(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(minEmployee);

        //max method
        Employee maxEmployee = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(maxEmployee);

        //gender with count
        Map<String, Long> map =employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(map);

        //gender with names
        Map<String, List<String>> mapWith = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(map);

        //findFirst method
      Employee findFirst=  employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();
        System.out.println(findFirst);

        //anyMatch(Predicate), allMatch(),noneMatch()
        //findAny method
        Employee findAny= employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findAny().get();
        System.out.println(findAny);

        //allMatch method
        boolean b = employees.stream().allMatch(e -> e.getSalary() > 50000);
        System.out.println(b);

        //limit(Long)
         employees.stream().filter(e -> e.getDept().equals("Development")).limit(3).forEach(System.out::println);

         //skip(Long)
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).forEach(System.out::println);

        //skip(Long)
        Employee employee = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get();
        System.out.println(employee);

        //findAny method
        Employee employee1 = employees.stream().filter(t -> t.getName().startsWith("J")).findAny().orElseThrow(() -> new NoSuchElementException("data not found"));
        System.out.println(employee1);

        //fetching using groupBy method
        Map<String,List<Employee>> map1= employees.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(map1);

        //fetching using groupBy method and its count
        Map<String,Long> map2=employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
        System.out.println(map2);
    }
}
