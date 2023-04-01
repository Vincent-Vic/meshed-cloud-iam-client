package cn.meshed.cloud.iam.account.query;


import com.alibaba.cola.dto.Query;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>授权查询</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "授权查询")
public class GrantedAuthorityQry extends Query {

    /**
     * 账号ID
     */
    @Schema(description = "账号ID")
    private Long accountId;

}
