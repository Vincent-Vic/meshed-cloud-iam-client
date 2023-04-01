package cn.meshed.cloud.iam.account.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * <h1>登入处理</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "登入处理")
public class DoLoginHandleCmd extends Command {

    /**
     * 登入名称
     */
    @Schema(description = "登入名称")
    @NotBlank(message = "登入名称不能为空")
    private String loginName;
    /**
     * 密码
     */
    @Schema(description = "密码")
    @NotBlank(message = "密码不能为空")
    private String password;

}
