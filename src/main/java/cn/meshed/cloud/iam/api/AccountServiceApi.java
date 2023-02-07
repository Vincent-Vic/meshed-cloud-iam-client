package cn.meshed.cloud.iam.api;

import cn.meshed.cloud.iam.dto.account.AccountByLoginIdQry;
import cn.meshed.cloud.iam.dto.account.GrantedAuthorityQry;
import cn.meshed.cloud.iam.dto.account.data.AccountDTO;
import cn.meshed.cloud.iam.dto.account.data.GrantedAuthorityDTO;
import com.alibaba.cola.dto.SingleResponse;

import java.util.Set;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
public interface AccountServiceApi {

    /**
     * 根据登入ID（用户名）查找用户消息
     * @param accountByLoginIdQry 请求对象
     * @return {@link SingleResponse< AccountDTO >}
     */
    SingleResponse<AccountDTO> getAccountByLoginId(AccountByLoginIdQry accountByLoginIdQry);

    /**
     * 获取账号权限
     *
     * @param grantedAuthorityQry 请求对象
     * @return 权限字符集
     */
    SingleResponse<Set<GrantedAuthorityDTO>> getGrantedAuthority(GrantedAuthorityQry grantedAuthorityQry);
}
