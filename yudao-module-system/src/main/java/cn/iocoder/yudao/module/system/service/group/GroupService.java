package cn.iocoder.yudao.module.system.service.group;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.module.system.controller.admin.group.vo.*;
import cn.iocoder.yudao.module.system.dal.dataobject.group.GroupDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 用户组 Service 接口
 *
 * @author admin
 */
public interface GroupService {

    /**
     * 创建用户组
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createGroup(@Valid GroupSaveReqVO createReqVO);

    /**
     * 更新用户组
     *
     * @param updateReqVO 更新信息
     */
    void updateGroup(@Valid GroupSaveReqVO updateReqVO);

    /**
     * 删除用户组
     *
     * @param id 编号
     */
    void deleteGroup(Long id);

    /**
    * 批量删除用户组
    *
    * @param ids 编号
    */
    void deleteGroupListByIds(List<Long> ids);

    /**
     * 获得用户组
     *
     * @param id 编号
     * @return 用户组
     */
    GroupDO getGroup(Long id);

    /**
     * 获得用户组分页
     *
     * @param pageReqVO 分页查询
     * @return 用户组分页
     */
    PageResult<GroupDO> getGroupPage(GroupPageReqVO pageReqVO);

}