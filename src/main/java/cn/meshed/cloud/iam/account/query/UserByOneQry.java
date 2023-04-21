package cn.meshed.cloud.iam.account.query;

import com.alibaba.cola.dto.Query;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>用户查询</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "用户查询")
public class UserByOneQry extends Query {

    private static final long serialVersionUID = 1L;

    @Schema(description = "用户ID")
    private Long id;
    @Schema(description = "含用户权限")
    private Boolean hasGrantedAuthority;
}
