package cn.meshed.cloud.iam.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class AccountByLoginIdRequest {

    @NotBlank(message = "登入ID不能为空")
    private String loginId;
}
