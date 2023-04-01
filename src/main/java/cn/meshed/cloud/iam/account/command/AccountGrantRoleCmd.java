package cn.meshed.cloud.iam.account.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;
import java.util.Set;

/**
 * <h1> 账号授权</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "账号授权")
public class AccountGrantRoleCmd extends Command {

    /**
     *账号ID
     */
    @Schema(description = "账号ID")
    @NotEmpty(message = "账号ID不能为空")
    private Long accountId;
    /**
     *角色列表
     */
    @Schema(description = "角色列表")
    private Set<Long> roleIds;

}
