
package com.refactech.driibo.type.dribble;

public enum Category {
    popular("流行"), everyone("大众"), debuts("Debuts");
    private String mDisplayName;

    Category(String displayName) {
        mDisplayName = displayName;
    }

    public String getDisplayName() {
        return mDisplayName;
    }
}
