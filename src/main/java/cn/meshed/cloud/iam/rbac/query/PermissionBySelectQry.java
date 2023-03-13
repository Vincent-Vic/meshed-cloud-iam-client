package cn.meshed.cloud.iam.rbac.query;

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
     * 模式限定
     */
    private List<Long> accessMode;


}
