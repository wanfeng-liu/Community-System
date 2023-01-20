package com.nowcoder.community.entity;
/**
 * encapsulating information of query paging
 */
public class Page {
    //current page
    private int current = 1;
    //Maximize count of information in a page
    private  int limit = 10;
    // the total of data(calculate the total pages of data)
    // the total pages of data = (the total of data)/(Maximize count of data in a page)
    private  int rows;
    //querying path(used to make urls for query paging)
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if(current >= 1) {
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit >= 1 && limit <= 100) {
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows >= 0) {
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * gain the num of rows in the current page
     * @return
     */

    public int getOffset() {
        // current * limit - limit;
        return (current - 1) * limit;
    }

    //gain the total pages of data
    public int getTotal() {
        // rows / limit + 1
        if(rows % limit == 0) {
            return rows / limit;
        }else {
            return rows/limit + 1;
        }
    }

    //gain the num of page in the start
    public int getFrom() {
        int from = current - 2;
        return from < 1 ? 1 : from;
    }

    //gain the num of page in the end
    public int getTo() {
        int to = current + 2;
        int total = getTotal();
        return to > total ? total : to;
    }

    @Override
    public String toString() {
        return "Page{" +
                "current=" + current +
                ", limit=" + limit +
                ", rows=" + rows +
                ", path='" + path + '\'' +
                '}';
    }
}
