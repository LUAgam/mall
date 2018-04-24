package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallIssue;
import org.linlinjava.litemall.db.domain.LitemallIssueExample;

public interface LitemallIssueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    long countByExample(LitemallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int deleteByExample(LitemallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int insert(LitemallIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int insertSelective(LitemallIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    List<LitemallIssue> selectByExample(LitemallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallIssue> selectByExampleSelective(@Param("example") LitemallIssueExample example, @Param("selective") LitemallIssue.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    LitemallIssue selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallIssue selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallIssue.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int updateByExampleSelective(@Param("record") LitemallIssue record, @Param("example") LitemallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int updateByExample(@Param("record") LitemallIssue record, @Param("example") LitemallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int updateByPrimaryKeySelective(LitemallIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int updateByPrimaryKey(LitemallIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallIssue selectOneByExample(LitemallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallIssue selectOneByExampleSelective(@Param("example") LitemallIssueExample example, @Param("selective") LitemallIssue.Column ... selective);
}