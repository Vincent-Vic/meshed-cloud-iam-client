package cn.meshed.cloud.iam.rbac.query;

import com.alibaba.cola.dto.Query;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * <p>
 * 权限选项模型
 * </p>
 *
 * @author by Vincent Vic
 * @since 2022-10-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "权限选项模型")
public class PermissionBySelectQry extends Query {

    private static final long serialVersionUID = 1L;

    /**
     * 模式限定
     */
    @Schema(description = "模式限定")
    private List<Long> accessMode;


}
