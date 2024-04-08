package com.example.ojbackendcommon.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author: 凌煜昂
 * @Date: 2023/11/7 22:46
 * @Description:
 */
public class SqlUtils {

    /**
     * 校验排序字段是否合法（防止 SQL 注入）
     *
     * @param sortField
     * @return
     */
    public static boolean validSortField(String sortField) {
        if (StringUtils.isBlank(sortField)) {
            return false;
        }
        return !StringUtils.containsAny(sortField, "=", "(", ")", " ");
    }
}
