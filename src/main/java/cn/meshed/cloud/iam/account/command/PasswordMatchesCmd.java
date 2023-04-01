package cn.meshed.cloud.iam.account.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * <h1>密码匹配</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@Schema(description = "密码匹配")
public class PasswordMatchesCmd extends Command {

    /**
     * 明文
     */
    @Schema(description = "明文")
    @NotBlank(message = "明文不能为空")
    private String unencrypted;
    /**
     *密文
     */
    @Schema(description = "密文")
    @NotBlank(message = "密文不能为空")
    private String encrypted;

}
