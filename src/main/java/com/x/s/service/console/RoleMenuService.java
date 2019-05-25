package com.x.s.service.console;

import com.x.s.mapper.console.RoleMenuMapper;
import com.x.s.model.console.RoleMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author x.s
 */
@Service
public class RoleMenuService {

    @Autowired
    private RoleMenuMapper roleMenuMapper;

    public void insert(RoleMenu roleMenu){
        roleMenuMapper.insert(roleMenu);
    }

    public void deleteMenuId(String id){
        Example example = new Example(RoleMenu.class);
        example.createCriteria().andCondition("menu_id =", id);
        roleMenuMapper.deleteByExample(example);
    }

    public void deleteRoleId(String id){
        Example example = new Example(RoleMenu.class);
        example.createCriteria().andCondition("role_id =", id);
        roleMenuMapper.deleteByExample(example);
    }

    public RoleMenu selectOne(RoleMenu roleMenu){
        return roleMenuMapper.selectOne(roleMenu);
    }

    public List<RoleMenu> getRoleList(RoleMenu roleMenu){
        return roleMenuMapper.select(roleMenu);
    }


}
