package cn.meshed.cloud.iam.account.command;

import com.alibaba.cola.dto.Command;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class DoLoginHandleCmd extends Command {

    private String loginName;
    private String password;

}
