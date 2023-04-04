package cn.meshed.cloud.iam.account;

import cn.meshed.cloud.iam.account.data.UserDTO;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * <h1>登入适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
public interface LoginAdapter {

    /**
     * 执行登入 (重定向模式)
     *
     * @param type     登入模式
     * @param key      系统标识
     * @param redirect 重定向
     * @param response 响应
     * @return 页面/重定向
     */
    @Operation(summary = "oauth2集中处理器")
    @GetMapping("/login/{type}/{key}")
    String oauth2Login(@Parameter(description = "登入模式：code|token") @PathVariable("type") String type,
                       @Parameter(description = "系统标识") @PathVariable("key") String key,
                       @Parameter(description = "重定向(不能为空)") String redirect,
                       @Parameter(description = "响应信息(非前端参数)")HttpServletResponse response);

    /**
     * 获取当前登入用户信息
     *
     * @return {@link SingleResponse< UserDTO >}
     */
    @Operation(summary = "获取当前登入用户信息")
    @GetMapping("/current/userinfo")
    @ResponseBody
    SingleResponse<UserDTO> userInfo();


    /**
     * 退出登入
     *
     * @return {@link Response}
     */
    @Operation(summary = "退出登入")
    @DeleteMapping("/logout")
    @ResponseBody
    Response logout();



}
