package com.motaharinia.msutility.search;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.motaharinia.msutility.annotation.SpringDataColumn;
import com.motaharinia.msutility.search.data.SearchDataColAlignEnum;

public interface SearchRowView {

    Integer getId();
    String toOut();

}
