import com.xsj.dao.BlogMapper;
import com.xsj.pojo.Blog;
import com.xsj.utils.IDUtils;
import com.xsj.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @author xsj
 * @create 2020-12-18 21:08
 */
public class MyTest {
    @Test
    public void addBlogTest(){
        SqlSession sqlSession = MybatisUtil.getSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Java");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("微服务");
        mapper.addBlog(blog);

        sqlSession.close();
    }
    @Test
    public void queryBlogIF(){
        SqlSession sqlSession = MybatisUtil.getSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title","Java");
        map.put("author","狂神说");
        List<Blog> blogList = mapper.queryBlogIF(map);


        for (Blog blog : blogList) {
            System.out.println(blog);
        }
    }

    @Test
    public void queryForeach(){
        SqlSession sqlSession = MybatisUtil.getSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        ArrayList ids =new ArrayList();
        ids.add(1);
        map.put("ids",ids);
        List<Blog> blogList = mapper.queryBlogForeach(map);


        for (Blog blog : blogList) {
            System.out.println(blog);
        }
    }
    @Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtil.getSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title","Java2");
        map.put("author","狂神说12");
        map.put("id","75ee9b5b0f58469c8ef619a89bf68c16");
        mapper.updateBlog(map);
    }

}

