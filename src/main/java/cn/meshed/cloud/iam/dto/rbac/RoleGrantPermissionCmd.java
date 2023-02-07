package cn.meshed.cloud.iam.dto.rbac;

import com.alibaba.cola.dto.Command;
import lombok.Data;

import java.util.Set;

/**
 * <h1>角色授权权限</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class RoleGrantPermissionCmd extends Command {

    private Long roleId;
    private Set<Long> permissionIds;

}
