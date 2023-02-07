package cn.meshed.cloud.iam.dto.account;

import com.alibaba.cola.dto.Command;
import lombok.Data;

import java.util.Set;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class LoginSuccessCmd extends Command {
    private Long id;
    private String loginId;
    private String phone;
    private String email;
    private Boolean validPhone;
    private Boolean validEmail;
    private Boolean expired;
    private Boolean locked;
    private Set<String> grantedAuthority;

}
