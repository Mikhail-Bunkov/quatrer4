package ru.bunkov.firstless.first;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public Person(String firstName, String lastName, String middleName, String country, String address, String phone, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        public Builder addFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder addLastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder addMiddleName(String middleName){
            this.middleName = middleName;
            return this;
        }
        public Builder addCountry(String country){
            this.country = country;
            return this;
        }
        public Builder addAddress(String address){
            this.address = address;
            return this;
        }
        public Builder addPhone(String phone){
            this.phone = phone;
            return this;
        }
        public Builder addAge(int age){
            this.age = age;
            return this;
        }
        public Builder addGender(String gender){
            this.gender = gender;
            return this;
        }

        public Person build(){
            return new Person(this.firstName, this.lastName, this.middleName, this.country, this.address, this.phone, this.age, this.gender); //???????? ?????? ???? ?????????????? ????????????-???? ????????????????, ?????? ?????? ???????? ???????????? ?? person. ???????????? ?????? ?? ????????)
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
