package cn.meshed.cloud.iam.rbac.data;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

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
public class RoleOptionDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 父角色
     */
    private Long parentId;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色英文名称
     */
    private String enname;

    /**
     * 权限
     */
    private List<Long> access;


}
