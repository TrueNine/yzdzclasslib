package cn.how2j.interfaces;

/**
 * MyStringBuffer的接口
 * 规范设计
 *
 * @author 彭继工
 * @date 2020-03-10:12:24
 */
public interface MyStringBuffer {
    /**
     * 在字符串尾部追加字符串
     *
     * @param str 字符串
     */
    void append(String str);

    /**
     * 在字符串的尾部追加字符
     *
     * @param c 字符
     */
    void append(char c);

    /**
     * 根据索引位置插入字符
     *
     * @param pos 索引
     * @param b   字符
     */
    void insert(int pos, char b);

    /**
     * 在指定索引位置插入字符
     *
     * @param pos 索引
     * @param b   字符串
     */
    void insert(int pos, String b);

    /**
     * 删除从索引开始的余下字符串
     *
     * @param start 索引
     */
    void delete(int start);

    /**
     * 删除指定位置之间的字符串
     *
     * @param start 开始位置
     * @param end   结束位置
     */
    void delete(int start, int end);

    /**
     * 反转字符串
     */
    void reverse();

    /**
     * 返回字符串的长度
     *
     * @return int
     */
    int length();
}
