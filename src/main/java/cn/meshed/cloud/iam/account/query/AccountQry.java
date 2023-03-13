package cn.meshed.cloud.iam.account.query;

import cn.meshed.cloud.constant.Status;
import com.alibaba.cola.dto.PageQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AccountQry extends PageQuery {

    /**
     * 账号登入主名称
     */
    private String loginId;

    /**
     * 账号手机号
     */
    private String phone;

    /**
     * 账号邮箱
     */
    private String email;

    /**
     * 状态
     */
    private Status status;
}
