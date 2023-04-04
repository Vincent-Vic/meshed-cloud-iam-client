package cn.meshed.cloud.iam.rbac.data;

import cn.meshed.cloud.constant.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 角色传输模型
 * </p>
 *
 * @author by Vincent Vic
 * @since 2022-10-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "角色传输模型")
public class RoleDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编码
     */
    @Schema(description = "编码")
    private Long id;

    /**
     * 父角色
     */
    @Schema(description = "父角色")
    private Long parentId;

    /**
     * 角色名称
     */
    @Schema(description = "名称")
    private String name;

    /**
     * 角色授权标识
     */
    @Schema(description = "角色授权标识")
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
