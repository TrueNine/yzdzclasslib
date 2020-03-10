package cn.yzdz.random.Interfaces;

/**
 * 该接口规定了随机字符类的规范
 *
 * @author 彭继工
 * @date 2020-03-08:19:18
 */
public interface RandomChar {

    int UNICODE_CHINESE_MAX = '\u9fa5';
    int UNICODE_CHINESE_MIN = '\u4e00';
    byte ASCII_RANGE_MAX = 126;
    byte ASCII_RANGE_MIN = 33;
    byte ASCII_UPPERCASE_LETTER_RANGE_MAX = 'Z';
    byte ASCII_UPPERCASE_LETTER_RANGE_MIN = 'A';
    byte ASCII_LOWERCASE_LETTER_RANGE_MAX = 'z';
    byte ASCII_LOWERCASE_LETTER_RANGE_MIN = 'a';
    byte ASCII_NUMBER_RANGE_MAX = '9';
    byte ASCII_NUMBER_RANGE_MIN = '0';
    byte ASCII_WHIT_SPACE = ' ';
    byte ASCII_SIGN_ONE_RANGE_MAX = 47;
    byte ASCII_SIGN_ONE_RANGE_MIN = 33;
    byte ASCII_SIGN_TWO_RANGE_MAX = 64;
    byte ASCII_SIGN_TWO_RANGE_MIN = 58;
    byte ASCII_SIGN_THREE_RANGE_MAX = 96;
    byte ASCII_SIGN_THREE_RANGE_MIN = 91;
    byte ASCII_SIGN_FOUR_RANGE_MAX = 126;
    byte ASCII_SIGN_FOUR_RANGE_MIN = 123;



    /**
     * 返回一个 ascii 范围内的 char
     *
     * @return char
     */
    char charAll();
    /**
     * 返回一个随机字母
     * 包括大小写
     *
     * @return char
     */
    char letter();

    /**
     * 返回一个随机字母
     * 字母大写
     *
     * @return char
     */
    char uppercaseLetter();

    /**
     * 返回一个随机字母
     * 小写字母
     *
     * @return char
     */
    char lowercaseLetter();

    /**
     * 返回数字类型的随机字符串
     * 0 - 9
     *
     * @return char
     */
    char number();

    /**
     * 返回符号类型的随机字符
     *
     * @return char
     */
    char sign();

    /**
     * 获取随机中文字符
     *
     * @return char
     */
    char chinese();

    /**
     * 判断该字符是否为符号
     * 因为判断的点实在是太多了
     *
     * @param ch 需要判断的副总裁
     * @return boolean
     */
    boolean isSign(char ch);
}
