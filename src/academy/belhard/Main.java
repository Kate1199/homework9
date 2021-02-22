package academy.belhard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        Person p1 = new Person("Дарья","Андреева", new Address("г.Минск","ул.Нахимова",1));
        Person p2 = new Person("Ростислав","Максимов", new Address("г.Минск","ул.Долгобродская",2));
        Person p3 = new Person("Марк","Медведев", new Address("г.Минск","ул.Сурганова",3));

        System.out.println(p1.toString() + p2.toString() + p3.toString());

        List<Person> people = new ArrayList<Person>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        PersonIOUtil.writePersons("People.TXT", people);

        System.out.println(PersonIOUtil.readPersons("People.TXT").toString());

            }
}
