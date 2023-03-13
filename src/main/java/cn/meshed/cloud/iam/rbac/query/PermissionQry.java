package cn.meshed.cloud.iam.rbac.query;

import cn.meshed.cloud.constant.Status;
import com.alibaba.cola.dto.PageQuery;
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
public class PermissionQry extends PageQuery {

    private static final long serialVersionUID = 1L;

    /**
     * 父权限
     */
    private Long parentId;

    /**
     * 父权限
     */
    private String keyword;

    /**
     * 状态
     */
    private Status status;

    /**
     * 模式限定
     */
    private List<Long> accessMode;

}
