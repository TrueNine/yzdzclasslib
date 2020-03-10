package cn.yzdz.outConsole;

/**
 * 可能会添加一些打印的方法
 * 支持泛型
 *
 * @author 彭继工
 * @date 2020-03-09:14:20
 */
public class Print <E> {

    /**
     * 公开构造器
     */
    public Print() {

    }
    /**
     * 在控制台打印数组
     * 格式 每个元素之间用 \t 分隔
     * 根据 lineNumber 决定一行打印多少数据
     * 只能打印对象数组,请提前写好 toString 方法
     *
     * @param t          数组
     * @param lineNumber 行数
     */
    public void printArray(E[] t, int lineNumber) {
        for (int i = 0; i < t.length; i++) {
            System.out.format("\t%s",t[i]);
            if (0 == (i + 1) % lineNumber) {
                System.out.format("\n");
            }
        }
    }

    /**
     * 返回一根分割线
     * 因为每次都写
     * 懒得写了
     * 请使用 println 打印
     * 分割线没有换行符
     * manual 说明在这条分割线上说明什么
     *
     * @param manual 说明文字
     * @return String
     */
    public static String line(String manual) {
        return "|===================== | " + manual + " | =====================|";
    }
}
