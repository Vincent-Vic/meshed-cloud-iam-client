package cn.meshed.cloud.iam.account;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
public interface LoginAdapter {

    /**
     * 执行登入 (重定向模式)
     *
     * @param key      系统标识
     * @param redirect 重定向
     * @param request  请求
     * @param response 响应
     */
    @Operation(summary = "oauth2集中处理器")
    @GetMapping("/login/{key}")
    String codeLogin(@PathVariable("key") String key, String redirect, HttpServletRequest request, HttpServletResponse response);
}
