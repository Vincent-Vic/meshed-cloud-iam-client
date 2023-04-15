package cn.meshed.cloud.iam.account;

import cn.meshed.cloud.iam.account.data.UserDTO;
import cn.meshed.cloud.iam.account.query.GrantedAuthorityQry;
import cn.meshed.cloud.iam.account.query.UserByOneQry;
import cn.meshed.cloud.iam.account.query.UserQry;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.SingleResponse;

import java.io.Serializable;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
public interface UserRpc extends Serializable {

    long serialVersionUID = 1L;

    /**
     * 获取用户权限
     *
     * @param grantedAuthorityQry 用户ID
     * @return 权限字符集
     */
    MultiResponse<String> getUserGrantedAuthority(GrantedAuthorityQry grantedAuthorityQry);

    /**
     * 获取用户角色
     *
     * @param grantedAuthorityQry 用户权限查询
     * @return 角色字符集
     */
    MultiResponse<String> getUserGrantedRole(GrantedAuthorityQry grantedAuthorityQry);


    /**
     * 获取用户信息
     *
     * @param userByOneQry 用户查询
     * @return 用户信息
     */
    SingleResponse<UserDTO> getUserInfo(UserByOneQry userByOneQry);


    /**
     * 批量获取用户信息
     *
     * @param userQry 用户查询
     * @return 用户信息列表
     */
    MultiResponse<UserDTO> getUserList(UserQry userQry);


}
