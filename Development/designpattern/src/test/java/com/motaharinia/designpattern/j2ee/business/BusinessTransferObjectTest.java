package com.motaharinia.designpattern.j2ee.business;

import com.motaharinia.designpattern.j2ee.business.transfereobject.StudentBO;
import com.motaharinia.designpattern.j2ee.business.transfereobject.StudentVO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.tutorialspoint.com/design_pattern/transfer_object_pattern.htm
//The Transfer Object pattern is used when we want to pass data with multiple attributes in one shot from client to server.
//Transfer object is also known as Value Object. Transfer Object is a simple POJO class having getter/setter methods and is serializable so that it can be transferred over the network.
//It does not have any behavior. Server Side business class normally fetches data from the database and fills the POJO and send it to the client or pass it by value. For client, transfer object is read-only.
//Client can create its own transfer object and pass it to server to update values in database in one shot. Following are the entities of this type of design pattern.
//الگوی انتقال شیء زمانی مورد استفاده قرار می گیرد كه می خواهیم داده ها را با چند ویژگی در یك شات از مشتری به سرور منتقل كنیم.
//انتقال شی نیز به عنوان Value Object شناخته می شود. Object Transfer یک کلاس ساده POJO(Plain Old Java Object) است که دارای روش های getter و setter است و به صورت سریال قابل تنظیم است به طوری که می تواند از طریق شبکه منتقل شود.
//هیچ رفتاری ندارد. کلاس تجاری Business Side معمولاً داده ها را از پایگاه داده می گیرد و POJO را پر می کند و به مشتری می فرستد یا آن را با ارزش منتقل می کند. برای مشتری ، شیء انتقال فقط خواندنی است.
//مشتری می تواند هدف انتقال خود را ایجاد کرده و آن را به سرور منتقل کند تا مقادیر موجود در پایگاه داده را با یک ضربه به روز کند. در زیر اشخاصی از این نوع الگوی طراحی آورده شده است.
public class BusinessTransferObjectTest {

    //سرویس بیزینس
    StudentBO studentBusinessObject ;


    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        studentBusinessObject = new StudentBO();
    }


    /**
     * این متد قابلیت ویرایش J2ee Transfer Object Design Pattern را تست میکند
     */
    @Test
    void j2eeTransferObjectUpdateTest() {
        StudentVO student = studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        student = studentBusinessObject.getAllStudents().get(0);
        Assertions.assertEquals("Michael", student.getName());
    }

}
