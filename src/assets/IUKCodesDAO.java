package assets;

import java.util.List;

import com.rent.cab.entity.UKPostCodes;

public interface IUKCodesDAO {
	
	public Long getAllUKCodesCount();
	public List<UKPostCodes> getMatchedPostCodes(String postCode);
	public UKPostCodes getPostCodeAgainstId(Long postCodeId);
	public List<UKPostCodes> getAllPostCodes();
	
}
