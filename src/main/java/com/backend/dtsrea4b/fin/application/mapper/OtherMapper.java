package com.backend.dtsrea4b.fin.application.mapper;

import static com.backend.dtsrea4b.fin.application.mapper.OtherDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.backend.dtsrea4b.fin.application.model.Other;
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
public interface OtherMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7715461+07:00", comments="Source Table: other")
    BasicColumn[] selectList = BasicColumn.columnList(id, judul, url, createdBy, createdAt, updatedBy, updatedAt, viewsCount, content);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7705463+07:00", comments="Source Table: other")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7705463+07:00", comments="Source Table: other")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7705463+07:00", comments="Source Table: other")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Other> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7705463+07:00", comments="Source Table: other")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OtherResult")
    Optional<Other> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7705463+07:00", comments="Source Table: other")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OtherResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="judul", property="judul", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="createdBy", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="createdAt", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updatedBy", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updatedAt", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ViewsCount", property="viewsCount", jdbcType=JdbcType.BIGINT),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Other> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7715461+07:00", comments="Source Table: other")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7715461+07:00", comments="Source Table: other")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, other, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7715461+07:00", comments="Source Table: other")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, other, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7715461+07:00", comments="Source Table: other")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7715461+07:00", comments="Source Table: other")
    default int insert(Other record) {
        return MyBatis3Utils.insert(this::insert, record, other, c ->
            c.map(judul).toProperty("judul")
            .map(url).toProperty("url")
            .map(createdBy).toProperty("createdBy")
            .map(createdAt).toProperty("createdAt")
            .map(updatedBy).toProperty("updatedBy")
            .map(updatedAt).toProperty("updatedAt")
            .map(viewsCount).toProperty("viewsCount")
            .map(content).toProperty("content")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7715461+07:00", comments="Source Table: other")
    default int insertSelective(Other record) {
        return MyBatis3Utils.insert(this::insert, record, other, c ->
            c.map(judul).toPropertyWhenPresent("judul", record::getJudul)
            .map(url).toPropertyWhenPresent("url", record::getUrl)
            .map(createdBy).toPropertyWhenPresent("createdBy", record::getCreatedBy)
            .map(createdAt).toPropertyWhenPresent("createdAt", record::getCreatedAt)
            .map(updatedBy).toPropertyWhenPresent("updatedBy", record::getUpdatedBy)
            .map(updatedAt).toPropertyWhenPresent("updatedAt", record::getUpdatedAt)
            .map(viewsCount).toPropertyWhenPresent("viewsCount", record::getViewsCount)
            .map(content).toPropertyWhenPresent("content", record::getContent)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7715461+07:00", comments="Source Table: other")
    default Optional<Other> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, other, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7715461+07:00", comments="Source Table: other")
    default List<Other> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, other, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7715461+07:00", comments="Source Table: other")
    default List<Other> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, other, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7715461+07:00", comments="Source Table: other")
    default Optional<Other> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7715461+07:00", comments="Source Table: other")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, other, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7715461+07:00", comments="Source Table: other")
    static UpdateDSL<UpdateModel> updateAllColumns(Other record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(judul).equalTo(record::getJudul)
                .set(url).equalTo(record::getUrl)
                .set(createdBy).equalTo(record::getCreatedBy)
                .set(createdAt).equalTo(record::getCreatedAt)
                .set(updatedBy).equalTo(record::getUpdatedBy)
                .set(updatedAt).equalTo(record::getUpdatedAt)
                .set(viewsCount).equalTo(record::getViewsCount)
                .set(content).equalTo(record::getContent);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7715461+07:00", comments="Source Table: other")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Other record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(judul).equalToWhenPresent(record::getJudul)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(createdBy).equalToWhenPresent(record::getCreatedBy)
                .set(createdAt).equalToWhenPresent(record::getCreatedAt)
                .set(updatedBy).equalToWhenPresent(record::getUpdatedBy)
                .set(updatedAt).equalToWhenPresent(record::getUpdatedAt)
                .set(viewsCount).equalToWhenPresent(record::getViewsCount)
                .set(content).equalToWhenPresent(record::getContent);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7715461+07:00", comments="Source Table: other")
    default int updateByPrimaryKey(Other record) {
        return update(c ->
            c.set(judul).equalTo(record::getJudul)
            .set(url).equalTo(record::getUrl)
            .set(createdBy).equalTo(record::getCreatedBy)
            .set(createdAt).equalTo(record::getCreatedAt)
            .set(updatedBy).equalTo(record::getUpdatedBy)
            .set(updatedAt).equalTo(record::getUpdatedAt)
            .set(viewsCount).equalTo(record::getViewsCount)
            .set(content).equalTo(record::getContent)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7725458+07:00", comments="Source Table: other")
    default int updateByPrimaryKeySelective(Other record) {
        return update(c ->
            c.set(judul).equalToWhenPresent(record::getJudul)
            .set(url).equalToWhenPresent(record::getUrl)
            .set(createdBy).equalToWhenPresent(record::getCreatedBy)
            .set(createdAt).equalToWhenPresent(record::getCreatedAt)
            .set(updatedBy).equalToWhenPresent(record::getUpdatedBy)
            .set(updatedAt).equalToWhenPresent(record::getUpdatedAt)
            .set(viewsCount).equalToWhenPresent(record::getViewsCount)
            .set(content).equalToWhenPresent(record::getContent)
            .where(id, isEqualTo(record::getId))
        );
    }
}