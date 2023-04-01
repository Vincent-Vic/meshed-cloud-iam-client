package cn.meshed.cloud.iam.rbac.query;

import cn.meshed.cloud.constant.Status;
import com.alibaba.cola.dto.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * <p>
 * 权限分页查询模型
 * </p>
 *
 * @author by Vincent Vic
 * @since 2022-10-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "权限分页查询模型")
public class PermissionQry extends PageQuery {

    private static final long serialVersionUID = 1L;

    /**
     * 父权限
     */
    @Schema(description = "父权限")
    private Long parentId;

    /**
     * 关键字
     */
    @Schema(description = "关键字")
    private String keyword;

    /**
     * 状态
     */
    @Schema(description = "状态")
    private Status status;

    /**
     * 模式限定
     */
    @Schema(description = "模式限定")
    private List<Long> accessMode;

}
