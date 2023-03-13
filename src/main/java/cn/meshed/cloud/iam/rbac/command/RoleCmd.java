package cn.meshed.cloud.iam.rbac.command;

import cn.meshed.cloud.constant.Status;
import com.alibaba.cola.dto.Command;
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
public class RoleCmd extends Command {

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
     * 备注
     */
    private String description;

    /**
     * 状态
     */
    private Status status;


}
