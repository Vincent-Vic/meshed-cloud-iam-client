package cn.meshed.cloud.iam.dto.rbac;

import cn.meshed.base.constant.Status;
import com.alibaba.cola.dto.Command;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class PermissionCmd extends Command {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 父权限
     */
    private Long parentId;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限英文名称
     */
    private String enname;

    /**
     * 授权路径
     */
    private String uri;

    /**
     * 备注
     */
    private String description;

    /**
     * 权限英文名称
     */
    private String access;

    /**
     * 状态
     */
    private Status status;


}
