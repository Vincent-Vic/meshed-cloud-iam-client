package cn.meshed.cloud.iam.account.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Set;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@Schema(description = "")
public class LoginSuccessCmd extends Command {
    /**
     * 编码
     */
    @Schema(description = "编码")
    private Long id;
    /**
     * 登入账户名
     */
    @Schema(description = "登入账户名")
    @NotBlank(message = "登入账户名不能为空")
    private String loginId;
    /**
     * 账号名称
     */
    @Schema(description = "账号名称")
    private String realName;
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
     * 过期
     */
    @Schema(description = "过期")
    private Boolean expired;
    /**
     * 锁定
     */
    @Schema(description = "锁定")
    private Boolean locked;
    /**
     * 授权权限
     */
    @Schema(description = "授权权限")
    private Set<String> grantedAuthority;
    /**
     * 授权角色
     */
    @Schema(description = "授权角色")
    private Set<String> grantedRole;

}
