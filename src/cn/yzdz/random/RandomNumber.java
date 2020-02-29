package cn.yzdz.random;

/**
 * 类作用: 工具类
 * 类说明: 包含一些常用的随机整数,浮点数方法
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
     * 空方法,如果忘记了调用,则会使用该方法
     * 该方法返回一个 1 - 10 之间的数值
     *
     * @return 整数 int
     */
    public static int randomInt() {
        int defaultNumber = 10;
        return (int) (Math.random() * defaultNumber) + 1;
    }

    /**
     * 该方法为私有方法
     * 返回一个范围内的值,会取零
     * 对外私有,尽量少暴露方法
     *
     * @param max 最大值
     * @return 整数 int
     */
    private static int randomInt(int max) {
        return (int) (Math.random() * max);
    }

    /**
     * 公开方法
     * 根据 max 参数,返回一个 直到 max 的随机整数
     * isZero 控制是否取零,如果不取零,则直接给予 false,调用私有方法
     * 如果传入的值 小于等于 0,则会抛出异常
     *
     * @param max 最大取值范围
     * @param isZero 是否取零
     * @return 整数 int
     */
    public static int randomInt(int max,boolean isZero) {
        // 非零负数排除
        if (0 >= max) {
            throw new RuntimeException("数值越界,不能是 0 或 负数");
        }
        return isZero ? randomInt(max) : randomInt(max) + 1;
    }

    /**
     * 私有方法
     * 处理一个随机在 beforeRange 和 afterRange 之间的整数
     * 会取到 0
     *
     * @param beforeRange 范围最小值
     * @param afterRange 范围最大值
     * @return 整数 int
     */
    private static int randomInt(int beforeRange,int afterRange) {
        return (int) (Math.random() * (afterRange - beforeRange)) + beforeRange;
    }

    /**
     * 对外公开方法
     * 获取一个在 beforeRange 和 afterRange 之间的整数
     * isZero 控制是否取零,如果不取零,则直接给予 false,调用私有方法
     * 如果传入的数值 小于等于 0,则会抛出异常
     *
     * @param beforeRange 最小值
     * @param afterRange 最大值
     * @param isZero 是否取零
     * @return 整数 int
     */
    public static int randomInt(int beforeRange,int afterRange,boolean isZero) {
        if (0 >= beforeRange || 0 >= afterRange) {
            throw new RuntimeException("数值越界,不能是 0 或 负数");
        }
        return isZero ? randomInt(beforeRange,afterRange) : randomInt(beforeRange,afterRange) + 1;
    }
}