package cn.meshed.cloud.iam.api;

import cn.meshed.cloud.iam.dto.AccountByLoginIdRequest;
import cn.meshed.cloud.iam.dto.AccountResponse;
import com.alibaba.cola.dto.SingleResponse;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
public interface AccountServiceApi {

    /**
     * 根据登入ID（用户名）查找用户消息
     * @param accountByLoginIdRequest 请求对象
     * @return {@link SingleResponse<AccountResponse>}
     */
    SingleResponse<AccountResponse> getAccountByLoginId(AccountByLoginIdRequest accountByLoginIdRequest);

}
