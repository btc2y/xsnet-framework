package com.x.s.mapper.member;

import com.x.s.core.CustomerMapper;
import com.x.s.model.member.Member;
import org.springframework.stereotype.Service;

/**
 * @author x.s
 */
@Service
public interface MemberMapper extends CustomerMapper<Member> {
    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    Member selectByUsername(String username);
}
