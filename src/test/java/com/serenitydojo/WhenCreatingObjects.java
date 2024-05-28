package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_dog() {
        Dog malu = new Dog("Malu","Bone", 5);
        Assert.assertEquals(malu.getName(), "Malu");
        Assert.assertEquals(malu.getFavoriteToy(), "Bone");
        Assert.assertEquals(malu.getAge(), 5);
    }
}
