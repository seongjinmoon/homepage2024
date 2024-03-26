package egovframework.let.temp.service.impl;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;


import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Service;


@Service("tempService")
public class TempServiceImpl extends EgovAbstractServiceImpl implements TempService {
    
    @Resource(name = "tempDAO")
    private TempDAO tempDAO;
    
	/*
    @Resource(name="tempMapper")
	private TempMapper tempMapper;
	*/
    /*
    @Resource(name="temp2Mapper")
	private Temp2Mapper temp2Mapper;
    
    @Resource(name = "egovTempIdGnrService")
    private EgovIdGnrService idgenService;
    */
	
	public TempVO selectTemp(TempVO vo) throws Exception {
		return tempDAO.selectTemp(vo);
	}
	
	//임시데이터 목록 가져오기
	public List<EgovMap> selectTempList(TempVO vo) throws Exception {
		return tempDAO.selectTempList(vo);
	}
	
    /*
	public String insertTemp(TempVO vo) throws Exception {
		//tempMapper.insertTemp(vo);
		
		String id = idgenService.getNextStringId();
		vo.setTempId(id);
		temp2Mapper.insertTemp(vo);
		
		return id;
	}
	
	//임시데이터 목록 가져오기
	public List<EgovMap> selectTempList(TempVO vo) throws Exception {
		return temp2Mapper.selectTempList(vo);
	}
	
	//임시데이터 목록 수
	public int selectTempListCnt(TempVO vo) throws Exception {
		return temp2Mapper.selectTempListCnt(vo);
	}
	
	//임시데이터 수정하기
	public void updateTemp(TempVO vo) throws Exception{
		temp2Mapper.updateTemp(vo);
	}
	
	//임시데이터 삭제하기
	public void deleteTemp(TempVO vo) throws Exception{
		temp2Mapper.deleteTemp(vo);
	}
	*/
}
