package cn.meshed.cloud.iam.dto.account;

import com.alibaba.cola.dto.Command;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class AccountLockCmd extends Command {

    /**
     * ID
     */
    @NotBlank(message = "登入ID不能为空")
    private Long id;

    /**
     * 操作
     */
    private boolean operate;

}
