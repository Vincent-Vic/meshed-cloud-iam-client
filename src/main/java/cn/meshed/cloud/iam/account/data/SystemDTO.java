package cn.meshed.cloud.iam.account.data;

import cn.meshed.cloud.iam.account.enums.SystemStatusEnum;
import cn.meshed.cloud.iam.account.enums.SystemTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>系统</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "系统传输模型")
public class SystemDTO {

    private static final long serialVersionUID = 1L;

    /**
     * 系统ID
     */
    @Schema(description = "系统ID")
    private Integer id;

    /**
     * 系统名称
     */
    @Schema(description = "系统名称")
    private String name;

    /**
     * 系统标识
     */
    @Schema(description = "系统标识")
    private String key;

    /**
     * 描述
     */
    @Schema(description = "描述")
    private String description;

    /**
     * 状态
     */
    @Schema(description = "状态")
    private SystemStatusEnum status;

    /**
     * 类型
     */
    @Schema(description = "类型")
    private SystemTypeEnum type;

    /**
     * 允许URL
     */
    @Schema(description = "允许URL")
    private String allowUrl;

    /**
     * 作用域
     */
    @Schema(description = "作用域")
    private String scope;

}
