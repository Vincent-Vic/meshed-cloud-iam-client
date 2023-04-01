package cn.meshed.cloud.iam.account.data;

import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 授权传输模型
 * </p>
 *
 * @author by Vincent Vic
 * @since 2022-10-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "授权传输模型")
public class GrantedAuthorityDTO extends DTO {

    private static final long serialVersionUID = 1L;

    /**
     * 编码
     */
    @Schema(description = "编码")
    private Long id;

    /**
     * 父权限
     */
    @Schema(description = "父权限")
    private Long parentId;

    /**
     * 权限名称
     */
    @Schema(description = "权限名称")
    private String name;

    /**
     * 权限英文名称
     */
    @Schema(description = "权限英文名称")
    private String enname;

    /**
     * 授权路径
     */
    @Schema(description = "授权路径")
    private String uri;

    /**
     * 备注
     */
    @Schema(description = "备注")
    private String description;

}
