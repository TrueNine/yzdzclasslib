package cn.yzdz.random;

/**
 * 类作用: 工具类
 * 类说明: 包含一些常用的随机数字,浮点数方法
 *
 * @author 彭继工
 * @date 2020 - 02 - 28:13:36
 */
public class RandomNumber {

    /**
     * 空构造器
     */
    RandomNumber() {

    }

    /**
     * 返回 0 - max 的随机数
     * 使用 Math.ramdom 执行
     * 在 math.random * max 之后进行了 + 1操作
     * 所以使用时,请考虑情况
     * 此方法是一个静态方法,所以可以尽管调用
     *
     * 加入boolean 变量,使用该布尔变量,可以取到 0
     * 但请小心 数学异常
     *
     * @param max 最大值
     * @param isZero 是否取零
     * @return 随机整数 int
     */
    public static int randomInt(int max,boolean isZero) {
        int result = (int) (Math.random() * max);
        return isZero ? result + 1 : result;
    }
}