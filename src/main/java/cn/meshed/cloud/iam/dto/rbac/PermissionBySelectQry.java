package cn.meshed.cloud.iam.dto.rbac;

import com.alibaba.cola.dto.Query;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * <p>
 * 权限表
 * </p>
 *
 * @author by Vincent Vic
 * @since 2022-10-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PermissionBySelectQry extends Query {

    private static final long serialVersionUID = 1L;

    /**
     * 父权限
     */
    private List<Long> accessMode;


}
