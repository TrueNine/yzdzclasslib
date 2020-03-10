package cn.yzdz.random.Interfaces;

/**
 * 该接口规定了随机字符串
 * 的获取方式
 * 与 RandomChar 接口相结合
 *
 * @author 彭继工
 * @date 2020-03-08:19:27
 */
public interface RandomString {
    /**
     * 随机获取所有字符 ASCII 范围内
     * 根据 length 的长度
     *
     * @param length 字符串长度
     * @return String
     */
    String charAll(int length);

    /**
     * 随机获取所有的字母,不包括数字,符号
     * 长度根据 length 决定
     *
     * @param length 字符串长度
     * @return String
     */
    String letter(int length);

    /**
     * 随机获取大写字母
     *
     * @param length 长度
     * @return String
     */
    String uppercaseLetter(int length);

    /**
     * 随机获取小写字母
     *
     * @param length 长度
     * @return String
     */
    String lowercaseLetter(int length);

    /**
     * 随机获取所有的数字
     *
     * @param length 长度
     * @return String
     */
    String number(int length);

    /**
     * 随机获取符号
     *
     * @param length 长度
     * @return String
     */
    String sign(int length);

    /**
     * 获取中文字符串
     *
     * @param length 长度
     * @return String
     */
    String chinese(int length);

    /**
     * 随机获取数字和大小写字母的混合字符串
     *
     * @param length 长度
     * @return String
     */
    String numberAndLetter(int length);

    /**
     * 随机获取数字和大写字母的混合字符串
     *
     * @param length 长度
     * @return String
     */
    String numberAndUppercaseLetter(int length);

    /**
     * 随机获取数字和小写字母的混合字符串
     *
     * @param length 长度
     * @return String
     */
    String numberAndLowercaseLetter(int length);

    /**
     * 混合大杂烩
     * 大小写字母,数字,符号
     * 但还是在ASCII范围内
     *
     * @param length 长度
     * @return boolean
     */
    String numberAndLetterAndSign(int length);

    /**
     * 终极混合大杂烩
     * 获取,英文(大小写),中文,数字,英文符号
     *
     * @param length 长度
     * @return String
     */
    String numberAndLetterAndSignAndChinese(int length);
}
