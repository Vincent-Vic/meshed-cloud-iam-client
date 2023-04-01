package cn.meshed.cloud.iam.rbac.command;

import cn.meshed.cloud.constant.Status;
import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 权限操作模型
 * </p>
 *
 * @author by Vincent Vic
 * @since 2022-10-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "权限操作模型")
public class PermissionCmd extends Command {

    private static final long serialVersionUID = 1L;
    /**
     * 编码
     */
    @Schema(description = "编码")
    private Long id;

    /**
     * 父权限
     */
    @NotBlank(message = "父权限不能为空")
    @Schema(description = "父权限")
    private Long parentId;

    /**
     * 权限名称
     */
    @NotBlank(message = "权限名称不能为空")
    @Schema(description = "名称")
    private String name;

    /**
     * 权限英文名称
     */
    @NotBlank(message = "权限英文名称不能为空")
    @Schema(description = "英文名称")
    private String enname;

    /**
     * 授权路径
     */
    @Schema(description = "授权路径")
    private String uri;

    /**
     * 备注
     */
    @Schema(description = "备注")
    private String description;

    /**
     * 权限字符
     */
    @NotBlank(message = "权限字符不能为空")
    @Schema(description = "权限字符")
    private String access;

    /**
     * 状态
     */
    @Schema(description = "状态")
    private Status status;

}
