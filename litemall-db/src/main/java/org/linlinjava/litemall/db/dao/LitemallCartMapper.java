package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallCart;
import org.linlinjava.litemall.db.domain.LitemallCartExample;

public interface LitemallCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_cart
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    long countByExample(LitemallCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_cart
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int deleteByExample(LitemallCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_cart
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_cart
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int insert(LitemallCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_cart
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int insertSelective(LitemallCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_cart
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    List<LitemallCart> selectByExample(LitemallCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_cart
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallCart> selectByExampleSelective(@Param("example") LitemallCartExample example, @Param("selective") LitemallCart.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_cart
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    LitemallCart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_cart
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallCart selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallCart.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_cart
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int updateByExampleSelective(@Param("record") LitemallCart record, @Param("example") LitemallCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_cart
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int updateByExample(@Param("record") LitemallCart record, @Param("example") LitemallCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_cart
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int updateByPrimaryKeySelective(LitemallCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_cart
     *
     * @mbg.generated Tue Apr 24 16:58:38 CST 2018
     */
    int updateByPrimaryKey(LitemallCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_cart
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallCart selectOneByExample(LitemallCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_cart
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallCart selectOneByExampleSelective(@Param("example") LitemallCartExample example, @Param("selective") LitemallCart.Column ... selective);
}