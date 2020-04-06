package com.covid.dashboard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert; import
org.apache.ibatis.annotations.Options; import
org.apache.ibatis.annotations.Result; import
org.apache.ibatis.annotations.Results; import
org.apache.ibatis.annotations.Select;

import com.covid.dashboard.domain.User;


public interface UserMapper {

@Insert("INSERT INTO USER(COUNTRY, TOTAL_CASES, NEW_CASES, TOTAL_DEATHS, NEW_DEATHS, TOTAL_RECOVERED, ACTIVE_CASES, SERIOUS, TOT_CASES_POP,DEATHS_POP,REPORTED_1ST_CASE) "
+
"VALUES(#{country}, #{totalCases}, #{newCases}, #{totalDeaths}, #{newDeaths}, #{totalRecovered}, #{activeCases}, #{serious}, #{totCasesPop},#{deathsPop}, #{reported1stCase})"
)

@Options(useGeneratedKeys = true, keyProperty = "userId") public void
insertUser(User user);

@Select("SELECT * FROM USER")

@Results({ @Result(property = "country", column = "COUNTRY"),

@Result(property = "totalCases", column = "TOTAL_CASES"),

@Result(property = "newCases", column = "NEW_CASES"),

@Result(property = "totalDeaths", column = "TOTAL_DEATHS"),

@Result(property = "newDeaths", column = "NEW_DEATHS"),

@Result(property = "totalRecovered", column = "TOTAL_RECOVERED"),

@Result(property = "activeCases", column = "ACTIVE_CASES"),

@Result(property = "serious", column = "SERIOUS"),

@Result(property = "totCasesPop", column = "TOTAL-CASES_POP"),

@Result(property = "deathsPop", column = "DEATHS_POP"),

@Result(property = "reported1stCase", column = "REPORTED_1ST_CASE")}) public
List<User> getAllUsers();

}
