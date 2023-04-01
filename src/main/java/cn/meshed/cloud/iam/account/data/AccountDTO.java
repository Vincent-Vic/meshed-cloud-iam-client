package cn.meshed.cloud.iam.account.data;

import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * <h1>账号传输模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "账号传输模型")
public class AccountDTO extends DTO {

    /**
     * ID
     */
    @Schema(description = "")
    private Long id;

    /**
     * 账号登入主名称
     */
    @Schema(description = "")
    private String loginId;

    /**
     * 账号手机号
     */
    @Schema(description = "")
    private String phone;

    /**
     * 账号邮箱
     */
    @Schema(description = "")
    private String email;

    /**
     * 账号手机号是否有效
     */
    @Schema(description = "")
    private Boolean validPhone;

    /**
     * 账号有效是否有效
     */
    @Schema(description = "")
    private Boolean validEmail;

    /**
     * 是否过期
     */
    @Schema(description = "")
    private Boolean expired;

    /**
     * 是否锁定
     */
    @Schema(description = "")
    private Boolean locked;

    /**
     * 权限集合
     */
    @Schema(description = "")
    private Set<String> grantedAuthority;

}
