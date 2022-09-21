package com.dev.courseAPI.dao;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.dev.courseAPI.model.Course;
@Component
public class CourseJdbcDAO implements DAO<Course>{

	private static final Logger log=LoggerFactory.getLogger(CourseJdbcDAO.class);
	private JdbcTemplate jdbcTemplate;
	RowMapper<Course> rowMapper=(rs,rowNum)->{
		Course course = new Course();
		course.setCourseId(rs.getInt("course_Id"));
		course.setTitle(rs.getString("title"));
		course.setDescription(rs.getString("description"));
		course.setLink(rs.getString("link"));
		return course;
		};

	public CourseJdbcDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Course> list() {
	
		String sql="SELECT course_Id, title, description, link from course";
		return jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public void create(Course course) {
	String sql="insert into course(title,description,link) value(?,?,?)";
	int insert=jdbcTemplate.update(sql,course.getTitle(),course.getDescription(),course.getLink());
	if(insert==1) {
		log.info("New course created: "+course.getTitle());
	}
	}
	

	@Override
	public Optional<Course> get(int id) {
	String sql="SELECT course_Id, title, description, link from course where course_id=?";
	Course course=null;
	try {
		course = jdbcTemplate.queryForObject(sql, new Object[] {id},rowMapper);
	}catch(DataAccessException ex) {
		log.info("Course not found: "+id);
	}
	
		return Optional.ofNullable(course);
	}

	@Override
	public void update(Course course, int id) {
		String sql = "update course settitle=?,description =? ,Link =? where course_id=?";
		int update = jdbcTemplate.update(sql,course.getTitle(),course.getDescription(),course.getLink());
	if(update==1) {
		log.info("Course Updated: "+course.getTitle());
	}
	
	}

	@Override
	public void delete(int id) {
		jdbcTemplate.update("delete from course where course_id = ?"+id);
		
	}


}
