package cn.yzdz;

/**
 * 最简单的动态数组
 * 暂时只支持增加元素和删除元素
 *
 * @author 彭继工
 * @date 2020-03-09:16:17
 */
public class YzdzList <T extends Object> {

    /** 容器内字符串长度 */
    private int size;
    /** 数组真实长度 */
    private int arrayIndex;
    /** 数组默认增加长度 */
    private int defaultArrayAddLength = 64;

    /** 存储元素 */
    private Object[] value;

    /**
     * 公开构造器
     * 初始化 size 为 0
     * 初始化数组长度为默认的 64
     */
    public YzdzList() {
        value = new Object[defaultArrayAddLength];
    }

    /**
     * 重载构造器
     * 根据自己的需要设定数组默认长度
     * 会根据这个数值,决定溢出之后增加的长度
     *
     * @param length 数组长度
     */
    public YzdzList(int length) {
        if (0 >= length) {
            throw new RuntimeException("传入数据不能为 0 或负数");
        }
        defaultArrayAddLength = length;
        value = new Object[length];
    }

    /**
     * 往数组的尾部增加内容
     * 之前忘记缓存的概念
     * 增加了缓存冗余
     *
     * @param type 元素
     */
    public void add(T type) {
        if (null == this.value) {
            value = new Object[defaultArrayAddLength];
            value[0] = type;
        } else {
            if (size + 1 >= value.length) {
                Object[] o = new Object[size + defaultArrayAddLength];
                System.arraycopy(value,0,o,0,value.length);
                value = o;
            }
            value[size] = type;
        }
        size ++;
    }

    /**
     * 重写的 toString 方法
     * 打印数组的元素
     * [x,x,x]
     *
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[");

        if (0 < size) {
            for (int i = 0; i < size; i++) {
                buffer.append(value[i])
                        .append(",");
            }
            buffer.delete(buffer.length() - 1,buffer.length());
        } else {
            buffer.append("null");
        }

        buffer.append("]");
        return buffer.toString();
    }

    /**
     * 返回容器的长度
     *
     * @return int
     */
    public int length() {
        return this.size;
    }

    /**
     * 根据索引位置返回一个 内容
     * 此处的返回,进行了 把 Object 强制转换为泛型的操作
     * 可能出现未知情况
     *
     * @param index 索引
     * @return T
     */
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引越界");
        }
        return (T) value[index];
    }
}
