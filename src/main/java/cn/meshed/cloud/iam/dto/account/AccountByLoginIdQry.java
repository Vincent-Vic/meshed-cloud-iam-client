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
public class AccountByLoginIdQry extends Command {

    @NotBlank(message = "登入ID不能为空")
    private String loginId;
}
