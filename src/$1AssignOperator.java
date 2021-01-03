/**
 * 1. Value being transmitted should be final
 * 2. If values are same, return directly.
 * 3. Return 'this' to be assigned continuously.
 */

public class $1AssignOperator {
    public static class MyString {
        private String str;

        public MyString(String str) {
            this.str = str;
        }

        public MyString assignedBy(final MyString myString) {
            if (this.str.equals(myString.str) || this == myString) return this;
            this.str = myString.str;
            return this;
        }

        @Override
        public String toString() {
            return "MyString{" +
                    "str='" + str + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        MyString str1 = new MyString("str1");
        MyString str2 = new MyString("str2");
        MyString str3 = new MyString("str3");
        MyString str4 = str1.assignedBy(str2).assignedBy(str3);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
