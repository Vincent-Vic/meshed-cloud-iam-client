package cn.meshed.cloud.iam.rbac;

import cn.meshed.cloud.iam.rbac.command.RoleCmd;
import cn.meshed.cloud.iam.rbac.command.RoleGrantPermissionCmd;
import cn.meshed.cloud.iam.rbac.data.RoleDTO;
import cn.meshed.cloud.iam.rbac.data.RoleOptionDTO;
import cn.meshed.cloud.iam.rbac.query.RoleBySelectQry;
import cn.meshed.cloud.iam.rbac.query.RoleQry;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
public interface RoleAdapter {

    /**
     * 分页列表
     *
     * @param pageQry 分页参数
     * @return {@link MultiResponse<RoleDTO>}
     */
    @Operation(summary = "分页列表")
    @GetMapping("list")
    MultiResponse<RoleDTO> list(RoleQry pageQry);

    /**
     * 角色详情
     *
     * @param id 角色编码
     * @return {@link SingleResponse<RoleDTO>}
     */
    @Operation(summary = "详情")
    @GetMapping("details/{id}")
    SingleResponse<RoleDTO> details(@PathVariable("id") Long id);

    /**
     * 角色选项
     *
     * @param roleBySelectQry
     * @return {@link MultiResponse<RoleOptionDTO>}
     */
    @Operation(summary = "选项")
    @GetMapping("select")
    MultiResponse<RoleOptionDTO> select(@Valid @RequestBody RoleBySelectQry roleBySelectQry);

    /**
     * 角色保存
     *
     * @param roleCmd
     * @return {@link Response}
     */
    @Operation(summary = "保存")
    @PostMapping("save")
    Response save(@Valid @RequestBody RoleCmd roleCmd);

    /**
     * 角色删除
     *
     * @param id 角色编码
     * @return {@link Response}
     */
    @Operation(summary = "删除")
    @DeleteMapping("delete/{id}")
    Response delete(@PathVariable("id") Long id);

    /**
     * 权限编码列表
     *
     * @param id 角色编码
     * @return {@link MultiResponse<Long>}
     */
    @Operation(summary = "权限编码列表")
    @GetMapping("get/permissions/{id}")
    MultiResponse<Long> getPermissionIds(@PathVariable("id") Long id);

    /**
     * 角色授权
     *
     * @param roleGrantPermissionCmd 角色授权操作
     * @return {@link Response}
     */
    @Operation(summary = "角色授权")
    @PostMapping("grant/permissions")
    Response grantRole(@Valid @RequestBody RoleGrantPermissionCmd roleGrantPermissionCmd);
}
