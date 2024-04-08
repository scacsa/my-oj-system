package com.example.ojbackendjudgeservice.judge.codesandbox;

import com.example.ojbackendjudgeservice.judge.codesandbox.impl.ExampleCodeSandbox;
import com.example.ojbackendjudgeservice.judge.codesandbox.impl.RemoteCodeSandbox;
import com.example.ojbackendjudgeservice.judge.codesandbox.impl.ThirdPartyCodeSandbox;

/**
 * @Author: 凌煜昂
 * @Date: 2023/11/9 19:23
 * @Description:
 */
public class CodeSandboxFactory {

    /**
     * 创建代码沙箱示例
     *
     * @param type 沙箱类型
     * @return
     */
    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}
