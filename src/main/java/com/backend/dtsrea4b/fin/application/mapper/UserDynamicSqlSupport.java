package com.backend.dtsrea4b.fin.application.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7555462+07:00", comments="Source Table: user")
    public static final User user = new User();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7555462+07:00", comments="Source field: user.id")
    public static final SqlColumn<Integer> id = user.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7555462+07:00", comments="Source field: user.username")
    public static final SqlColumn<String> username = user.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7555462+07:00", comments="Source field: user.password")
    public static final SqlColumn<String> password = user.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7565465+07:00", comments="Source field: user.createdby")
    public static final SqlColumn<String> createdby = user.createdby;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7565465+07:00", comments="Source field: user.createdAt")
    public static final SqlColumn<Date> createdAt = user.createdAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7565465+07:00", comments="Source field: user.updatedby")
    public static final SqlColumn<String> updatedby = user.updatedby;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7565465+07:00", comments="Source field: user.updatedAt")
    public static final SqlColumn<Date> updatedAt = user.updatedAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-27T07:22:31.7555462+07:00", comments="Source Table: user")
    public static final class User extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> createdby = column("createdby", JDBCType.VARCHAR);

        public final SqlColumn<Date> createdAt = column("createdAt", JDBCType.TIMESTAMP);

        public final SqlColumn<String> updatedby = column("updatedby", JDBCType.VARCHAR);

        public final SqlColumn<Date> updatedAt = column("updatedAt", JDBCType.TIMESTAMP);

        public User() {
            super("user");
        }
    }
}