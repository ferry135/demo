package com.ferry.demo.user;

import com.mzt.logapi.starter.annotation.LogRecordAnnotation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @LogRecordAnnotation(success = "创建了用户「{{#user.name}}」,创建结果:{{#_ret}}",
            fail = "创建用户「{{#user.name}}」失败",
            operator = "{{#loginUserId}}",
            prefix = "user", bizNo = "{{#user.id}}")
    @Transactional(rollbackFor = Exception.class)
    @Override
    public User createUser(User user) {
        userMapper.insert(user);
        return user;
    }
}
