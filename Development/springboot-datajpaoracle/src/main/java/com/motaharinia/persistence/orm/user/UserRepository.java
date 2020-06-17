package com.motaharinia.persistence.orm.user;

import com.motaharinia.business.service.SearchRowViewUserBrief;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import th.co.geniustree.springdata.jpa.repository.JpaSpecificationExecutorWithProjection;

import java.util.List;

//https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
//https://attacomsian.com/blog/spring-data-jpa-specifications
//https://github.com/pramoth/specification-with-projection

@Repository
public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {



    List<SearchRowViewUserBrief> findAllUserByFirstName(String firstName);
//    List<GridDataRowUserBriefView> readBriefView(String firstName);

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
