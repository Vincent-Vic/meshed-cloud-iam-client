package cn.meshed.cloud.iam.rbac.data;

import cn.meshed.cloud.constant.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

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
     * 权限英文名称
     */
    @Schema(description = "英文名称")
    private String enname;

    /**
     * 授权路径
     */
    @Schema(description = "授权路径")
    private String uri;

    /**
     * 权限标识
     */
    @Schema(description = "权限标识")
    private String access;

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
