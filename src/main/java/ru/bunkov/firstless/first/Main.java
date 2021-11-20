package ru.bunkov.firstless.first;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .addFirstName("Ivan")
                .addLastName("Ivanov")
                .addMiddleName("Ivanovich")
                .addAddress("Pushkina 21")
                .addCountry("Russia")
                .addPhone("71111111111")
                .addAge(25)
                .addGender("Male")
                .build();
        System.out.println(person);
    }
}
