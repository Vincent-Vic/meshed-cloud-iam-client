package cn.meshed.cloud.iam.rbac.command;

import cn.meshed.cloud.constant.Status;
import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 角色操作模型
 * </p>
 *
 * @author by Vincent Vic
 * @since 2022-10-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "角色操作模型")
public class RoleCmd extends Command {

    private static final long serialVersionUID = 1L;

    /**
     * 编码
     */
    @Schema(description = "编码")
    private Long id;

    /**
     * 父角色
     */
    @NotBlank(message = "父角色不能为空")
    @Schema(description = "父角色")
    private Long parentId;

    /**
     * 角色名称
     */
    @Schema(description = "名称")
    @NotBlank(message = "角色名称不能为空")
    private String name;

    /**
     * 角色授权码
     */
    @NotBlank(message = "角色授权码不能为空")
    @Schema(description = "角色授权码")
    private String access;

    /**
     * 角色所属系统
     */
    @NotBlank(message = "角色所属系统不能为空")
    @Schema(description = "角色所属系统")
    private Integer ownerId;


    /**
     * 备注
     */
    @Schema(description = "备注")
    private String description;

    /**
     * 状态
     */
    @Schema(description = "状态")
    private Status status;
}
