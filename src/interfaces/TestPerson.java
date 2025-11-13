package interfaces;

import java.util.List;

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person(1L, "Hyago", 35);

        PersonService personService = new PersonService();
        personService.create(person);
        personService.find(1L);
        List<Person> people = personService.readAll();

        for (Person p : people) {
            System.out.println("Id: " + p.getId());
            System.out.println("Name: " + p.getName());
            System.out.println("Age: " + p.getAge());
        }
        personService.delete(1L);
    }
}
