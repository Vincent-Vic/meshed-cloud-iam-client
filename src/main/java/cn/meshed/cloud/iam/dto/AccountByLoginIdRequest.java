package cn.meshed.cloud.iam.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class AccountByLoginIdRequest implements Serializable {

    @NotBlank(message = "登入ID不能为空")
    private String loginId;
}
