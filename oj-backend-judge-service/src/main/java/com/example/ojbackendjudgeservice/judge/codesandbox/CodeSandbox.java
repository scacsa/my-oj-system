package com.example.ojbackendjudgeservice.judge.codesandbox;

import com.example.ojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.example.ojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * @Author: 凌煜昂
 * @Date: 2023/11/9 19:12
 * @Description:
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
