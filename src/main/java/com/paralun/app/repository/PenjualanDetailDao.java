/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.repository;

import com.paralun.app.model.PenjualanDetail;
import java.util.List;

public interface PenjualanDetailDao {
    
    public void saveOrUpdate(PenjualanDetail detail);
    public void delete(PenjualanDetail detail);
    public List<PenjualanDetail> getPenjualanDetails();
    
}
