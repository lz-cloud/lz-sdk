package com.wkclz.sdk.pojo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.wkclz.core.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Description: Create by Shrimp Generator
 * @author: wangkaicun @ current time
 * @table: demo_types (demo-全类型)
 */

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DemoTypes extends BaseModel {

    /**
     * ID
     */
    private Long id;

    /**
     * type_int
     */
    private Integer typeInt;

    /**
     * type_bigint
     */
    private Long typeBigint;

    /**
     * type_binary
     */
    private byte[] typeBinary;

    /**
     * type_bit
     */
    private Boolean typeBit;

    /**
     * type_blob
     */
    private byte[] typeBlob;

    /**
     * type_char
     */
    private String typeChar;

    /**
     * type_date
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date typeDate;

    /**
     * type_datetime
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date typeDatetime;

    /**
     * type_decimal
     */
    private BigDecimal typeDecimal;

    /**
     * type_double
     */
    private Double typeDouble;

    /**
     * type_float
     */
    private Float typeFloat;

    /**
     * type_geometry
     */
    private byte[] typeGeometry;

    /**
     * type_geometrycollection
     */
    private Object typeGeometrycollection;

    /**
     * type_integer
     */
    private Integer typeInteger;

    /**
     * type_json
     */
    private String typeJson;

    /**
     * type_linestring
     */
    private Object typeLinestring;

    /**
     * type_longblob
     */
    private byte[] typeLongblob;

    /**
     * type_longtext
     */
    private String typeLongtext;

    /**
     * type_mediumblob
     */
    private byte[] typeMediumblob;

    /**
     * type_mediumint
     */
    private Integer typeMediumint;

    /**
     * type_mediumtext
     */
    private String typeMediumtext;

    /**
     * type_multilinestring
     */
    private Object typeMultilinestring;

    /**
     * type_multipoint
     */
    private Object typeMultipoint;

    /**
     * type_multipolygon
     */
    private Object typeMultipolygon;

    /**
     * type_numeric
     */
    private BigDecimal typeNumeric;

    /**
     * type_point
     */
    private Object typePoint;

    /**
     * type_polygon
     */
    private Object typePolygon;

    /**
     * type_real
     */
    private Double typeReal;

    /**
     * type_text
     */
    private String typeText;

    /**
     * type_time
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date typeTime;

    /**
     * type_timestamp
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date typeTimestamp;

    /**
     * type_tinyblob
     */
    private byte[] typeTinyblob;

    /**
     * type_tinyint
     */
    private Byte typeTinyint;

    /**
     * type_tinytext
     */
    private String typeTinytext;

    /**
     * type_varbinary
     */
    private byte[] typeVarbinary;

    /**
     * type_varchar
     */
    private String typeVarchar;

    /**
     * type_year
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date typeYear;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 可用状态
     */
    private Integer enableFlag;

    /**
     * 可用开始
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date enableBegin;

    /**
     * 可用结束
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date enableEnd;

    /**
     * 创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 备注
     */
    private String comments;

    /**
     * 版本号
     */
    private Integer version;


    public static DemoTypes copy(DemoTypes source, DemoTypes target){
        if (target == null ){ target = new DemoTypes();}
        if (source == null){ return target; }
        target.setId(source.getId());
        target.setTypeInt(source.getTypeInt());
        target.setTypeBigint(source.getTypeBigint());
        target.setTypeBinary(source.getTypeBinary());
        target.setTypeBit(source.getTypeBit());
        target.setTypeBlob(source.getTypeBlob());
        target.setTypeChar(source.getTypeChar());
        target.setTypeDate(source.getTypeDate());
        target.setTypeDatetime(source.getTypeDatetime());
        target.setTypeDecimal(source.getTypeDecimal());
        target.setTypeDouble(source.getTypeDouble());
        target.setTypeFloat(source.getTypeFloat());
        target.setTypeGeometry(source.getTypeGeometry());
        target.setTypeGeometrycollection(source.getTypeGeometrycollection());
        target.setTypeInteger(source.getTypeInteger());
        target.setTypeJson(source.getTypeJson());
        target.setTypeLinestring(source.getTypeLinestring());
        target.setTypeLongblob(source.getTypeLongblob());
        target.setTypeLongtext(source.getTypeLongtext());
        target.setTypeMediumblob(source.getTypeMediumblob());
        target.setTypeMediumint(source.getTypeMediumint());
        target.setTypeMediumtext(source.getTypeMediumtext());
        target.setTypeMultilinestring(source.getTypeMultilinestring());
        target.setTypeMultipoint(source.getTypeMultipoint());
        target.setTypeMultipolygon(source.getTypeMultipolygon());
        target.setTypeNumeric(source.getTypeNumeric());
        target.setTypePoint(source.getTypePoint());
        target.setTypePolygon(source.getTypePolygon());
        target.setTypeReal(source.getTypeReal());
        target.setTypeText(source.getTypeText());
        target.setTypeTime(source.getTypeTime());
        target.setTypeTimestamp(source.getTypeTimestamp());
        target.setTypeTinyblob(source.getTypeTinyblob());
        target.setTypeTinyint(source.getTypeTinyint());
        target.setTypeTinytext(source.getTypeTinytext());
        target.setTypeVarbinary(source.getTypeVarbinary());
        target.setTypeVarchar(source.getTypeVarchar());
        target.setTypeYear(source.getTypeYear());
        target.setSort(source.getSort());
        target.setEnableFlag(source.getEnableFlag());
        target.setEnableBegin(source.getEnableBegin());
        target.setEnableEnd(source.getEnableEnd());
        target.setCreateTime(source.getCreateTime());
        target.setComments(source.getComments());
        target.setVersion(source.getVersion());
        return target;
    }

    public static DemoTypes copyIfNotNull(DemoTypes source, DemoTypes target){
        if (target == null ){ target = new DemoTypes();}
        if (source == null){ return target; }
        if (source.getId() != null){ target.setId(source.getId()); }
        if (source.getTypeInt() != null){ target.setTypeInt(source.getTypeInt()); }
        if (source.getTypeBigint() != null){ target.setTypeBigint(source.getTypeBigint()); }
        if (source.getTypeBinary() != null){ target.setTypeBinary(source.getTypeBinary()); }
        if (source.getTypeBit() != null){ target.setTypeBit(source.getTypeBit()); }
        if (source.getTypeBlob() != null){ target.setTypeBlob(source.getTypeBlob()); }
        if (source.getTypeChar() != null){ target.setTypeChar(source.getTypeChar()); }
        if (source.getTypeDate() != null){ target.setTypeDate(source.getTypeDate()); }
        if (source.getTypeDatetime() != null){ target.setTypeDatetime(source.getTypeDatetime()); }
        if (source.getTypeDecimal() != null){ target.setTypeDecimal(source.getTypeDecimal()); }
        if (source.getTypeDouble() != null){ target.setTypeDouble(source.getTypeDouble()); }
        if (source.getTypeFloat() != null){ target.setTypeFloat(source.getTypeFloat()); }
        if (source.getTypeGeometry() != null){ target.setTypeGeometry(source.getTypeGeometry()); }
        if (source.getTypeGeometrycollection() != null){ target.setTypeGeometrycollection(source.getTypeGeometrycollection()); }
        if (source.getTypeInteger() != null){ target.setTypeInteger(source.getTypeInteger()); }
        if (source.getTypeJson() != null){ target.setTypeJson(source.getTypeJson()); }
        if (source.getTypeLinestring() != null){ target.setTypeLinestring(source.getTypeLinestring()); }
        if (source.getTypeLongblob() != null){ target.setTypeLongblob(source.getTypeLongblob()); }
        if (source.getTypeLongtext() != null){ target.setTypeLongtext(source.getTypeLongtext()); }
        if (source.getTypeMediumblob() != null){ target.setTypeMediumblob(source.getTypeMediumblob()); }
        if (source.getTypeMediumint() != null){ target.setTypeMediumint(source.getTypeMediumint()); }
        if (source.getTypeMediumtext() != null){ target.setTypeMediumtext(source.getTypeMediumtext()); }
        if (source.getTypeMultilinestring() != null){ target.setTypeMultilinestring(source.getTypeMultilinestring()); }
        if (source.getTypeMultipoint() != null){ target.setTypeMultipoint(source.getTypeMultipoint()); }
        if (source.getTypeMultipolygon() != null){ target.setTypeMultipolygon(source.getTypeMultipolygon()); }
        if (source.getTypeNumeric() != null){ target.setTypeNumeric(source.getTypeNumeric()); }
        if (source.getTypePoint() != null){ target.setTypePoint(source.getTypePoint()); }
        if (source.getTypePolygon() != null){ target.setTypePolygon(source.getTypePolygon()); }
        if (source.getTypeReal() != null){ target.setTypeReal(source.getTypeReal()); }
        if (source.getTypeText() != null){ target.setTypeText(source.getTypeText()); }
        if (source.getTypeTime() != null){ target.setTypeTime(source.getTypeTime()); }
        if (source.getTypeTimestamp() != null){ target.setTypeTimestamp(source.getTypeTimestamp()); }
        if (source.getTypeTinyblob() != null){ target.setTypeTinyblob(source.getTypeTinyblob()); }
        if (source.getTypeTinyint() != null){ target.setTypeTinyint(source.getTypeTinyint()); }
        if (source.getTypeTinytext() != null){ target.setTypeTinytext(source.getTypeTinytext()); }
        if (source.getTypeVarbinary() != null){ target.setTypeVarbinary(source.getTypeVarbinary()); }
        if (source.getTypeVarchar() != null){ target.setTypeVarchar(source.getTypeVarchar()); }
        if (source.getTypeYear() != null){ target.setTypeYear(source.getTypeYear()); }
        if (source.getSort() != null){ target.setSort(source.getSort()); }
        if (source.getEnableFlag() != null){ target.setEnableFlag(source.getEnableFlag()); }
        if (source.getEnableBegin() != null){ target.setEnableBegin(source.getEnableBegin()); }
        if (source.getEnableEnd() != null){ target.setEnableEnd(source.getEnableEnd()); }
        if (source.getCreateTime() != null){ target.setCreateTime(source.getCreateTime()); }
        if (source.getComments() != null){ target.setComments(source.getComments()); }
        if (source.getVersion() != null){ target.setVersion(source.getVersion()); }
        return target;
    }

}
