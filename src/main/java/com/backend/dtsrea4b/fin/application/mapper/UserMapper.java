package com.backend.dtsrea4b.fin.application.mapper;

import static com.backend.dtsrea4b.fin.application.mapper.UserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.backend.dtsrea4b.fin.application.model.User;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface UserMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5624714+07:00", comments="Source Table: user")
    BasicColumn[] selectList = BasicColumn.columnList(id, username, password, createdby, createdAt, updatedby, updatedAt);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5524689+07:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5534689+07:00", comments="Source Table: user")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5544902+07:00", comments="Source Table: user")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<User> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5574962+07:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserResult")
    Optional<User> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5574962+07:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="createdby", property="createdby", jdbcType=JdbcType.VARCHAR),
        @Result(column="createdAt", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updatedby", property="updatedby", jdbcType=JdbcType.VARCHAR),
        @Result(column="updatedAt", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<User> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5584894+07:00", comments="Source Table: user")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5584894+07:00", comments="Source Table: user")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5584894+07:00", comments="Source Table: user")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5594912+07:00", comments="Source Table: user")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5594912+07:00", comments="Source Table: user")
    default int insert(User record) {
        return MyBatis3Utils.insert(this::insert, record, user, c ->
            c.map(username).toProperty("username")
            .map(password).toProperty("password")
            .map(createdby).toProperty("createdby")
            .map(createdAt).toProperty("createdAt")
            .map(updatedby).toProperty("updatedby")
            .map(updatedAt).toProperty("updatedAt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5604713+07:00", comments="Source Table: user")
    default int insertSelective(User record) {
        return MyBatis3Utils.insert(this::insert, record, user, c ->
            c.map(username).toPropertyWhenPresent("username", record::getUsername)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(createdby).toPropertyWhenPresent("createdby", record::getCreatedby)
            .map(createdAt).toPropertyWhenPresent("createdAt", record::getCreatedAt)
            .map(updatedby).toPropertyWhenPresent("updatedby", record::getUpdatedby)
            .map(updatedAt).toPropertyWhenPresent("updatedAt", record::getUpdatedAt)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.56349+07:00", comments="Source Table: user")
    default Optional<User> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.56349+07:00", comments="Source Table: user")
    default List<User> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5644906+07:00", comments="Source Table: user")
    default List<User> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5644906+07:00", comments="Source Table: user")
    default Optional<User> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.565261+07:00", comments="Source Table: user")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5656738+07:00", comments="Source Table: user")
    static UpdateDSL<UpdateModel> updateAllColumns(User record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(username).equalTo(record::getUsername)
                .set(password).equalTo(record::getPassword)
                .set(createdby).equalTo(record::getCreatedby)
                .set(createdAt).equalTo(record::getCreatedAt)
                .set(updatedby).equalTo(record::getUpdatedby)
                .set(updatedAt).equalTo(record::getUpdatedAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.566136+07:00", comments="Source Table: user")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(User record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(username).equalToWhenPresent(record::getUsername)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(createdby).equalToWhenPresent(record::getCreatedby)
                .set(createdAt).equalToWhenPresent(record::getCreatedAt)
                .set(updatedby).equalToWhenPresent(record::getUpdatedby)
                .set(updatedAt).equalToWhenPresent(record::getUpdatedAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5674685+07:00", comments="Source Table: user")
    default int updateByPrimaryKey(User record) {
        return update(c ->
            c.set(username).equalTo(record::getUsername)
            .set(password).equalTo(record::getPassword)
            .set(createdby).equalTo(record::getCreatedby)
            .set(createdAt).equalTo(record::getCreatedAt)
            .set(updatedby).equalTo(record::getUpdatedby)
            .set(updatedAt).equalTo(record::getUpdatedAt)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5674685+07:00", comments="Source Table: user")
    default int updateByPrimaryKeySelective(User record) {
        return update(c ->
            c.set(username).equalToWhenPresent(record::getUsername)
            .set(password).equalToWhenPresent(record::getPassword)
            .set(createdby).equalToWhenPresent(record::getCreatedby)
            .set(createdAt).equalToWhenPresent(record::getCreatedAt)
            .set(updatedby).equalToWhenPresent(record::getUpdatedby)
            .set(updatedAt).equalToWhenPresent(record::getUpdatedAt)
            .where(id, isEqualTo(record::getId))
        );
    }
}