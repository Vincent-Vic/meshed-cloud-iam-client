package cn.meshed.cloud.iam.account.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * <h1>账号锁定</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "账号锁定")
public class AccountLockCmd extends Command {

    /**
     * 登入ID
     */
    @Schema(description = "登入ID")
    @NotBlank(message = "登入ID不能为空")
    private Long id;

    /**
     * 操作
     */
    @Schema(description = "操作")
    private boolean operate;

}
