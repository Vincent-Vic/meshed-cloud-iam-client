package cn.meshed.cloud.iam.dto.account;

import com.alibaba.cola.dto.Command;
import lombok.Data;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class PasswordMatchesCmd extends Command {

    private String unencrypted;
    private String encrypted;

}
