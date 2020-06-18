package com.motaharinia.msutility.search.filter;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-16<br>
 * Time: 23:09:56<br>
 * Description:<br>
 *     مقادیر ثابت عملیات شرط گذاری بر روی جستجوی پیشرفته
 */
public enum SearchFilterOperationEnum {

    /**
     * بزرگتر از
     */
    GREATER_THAN("GREATER_THAN"),
    /**
     * کوچکتر از
     */
    LESS_THAN("LESS_THAN"),
    /**
     * بزرگتر مساوی
     */
    GREATER_THAN_EQUAL("GREATER_THAN_EQUAL"),
    /**
     * کوچکتر مساوی
     */
    LESS_THAN_EQUAL("LESS_THAN_EQUAL"),
    /**
     * مساوی نباشد با
     */
    NOT_EQUAL("NOT_EQUAL"),
    /**
     * مساوی باشد با
     */
    EQUAL("EQUAL"),
    /**
     * تطبیق داشته باشد با
     */
    MATCH("MATCH"),
    /**
     * با ابتدای عبارت تطبیق داشته باشد
     */
    MATCH_START("MATCH_START"),
    /**
     * با انتهای عبارت تطبیق داشته باشد
     */
    MATCH_END("MATCH_END"),
    /**
     * در بین یکی از گزینه ها باشد
     */
    IN("IN"),
    /**
     * در بین هیچ یک از گزینه ها نباشد
     */
    NOT_IN("NOT_IN");

    private final String value;

    private SearchFilterOperationEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return super.toString();
    }
}
