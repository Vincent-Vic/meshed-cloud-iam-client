package cn.meshed.cloud.iam.rbac.query;

import com.alibaba.cola.dto.Query;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

/**
 * <h1>权限集合查询模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "权限集合查询模型")
public class PermissionSetQry extends Query {

    /**
     * 角色列表
     */
    @Schema(description = "角色列表")
    private Set<Long> roleIds;


}
