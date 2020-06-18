package com.motaharinia.persistence.orm.adminuser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.co.geniustree.springdata.jpa.repository.JpaSpecificationExecutorWithProjection;

//https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
//https://attacomsian.com/blog/spring-data-jpa-specifications
//https://github.com/pramoth/specification-with-projection
//https://stackoverflow.com/questions/22171822/spring-data-jpa-specification-to-select-specific-columns

@Repository
public interface AdminUserRepository2 extends JpaRepository<AdminUser, Integer>, JpaSpecificationExecutorWithProjection<AdminUser> {

}