package org.linlinjava.litemall.db.domain;

public class LitemallIssue {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_issue.id
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_issue.question
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    private String question;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_issue.answer
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    private String answer;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_issue.id
     *
     * @return the value of litemall_issue.id
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_issue.id
     *
     * @param id the value for litemall_issue.id
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_issue.question
     *
     * @return the value of litemall_issue.question
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    public String getQuestion() {
        return question;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_issue.question
     *
     * @param question the value for litemall_issue.question
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_issue.answer
     *
     * @return the value of litemall_issue.answer
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_issue.answer
     *
     * @param answer the value for litemall_issue.answer
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", question=").append(question);
        sb.append(", answer=").append(answer);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
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
        LitemallIssue other = (LitemallIssue) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getQuestion() == null ? other.getQuestion() == null : this.getQuestion().equals(other.getQuestion()))
            && (this.getAnswer() == null ? other.getAnswer() == null : this.getAnswer().equals(other.getAnswer()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_issue
     *
     * @mbg.generated Wed May 02 15:25:52 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getQuestion() == null) ? 0 : getQuestion().hashCode());
        result = prime * result + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_issue
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        question("question"),
        answer("answer");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_issue
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_issue
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_issue
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_issue
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_issue
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_issue
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}