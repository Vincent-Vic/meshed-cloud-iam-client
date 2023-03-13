package cn.meshed.cloud.iam.rbac.query;

import com.alibaba.cola.dto.Query;
import lombok.Data;

import java.util.Set;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class PermissionSetQry extends Query {

    private Set<Long> roleIds;


}
