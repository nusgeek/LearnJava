public class StaticClass1 {
    private static String FIRST_NAME;
    private String lastName;

    public StaticClass1(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.FIRST_NAME  = firstName;
    }

    public String getFirstName() {
        return FIRST_NAME;
    }

    public static String getFirstNameByStatic() {
        return FIRST_NAME;
    }

    public static class StaticInnerClass {
        public void printOuterFields() {
            System.out.println(FIRST_NAME);
            System.out.println(getFirstNameByStatic()   );
        }
    }

    public class InnerClass {
        public void printOuterFields() {
            System.out.println(lastName);
        }
    }
}
