package cn.meshed.cloud.iam.account.command;

import cn.meshed.cloud.constant.Status;
import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 *  账号操作
 * </p>
 *
 * @author by Vincent Vic
 * @since 2022-10-04
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "账号操作")
public class AccountAddCmd extends Command {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @Schema(description = "ID")
    private Long id;


    /**
     * 账号登入主名称
     */
    @NotBlank(message = "账号登入主名称不能为空")
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
     * 账号加密后的密码
     */
    @NotBlank(message = "密码不能为空")
    @Schema(description = "账号加密后的密码")
    private String secretKey;

    /**
     * 状态
     */
    @Schema(description = "状态")
    private Status status;


}
