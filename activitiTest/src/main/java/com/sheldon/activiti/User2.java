package com.sheldon.activiti;

import java.util.Objects;

/**
 * @author sheldon
 * 描述：
 * @date 2021/6/26 9:45
 */
public class User2 {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User2 user2 = (User2) o;
        return i == user2.i;
    }

    @Override
    public int hashCode() {
        return i%10;
    }
}
