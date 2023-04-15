package cn.meshed.cloud.iam.rbac.data;

import cn.meshed.cloud.constant.Status;
import cn.meshed.cloud.iam.rbac.enums.AccessModeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 身份验证模型
 * </p>
 *
 * @author by Vincent Vic
 * @since 2022-10-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "身份验证模型")
public class IdentityAuthenticationDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 授权路径
     */
    @Schema(description = "授权路径")
    private String uri;

    /**
     * 权限授权标识
     */
    @Schema(description = "权限授权标识")
    private String access;

    /**
     * 授权模式
     */
    @Schema(description = "授权模式")
    private AccessModeEnum accessMode;

}
