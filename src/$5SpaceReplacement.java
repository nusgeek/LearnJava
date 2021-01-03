import javax.management.MBeanServerFactory;

/**
 * Created on 3 Jan 2021
 * 题目要求：
 * 实现一个函数，把字符串中的每个空格都替换成“20%”
 * 1.
 */
public class $5SpaceReplacement {

    public static String replaceSpace(String stringWithSpace) {
        if (stringWithSpace.length() == 0) return "";

        char[] str = stringWithSpace.toCharArray();
        int strLen, newStrLen;
        strLen = newStrLen = stringWithSpace.length();

        for (int i = 0; i < strLen; i++) {
            if (str[i] == ' ') newStrLen += 2;
        }

        char[] newStr = new char[newStrLen];
        for (int i = 0, j = 0; i < strLen;) {
            if (str[i] == ' ') {
                newStr[j++] = '2';
                newStr[j++] = '0';
                newStr[j++] = '%';
                i++;
            } else {
                newStr[j++] = str[i++];
            }
        }

        return new String(newStr);
    }

    public static void main(String[] args) {
        String replacedString = replaceSpace(" A   M -  N ");
        System.out.println(replacedString);
    }
}
