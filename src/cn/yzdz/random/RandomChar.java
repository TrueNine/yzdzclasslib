package cn.yzdz.random;

/**
 * 工具类,用以产生随机字符
 * 随机字符范围包括:
 * 数字,英文字母,符号(ASCII码以内)
 * 已经包括中文字符
 *
 * @author 彭继工
 * @date 2020-03-08:19:14
 */
public class RandomChar implements cn.yzdz.random.Interfaces.RandomChar {

    /**
     * 返回一个 ascii 范围内的 char
     *
     * @return char
     */
    @Override
    public char charAll() {
        return (char) RandomNumber.randomInt(ASCII_RANGE_MIN, ASCII_RANGE_MAX,false);
    }

    /**
     * 返回一个随机字母
     * 包括大小写
     * 使用了 Cahracter 的方法
     *
     * @return char
     */
    @Override
    public char letter() {
        // 防空操作
        char result = ' ';
        // 一直循环判断,是否是字母
        while (true) {
            result = this.charAll();
            if ( ! Character.isLetter(result)) {
                continue;
            }
            return result;
        }
    }

    /**
     * 返回一个随机字母
     * 字母大写
     *
     * @return char
     */
    @Override
    public char uppercaseLetter() {
        // 防空操作
        char result = ' ';
        while (true) {
            // 一直循环判断是否是大写字母
            result = this.letter();
            if ( ! Character.isUpperCase(result)) {
                continue;
            }
            return result;
        }
    }

    /**
     * 返回一个随机字母
     * 小写字母
     *
     * @return char
     */
    @Override
    public char lowercaseLetter() {
        // 防空操作
        char result = ' ';
        while (true) {
            // 一直循环判断是否是小写字母
            result = this.letter();
            if ( ! Character.isLowerCase(result)) {
                continue;
            }
            return result;
        }
    }

    /**
     * 返回数字类型的随机字符串
     * 0 - 9
     *
     * @return char
     */
    @Override
    public char number() {
        // 防空操作
        char result = ' ';
        while (true) {
            // 一直循环判断是否是数字类型的 char
            result = this.charAll();
            if ( ! Character.isDigit(result)) {
                continue;
            }
            return result;
        }
    }

    /**
     * 返回符号类型的随机字符
     *
     * @return char
     */
    @Override
    public char sign() {
        // 防空操作,因为没有中文,故意给个中文
        char result = '杀';
        // 符号比较多,定义一些布尔变量,方便写判断式

        while (true) {
            result = charAll();
            if ( ! this.isSign(result)) {
                continue;
            }
            return result;
        }
    }

    /**
     * 获取随机中文字符
     *
     * @return char
     */
    @Override
    public char chinese() {
        return (char) RandomNumber.randomInt(UNICODE_CHINESE_MIN,UNICODE_CHINESE_MAX,false);
    }

    /**
     * 判断该字符是否为符号
     * 因为判断的点实在是太多了
     *
     * @param ch 需要判断的副总裁
     * @return boolean
     */
    @Override
    public boolean isSign(char ch) {
        boolean result = false;
        // 没什么好说的,else if 就是了
        if (ch >= ASCII_SIGN_ONE_RANGE_MIN && ch <= ASCII_SIGN_ONE_RANGE_MAX) {
            result = true;
        } else if (ch >= ASCII_SIGN_TWO_RANGE_MIN && ch <= ASCII_SIGN_TWO_RANGE_MAX) {
            result = true;
        } else if (ch >= ASCII_SIGN_THREE_RANGE_MIN && ch <= ASCII_SIGN_THREE_RANGE_MAX) {
            result = true;
        } else if (ch >= ASCII_SIGN_FOUR_RANGE_MIN && ch <= ASCII_SIGN_FOUR_RANGE_MAX) {
            result = true;
        } else if (ch == ASCII_WHIT_SPACE) {
            return true;
        }
        return result;
    }
}