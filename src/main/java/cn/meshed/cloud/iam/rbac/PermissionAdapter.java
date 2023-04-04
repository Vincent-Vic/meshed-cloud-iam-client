package cn.meshed.cloud.iam.rbac;

import cn.meshed.cloud.iam.rbac.command.PermissionCmd;
import cn.meshed.cloud.iam.rbac.data.PermissionDTO;
import cn.meshed.cloud.iam.rbac.data.PermissionOptionDTO;
import cn.meshed.cloud.iam.rbac.query.PermissionBySelectQry;
import cn.meshed.cloud.iam.rbac.query.PermissionQry;
import com.alibaba.cola.dto.MultiResponse;
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
 * <h1>权限适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("permission")
public interface PermissionAdapter {

    /**
     * 分页列表
     *
     * @param pageQry 分页查询
     * @return {@link MultiResponse<PermissionDTO>}
     */
    @Operation(summary = "分页列表")
    @GetMapping("list")
    MultiResponse<PermissionDTO> list(@Valid PermissionQry pageQry);

    /**
     * 权限选项
     *
     * @param permissionBySelectQry 选项参数
     * @return {@link MultiResponse<PermissionOptionDTO>}
     */
    @Operation(summary = "选项")
    @GetMapping("select")
    MultiResponse<PermissionOptionDTO> select(@Valid PermissionBySelectQry permissionBySelectQry);

    /**
     * 权限详情
     *
     * @param id 权限编码
     * @return {@link SingleResponse<PermissionDTO>}
     */
    @Operation(summary = "详情")
    @GetMapping("details/{id}")
    SingleResponse<PermissionDTO> details(@PathVariable("id") Long id);

    /**
     * 保存权限
     *
     * @param permissionCmd 权限命令
     * @return {@link Response}
     */
    @Operation(summary = "保存")
    @PostMapping("save")
    Response save(@Valid @RequestBody PermissionCmd permissionCmd);

    /**
     * 删除权限
     *
     * @param id 权限编码
     * @return {@link Response}
     */
    @Operation(summary = "删除")
    @DeleteMapping("delete/{id}")
    Response delete(@PathVariable("id") Long id);
}
