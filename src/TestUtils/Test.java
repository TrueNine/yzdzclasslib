package TestUtils;

import cn.how2j.YzdzStringBuffer;
import cn.yzdz.random.RandomChar;
import cn.yzdz.random.RandomString;
import cn.yzdz.random.RandomStringX;

import java.util.ArrayList;

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
        RandomStringX x = new RandomStringX();
        System.out.println(x.letter().number().chinese().build(24));
    }
}