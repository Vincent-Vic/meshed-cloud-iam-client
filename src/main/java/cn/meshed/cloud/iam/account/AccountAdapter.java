package cn.meshed.cloud.iam.account;

import cn.meshed.cloud.iam.account.command.AccountAddCmd;
import cn.meshed.cloud.iam.account.command.AccountGrantRoleCmd;
import cn.meshed.cloud.iam.account.command.AccountLockCmd;
import cn.meshed.cloud.iam.account.data.AccountDTO;
import cn.meshed.cloud.iam.account.query.AccountPageQry;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <h1>账号适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("account")
public interface AccountAdapter {

    /**
     * 分页列表
     *
     * @param pageQry 分页参数
     * @return {@link PageResponse<AccountDTO>}
     */
    @Operation(summary = "分页列表")
    @GetMapping("list")
    PageResponse<AccountDTO> list(AccountPageQry pageQry);

    /**
     * 保存
     *
     * @param accountAddCmd 新增操作
     * @return {@link Response}
     */
    @Operation(summary = "保存")
    @PostMapping("save")
    Response save(@Valid @RequestBody AccountAddCmd accountAddCmd);

    /**
     * 删除
     *
     * @param id 账号ID
     * @return {@link Response}
     */
    @Operation(summary = "删除")
    @DeleteMapping("delete/{id}")
    Response delete(@PathVariable("id") Long id);

    /**
     * 详情
     *
     * @param id 账号ID
     * @return {@link SingleResponse<AccountDTO>}
     */
    @Operation(summary = "详情")
    @GetMapping("details/{id}")
    SingleResponse<AccountDTO> details(@PathVariable("id") Long id);

    /**
     * 账号角色编码列表
     *
     * @param id 账号ID
     * @return {@link MultiResponse<Long>}
     */
    @Operation(summary = "账号角色编码列表")
    @GetMapping("get/roles/{id}")
    MultiResponse<Long> getAccountRoleIds(@PathVariable("id") Long id);

    /**
     * 账号授权
     *
     * @param accountGrantRoleCmd 账号授权
     * @return {@link Response}
     */
    @Operation(summary = "账号授权")
    @PostMapping("grant/roles")
    Response grantAccount(@Valid @RequestBody AccountGrantRoleCmd accountGrantRoleCmd);


    /**
     * 锁定账号
     *
     * @param accountLockCmd 锁定命令
     * @return {@link Response}
     */
    @Operation(summary = "锁定账号")
    @PostMapping("lock")
    Response lock(@Valid @RequestBody AccountLockCmd accountLockCmd);


    /**
     * 解锁账号
     *
     * @param accountLockCmd 解锁命令
     * @return {@link Response}
     */
    @Operation(summary = "解锁账号")
    @PostMapping("unlock")
    Response unlock(@Valid @RequestBody AccountLockCmd accountLockCmd);
}
