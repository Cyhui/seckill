package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;
import org.springframework.stereotype.Repository;

/**
 * Created by 54459 on 2017/2/2 0002.
 */
@Repository
public interface SuccessKilledDao {
    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return 如果影响行数>1，表示更新的记录行数
     */
    int insertSuccessKilled(@Param("seckillId") Long seckillId, @Param("userPhone") Long userPhone);

    /**
     * 根据id查询SuccessKilled并携带秒杀实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") Long seckillId,@Param("userPhone") Long userPhone);
}
