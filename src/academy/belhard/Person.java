package academy.belhard;

public class Person {

    private String firstName;
    private String lastName;
    private Address address;

    public Person(String firstName, String lastName, Address address) {
        if (firstName == null || lastName == null || address == null)
            throw new NullFieldException("Поле не может быть пустым!");
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setFirstName(String firstName) throws NullFieldException{
        if (firstName == null)
            throw new NullFieldException("Строка не может быть пустой!");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) throws NullFieldException{
        if (lastName == null)
            throw new NullFieldException("Строка не может быть пустой!");
        this.lastName = lastName;
    }

    public void setAddress(Address address) throws NullFieldException {
        if (address == null)
            throw new NullFieldException("Адрес не может быть пустым!");
        this.address = address;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + address.getCity() +
                " " + address.getStreet() + " " + address.getHouse() + "\n";
    }
}
