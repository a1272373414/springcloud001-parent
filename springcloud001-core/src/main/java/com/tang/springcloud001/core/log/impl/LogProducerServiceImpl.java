package com.tang.springcloud001.core.log.impl;

import com.tang.springcloud001.api.log.constants.LogConstants;
import com.tang.springcloud001.api.log.entity.RosesCommanLog;
import com.tang.springcloud001.api.log.entity.RosesTraceLog;
import com.tang.springcloud001.core.log.LogProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * 发送日志到消息队列的实现类
 *
 * @author yaoliguo
 * @date 2018-04-25 10:37
 */
public class LogProducerServiceImpl implements LogProducerService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    @Override
    public void sendMsg(RosesCommanLog log) {
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                BoundListOperations<String, Object> operations = redisTemplate.boundListOps(LogConstants.COMMON_LOG);
                operations.leftPush(log);
            }
        });

    }

    @Override
    public void sendTraceMsg(RosesTraceLog traceLog) {
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                BoundListOperations<String, Object> operations = redisTemplate.boundListOps(LogConstants.TRACE_LOG);
                operations.leftPush(traceLog);
            }
        });
    }
}
