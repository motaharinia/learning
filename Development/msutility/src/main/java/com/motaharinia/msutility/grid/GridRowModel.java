
package com.motaharinia.msutility.grid;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-12
 * Time: 01:05:58
 * Description: این کلاس اطلاعاتی از هر یک از سطزهای گرید ارائه میکند
 */
@JsonSerialize
public class GridRowModel implements Serializable {

    private Integer id;
    private Object[] cell;

    public GridRowModel(Integer id, Object[] cell) {
        this.id = id;
        this.cell = cell;
    }


    @Override
    public String toString() {
        return "GridRow{" + "id=" + id.toString() + ", cell=" + Arrays.asList(cell).toString() + '}';
    }


    //getter-setter:
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object[] getCell() {
        return cell;
    }

    public void setCell(Object[] cell) {
        this.cell = cell;
    }
}
