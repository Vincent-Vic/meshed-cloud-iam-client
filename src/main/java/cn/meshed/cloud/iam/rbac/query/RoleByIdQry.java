package cn.meshed.cloud.iam.rbac.query;

import com.alibaba.cola.dto.Query;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class RoleByIdQry extends Query {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    private Long id;

}
