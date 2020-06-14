package com.motaharinia.persistence.orm.user;

import com.motaharinia.business.service.GridViewUser1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<GridViewUser1> findAllUserByFirstName(String firstName);

//    User findUserByUsername(String username);
//    User findUserById(Integer id);
//    List<User> findAllBy


//    @Query("select lo.startDate,count(*) from LoanOffer lo where lo.loan.fsp= :fsp and lo.startDate between :fromDate and :toDate Group by lo.startDate")
//    public List<Object[]> getLastMonthLoans(@Param("fsp")Fsp fsp,@Param("fromDate")LocalDate fromDate,@Param("toDate") LocalDate toDate);


//    @Transactional(timeout = 10)


    @Query("select obj.id,obj.firstName,obj.lastName from User obj where obj.firstName= :firstName")
    public List<Object[]> listGrid(@Param("firstName")String firstName);

    public User findByLastNameLikeAndFirstNameStartingWith(String lastName,String firstName);

    public List<User> findAllByLastNameLikeAndFirstNameStartingWith(String lastName,String firstName);



}
