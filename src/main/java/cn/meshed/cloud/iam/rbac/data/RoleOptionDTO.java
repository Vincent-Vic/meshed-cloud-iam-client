package cn.meshed.cloud.iam.rbac.data;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author by Vincent Vic
 * @since 2022-10-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "")
public class RoleOptionDTO implements Serializable {

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
     * 角色标识
     */
    @Schema(description = "角色标识")
    private String key;

    /**
     * 权限列表
     */
    @Schema(description = "权限列表")
    private List<Long> access;

}
