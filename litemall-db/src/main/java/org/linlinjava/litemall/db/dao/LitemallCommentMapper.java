package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallComment;
import org.linlinjava.litemall.db.domain.LitemallCommentExample;

public interface LitemallCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    long countByExample(LitemallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    int deleteByExample(LitemallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    int insert(LitemallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    int insertSelective(LitemallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    List<LitemallComment> selectByExample(LitemallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallComment> selectByExampleSelective(@Param("example") LitemallCommentExample example, @Param("selective") LitemallComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    LitemallComment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallComment selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") LitemallComment record, @Param("example") LitemallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    int updateByExample(@Param("record") LitemallComment record, @Param("example") LitemallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    int updateByPrimaryKeySelective(LitemallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    int updateByPrimaryKey(LitemallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallComment selectOneByExample(LitemallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallComment selectOneByExampleSelective(@Param("example") LitemallCommentExample example, @Param("selective") LitemallComment.Column ... selective);
}