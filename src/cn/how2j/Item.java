package cn.how2j;

/**
 * 类作用: 工具类
 * 类说明: how2j 例子
 * <p>
 * 因为 how2j 的需要,所以直接写成工具类
 * 这是一个物品类,大概意思是有价格,有名称
 * 还重写了方法
 *
 * @author 彭继工
 * @date 2020 - 03 - 06:15:57
 */
public class Item {

    /** 物品名称 */
    public String name;
    /** 物品价格 */
    public float price;

    /**
     * 空构造器
     */
    public Item() {

    }

    /**
     * 传入名称,初始化物品
     *
     * @param name 物品名称
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * 构造器
     * 通过名称和价格初始化物品
     *
     * @param name 名称
     * @param price 价格
     */
    public Item(String name,float price) {
        this(name);
        this.price = price;
    }

    /**
     * 重写的 toString 方法
     * 返回格式: 名称 : 价格
     *
     * @return 字符串
     */
    @Override
    public String toString() {
        return this.name + " : " + this.price;
    }

    /**
     * 重写的 equals 方法
     * 比较另一个对象是否是 Item 类型
     * 再判断是否是同一个物品
     * 再判断物品的名称和价格是否相等
     *
     * @param object 对象
     * @return 布尔值
     */
    @Override
    public boolean equals(Object object) {
        // 首先判断 是否是同一个对象
        if (object instanceof Item) {
            // 强制转型判断名称和价格
            if (((Item) object).name.equals(this.name) && ((Item)object).price == this.price) {
                return true;
            }
        }
        return false;
    }

    /**
     * 重写打垃圾回收方法
     * 只是打印了一下呗回收了
     *
     * @throws Throwable 不知道的异常
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("对象: " + this.toString() + "被回收");
    }
}