package com.cs.common.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Random;

/**
 * 验证码生成.
 *
 * @author 李思良
 *
 */
public final class CaptchaUtils {

    /**
     * 验证码字体尺寸.
     */
    private static final int FONT_SIZE = 18;
    /**
     * 色彩基值.
     */
    private static final int COLOR_BASE = 110;
    /**
     * 色彩随机基值.
     */
    private static final int COLOR_RANDOM_BASE = 7;
    /**
     * 色彩随机偏移量.
     */
    private static final int COLOR_RANDOM_OFFSET = 2;
    /**
     * 字体色彩基值.
     */
    private static final int FONT_COLOR_BASE = 111;
    /**
     * 字体色彩偏移.
     */
    private static final int FONT_COLOR_OFFSET = 10;
    /**
     * 最大字体translate偏移.
     */
    private static final int FONT_TRANSLATE_OFFSET_MAX = 3;
    /**
     * 文字书写位置X坐标放大倍数.
     */
    private static final int FONT_DRAW_X_MULTIPLE = 13;
    /**
     * 文字书写位置Y坐标.
     */
    private static final int FONT_DRAW_Y = 16;
    /**
     * 放到session中的key.
     */
    public static final String RANDOMCODEKEY = "captcha";
    /**
     * 随机产生的字符串.
     */
    private static Random random = new Random();
    /**
     * 用于得到随机字符的字符串.
     */
    private static String randString = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    /**
     * 图片宽.
     */
    private static final int WIDTH = 80;
    /**
     * 图片高.
     */
    private static final int HEIGHT = 26;
    /**
     * 干扰线数量.
     */
    private static final int LINESIZE = 40;
    /**
     * 随机产生字符数量.
     */
    private static final int STRINGNUM = 4;

    /**
     * 干扰线左侧尺寸.
     */
    private static final int LINETOP = 13;
    /**
     * 干扰线左侧尺寸.
     */
    private static final int LINELEFT = 15;
    /**
     * 禁用public构造函数.
     */
    private CaptchaUtils() {

    }

    /**
     * 生成随机图片.
     *
     * @return 图片信息和字符串 image : 图片 captcha : 验证码
     */
    public static HashMap<String, Object> getRandcode() {
        // BufferedImage类是具有缓冲区的Image类,Image类是用于描述图像信息的类
        BufferedImage image = new BufferedImage(WIDTH, HEIGHT,
                BufferedImage.TYPE_INT_BGR);
        // 产生Image对象的Graphics对象,改对象可以在图像上进行各种绘制操作
        Graphics g = image.getGraphics();
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, FONT_SIZE));
        g.setColor(new Color(COLOR_BASE + random.nextInt(COLOR_RANDOM_BASE),
                COLOR_BASE
                + random.nextInt(COLOR_RANDOM_BASE + COLOR_RANDOM_OFFSET),
                COLOR_BASE
                + random.nextInt(COLOR_RANDOM_BASE - COLOR_RANDOM_OFFSET)));
        // 绘制干扰线
        for (int i = 0; i <= LINESIZE; i++) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int xl = random.nextInt(LINETOP);
            int yl = random.nextInt(LINELEFT);
            g.drawLine(x, y, x + xl, y + yl);
        }
        // 绘制随机字符
        String randomString = "";
        for (int i = 1; i <= STRINGNUM; i++) {
            g.setFont(new Font("Fixedsys", Font.CENTER_BASELINE, FONT_SIZE));
            g.setColor(new Color(
                    random.nextInt(FONT_COLOR_BASE - FONT_COLOR_OFFSET),
                    random.nextInt(FONT_COLOR_BASE),
                    random.nextInt(FONT_COLOR_BASE + FONT_COLOR_OFFSET)));
            String rand = String.valueOf(String.valueOf(randString
                    .charAt(random.nextInt(randString.length()))));
            randomString += rand;
            g.translate(random.nextInt(FONT_TRANSLATE_OFFSET_MAX),
                    random.nextInt(FONT_TRANSLATE_OFFSET_MAX));
            g.drawString(rand, FONT_DRAW_X_MULTIPLE * i, FONT_DRAW_Y);
        }
        g.dispose();
        HashMap<String, Object> result = new HashMap<String, Object>();
        result.put("image", image);
        result.put("captcha", randomString);
        return result;
    }

    /**
     * 检测验证码是否匹配.
     *
     * @param captcha
     *            验证码
     * @param inCaptcha
     *            输入验证码
     * @return 是否匹配
     */
    public static boolean captchCheck(final String captcha,
            final String inCaptcha) {
        if (inCaptcha == null) {
            return false;
        }
        return inCaptcha.equals(captcha);
    }
}
