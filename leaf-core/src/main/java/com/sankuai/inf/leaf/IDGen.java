package com.sankuai.inf.leaf;

import com.sankuai.inf.leaf.common.Result;

public interface IDGen {
    Result get(String key);

    Result get(String key, int num);

    boolean init();
}
