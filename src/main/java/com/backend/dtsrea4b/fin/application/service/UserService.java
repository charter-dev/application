package com.backend.dtsrea4b.fin.application.service;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dtsrea4b.fin.application.mapper.UserDynamicSqlSupport;
import com.backend.dtsrea4b.fin.application.model.User;


@Service
public class UserService {

	@Autowired
	protected com.backend.dtsrea4b.fin.application.mapper.UserMapper userMapper;
	
	public Optional<User> getSelectedid(Integer id) {
		SelectStatementProvider selectStatement = null;
		try {
			selectStatement = select(UserDynamicSqlSupport.user.allColumns())
					.from(UserDynamicSqlSupport.user).where(UserDynamicSqlSupport.id, isEqualTo(id)).build()
					.render(RenderingStrategies.MYBATIS3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userMapper.selectOne(selectStatement);
	}
	
	public List<User> getSelectedall() {
		SelectStatementProvider selectStatement = select(UserDynamicSqlSupport.user.allColumns())
				.from(UserDynamicSqlSupport.user).build()
				.render(RenderingStrategies.MYBATIS3);
		return userMapper.selectMany(selectStatement);
	}

	public Integer insertNew(User user, String Username) {
		user.setCreatedby(Username);
		user.setCreatedAt(new Date());
		return userMapper.insert(user);
	}

	public Integer update(User user, String status, String Username) {
		if (status.equals("delete")) {
			return userMapper.deleteByPrimaryKey(user.getId());
		}
		user.setUpdatedby(Username);
		user.setUpdatedAt(new Date());

		return userMapper.updateByPrimaryKey(user);
	}

	public Optional<User> getuserandpass(String username, String password) {
		SelectStatementProvider selectStatement = null;
		try {
			selectStatement = select(UserDynamicSqlSupport.user.allColumns())
					.from(UserDynamicSqlSupport.user).where(UserDynamicSqlSupport.username, isEqualTo(username))
					.and(UserDynamicSqlSupport.password, isEqualTo(password)).build()
					.render(RenderingStrategies.MYBATIS3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userMapper.selectOne(selectStatement);
	}
	
}

