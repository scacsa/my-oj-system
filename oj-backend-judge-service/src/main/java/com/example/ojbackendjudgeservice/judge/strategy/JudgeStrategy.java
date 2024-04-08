package com.example.ojbackendjudgeservice.judge.strategy;


import com.example.ojbackendmodel.model.codesandbox.JudgeInfo;

/**
 * @Author: 凌煜昂
 * @Date: 2023/11/15 21:52
 * @Description:
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
