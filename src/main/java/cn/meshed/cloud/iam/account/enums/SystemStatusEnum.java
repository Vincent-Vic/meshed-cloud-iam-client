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
public enum SystemStatusEnum {

    /**
     * 运行中
     */
    RUN(1, "RUN"),

    /**
     * 下线
     */
    OFFLINE(2, "OFFLINE"),

    /**
     * 废弃
     */
    DISCARD(3, "DISCARD"),

    /**
     * 立项
     */
    INITIATION(4, "INITIATION"),

    /**
     * 研发
     */
    RD(5, "RD"),


    ;

    @EnumValue
    private final int value;
    private final String ext;
}
