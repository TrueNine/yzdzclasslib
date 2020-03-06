package cn.how2j;

/**
 * 类作用: 工具类
 * 类说明: 因为how2j太喜欢使用英雄作为例子了
 * 老是写太麻烦,索性写了个工具类,方便使用
 *
 * 包含各种需要的属性以及方法
 * 后续经常添加
 *
 * @author 彭继工
 * @date 2020 - 02 - 29:22:15
 */
public class Hero {

    /** 英雄名称 */
    public String name;
    /** 英雄血量 */
    public float hp;
    /** 英雄护甲 */
    public float armor;
    /** 移动速度 */
    public int moveSpeed;
    /** 攻击速度 */
    public float attackSpeed;
    /** 杀人次数 */
    public short k;
    /** 死亡次数 */
    public short d;
    /** 助攻次数 */
    public short a;
    /** 补刀次数 */
    public int killCreatures;
    /** 杀人前说的话 */
    public String lillBefore;
    /** 杀人后说的话 */
    public String killAfter;
    /** 复制权(静态属性) */
    public static String copyRights = "YZDZ";

    /**
     * 空构造器
     */
    public Hero() {

    }

    /**
     * 构造器
     * 初始化名称和血量
     *
     * @param name 英雄名称
     * @param hp   英雄血量
     */
    public Hero(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    /**
     * 构造器
     * 提供英雄的一些属性
     * 来初始化一个英雄
     * 在本构造器中,调用了别的构造器
     *
     * @param heroName      英雄名称
     * @param heroHp        英雄血量
     * @param heroArmor     英雄护甲值
     * @param heroMoveSpeed 英雄移动速度
     */
    public Hero(String heroName, float heroHp, float heroArmor, int heroMoveSpeed) {
        // 调用本类中的其他构造器
        this(heroName, heroHp);
        this.armor = heroArmor;
        this.moveSpeed = heroMoveSpeed;
    }

    /**
     * 杀人 kull 方法
     * 在此方法调用 Mortal 接口的方法
     *
     * @param mortal Mortal 接口类型
     */
    public void kill(Mortal mortal) {
        mortal.die();
    }

    /**
     * 重写的 toString 方法
     * 打印英雄的一些数据
     *
     * @return 字符串
     */
    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("名称: ")
                .append(this.name)
                .append(" 血量: ")
                .append(this.hp)
                .append(" 护甲值: ")
                .append(this.armor)
                .append(" 移动速度: ")
                .append(this.moveSpeed);
        return buffer.toString();
    }
}
