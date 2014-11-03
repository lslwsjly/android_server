package com.cs.common.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * 字符串处理工具.
 *
 * @author tinna.xie
 *
 */
public final class StringUtils {

    /**
     * Get方法前缀.
     */
    public static final String GET_METHOD_PREFIX = "get";
    /**
     * Is方法前缀.
     */
    public static final String IS_METHOD_PREFIX = "is";
    /**
     * 空字符串.
     */
    public static final String EMPTY_STRING = "";
    /**
     * 配置路径.
     */
    public static final String PATH = "file:D:"
            + "/javaProjects/working_dwx/src/main/resources";
    /**
     * 配置路径.
     */
    public static final String YPATH = "";
    /**
     * 禁用public构造方法.
     */
    private StringUtils() {

    }

    /**
     * 将字符串的首字母转化为大写字母.
     *
     * @param str
     *            被转化字符串
     * @return 作为转化结果的字符串
     */
    public static String toUpperCase4FirstChar(final String str) {
        return (new StringBuilder())
                .append(Character.toUpperCase(str.charAt(0)))
                .append(str.substring(1)).toString();
    }

    /**
     * 将字符串的首字母转化为小写字母.
     *
     * @param str
     *            被转化字符串
     * @return 转化所的字符串
     */
    public static String toLowerCase4FirstChar(final String str) {
        return (new StringBuilder())
                .append(Character.toLowerCase(str.charAt(0)))
                .append(str.substring(1)).toString();
    }

    /**
     * 构造getter方法名，即将传入的字符串参数的首字母转化为大写字母，然后加上“get”前缀.
     *
     * @param str
     *            被转化的字符串
     * @return 转化结果字符串
     */
    public static String constractGetterMethod(final String str) {
        return (new StringBuilder()).append(GET_METHOD_PREFIX)
                .append(Character.toUpperCase(str.charAt(0)))
                .append(str.substring(1)).toString();
    }

    /**
     * 判断是否为空.
     *
     * @param str
     *            被判断的字符串
     * @return 布尔值
     */
    public static boolean isEmpty(final String str) {
        boolean ret = true;
        if (str != null) {
            ret = "".equals(str.trim());
        }
        return ret;
    }

    /**
     * 判断是否非空.
     *
     * @param str
     *            被判断的字符串
     * @return 布尔值
     */
    public static boolean isNotEmpty(final String str) {
        return !isEmpty(str);
    }

    /**
     * 排序.
     *
     * @param params
     *            排序材料
     * @return String化的排序结果
     */
    public static String sortProp(final Map<String, String> params) {
        if (params == null || params.isEmpty()) {
            return null;
        }

        StringBuffer content = new StringBuffer();
        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = params.get(key);
            if (i == 0) {
                content.append(key + "=" + value);
            } else {
                content.append("&" + key + "=" + value);
            }
        }

        return content.toString();
    }

    /**
     * 防止null.
     *
     * 如果字符串是<code>null</code>或空字符串<code>""</code>，则返回空字符串 <code>""</code>
     * ，否则返回字符串本身。
     *
     * <p>
     * 此方法实际上和<code>defaultIfNull(String)</code>等效。
     *
     * <pre>
     * StringUtil.defaultIfEmpty(null)  = ""
     * StringUtil.defaultIfEmpty("")    = ""
     * StringUtil.defaultIfEmpty("  ")  = "  "
     * StringUtil.defaultIfEmpty("bat") = "bat"
     * </pre>
     *
     * </p>
     *
     * @param str
     *            要转换的字符串
     *
     * @return 字符串本身或空字符串<code>""</code>
     */
    public static String defaultIfEmpty(final String str) {
        if (str == null) {
            return EMPTY_STRING;
        }
        return str;
    }

    /**
     * 检查字符串中是否包含指定的字符。如果字符串为<code>null</code>，将返回<code>false</code>.
     *
     * <pre>
     * StringUtil.contains(null, *)    = false
     * StringUtil.contains("", *)      = false
     * StringUtil.contains("abc", 'a') = true
     * StringUtil.contains("abc", 'z') = false
     * </pre>
     *
     * @param str
     *            要扫描的字符串
     * @param searchChar
     *            要查找的字符
     *
     * @return 如果找到，则返回<code>true</code>
     */
    public static boolean contains(final String str, final char searchChar) {
        if ((str == null) || (str.length() == 0)) {
            return false;
        }

        return str.indexOf(searchChar) >= 0;
    }

    /**
     * 从字符串移除给定字符.
     *
     * @param s1
     *            要扫描的字符串
     * @param s2
     *            给定字符
     *
     * @return 移除后的字符串
     */
    public static String removeChar(final String s1, final String s2) {
        return s1.replace(s2, "");
    }

    /**
     * 将id转化为link.
     *
     * @param type
     *            类型名
     * @param id
     *            可能是任意类型的ID
     * @return link字符串
     */
    public static String id2Link(final String type, final int id) {
        return ("localhost/" + "type=" + type + "?id=" + Integer.valueOf(id)
                .toString());
    }

    /**
     * main.
     *
     * @param args
     *            main args
     */
    public static void main(final String[] args) {
        String str = "132132,231.00";
        System.out.println(removeChar(str, ","));
    }

}
