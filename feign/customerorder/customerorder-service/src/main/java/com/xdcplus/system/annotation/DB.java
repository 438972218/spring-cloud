package com.xdcplus.system.annotation;



import com.xdcplus.system.common.enums.DataSourceType;

import java.lang.annotation.*;

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DB
{
    /**
     * 切换数据源名称
     */
     DataSourceType value() default DataSourceType.DB1;
}
