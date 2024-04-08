package com.example.ojbackendcommon.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 凌煜昂
 * @Date: 2023/11/7 22:01
 * @Description:
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}