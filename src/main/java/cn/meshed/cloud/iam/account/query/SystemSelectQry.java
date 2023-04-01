package cn.meshed.cloud.iam.account.query;

import cn.meshed.cloud.iam.account.enums.SystemStatusEnum;
import cn.meshed.cloud.iam.account.enums.SystemTypeEnum;
import com.alibaba.cola.dto.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>系统</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "系统分页查询")
public class SystemSelectQry extends PageQuery {

    /**
     * 类型
     */
    @Schema(description = "类型")
    private SystemTypeEnum type;

}
