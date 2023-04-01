package cn.meshed.cloud.iam.account;

import cn.meshed.cloud.iam.account.command.SystemCmd;
import cn.meshed.cloud.iam.account.data.AccountDTO;
import cn.meshed.cloud.iam.account.data.SystemDTO;
import cn.meshed.cloud.iam.account.query.SystemPageQry;
import cn.meshed.cloud.iam.account.query.SystemSelectQry;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("system")
public interface SystemAdapter {

    /**
     * 分页列表
     *
     * @param pageQry 分页参数
     * @return {@link PageResponse < AccountDTO >}
     */
    @Operation(summary = "分页列表")
    @GetMapping("list")
    PageResponse<SystemDTO> list(SystemPageQry pageQry);

    /**
     * 保存
     *
     * @param systemCmd 新增操作
     * @return {@link Response}
     */
    @Operation(summary = "保存")
    @PostMapping("save")
    Response save(@Valid @RequestBody SystemCmd systemCmd);

    /**
     * 删除
     *
     * @param id 系统ID
     * @return {@link Response}
     */
    @Operation(summary = "删除")
    @DeleteMapping("delete/{id}")
    Response delete(@PathVariable("id") Integer id);

    /**
     * 系统选项
     *
     * @param systemSelectQry 选项参数
     * @return {@link MultiResponse<SystemDTO>}
     */
    @Operation(summary = "选项")
    @GetMapping("select")
    MultiResponse<SystemDTO> select(SystemSelectQry systemSelectQry);

    /**
     * 检查系统标识是否可用
     *
     * @param key 系统标识
     * @return {@link Response}
     */
    @Operation(summary = "检查表单标识是否可用")
    @GetMapping("/available/key/{key}")
    Response availableKey(@Parameter(description = "系统标识") @PathVariable("key") String key);

}
