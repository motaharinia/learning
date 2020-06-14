package com.motaharinia.msutility.grid.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.motaharinia.msutility.grid.filter.GridFilterModel;
import org.junit.jupiter.api.*;

import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-14
 * Time: 20:49:58
 * Description: کلاس تست GridDataModel
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GridDataModelTests {

    private final ObjectMapper mapper = new ObjectMapper();
    
    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {

    }

    @Order(1)
    @Test
    void deserializeTest() throws Exception {
        Locale.setDefault(new Locale("fa"));
        String json = "{" +
                "  'page': 1," +
                "  'records': 2," +
                "  'rows': [" +
                "    {" +
                "      'id': 373075," +
                "      'cell': [373075, 294, 'PO122423', '1399/02/02', '1399/02/02', 'در حال بررسی', 'CHECKING', '1399/02/02', 396595]" +
                "    }," +
                "    {" +
                "      'id': 368816," +
                "      'cell': [368816, 294, 'PO118154', '1398/12/19', '1398/12/19', 'تکمیل فرآیند خرید', 'COMPLETE_ORDER', '1398/12/19', 801815]" +
                "    }" +
                "  ]," +
                "  'total': 1," +
                "  'userdata': ''" +
                "}";
        GridDataModel gridDataModel = mapper.readValue(json.replaceAll("'","\""), GridDataModel.class);
        assertThat(gridDataModel.getPage()).isEqualTo(1);
    }
}
