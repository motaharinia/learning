package com.motaharinia.persistence.orm.adminuserorganizationunit;

import com.motaharinia.persistence.orm.adminusercontact.AdminUserContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.co.geniustree.springdata.jpa.repository.JpaSpecificationExecutorWithProjection;

import java.util.List;

//https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
//https://attacomsian.com/blog/spring-data-jpa-specifications
//https://github.com/pramoth/specification-with-projection
//https://stackoverflow.com/questions/22171822/spring-data-jpa-specification-to-select-specific-columns

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 *  کلاس ریپازیتوری اطلاعات تماس ادمین
 */
@Repository
public interface AdminUserOrganizationUnitRepository extends JpaRepository<AdminUserOrganizationUnit, Integer>, JpaSpecificationExecutorWithProjection<AdminUserOrganizationUnit> {
 List<AdminUserOrganizationUnit> findAllByParent(AdminUserOrganizationUnit adminUserOrganizationUnit);
}
