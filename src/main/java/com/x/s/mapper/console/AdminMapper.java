package com.x.s.mapper.console;

import com.x.s.core.CustomerMapper;
import com.x.s.model.console.Admin;
import org.springframework.stereotype.Service;

/**
 * @author x.s
 */
@Service
public interface AdminMapper extends CustomerMapper<Admin> {
    /**
     * 根据用户名获取用户
     * @param userName
     * @return
     */
    Admin selectByUsername(String userName);

    /**
     * 根据ID删除
     * @param id
     */
    void deleteById(String id);
}
