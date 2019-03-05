package com.xiaoyingjie.tmall.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xiaoyingjie.tmall.pojo.Product;
import com.xiaoyingjie.tmall.pojo.ProductImage;

public interface ProductImageDAO extends JpaRepository<ProductImage,Integer>{
    public List<ProductImage> findByProductAndTypeOrderByIdDesc(Product product, String type);

}