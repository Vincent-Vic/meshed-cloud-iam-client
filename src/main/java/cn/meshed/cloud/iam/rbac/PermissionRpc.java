package cn.meshed.cloud.iam.rbac;

import cn.meshed.cloud.iam.rbac.data.IdentityAuthenticationDTO;
import com.alibaba.cola.dto.MultiResponse;

import java.io.Serializable;

/**
 * <h1>权限查询</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
public interface PermissionRpc extends Serializable {

     long serialVersionUID = 1L;

    /**
     * 认证权限查询 （授权与匿名）
     * 登入模式可忽略
     * @return {@link MultiResponse<IdentityAuthenticationDTO>}
     */
    MultiResponse<IdentityAuthenticationDTO> getIdentityAuthentications();
}
