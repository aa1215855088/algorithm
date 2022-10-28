/**
  * Copyright 2022 bejson.com 
  */
package com.xzl.algorithm.sync.garminBean;

/**
 * Auto-generated: 2022-10-28 16:38:40
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ActivityType {

    private int typeId;
    private String typeKey;
    private int parentTypeId;
    private boolean isHidden;
    private String sortOrder;
    private boolean restricted;
    private boolean trimmable;
    public void setTypeId(int typeId) {
         this.typeId = typeId;
     }
     public int getTypeId() {
         return typeId;
     }

    public void setTypeKey(String typeKey) {
         this.typeKey = typeKey;
     }
     public String getTypeKey() {
         return typeKey;
     }

    public void setParentTypeId(int parentTypeId) {
         this.parentTypeId = parentTypeId;
     }
     public int getParentTypeId() {
         return parentTypeId;
     }

    public void setIsHidden(boolean isHidden) {
         this.isHidden = isHidden;
     }
     public boolean getIsHidden() {
         return isHidden;
     }

    public void setSortOrder(String sortOrder) {
         this.sortOrder = sortOrder;
     }
     public String getSortOrder() {
         return sortOrder;
     }

    public void setRestricted(boolean restricted) {
         this.restricted = restricted;
     }
     public boolean getRestricted() {
         return restricted;
     }

    public void setTrimmable(boolean trimmable) {
         this.trimmable = trimmable;
     }
     public boolean getTrimmable() {
         return trimmable;
     }

}