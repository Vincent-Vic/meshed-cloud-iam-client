package cn.meshed.cloud.iam.account.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * <h1>密码构建</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@Schema(description = "密码构建")
public class PasswordBuildCmd extends Command {
    /**
     * 明文
     */
    @Schema(description = "明文")
    @NotBlank(message = "明文不能为空")
    private String unencrypted;


}
