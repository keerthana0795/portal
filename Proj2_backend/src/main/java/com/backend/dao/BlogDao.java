package com.backend.dao;

import java.util.List;

import com.backend.model.BlogPost;
import com.backend.model.BlogComment;
public interface BlogDao {
void saveBlogPost(BlogPost blogPost);
public List<BlogPost> getBlogPosts(int approved);
public BlogPost getBlogPostById(int id);
void addBlogComment(BlogComment blogComment);
List<BlogComment> getBlogComments(int blogPostId);
void update(BlogPost blogPost);

}
