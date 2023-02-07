package cn.meshed.cloud.iam.dto.account;

import cn.meshed.base.constant.Status;
import com.alibaba.cola.dto.Command;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author by Vincent Vic
 * @since 2022-10-04
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class AccountSaveCmd extends Command {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Long id;


    /**
     * 账号登入主名称
     */
    private String loginId;

    /**
     * 账号手机号
     */
    private String phone;

    /**
     * 账号邮箱
     */
    private String email;


    /**
     * 账号加密后的密码
     */
    private String secretKey;

    /**
     * 授权角色
     */
    private List<Long> roles;

    /**
     * 状态
     */
    private Status status;


}
