package cn.meshed.cloud.iam.account.query;

import com.alibaba.cola.dto.Query;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

/**
 * <h1>用户查询</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "用户查询")
public class UserQry extends Query {

    private static final long serialVersionUID = 1L;

    @Schema(description = "用户ID列表")
    private Set<Long> ids;

}
