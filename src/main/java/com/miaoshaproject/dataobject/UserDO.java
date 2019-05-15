package com.miaoshaproject.dataobject;

public class UserDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.id
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.name
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.gender
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    private Boolean gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.age
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.telphone
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    private String telphone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.regisit_mode
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    private String regisitMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.third_party_id
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    private Integer thirdPartyId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.id
     *
     * @return the value of user_info.id
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.id
     *
     * @param id the value for user_info.id
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.name
     *
     * @return the value of user_info.name
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.name
     *
     * @param name the value for user_info.name
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.gender
     *
     * @return the value of user_info.gender
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.gender
     *
     * @param gender the value for user_info.gender
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.age
     *
     * @return the value of user_info.age
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.age
     *
     * @param age the value for user_info.age
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.telphone
     *
     * @return the value of user_info.telphone
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.telphone
     *
     * @param telphone the value for user_info.telphone
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.regisit_mode
     *
     * @return the value of user_info.regisit_mode
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    public String getRegisitMode() {
        return regisitMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.regisit_mode
     *
     * @param regisitMode the value for user_info.regisit_mode
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    public void setRegisitMode(String regisitMode) {
        this.regisitMode = regisitMode == null ? null : regisitMode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.third_party_id
     *
     * @return the value of user_info.third_party_id
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    public Integer getThirdPartyId() {
        return thirdPartyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.third_party_id
     *
     * @param thirdPartyId the value for user_info.third_party_id
     *
     * @mbg.generated Wed May 15 17:05:51 CST 2019
     */
    public void setThirdPartyId(Integer thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }
}