package com.learn.redis.support;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.StringUtils;

/**
 * Created by yf003 on 2017/9/12.
 */
public class RedisConfigCondition implements Condition {

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env = conditionContext.getEnvironment();
        return (!StringUtils.isEmpty(env.getProperty("redis.enabled"))
                && env.getProperty("redis.enabled").equals("true"));
    }
}
