package com.cs.common.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

/**
 * 小工具.
 *
 * @author 李思良
 *
 */
public final class ToolUtils {

    /**
     * MD5_MAGIC_NUM1.
     */
    private static final int MD5_MAGIC_NUM1 = 256;
    /**
     * MD5_MAGIC_NUM2.
     */
    private static final int MD5_MAGIC_NUM2 = 16;
    /**
     * MD5_MAGIC_NUM3.
     */
    private static final int MD5_MAGIC_NUM3 = 8;
    /**
     * MD5_MAGIC_NUM4.
     */
    private static final int MD5_MAGIC_NUM4 = 24;


    /**
     * 检测字符串是否为整数.
     *
     * @param str
     *            带检测字符串
     * @return 是否为整数
     */
    public static boolean isNumeric(final String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    /**
     * 判断是否满足邮箱格式.
     *
     * @param mail
     *            邮箱字符串
     * @return 是否是邮箱
     */
    public static boolean isMail(final String mail) {
        if (mail == null) {
            return false;
        }
        String check = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+"
                + "(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";
        return Pattern.compile(check).matcher(mail).matches();
    }

    /**
     * 判断是否满足电话格式（包含+86，手机号，座机号）.
     *
     * @param phone
     *            电话号码
     * @return 是否合法
     */
    public static boolean isPhone(final String phone) {
        if (phone == null) {
            return false;
        }
        String check = "^((\\+86)|(86))?1(\\d{10})|^((\\d{7,8})|"
                + "(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{4}|\\d{3})-"
                + "(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})|"
                + "(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1}))$";
        return Pattern.compile(check).matcher(phone).matches();
    }

    /**
     * 字符串md5加密.
     *
     * @param pwd
     *            字符串
     * @return 加密后的字符串
     */
    public static String getMD5(final String pwd) {
        if (pwd == null || pwd == "") {
            return "";
        }
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(pwd.getBytes());
            byte[] md5 = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < md5.length; offset++) {
                i = md5[offset];
                if (i < 0) {
                    i += MD5_MAGIC_NUM1;
                }
                if (i < MD5_MAGIC_NUM2) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            return buf.toString().substring(MD5_MAGIC_NUM3, MD5_MAGIC_NUM4);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
