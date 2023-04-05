package cn.meshed.cloud.iam.account.data;

import cn.meshed.cloud.iam.account.enums.AccountStatusEnum;
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
    @Schema(description = "ID")
    private Long id;

    /**
     * 账号名称
     */
    @Schema(description = "账号名称")
    private String realName;
    /**
     * 账号登入主名称
     */
    @Schema(description = "账号登入主名称")
    private String loginId;

    /**
     * 账号手机号
     */
    @Schema(description = "账号手机号")
    private String phone;

    /**
     * 账号邮箱
     */
    @Schema(description = "账号邮箱")
    private String email;

    /**
     * 账号手机号是否有效
     */
    @Schema(description = "账号手机号是否有效")
    private Boolean validPhone;

    /**
     * 账号有效是否有效
     */
    @Schema(description = "账号有效是否有效")
    private Boolean validEmail;

    /**
     * 是否过期
     */
    @Schema(description = "")
    private Boolean expired;

    /**
     * 状态
     */
    @Schema(description = "状态")
    private AccountStatusEnum status;

}
