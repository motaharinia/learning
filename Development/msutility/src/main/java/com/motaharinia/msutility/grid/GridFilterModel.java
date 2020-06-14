package com.motaharinia.msutility.grid;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *این کلاس برای ارسال اطلاعات فیلترینگ از گرید کلاینت به سمت سرور جهت فیلترکردن و صفحه بندی کردن اطلاعات گرید استفاده میگردد
 * @author Administrator
 */
public class GridFilterModel implements Serializable {

    //شماره صفحه دلخواه کلاینت از اطلاعات صفحه بندی شده در سرور
    //این عدد صفحه از سمت کلاینت در لود اولیه گرید با عدد یک شروع میشود و با اسکرول کردن گرید به سمت پایین این عدد افزایش می یابد
    private Integer page;
    //تعداد سطر مورد نیاز در هر صفحه از صفحه بندی
    //برای مثال در پروژه ما این مقدار را روی عدد ده گذاشته ایم که در هر صفحه اطلاعات ده سطر توسط سرور ارسال گردد
    private Integer rows;
    
    //نام فیلدها و نوع مرتب سازی هر فیلد در این  فیلد و فیلد بعدی می آید
    //ordering = sidx + sord fileds
    //example: (nationalcode asc,family desc) => sidx:(nationalcode asc,family) , sord:(desc)
    //مثلا: nationalcode asc,family
    private String sidx;
    private String sord;
    
    //تمام فیلترهایی که برای ستونهای گرید در جستجوی ساده و در جستجوی پیشرفته گریدهای بک انجام میشود
    //در قالب یک رشته جیسون در این فیلد از سمت کلاینت به سرور ارسال میگردد
    private String filters;
    
    //نشان میدهد که آیا در گرید جستجویی انجام شده است یا خیر
    private Boolean search;
    
    //زمان به میلی ثانیه که برای جلوگیری از کش شدن اطلاعات توسط مرورگر پر میشود
    private Long nd;
    
    //بدون استفاده
    private String searchField;
    private String searchOper;
    private String searchString;
    
    //لیستی از اطلاعات ستونهای گرید را در خود دارد
    private List<GridColModel> pageGridColModelList;
    
    //این فیلد توسط توسعه دهندگان زمانی پر میشود که میخواهند همیشه در حالت غیر فیلتر کلاینت و در حالت فیلتر کلاینت به کوئری گرید یکسری فیلترهای همیشگی اعمال گردد
    private String restrictionJpqlString;
    
    //ترکیب این دو فیلد به این جهت است که به متد لیست گرید خودمان با پارامترزمود و لیست پارامترهای ارسالی از سمت کلاینت تیپ بدهیم
    //و یک متد لیست گرید در سرویس نسبت به تیپهای مختلف حالتهای مختلفی از داده را برای گرید ارسال کند
    //برای نمونه یک متد لیست گرید در سرویس اعضا نوشته باشیم که با پارامترزمورد اول و چند مقدار پارامتر ورودی اعضای خانم را در گرید نمایش دهد
    //و با پارامترزمود دیگر و لیست پارامترهای ورودی دیگر اعضای راهنما را در گرید نمایش دهد
    private List<Object> parameters;
    private String parametersMode;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    //This cunstructor used for detect smart rendering 
    public GridFilterModel(List<GridColModel> pageGridColModelList) {
        this.nd = (long) 0;
        this.page = 1;
        this.pageGridColModelList = pageGridColModelList;
        this.rows = 1;
        this.search = false;
        this.sidx = "";
        this.sord = "asc";
    }

    public GridFilterModel() {

    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getSidx() {
        return sidx;
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }

    public String getSord() {
        return sord;
    }

    public void setSord(String sord) {
        this.sord = sord;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public Boolean getSearch() {
        return search;
    }

    public void setSearch(Boolean search) {
        this.search = search;
    }

    public Long getNd() {
        return nd;
    }

    public void setNd(Long nd) {
        this.nd = nd;
    }

    public String getSearchField() {
        return searchField;
    }

    public void setSearchField(String searchField) {
        this.searchField = searchField;
    }

    public String getSearchOper() {
        return searchOper;
    }

    public void setSearchOper(String searchOper) {
        this.searchOper = searchOper;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public List<GridColModel> getPageGridColModelList() {
        return pageGridColModelList;
    }

    public void setPageGridColModelList(List<GridColModel> pageGridColModelList) {
        this.pageGridColModelList = pageGridColModelList;
    }

    public String getRestrictionJpqlString() {
        return restrictionJpqlString;
    }

    public void setRestrictionJpqlString(String restrictionJpqlString) {
        this.restrictionJpqlString = restrictionJpqlString;
    }

    public List<Object> getParameters() {
        return parameters;
    }

    public void setParameters(List<Object> parameters) {
        this.parameters = parameters;
    }

    public String getParametersMode() {
        return parametersMode;
    }

    public void setParametersMode(String parametersMode) {
        this.parametersMode = parametersMode;
    }

    @Override
    public String toString() {
        return "GridFilter{" + "page=" + page + ", rows=" + rows + ", sidx=" + sidx + ", sord=" + sord + ", filters=" + filters + ", search=" + search + ", nd=" + nd + ", searchField=" + searchField + ", searchOper=" + searchOper + ", searchString=" + searchString + ", pageGridColModelList=" + pageGridColModelList + ", restrictionJpqlString=" + restrictionJpqlString + '}';
    }

    public static String encryptParametersMode(String parametersMode, String ipAsKey) {
        try {
            //secretKey must be 16 character
            String secretKey = "65a4f+6a5s4df+6a";
            IvParameterSpec iv = new IvParameterSpec(secretKey.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(ipAsKey.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
            byte[] encrypted = cipher.doFinal(parametersMode.getBytes());
            return Base64.encodeBase64String(encrypted);
        } catch (Exception ex) {
            return ex.toString();
        }
    }

    public static String decryptParametersMode(String encrypted, String ipAsKey) {
        try {
            //secretKey must be 16 character
            String secretKey = "65a4f+6a5s4df+6a";
            IvParameterSpec iv = new IvParameterSpec(secretKey.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(ipAsKey.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted));

            return new String(original);
        } catch (Exception ex) {
            return ex.toString();
        }
    }

    public void fixPageGridColModelListAndFilters(String[] columnNames, String[] columnIndexes) {
        // fix pageGridColModelList:
        for (int i = 0; i < getPageGridColModelList().size(); i++) {
            getPageGridColModelList().get(i).setName(columnNames[i]);
            getPageGridColModelList().get(i).setIndex(columnIndexes[i]);
        }

        // fix Filters:
        JSONObject filtersJsonObject, jsonObj2;
        String groupOp, op, field, data;
        Integer index = 0;
        if (getFilters() != null) {
            if (!"".equals(getFilters())) {
                filtersJsonObject = new JSONObject(getFilters());
                groupOp = filtersJsonObject.getString("groupOp");
                JSONArray rulesJsonArray = filtersJsonObject.getJSONArray("rules");
                JSONArray rulesJsonArray2 = new JSONArray();
                logger.info("before rulesJsonArray.length():" + rulesJsonArray.length() + " rulesJsonArray:" + rulesJsonArray);
                for (int i = 0; i < rulesJsonArray.length(); i++) {
                    jsonObj2 = rulesJsonArray.getJSONObject(i);
                    op = jsonObj2.getString("op");
                    field = jsonObj2.getString("field");
                    if (isInteger(field, 10)) {
                        index = Integer.parseInt(field);
                        if ((index >= 0) && (index < columnIndexes.length)) {
                            jsonObj2.put("field", columnIndexes[index]);
                        }
                    }
                    data = jsonObj2.getString("data");
                    rulesJsonArray2.put(i, jsonObj2);
                }
                rulesJsonArray = rulesJsonArray2;
                logger.info("after rulesJsonArray.length():" + rulesJsonArray.length() + " rulesJsonArray:" + rulesJsonArray);
                filtersJsonObject.put("rules", rulesJsonArray);
                setFilters(filtersJsonObject.toString());
            }
        }

        // fix sort Sidx:
        String tmpSidx = "";
        if (getSidx() != null) {
            if (!"".equals(getSidx().trim())) {
                String sortField = "";
                String sortType = "";
                String sortToken = "";
                String sortStr = getSidx().trim();
                List<String> arSort = new ArrayList<String>();
                arSort.addAll(Arrays.asList(sortStr.split(",", -1)));
                logger.info("arSort.size():" + arSort.size());
                index = 0;
                for (int i = 0; i < arSort.size(); i++) {
                    sortToken = arSort.get(i).trim();
                    logger.info("sortToken:" + sortToken);
                    if (i < (arSort.size() - 1)) {
                        sortField = Arrays.asList(sortToken.split(" ", -1)).get(0);
                        logger.info("i < : sortField:" + sortField);
                        if (isInteger(sortField, 10)) {
                            index = Integer.parseInt(sortField);
                            if ((index >= 0) && (index < columnIndexes.length)) {
                                sortField = columnIndexes[index];
                            }
                        }
                        sortType = Arrays.asList(sortToken.split(" ", -1)).get(1);
                        if (!"".equals(tmpSidx)) {
                            tmpSidx = tmpSidx + ",";
                        }
                        tmpSidx = tmpSidx + sortField + " " + sortType;
                    } else {
                        sortField = sortToken;
                        logger.info("i !< : sortField:" + sortField);
                        if (isInteger(sortField, 10)) {
                            index = Integer.parseInt(sortField);
                            if ((index >= 0) && (index < columnIndexes.length)) {
                                sortField = columnIndexes[index];
                            }
                        }
                        if (!"".equals(tmpSidx)) {
                            tmpSidx = tmpSidx + ",";
                        }
                        tmpSidx = tmpSidx + sortField + " ";
                    }
                }
                setSidx(tmpSidx);

            }
        }
        logger.info(this.toString());
    }

    public static boolean isInteger(String s, int radix) {
        if (s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                if (s.length() == 1) {
                    return false;
                } else {
                    continue;
                }
            }
            if (Character.digit(s.charAt(i), radix) < 0) {
                return false;
            }
        }
        return true;
    }
}
