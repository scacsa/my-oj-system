package com.example.ojbackendcommon.common;

import lombok.Data;
import com.example.ojbackendcommon.constant.CommonConstant;

/**
 * @Author: 凌煜昂
 * @Date: 2023/11/7 22:10
 * @Description:
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private long current = 1;

    /**
     * 页面大小
     */
    private long pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认升序）
     */
    private String sortOrder = CommonConstant.SORT_ORDER_ASC;
}
