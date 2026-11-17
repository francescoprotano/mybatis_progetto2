package it.exolab.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import it.exolab.mapper.StudenteMapper;
import it.exolab.model.Studente;
import it.exolab.util.MyBatisUtils;

public class StudenteDAO {
	
	public void insert(Studente model) {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		StudenteMapper theMapper = session.getMapper(StudenteMapper.class);
	    theMapper.insert(model);
	    session.commit();
	}
	public void delete(Long id) {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		StudenteMapper theMapper = session.getMapper(StudenteMapper.class);
	    theMapper.delete(id);
	    session.commit();
	}
	public void update(Studente model) {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		StudenteMapper theMapper = session.getMapper(StudenteMapper.class);
	    theMapper.update(model);
	    session.commit();
	}
	public List<Studente> findAll() {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		StudenteMapper theMapper = session.getMapper(StudenteMapper.class);
	    return theMapper.findAll();
	    
	}
	public Studente find(Long id) {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		StudenteMapper theMapper = session.getMapper(StudenteMapper.class);
	    return theMapper.find(id);
	    
	}
	public Studente findAndJoinCorso(Long id) {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		StudenteMapper theMapper = session.getMapper(StudenteMapper.class);
	    return theMapper.findAndJoinCorso(id);
	    
	}
}
