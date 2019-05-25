package com.x.s.service.member;

import com.github.pagehelper.PageHelper;
import com.x.s.mapper.member.MemberMapper;
import com.x.s.model.member.Member;
import com.x.s.util.CamelCaseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author x.s
 */
@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public List<Member> getPageList(Member member) {
        PageHelper.offsetPage(member.getOffset(), member.getLimit());
        PageHelper.orderBy(CamelCaseUtil.toUnderlineName(member.getSort())+" "+member.getOrder());
        return memberMapper.selectAll();
    }

    public Integer getCount(Example example){
        return memberMapper.selectCountByExample(example);
    }

    public Member getMember(Member member){
        return memberMapper.selectOne(member);
    }

    public Member findByUsername(String username) {
        return memberMapper.selectByUsername(username);
    }

    public void insert(Member member){
        memberMapper.insert(member);
    }
}
