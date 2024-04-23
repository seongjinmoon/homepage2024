package egovframework.let.temp3.service.impl;
import egovframework.let.temp3.service.Temp3VO;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Repository;


@Repository("temp3DAO")
public class Temp3DAO extends EgovAbstractMapper {

    //임시데이터 가져오기
    public Temp3VO selectTemp(Temp3VO vo) throws Exception {
    	return selectOne("temp3DAO.selectTemp", vo);
    }
    
    //임시데이터 목록 가져오기
	public List<EgovMap> selectTempList(Temp3VO vo) throws Exception {
  		return selectList("temp3DAO.selectTempList", vo);
  	}
	
	//임시데이터 등록
    public void insertTemp(Temp3VO vo) throws Exception {
    	insert("temp3DAO.insertTemp", vo);
    }
	
    //임시데이터 수정
    public void updateTemp(Temp3VO vo) throws Exception {
    	update("temp3DAO.updateTemp", vo);
    }
    
    //임시데이터 삭제
    public void deleteTemp(Temp3VO vo) throws Exception {
    	delete("temp3DAO.deleteTemp", vo);
    }
	
    //임시데이터 목록 수
    public int selectTempListCnt(Temp3VO vo) throws Exception {
    	return selectOne("temp3DAO.selectTempListCnt", vo);
    }
    
}
