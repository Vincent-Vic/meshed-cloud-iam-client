package cn.meshed.cloud.iam.dto.rbac;

import cn.meshed.base.constant.Status;
import com.alibaba.cola.dto.PageQuery;
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
public class RoleQry extends PageQuery {

    private static final long serialVersionUID = 1L;

    /**
     * 父权限
     */
    private Long parentId;

    /**
     * 关键字
     */
    private String keyword;

    /**
     * 状态
     */
    private Status status;

}
