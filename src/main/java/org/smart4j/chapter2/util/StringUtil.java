package org.smart4j.chapter2.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by japing on 16-10-22.
 */
public class StringUtil {
    public static boolean isEmpty(String str){
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static  boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
