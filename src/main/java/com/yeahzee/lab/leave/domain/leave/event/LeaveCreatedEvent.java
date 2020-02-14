package com.yeahzee.lab.leave.domain.leave.event;

import com.yeahzee.lab.common.event.DomainEvent;

/**
 * 领域事件
 *
 * 1. 领域事件在领域层内部定义、产生、发布。
 * 2. 领域事件属于界限上下文内部的事件，不能逃逸到其他界限上下文。
 * 3. 通常一个界限上下文对应一个微服务，则领域事件发布后，只能被本微服务订阅和消费。
 * 4. 领域事件典型应用场景：通过MQ实现异步编程。
 * 5. 同一个微服务内的多聚合编排，直接通过应用层事务保证，而不使用领域事件。
 *
 * 应用事件
 *
 * 1. 应用事件在应用层定义、产生、发布。
 * 2. 应用事件属于界限上下文之间的事件，用于界限上下文之间的消息传递。
 * 3. 通常一个界限上下文对应一个微服务，则应用事件被发布后，应当只由其他微服务订阅和消费。
 */
public class LeaveCreatedEvent extends DomainEvent {
}
