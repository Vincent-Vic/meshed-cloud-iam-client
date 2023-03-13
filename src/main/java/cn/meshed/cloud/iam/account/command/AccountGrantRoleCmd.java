package cn.meshed.cloud.iam.account.command;

import com.alibaba.cola.dto.Command;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Set;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class AccountGrantRoleCmd extends Command {

    @NotEmpty(message = "账号ID不能为空")
    private Long accountId;

    private Set<Long> roleIds;

}
