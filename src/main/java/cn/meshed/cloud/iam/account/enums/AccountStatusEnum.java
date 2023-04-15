package cn.meshed.cloud.iam.account.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
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
public enum AccountStatusEnum {

    /**
     * 正常
     */
    VALID(1, "valid"),

    /**
     * 下线
     */
    INVALID(2, "invalid"),

    /**
     * 废弃
     */
    LOCK(3, "lock"),
    ;

    @EnumValue
    private final int value;
    private final String ext;
}
