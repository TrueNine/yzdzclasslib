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
     *
     * @param max 最大值
     * @return 随机数
     */
    public int randomInt(int max) {
        return (int) (Math.random() * max) + 1;
    }
}
