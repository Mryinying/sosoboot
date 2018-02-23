/*
 * This file is generated by jOOQ.
*/
package com.it.service.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * 案由表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefinedCause implements Serializable {

    private static final long serialVersionUID = 1674298579;

    private String id;
    private String parentId;
    private String judicialId;
    private String title;

    public DefinedCause() {}

    public DefinedCause(DefinedCause value) {
        this.id = value.id;
        this.parentId = value.parentId;
        this.judicialId = value.judicialId;
        this.title = value.title;
    }

    public DefinedCause(
        String id,
        String parentId,
        String judicialId,
        String title
    ) {
        this.id = id;
        this.parentId = parentId;
        this.judicialId = judicialId;
        this.title = title;
    }

    public String getId() {
        return this.id;
    }

    public DefinedCause setId(String id) {
        this.id = id;
        return this;
    }

    public String getParentId() {
        return this.parentId;
    }

    public DefinedCause setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getJudicialId() {
        return this.judicialId;
    }

    public DefinedCause setJudicialId(String judicialId) {
        this.judicialId = judicialId;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public DefinedCause setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final DefinedCause other = (DefinedCause) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (parentId == null) {
            if (other.parentId != null)
                return false;
        }
        else if (!parentId.equals(other.parentId))
            return false;
        if (judicialId == null) {
            if (other.judicialId != null)
                return false;
        }
        else if (!judicialId.equals(other.judicialId))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        }
        else if (!title.equals(other.title))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.parentId == null) ? 0 : this.parentId.hashCode());
        result = prime * result + ((this.judicialId == null) ? 0 : this.judicialId.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DefinedCause (");

        sb.append(id);
        sb.append(", ").append(parentId);
        sb.append(", ").append(judicialId);
        sb.append(", ").append(title);

        sb.append(")");
        return sb.toString();
    }
}
