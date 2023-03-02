package com.sankuai.inf.leaf.common;

import com.sankuai.inf.leaf.IDGen;

public class ZeroIDGen implements IDGen {
    @Override
    public Result get(String key) {
        return new Result("0", Status.SUCCESS, 1);
    }

    @Override
    public Result get(String key, int num) {
        return new Result("0", Status.EXCEPTION, 500);
    }

    @Override
    public boolean init() {
        return true;
    }
}
