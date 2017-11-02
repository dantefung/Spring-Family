package org.family.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.family.pojo.Motor;
import org.family.pojo.MotorKey;

public interface MotorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRAFFIC_MOTOR
     *
     * @mbggenerated Thu Nov 02 23:00:05 CST 2017
     */
    @Delete({
        "delete from TRAFFIC_MOTOR",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(MotorKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRAFFIC_MOTOR
     *
     * @mbggenerated Thu Nov 02 23:00:05 CST 2017
     */
    @Insert({
        "insert into TRAFFIC_MOTOR (ID, MOTOR_USERNAME, ",
        "MOTOR_MOBILE, MOTOR_CARDID, ",
        "MOTOR_PLATE_NUMBER, MOTOR_ENGINE, ",
        "MOTOR_TYPE, MOTOR_COLOR, ",
        "MOTOR_MODEL, IS_SCRAP, ",
        "IS_DELETE, CREAT_USER_ID, ",
        "CREAT_TIME, EDIT_USER_ID, ",
        "EDIT_TIME)",
        "values (#{id,jdbcType=INTEGER}, #{motorUsername,jdbcType=VARCHAR}, ",
        "#{motorMobile,jdbcType=VARCHAR}, #{motorCardid,jdbcType=VARCHAR}, ",
        "#{motorPlateNumber,jdbcType=VARCHAR}, #{motorEngine,jdbcType=VARCHAR}, ",
        "#{motorType,jdbcType=INTEGER}, #{motorColor,jdbcType=VARCHAR}, ",
        "#{motorModel,jdbcType=VARCHAR}, #{isScrap,jdbcType=CHAR}, ",
        "#{isDelete,jdbcType=CHAR}, #{creatUserId,jdbcType=INTEGER}, ",
        "#{creatTime,jdbcType=VARCHAR}, #{editUserId,jdbcType=INTEGER}, ",
        "#{editTime,jdbcType=VARCHAR})"
    })
    int insert(Motor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRAFFIC_MOTOR
     *
     * @mbggenerated Thu Nov 02 23:00:05 CST 2017
     */
    int insertSelective(Motor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRAFFIC_MOTOR
     *
     * @mbggenerated Thu Nov 02 23:00:05 CST 2017
     */
    @Select({
        "select",
        "ID, MOTOR_USERNAME, MOTOR_MOBILE, MOTOR_CARDID, MOTOR_PLATE_NUMBER, MOTOR_ENGINE, ",
        "MOTOR_TYPE, MOTOR_COLOR, MOTOR_MODEL, IS_SCRAP, IS_DELETE, CREAT_USER_ID, CREAT_TIME, ",
        "EDIT_USER_ID, EDIT_TIME",
        "from TRAFFIC_MOTOR",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Motor selectByPrimaryKey(MotorKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRAFFIC_MOTOR
     *
     * @mbggenerated Thu Nov 02 23:00:05 CST 2017
     */
    int updateByPrimaryKeySelective(Motor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRAFFIC_MOTOR
     *
     * @mbggenerated Thu Nov 02 23:00:05 CST 2017
     */
    @Update({
        "update TRAFFIC_MOTOR",
        "set MOTOR_USERNAME = #{motorUsername,jdbcType=VARCHAR},",
          "MOTOR_MOBILE = #{motorMobile,jdbcType=VARCHAR},",
          "MOTOR_CARDID = #{motorCardid,jdbcType=VARCHAR},",
          "MOTOR_PLATE_NUMBER = #{motorPlateNumber,jdbcType=VARCHAR},",
          "MOTOR_ENGINE = #{motorEngine,jdbcType=VARCHAR},",
          "MOTOR_TYPE = #{motorType,jdbcType=INTEGER},",
          "MOTOR_COLOR = #{motorColor,jdbcType=VARCHAR},",
          "MOTOR_MODEL = #{motorModel,jdbcType=VARCHAR},",
          "IS_SCRAP = #{isScrap,jdbcType=CHAR},",
          "IS_DELETE = #{isDelete,jdbcType=CHAR},",
          "CREAT_USER_ID = #{creatUserId,jdbcType=INTEGER},",
          "CREAT_TIME = #{creatTime,jdbcType=VARCHAR},",
          "EDIT_USER_ID = #{editUserId,jdbcType=INTEGER},",
          "EDIT_TIME = #{editTime,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Motor record);
}