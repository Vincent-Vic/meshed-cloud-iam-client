package cn.meshed.cloud.iam.rbac.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.util.Set;

/**
 * <h1>角色授权权限</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "角色授权权限")
public class RoleGrantPermissionCmd extends Command {

    /**
     * 角色编码
     */
    @NotBlank(message = "角色编码不能为空")
    @Schema(description = "角色编码")
    private Long roleId;
    /**
     * 权限编码列表
     */
    @Schema(description = "权限编码列表")
    private Set<Long> permissionIds;

}
