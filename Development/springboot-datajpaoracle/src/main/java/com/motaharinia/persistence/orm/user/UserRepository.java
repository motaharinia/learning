package com.motaharinia.persistence.orm.user;

import com.motaharinia.business.service.UserGrid1View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    @Query("select u from User u where u.firstName = ?1")
//    List<UserGrid1View> findUserByFirstName(String firstName);

//    User findUserByUsername(String username);
//    User findUserById(Integer id);
//    List<User> findAllBy


//    @Query("select lo.startDate,count(*) from LoanOffer lo where lo.loan.fsp= :fsp and lo.startDate between :fromDate and :toDate Group by lo.startDate")
//    public List<Object[]> getLastMonthLoans(@Param("fsp")Fsp fsp,@Param("fromDate")LocalDate fromDate,@Param("toDate") LocalDate toDate);


    @Query("select obj.firstName,obj.lastName from User obj where obj.firstName= :firstName")
    public List<Object[]> f1(@Param("firstName")String firstName);

    public User findByLastNameLikeAndFirstNameStartingWith(String lastName,String firstName);

    public List<User> findAllByLastNameLikeAndFirstNameStartingWith(String lastName,String firstName);

}
