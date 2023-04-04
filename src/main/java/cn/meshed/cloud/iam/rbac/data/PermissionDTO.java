package cn.meshed.cloud.iam.rbac.data;

import cn.meshed.cloud.constant.Status;
import cn.meshed.cloud.iam.rbac.enums.AccessModeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 权限传输模型
 * </p>
 *
 * @author by Vincent Vic
 * @since 2022-10-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "权限传输模型")
public class PermissionDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编码
     */
    @Schema(description = "编码")
    private Long id;

    /**
     * 父权限
     */
    @Schema(description = "父权限")
    private Long parentId;

    /**
     * 权限名称
     */
    @Schema(description = "名称")
    private String name;

    /**
     * 权限所属系统
     */
    @Schema(description = "权限所属系统")
    private Integer ownerId;

    /**
     * 授权路径
     */
    @Schema(description = "授权路径")
    private String uri;

    /**
     * 权限授权标识
     */
    @Schema(description = "权限授权标识")
    private String access;

    /**
     * 授权模式
     */
    @Schema(description = "授权模式")
    private AccessModeEnum accessMode;

    /**
     * 状态
     */
    @Schema(description = "状态")
    private Status status;

    /**
     * 备注
     */
    @Schema(description = "备注")
    private String description;


}
