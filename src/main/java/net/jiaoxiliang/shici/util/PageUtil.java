package net.jiaoxiliang.shici.util;

/**
 * PageUtil
 */
public class PageUtil {

    private int page = 1;   // 当前页数
    private int total = 0;  // 总数
    private int totalPages = 0; // 总页数
    private int limit = 10; // 每页显示的条数
    private int start = 0;  // 开始在那一条开始查询

    /**
     * @return the page
     */
    public int getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * 计算各个参数
     * @param total
     */
    public void calcParam(int total) {
        this.total = total;
        this.totalPages = (int) Math.ceil((double) total / (double)this.limit);
        this.start = (this.page-1)*this.limit;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the totalPages
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * @param totalPages the totalPages to set
     */
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * @return the limit
     */
    public int getLimit() {
        return limit;
    }

    /**
     * @param limit the limit to set
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * @return the start
     */
    public int getStart() {
        return start;
    }

    /**
     * @param start the start to set
     */
    public void setStart(int start) {
        this.start = start;
    }
    
}