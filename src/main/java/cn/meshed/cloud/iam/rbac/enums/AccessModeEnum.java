package cn.meshed.cloud.iam.rbac.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <h1>任务查询类型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public enum AccessModeEnum {

    /**
     * 匿名
     */
    ANONYMOUS(1, "ANONYMOUS"),

    /**
     * 登入
     */
    LOGIN(2, "LOGIN"),

    /**
     * 授权
     */
    EMPOWER(3, "EMPOWER"),

    ;

    private final int value;
    private final String key;
}
