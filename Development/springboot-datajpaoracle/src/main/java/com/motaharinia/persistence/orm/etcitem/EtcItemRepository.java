package com.motaharinia.persistence.orm.etcitem;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
 * کلاس ریپازیتوری مقادیر ثابت
 */
@Repository
public interface EtcItemRepository extends JpaRepository<EtcItem, Integer>, JpaSpecificationExecutorWithProjection<EtcItem> {
    EtcItem findByValueAndType(String value, String type);

    EtcItem findByValueAndTypeAndTypeTag(String value, String type, String typeTag);

    List<EtcItem> findAllByTypeTag(String typeTag);

    Long countByTypeEquals(String type);

    @Query(value = "SELECT obj.id,obj.langKey,obj.value FROM EtcItem obj WHERE obj.type= :type and obj.invalid= :invalid and obj.hidden= :hidden")
    List<Object[]> arrayListCustomCombo(@Param("type") String type, @Param("invalid") Boolean invalid, @Param("hidden") Boolean hidden, Pageable pageable);
}
