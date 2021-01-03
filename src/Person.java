/**
 * 通过内部类调用外部构造函数来初始化外部类
 * @author KL
 */
public class Person {
    private int age;
    private String firstName, lastName;

    public static class Builder {
        private int age;
        private String firstName, lastName;

        public Builder(int age) {
            this.age = age;
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    private Person(Builder builder) {
        this.age = builder.age;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
