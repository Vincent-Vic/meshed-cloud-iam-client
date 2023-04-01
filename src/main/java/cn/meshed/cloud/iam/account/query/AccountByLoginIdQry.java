package cn.meshed.cloud.iam.account.query;

import com.alibaba.cola.dto.Query;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "")
public class AccountByLoginIdQry extends Query {

    @Schema(description = "登入ID")
    @NotBlank(message = "登入ID不能为空")
    private String loginId;
}
