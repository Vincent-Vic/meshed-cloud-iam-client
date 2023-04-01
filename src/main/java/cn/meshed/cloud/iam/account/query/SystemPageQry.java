package cn.meshed.cloud.iam.account.query;

import cn.meshed.cloud.constant.Status;
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
public class SystemPageQry extends PageQuery {

    /**
     * 关键字查询 系统名称/key
     */
    @Schema(description = "关键字")
    private String keyword;


    /**
     * 状态
     */
    @Schema(description = "状态")
    private SystemStatusEnum status;

    /**
     * 类型
     */
    @Schema(description = "类型")
    private SystemTypeEnum type;
}
