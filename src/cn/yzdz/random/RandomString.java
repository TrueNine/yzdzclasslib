package cn.yzdz.random;

/**
 * 随机获取字符串 ASCII 范围内
 * 实现了 RandomString 接口
 * 不包括中文字符
 *
 * 内部维护一个字符数组
 *
 * @author 彭继工
 * @date 2020-03-08:19:46
 */
public class RandomString implements cn.yzdz.random.Interfaces.RandomString {
    /**
     * 内部维护的数组,用以制造字符串
     */
    private char[] elementCharArray;
    private RandomChar randomChar = new RandomChar();
    private int arrayPointer;

    /**
     * 通过指针位置和字符
     * 放入字符数组内部
     * 传入的指针需要很好地处理
     * 不能索引越界
     *
     * @param ch 字符
     * @param index 指针位置
     */
    private void addChar(char ch,int index) {
        if (index < 0 || index > elementCharArray.length - 1) {
            throw new RuntimeException("正在尝试越界");
        }
        this.elementCharArray[index] = ch;
    }

    /**
     * 随机获取所有字符 ASCII 范围内
     * 根据 length 的长度
     *
     * @param length 字符串长度
     * @return String
     */
    @Override
    public String charAll(int length) {
        // 初始化数组和指针位置
        elementCharArray = new char[length];
        arrayPointer = 0;

        for (int i = 0; i < length; i++) {
            this.addChar(this.randomChar.charAll(),i);
        }
        return new String(this.elementCharArray);
    }

    /**
     * 随机获取所有的字母,不包括数字,符号
     * 长度根据 length 决定
     *
     * @param length 字符串长度
     * @return String
     */
    @Override
    public String letter(int length) {
        // 初始化数组和指针位置
        elementCharArray = new char[length];
        arrayPointer = 0;

        for (int i = 0; i < length; i++) {
            this.addChar(this.randomChar.letter(),i);
        }
        return new String(this.elementCharArray);
    }

    /**
     * 随机获取大写字母
     *
     * @param length 长度
     * @return String
     */
    @Override
    public String uppercaseLetter(int length) {
        // 初始化数组和指针位置
        elementCharArray = new char[length];
        arrayPointer = 0;

        for (int i = 0; i < length; i++) {
            this.addChar(this.randomChar.uppercaseLetter(),i);
        }
        return new String(this.elementCharArray);
    }

    /**
     * 随机获取小写字母
     *
     * @param length 长度
     * @return String
     */
    @Override
    public String lowercaseLetter(int length) {
        // 初始化数组和指针位置
        elementCharArray = new char[length];
        arrayPointer = 0;

        for (int i = 0; i < length; i++) {
            this.addChar(this.randomChar.lowercaseLetter(),i);
        }
        return new String(this.elementCharArray);
    }

    /**
     * 随机获取所有的数字
     *
     * @param length 长度
     * @return String
     */
    @Override
    public String number(int length) {
        // 初始化数组和指针位置
        elementCharArray = new char[length];
        arrayPointer = 0;

        for (int i = 0; i < length; i++) {
            this.addChar(this.randomChar.number(),i);
        }
        return new String(this.elementCharArray);
    }

    /**
     * 随机获取符号
     *
     * @param length 长度
     * @return String
     */
    @Override
    public String sign(int length) {
        // 初始化数组和指针位置
        elementCharArray = new char[length];
        arrayPointer = 0;

        for (int i = 0; i < length; i++) {
            this.addChar(this.randomChar.sign(),i);
        }
        return new String(this.elementCharArray);
    }

    /**
     * 获取中文字符串
     *
     * @param length 长度
     * @return String
     */
    @Override
    public String chinese(int length) {
        elementCharArray = new char[length];
        arrayPointer = 0;

        for (int i = 0; i < elementCharArray.length; i++) {
            this.elementCharArray[i] = this.randomChar.chinese();
        }

        return new String(this.elementCharArray);
    }

    /**
     * 随机获取数字和大小写字母的混合字符串
     *
     * @param length 长度
     * @return String
     */
    @Override
    public String numberAndLetter(int length) {
        // 初始化数组和指针位置
        elementCharArray = new char[length];
        this.arrayPointer = 0;

        for (int i = 0; i < length; i++) {
            switch (RandomNumber.randomInt(2,false)) {
                case 1:
                    this.addChar(this.randomChar.number(),i);
                    break;
                case 2:
                    this.addChar(this.randomChar.letter(),i);
                    break;
                default:
                    throw new RuntimeException("随机取值异常");
            }
        }
        return new String(this.elementCharArray);
    }

    /**
     * 随机获取数字和大写字母的混合字符串
     *
     * @param length 长度
     * @return String
     */
    @Override
    public String numberAndUppercaseLetter(int length) {
        // 初始化数组和指针位置
        elementCharArray = new char[length];
        this.arrayPointer = 0;

        for (int i = 0; i < length; i++) {
            switch (RandomNumber.randomInt(2,false)) {
                case 1:
                    this.addChar(this.randomChar.number(),i);
                    break;
                case 2:
                    this.addChar(this.randomChar.uppercaseLetter(),i);
                    break;
                default:
                    throw new RuntimeException("随机取值异常");
            }
        }
        return new String(this.elementCharArray);
    }

    /**
     * 随机获取数字和小写字母的混合字符串
     *
     * @param length 长度
     * @return String
     */
    @Override
    public String numberAndLowercaseLetter(int length) {
        // 初始化数组和指针位置
        elementCharArray = new char[length];
        this.arrayPointer = 0;

        for (int i = 0; i < length; i++) {
            switch (RandomNumber.randomInt(2,false)) {
                case 1:
                    this.addChar(this.randomChar.number(),i);
                    break;
                case 2:
                    this.addChar(this.randomChar.lowercaseLetter(),i);
                    break;
                default:
                    throw new RuntimeException("随机取值异常");
            }
        }
        return new String(this.elementCharArray);
    }

    /**
     * 混合大杂烩
     * 大小写字母,数字,符号
     * 但还是在ASCII范围内
     *
     * @param length 长度
     * @return boolean
     */
    @Override
    public String numberAndLetterAndSign(int length) {
        // 初始化数组和指针位置
        elementCharArray = new char[length];
        this.arrayPointer = 0;

        for (int i = 0; i < length; i++) {
            switch (RandomNumber.randomInt(3,false)) {
                case 1:
                    this.addChar(this.randomChar.number(),i);
                    break;
                case 2:
                    this.addChar(this.randomChar.lowercaseLetter(),i);
                    break;
                case 3:
                    this.addChar(this.randomChar.sign(),i);
                    break;
                default:
                    throw new RuntimeException("随机取值异常");
            }
        }
        return new String(this.elementCharArray);
    }

    /**
     * 终极混合大杂烩
     * 获取,英文(大小写),中文,数字,英文符号
     *
     * @param length 长度
     * @return String
     */
    @Override
    public String numberAndLetterAndSignAndChinese(int length) {
        elementCharArray = new char[length];
        this.arrayPointer = 0;

        for (int i = 0; i < length; i++) {
            switch (RandomNumber.randomInt(4,false)) {
                case 1:
                    this.addChar(this.randomChar.number(),i);
                    break;
                case 2:
                    this.addChar(this.randomChar.lowercaseLetter(),i);
                    break;
                case 3:
                    this.addChar(this.randomChar.sign(),i);
                    break;
                case 4:
                    this.elementCharArray[i] = this.randomChar.chinese();
                    break;
                default:
                    throw new RuntimeException("随机取值异常");
            }
        }
        return new String(this.elementCharArray);
    }
}