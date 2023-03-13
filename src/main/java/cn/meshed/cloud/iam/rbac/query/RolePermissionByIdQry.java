package cn.meshed.cloud.iam.rbac.query;

import com.alibaba.cola.dto.Query;
import lombok.Data;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class RolePermissionByIdQry extends Query {

    private Long id;
}
