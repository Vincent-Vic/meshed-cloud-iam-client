package cn.meshed.cloud.iam.account;

import com.alibaba.cola.dto.SingleResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h1>Oauth 2 认证服务适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
public interface OAuth2ServerAdapter {

    /**
     * oauth2 集中处理器
     * @return
     */
    @Operation(summary = "oauth2集中处理器")
    @RequestMapping("/oauth2/*")
    Object request();

}
