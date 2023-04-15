package cn.meshed.cloud.iam.rbac.query;

import cn.meshed.cloud.constant.Status;
import cn.meshed.cloud.iam.rbac.enums.AccessModeEnum;
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
     * 归属系统编码
     */
    @Schema(description = "归属系统编码")
    private Long systemId;

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
     * 授权模式列表
     */
    @Schema(description = "授权模式")
    private List<AccessModeEnum> accessModes;

}
