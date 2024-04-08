package com.example.ojbackendjudgeservice.judge;

import com.example.ojbackendmodel.model.entity.QuestionSubmit;

/**
 * @Author: 凌煜昂
 * @Date: 2023/11/11 19:39
 * @Description:
 */
public interface JudgeService {

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
