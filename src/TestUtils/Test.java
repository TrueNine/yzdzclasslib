package TestUtils;

import cn.how2j.YzdzStringBuffer;

/**
 * 测试类
 * 测试一些工具类的功能
 *
 * @author 彭继工
 * @date 2020-03-09:17:31
 */
public class Test {

    private Test(){}

    public static void main(String[] args) {
        YzdzStringBuffer f = new YzdzStringBuffer();
        for (int i = '0'; i < '9'; i++) {
            char temp = (char) i;
            f.append(temp);

        }
        print(f);
        f.delete(0,8);
        print(f);

        StringBuffer buffer = new StringBuffer();
        for (int i = '0'; i < '9'; i++) {
            char temp = (char) i;
            buffer.append(temp);
        }
        System.out.println(buffer);
        buffer.delete(0,8);
        System.out.println(buffer);
    }
    private static void print(YzdzStringBuffer f) {
        System.out.println(f);
        System.out.println(f.test());
    }
}
