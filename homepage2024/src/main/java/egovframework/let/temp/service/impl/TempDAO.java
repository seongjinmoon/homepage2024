package egovframework.let.temp.service.impl;
import egovframework.let.cop.bbs.service.BoardVO;
import egovframework.let.temp.service.TempVO;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Repository;


@Repository("tempDAO")
public class TempDAO extends EgovAbstractMapper {

    //임시데이터 가져오기
    public TempVO selectTemp(TempVO vo) throws Exception {
    	return (TempVO)selectOne("TempDAO.selectTemp", vo);
    }
    
    //임시데이터 목록 가져오기
  	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<EgovMap> selectTempList(TempVO vo) throws Exception {
  		return (List<EgovMap>) list("TempDAO.selectTempList", vo);
  	}
}
