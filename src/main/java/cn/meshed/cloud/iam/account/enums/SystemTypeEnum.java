package cn.meshed.cloud.iam.account.enums;

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
public enum SystemTypeEnum {

    /**
     * 服务
     */
    SERVICE(1, "SERVICE"),

    /**
     * 授权
     */
    EMPOWER(2, "EMPOWER"),

    ;

    private final int value;
    private final String key;
}
