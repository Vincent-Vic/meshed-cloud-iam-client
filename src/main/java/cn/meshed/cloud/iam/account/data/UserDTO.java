package cn.meshed.cloud.iam.account.data;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

/**
 * <h1>当前用户信息模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "当前用户信息模型")
public class UserDTO extends Command {
    /**
     * 编码
     */
    @Schema(description = "编码")
    private Long id;
    /**
     * 账号名称
     */
    @Schema(description = "账号名称")
    private String name;
    /**
     * 登入账号
     */
    @Schema(description = "登入账号")
    private String loginId;
    /**
     * 手机号
     */
    @Schema(description = "手机号")
    private String phone;
    /**
     * 邮箱
     */
    @Schema(description = "邮箱")
    private String email;
    /**
     * 校验手机号
     */
    @Schema(description = "校验手机号")
    private Boolean validPhone;
    /**
     * 校验邮箱
     */
    @Schema(description = "校验邮箱")
    private Boolean validEmail;
    /**
     * 有效
     */
    @Schema(description = "有效")
    private Boolean expired;
    /**
     * 锁定
     */
    @Schema(description = "锁定")
    private Boolean locked;
    /**
     * 授权列表
     */
    @Schema(description = "授权列表")
    private Set<String> grantedAuthority;

}
