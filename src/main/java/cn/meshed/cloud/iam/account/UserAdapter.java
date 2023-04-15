package cn.meshed.cloud.iam.account;

import cn.meshed.cloud.iam.account.data.UserDTO;
import cn.meshed.cloud.iam.account.query.UserSelectQry;
import com.alibaba.cola.dto.MultiResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h1>用户适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("user")
public interface UserAdapter {

    /**
     * 选项列表
     *
     * @param userSelectQry 选项参数
     * @return {@link MultiResponse<UserDTO>}
     */
    @Operation(summary = "选项列表")
    @GetMapping("select")
    MultiResponse<UserDTO> list(UserSelectQry userSelectQry);
}
