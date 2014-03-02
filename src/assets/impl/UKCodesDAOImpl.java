package assets.impl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rent.cab.entity.UKPostCodes;

import assets.IUKCodesDAO;

@Service
public class UKCodesDAOImpl implements IUKCodesDAO {
	
	
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	protected Session getCurrentSession(){
		System.out.println("Session Factory" + sessionFactory);
		System.out.println("Session  " + sessionFactory.openSession());
		return sessionFactory.openSession();
	}
	
	@Override
	public Long getAllUKCodesCount() {
		// TODO Auto-generated method stub
		Session session = this.getCurrentSession();
		String query = "select count(*) from com.rent.cab.entity.UKPostCodes ukpostcodes";
		Long size = (Long)session.createQuery(query).uniqueResult();
		
		return size;
	}
	
	
	@Override
	public List<UKPostCodes> getMatchedPostCodes(String postcode) {
		// TODO Auto-generated method stub
		Session session = this.getCurrentSession();
		String query = "select ukpostcodes from com.rent.cab.entity.UKPostCodes ukpostcodes where ukpostcodes.postcode like '"+postcode+"%'";
		return session.createQuery(query).list();
		
	}
	
	@Override
	public List<UKPostCodes> getAllPostCodes() {
		// TODO Auto-generated method stub
		Session session = this.getCurrentSession();
		String query = "select ukpostcodes from com.rent.cab.entity.UKPostCodes ukpostcodes ";
		return session.createQuery(query).list();
	}
	
	@Override
	public UKPostCodes getPostCodeAgainstId(Long postCodeId){
		Session session = this.getCurrentSession();
		String query = "select ukpostcodes from com.rent.cab.entity.UKPostCodes ukpostcodes where ukpostcodes.id = :id";
		return (UKPostCodes)session.createQuery(query).setLong("id", postCodeId).uniqueResult();
	}
	

}
