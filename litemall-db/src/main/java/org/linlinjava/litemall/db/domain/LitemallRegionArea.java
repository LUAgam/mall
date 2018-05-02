package org.linlinjava.litemall.db.domain;

public class LitemallRegionArea {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_region_area.code
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    private Integer code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_region_area.name
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_region_area.city_code
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    private Integer cityCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_region_area.province_code
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    private Integer provinceCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_region_area.code
     *
     * @return the value of litemall_region_area.code
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    public Integer getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_region_area.code
     *
     * @param code the value for litemall_region_area.code
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_region_area.name
     *
     * @return the value of litemall_region_area.name
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_region_area.name
     *
     * @param name the value for litemall_region_area.name
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_region_area.city_code
     *
     * @return the value of litemall_region_area.city_code
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    public Integer getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_region_area.city_code
     *
     * @param cityCode the value for litemall_region_area.city_code
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_region_area.province_code
     *
     * @return the value of litemall_region_area.province_code
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    public Integer getProvinceCode() {
        return provinceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_region_area.province_code
     *
     * @param provinceCode the value for litemall_region_area.province_code
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_area
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", provinceCode=").append(provinceCode);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_area
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LitemallRegionArea other = (LitemallRegionArea) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCityCode() == null ? other.getCityCode() == null : this.getCityCode().equals(other.getCityCode()))
            && (this.getProvinceCode() == null ? other.getProvinceCode() == null : this.getProvinceCode().equals(other.getProvinceCode()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_area
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCityCode() == null) ? 0 : getCityCode().hashCode());
        result = prime * result + ((getProvinceCode() == null) ? 0 : getProvinceCode().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_region_area
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        code("code"),
        name("name"),
        cityCode("city_code"),
        provinceCode("province_code");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_region_area
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_region_area
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_region_area
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_region_area
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_region_area
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_region_area
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}