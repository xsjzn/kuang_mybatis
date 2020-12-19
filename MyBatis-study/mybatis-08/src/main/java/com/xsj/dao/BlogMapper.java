package com.xsj.dao;

import com.xsj.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author xsj
 * @create 2020-12-18 20:55
 */
public interface BlogMapper {

    //插入博客
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map<String,String> map);

    List<Blog> queryBlogChoose(Map<String,String> map);

    List<Blog> queryBlogForeach(Map map);

//更新博客
    int updateBlog(Map map);
}
