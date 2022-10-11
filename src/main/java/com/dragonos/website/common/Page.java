package com.dragonos.website.common;

import java.io.Serializable;

public class Page implements Serializable {
    private static final long serialVersionUID = 1L;
    protected Integer page = 1;
    protected Integer limit = 20;
    protected String sortField;
    protected String sortOrder;

    public Page() {
    }

    public Page(Integer page, Integer limit) {
        this.page = page;
        this.limit = limit;
    }

    public Page(Integer page, Integer limit, String sortField, String sortOrder) {
        this.page = page;
        this.limit = limit;
        this.sortField = sortField;
        this.sortOrder = sortOrder;
    }

    public Integer getPage() {
        return this.page;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getSortField() {
        return this.sortField;
    }

    public String getSortOrder() {
        return this.sortOrder;
    }

    public void setPage(final Integer page) {
        this.page = page;
    }

    public void setLimit(final Integer limit) {
        this.limit = limit;
    }

    public void setSortField(final String sortField) {
        this.sortField = sortField;
    }

    public void setSortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Page)) {
            return false;
        } else {
            Page other = (Page) o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label59:
                {
                    Object this$page = this.getPage();
                    Object other$page = other.getPage();
                    if (this$page == null) {
                        if (other$page == null) {
                            break label59;
                        }
                    } else if (this$page.equals(other$page)) {
                        break label59;
                    }

                    return false;
                }

                Object this$limit = this.getLimit();
                Object other$limit = other.getLimit();
                if (this$limit == null) {
                    if (other$limit != null) {
                        return false;
                    }
                } else if (!this$limit.equals(other$limit)) {
                    return false;
                }

                Object this$sortField = this.getSortField();
                Object other$sortField = other.getSortField();
                if (this$sortField == null) {
                    if (other$sortField != null) {
                        return false;
                    }
                } else if (!this$sortField.equals(other$sortField)) {
                    return false;
                }

                Object this$sortOrder = this.getSortOrder();
                Object other$sortOrder = other.getSortOrder();
                if (this$sortOrder == null) {
                    if (other$sortOrder != null) {
                        return false;
                    }
                } else if (!this$sortOrder.equals(other$sortOrder)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Page;
    }

    public String toString() {
        return "Page(page=" + this.getPage() + ", limit=" + this.getLimit() + ", sortField=" + this.getSortField() + ", sortOrder=" + this.getSortOrder() + ")";
    }
}

