package interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonService implements
        CRUDService<Person, Long> {

    private List<Person> people = new ArrayList<>();

    @Override
    public void create(Person person) {
        people.add(person);
    }

    @Override
    public Optional<Person> find(Long id) {
        return people.stream().filter(
                p -> p.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<Person> readAll() {
        return people;
    }

    @Override
    public void update(Person person) {
        for (int i = 0; i < people.size(); i++) {
            Person p = people.get(i);
            if (p.getId().equals(person.getId())) {
             people.set(i, person);
             return;
            }
        }
        throw new IllegalArgumentException("Person not found");
    }

    @Override
    public void delete(Long id) {
        people.removeIf(p -> p.getId().equals(id));
    }
}
