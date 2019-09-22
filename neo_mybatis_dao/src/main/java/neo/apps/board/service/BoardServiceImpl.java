package neo.apps.board.service;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neo.apps.board.dao.BoardDao;
import neo.apps.board.dto.BoardDto;
import neo.apps.board.mapper.BoardMapper;
import neo.com.dao.CommonDao;

@Service
public class BoardServiceImpl implements BoardService {

	//MyBatis Mapper 방식
	//@Autowired
	//private BoardMapper boardMapper;
	
	//각 도메인 DAO 방식
	//@Autowired
	//private BoardDao boardDao;
	
	@Resource(name="cmDao")
	private CommonDao cmDao;
	
	/*
	MyBatis Mapper 방식
	public int selectBoardListCnt(HttpServletRequest request, BoardDto boardDto) throws Exception {
		return boardMapper.selectBoardListCnt(boardDto);
	}

	public List<BoardDto> selectBoardList(HttpServletRequest request, BoardDto boardDto) throws Exception {
		return boardMapper.selectBoardList(boardDto);
	}
	
	public BoardDto selectBoard(HttpServletRequest request, int boardIdx) throws Exception {
		return boardMapper.selectBoard(boardIdx);
	}
	
	public void insertBoard(HttpServletRequest request, BoardDto boardDto) throws Exception {
		boardMapper.insertBoard(boardDto);
	}
	
	public void updateBoard(HttpServletRequest request, BoardDto boardDto) throws Exception {
		boardMapper.updateBoard(boardDto);
	}
	*/

	/*
	각 도메인 DAO 방식
	public int selectBoardListCnt(HttpServletRequest request, BoardDto boardDto) throws Exception {
		return boardDao.selectBoardListCnt(boardDto);
	}
	
	public List<BoardDto> selectBoardList(HttpServletRequest request, BoardDto boardDto) throws Exception {
		return boardDao.selectBoardList(boardDto);
	}
	
	public BoardDto selectBoard(HttpServletRequest request, int boardIdx) throws Exception {
		return boardDao.selectBoard(boardIdx);
	}
	
	public int insertBoard(HttpServletRequest request, BoardDto boardDto) throws Exception {
		return boardDao.insertBoard(boardDto);
	}
	
	public int updateBoard(HttpServletRequest request, BoardDto boardDto) throws Exception {
		return boardDao.updateBoard(boardDto);
	}
	*/
	
	public int selectBoardListCnt(HttpServletRequest request, BoardDto boardDto) throws Exception {
		return cmDao.selectListCnt("Board.selectBoardListCnt", boardDto);
	}
	
	public List<BoardDto> selectBoardList(HttpServletRequest request, BoardDto boardDto) throws Exception {
		return cmDao.selectList("Board.selectBoardList", boardDto);
	}
	
	public BoardDto selectBoard(HttpServletRequest request, int boardIdx) throws Exception {
		return cmDao.select("Board.selectBoard", boardIdx);
	}
	
	public int insertBoard(HttpServletRequest request, BoardDto boardDto) throws Exception {
		return cmDao.insert("Board.insertBoard", boardDto);
	}
	
	public int updateBoard(HttpServletRequest request, BoardDto boardDto) throws Exception {
		return cmDao.update("Board.updateBoard", boardDto);
	}
}