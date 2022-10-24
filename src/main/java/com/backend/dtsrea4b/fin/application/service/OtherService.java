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

import com.backend.dtsrea4b.fin.application.mapper.OtherDynamicSqlSupport;
import com.backend.dtsrea4b.fin.application.mapper.OtherMapper;
import com.backend.dtsrea4b.fin.application.model.Other;



@Service
public class OtherService {


	@Autowired
	protected OtherMapper otherMapper;
	
	public Optional<Other> getSelectedid(Integer id) {
		SelectStatementProvider selectStatement = select(OtherDynamicSqlSupport.other.allColumns())
				.from(OtherDynamicSqlSupport.other).where(OtherDynamicSqlSupport.id, isEqualTo(id)).build()
				.render(RenderingStrategies.MYBATIS3);
		return otherMapper.selectOne(selectStatement);
	}
	
	public List<Other> getSelectedall() {
		SelectStatementProvider selectStatement = select(OtherDynamicSqlSupport.other.allColumns())
				.from(OtherDynamicSqlSupport.other).build()
				.render(RenderingStrategies.MYBATIS3);
		return otherMapper.selectMany(selectStatement);
	}

	public Integer insertNew(Other other, String Username) {
		other.setCreatedBy(Username);
		other.setCreatedAt(new Date());
		return otherMapper.insert(other);
	}

	public Integer update(Other other, String status, String Username) {
		if (status.equals("delete")) {
			return otherMapper.deleteByPrimaryKey(other.getId());
		}
		other.setUpdatedBy(Username);
		other.setUpdatedAt(new Date());

		return otherMapper.updateByPrimaryKey(other);
	}
	
}
