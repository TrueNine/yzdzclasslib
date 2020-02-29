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
    String name;
    /** 英雄血量 */
    float hp;
    /** 英雄护甲 */
    float armor;
    /** 移动速度 */
    int moveSpeed;
    /** 攻击速度 */
    float attackSpeed;
    /** 杀人次数 */
    short k;
    /** 死亡次数 */
    short d;
    /** 助攻次数 */
    short a;
    /** 补刀次数 */
    int killCreatures;
    /** 杀人前说的话 */
    String lillBefore;
    /** 杀人后说的话 */
    String killAfter;
}
