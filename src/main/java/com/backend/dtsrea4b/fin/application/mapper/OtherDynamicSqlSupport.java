package com.backend.dtsrea4b.fin.application.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OtherDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5704713+07:00", comments="Source Table: other")
    public static final Other other = new Other();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5704713+07:00", comments="Source field: other.id")
    public static final SqlColumn<Integer> id = other.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5704713+07:00", comments="Source field: other.judul")
    public static final SqlColumn<String> judul = other.judul;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5704713+07:00", comments="Source field: other.url")
    public static final SqlColumn<String> url = other.url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5704713+07:00", comments="Source field: other.createdBy")
    public static final SqlColumn<String> createdBy = other.createdBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5704713+07:00", comments="Source field: other.createdAt")
    public static final SqlColumn<Date> createdAt = other.createdAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5704713+07:00", comments="Source field: other.updatedBy")
    public static final SqlColumn<String> updatedBy = other.updatedBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5704713+07:00", comments="Source field: other.updatedAt")
    public static final SqlColumn<Date> updatedAt = other.updatedAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5704713+07:00", comments="Source field: other.content")
    public static final SqlColumn<String> content = other.content;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T06:33:53.5704713+07:00", comments="Source Table: other")
    public static final class Other extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> judul = column("judul", JDBCType.VARCHAR);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<String> createdBy = column("createdBy", JDBCType.VARCHAR);

        public final SqlColumn<Date> createdAt = column("createdAt", JDBCType.TIMESTAMP);

        public final SqlColumn<String> updatedBy = column("updatedBy", JDBCType.VARCHAR);

        public final SqlColumn<Date> updatedAt = column("updatedAt", JDBCType.TIMESTAMP);

        public final SqlColumn<String> content = column("content", JDBCType.LONGVARCHAR);

        public Other() {
            super("other");
        }
    }
}