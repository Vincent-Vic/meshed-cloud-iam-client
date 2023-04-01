package cn.meshed.cloud.iam.account.query;

import cn.meshed.cloud.constant.Status;
import com.alibaba.cola.dto.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>账号分页查询</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "账号分页查询")
public class AccountPageQry extends PageQuery {

    /**
     * 账号登入主名称
     */
    @Schema(description = "账号登入主名称")
    private String loginId;

    /**
     * 账号手机号
     */
    @Schema(description = "账号手机号")
    private String phone;

    /**
     * 账号邮箱
     */
    @Schema(description = "账号邮箱")
    private String email;

    /**
     * 状态
     */
    @Schema(description = "状态")
    private Status status;
}
