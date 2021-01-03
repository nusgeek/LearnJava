public class Test {
    /**
     *
     * @param args The parameter name;
     */
    public static void main(String[] args) {
        Person person = new Person.Builder(12)
                .withFirstName("Tony")
                .withLastName("Ng")
                .build();
        System.out.println(person.toString());

    }
}
